/**
 * Copyright (C) 2016 Samil Atesoglu & Abdullah Coban
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package msa.tools.cursorlocation;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.swing.Timer;

/**
 *
 * @author Samil Atesoglu
 */
public class Main extends javax.swing.JFrame {

    public static String before_x = "";
    public static String between = "";
    public static String after_y = "";

    public int mouse_x;
    public int mouse_y;

    public static int b_red;
    public static int b_green;
    public static int b_blue;
    public static int f_red;
    public static int f_green;
    public static int f_blue;
    public static int size_x;
    public static int size_y;
    public static int opacity;
    public static int font_style;
    public static int font_size;
    public static int origin;
    public static boolean always_on_top;
    public static boolean save_logs_statistics;
    public static String font_name;
    public static Font font;

    public static boolean recording = false;
    public static int recLoop = 0;
    public static int recLastLoop;

    public static Properties p = new Properties();
    public static Properties pLastLoc = new Properties();

    public static final File USER_FILE_DIR = new File(System.getProperty("user.home") + File.separator
            + "Cursor Location");
    public static final File USER_SETTINGS_DIR = new File(USER_FILE_DIR + File.separator + "Settings");
    public static File user_settings_file = new File(USER_FILE_DIR + File.separator + "Settings"
            + File.separator
            + "settings.properties");
    public static File user_stats_dir = new File(USER_FILE_DIR + File.separator + "Statistics");
    public static File user_logs_file = new File(USER_FILE_DIR + File.separator + "Statistics"
            + File.separator
            + "logs.txt");
    public static File user_ll_file = new File(USER_SETTINGS_DIR + File.separator
            + "last_location.properties");

    public static OutputStream settings_output;
    public static InputStream settings_input;

    public int[] x_arr = new int[10000000];
    public int[] y_arr = new int[10000000];

    public OutputStream stats;
    public PrintWriter statWriter;
    public FileWriter fileLogWriter;
    public BufferedWriter bufferedLogWriter;
    public static String logs_str = "";

    public Timer recTimer;
    public Player player = new Player();
    public Timer pTimer;
    Recorder rec = new Recorder();

    public static final Color ERR_BACK = new Color(156, 99, 99);
    public static final Color ERR_FORE = new Color(208, 99, 99);

    public Robot robot;

    public Main() {
        initComponents();
        initEnvironment();
        initKeyListener();
    }

    public void initTimer() {
        TimeListener listener = new TimeListener();
        Timer timer = new Timer(10, listener);
        timer.start();
        StatisticsListener sL = new StatisticsListener();
        Timer sTimer = new Timer(50, sL);
        sTimer.start();
    }

    public void update() {
        int imgX = MouseInfo.getPointerInfo().getLocation().x;
        int imgY = MouseInfo.getPointerInfo().getLocation().y;
        int sW = Toolkit.getDefaultToolkit().getScreenSize().width;
        int sH = Toolkit.getDefaultToolkit().getScreenSize().height;
        int rX = (origin == 0) ? imgX : ((origin == 1) ? imgX : ((origin == 2) ? sW - imgX - 1 : sW - imgX - 1));
        int rY = (origin == 0) ? imgY : ((origin == 1) ? sH - imgY - 1 : ((origin == 2) ? sH - imgY - 1 : imgY));
        locationLabel.setText(before_x
                + String.valueOf(rX)
                + between + String.valueOf(rY)
                + after_y);
        this.setSize(size_x, size_y);
        locationLabel.setBackground(new Color(b_red, b_green, b_blue));
        locationLabel.setForeground(new Color(f_red, f_green, f_blue));
        locationLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(f_red, f_green, f_blue)));
        this.setAlwaysOnTop(always_on_top);
        float o = (float) opacity / 100;
        this.setOpacity(o);
    }

    public void initEnvironment() {
        try {
            InputStream imgStream = Options.class.getResourceAsStream("cursor-x32.png");
            BufferedImage iconImg = ImageIO.read(imgStream);
            this.setIconImage(iconImg);
        } catch (IOException e) {
            throwErrorMessage("Couldn\'t load icon file.\n[IOException]\n[Error code: 000]");
        }
        if (!(user_settings_file.exists())) {
            user_stats_dir.mkdirs();
            USER_SETTINGS_DIR.mkdirs();
            saveDefaultSettings();
        }
        getSettings();
        applySettings();
        if (user_ll_file.exists()) {
            try {
                pLastLoc.load(new FileInputStream(user_ll_file));
                int x = Integer.valueOf(pLastLoc.getProperty("LAST_LOCATION_X"));
                int y = Integer.valueOf(pLastLoc.getProperty("LAST_LOCATION_Y"));
                this.setLocation(x, y);
            } catch (IOException ex) {
                throwErrorMessage("Something went wrong,\nwhile saving \"last_location\" property.\n[IOException]\n[Error code: 001]");
            }
        }
    }

    public void initKeyListener() {
        this.addKeyListener(new ListenKeyboard());
    }

    public static void saveSettings() {
        try {
            settings_output = new FileOutputStream(user_settings_file);
            p.setProperty("FOREGROUND_RED", String.valueOf(locationLabel.getForeground().getRed()));
            p.setProperty("FOREGROUND_GREEN", String.valueOf(locationLabel.getForeground().getGreen()));
            p.setProperty("FOREGROUND_BLUE", String.valueOf(locationLabel.getForeground().getBlue()));
            p.setProperty("BACKGROUND_RED", String.valueOf(locationLabel.getBackground().getRed()));
            p.setProperty("BACKGROUND_GREEN", String.valueOf(locationLabel.getBackground().getGreen()));
            p.setProperty("BACKGROUND_BLUE", String.valueOf(locationLabel.getBackground().getBlue()));
            p.setProperty("OPACITY", String.valueOf(opacity));
            p.setProperty("SIZE_X", String.valueOf(locationLabel.getSize().width));
            p.setProperty("SIZE_Y", String.valueOf(locationLabel.getSize().height));
            p.setProperty("BEFORE_X", before_x);
            p.setProperty("BETWEEN", between);
            p.setProperty("AFTER_Y", after_y);
            p.setProperty("FONT_SIZE", String.valueOf(locationLabel.getFont().getSize()));
            p.setProperty("FONT_NAME", locationLabel.getFont().getName());
            p.setProperty("FONT_STYLE", String.valueOf(locationLabel.getFont().getStyle()));
            p.setProperty("SAVE_LOGS&STATISTICS", String.valueOf(save_logs_statistics));
            p.setProperty("ALWAYS_ON_TOP", String.valueOf(always_on_top));
            p.setProperty("ORIGIN", String.valueOf(origin));
            p.store(settings_output, "Settings file of \"Cursor Location\" application. Do not change.");
            settings_output.close();
            throwInfoMessage("Settings saved to: \n" + user_settings_file.getAbsolutePath(), "SAVED");
        } catch (FileNotFoundException ex) {
            throwErrorMessage("\"settings.properties\" file not found.\n[FileNotFoundException]\n[Error code: 003]");
        } catch (IOException ex) {
            throwErrorMessage("Something went wrong,\nwhile input/output process.\n[IOException]\n[Error code: 004]");
        }
    }

    public static void saveDefaultSettings() {
        try {
            settings_output = new FileOutputStream(user_settings_file);
            p.setProperty("BACKGROUND_RED", "0");
            p.setProperty("BACKGROUND_GREEN", "0");
            p.setProperty("BACKGROUND_BLUE", "0");
            p.setProperty("FOREGROUND_RED", "255");
            p.setProperty("FOREGROUND_GREEN", "255");
            p.setProperty("FOREGROUND_BLUE", "255");
            p.setProperty("OPACITY", "100");
            p.setProperty("SIZE_X", "100");
            p.setProperty("SIZE_Y", "30");
            p.setProperty("BEFORE_X", "(");
            p.setProperty("BETWEEN", ", ");
            p.setProperty("AFTER_Y", ")");
            p.setProperty("LAST_LOCATION_X", String.valueOf(10));
            p.setProperty("LAST_LOCATION_Y", String.valueOf(10));
            p.setProperty("FONT_SIZE", "13");
            p.setProperty("FONT_NAME", "Courier New");
            p.setProperty("FONT_STYLE", "1");
            p.setProperty("SAVE_LOGS&STATISTICS", "false");
            p.setProperty("ALWAYS_ON_TOP", "true");
            p.setProperty("ORIGIN", "0");
            p.setProperty("USER_DIR", System.getProperty("user.home"));
            p.store(settings_output, "Settings file of \"Cursor Location\" application. Do not change.");
            settings_output.close();
        } catch (IOException ex) {
            throwErrorMessage("Something went wrong,\nwhile input/output process.\n[IOException]\n[Error code: 005]");
        }
    }

    public static void getSettings() {
        try {
            settings_input = new FileInputStream(user_settings_file);
            p.load(settings_input);
            b_red = Integer.valueOf(p.getProperty("BACKGROUND_RED"));
            b_green = Integer.valueOf(p.getProperty("BACKGROUND_GREEN"));
            b_blue = Integer.valueOf(p.getProperty("BACKGROUND_BLUE"));
            f_red = Integer.valueOf(p.getProperty("FOREGROUND_RED"));
            f_green = Integer.valueOf(p.getProperty("FOREGROUND_GREEN"));
            f_blue = Integer.valueOf(p.getProperty("FOREGROUND_BLUE"));
            size_x = Integer.valueOf(p.getProperty("SIZE_X"));
            size_y = Integer.valueOf(p.getProperty("SIZE_Y"));
            opacity = Integer.valueOf(p.getProperty("OPACITY"));
            before_x = String.valueOf(p.getProperty("BEFORE_X"));
            between = String.valueOf(p.getProperty("BETWEEN"));
            after_y = String.valueOf(p.getProperty("AFTER_Y"));
            font_size = Integer.valueOf(p.getProperty("FONT_SIZE"));
            font_style = Integer.valueOf(p.getProperty("FONT_STYLE"));
            font_name = p.getProperty("FONT_NAME");
            always_on_top = Boolean.valueOf(p.getProperty("ALWAYS_ON_TOP"));
            save_logs_statistics = Boolean.valueOf(p.getProperty("SAVE_LOGS&STATISTICS"));
            origin = Integer.valueOf(p.getProperty("ORIGIN"));
            settings_input.close();
        } catch (FileNotFoundException ex) {
            throwErrorMessage("\"settings.properties\" file not found.\n[FileNotFoundException]\n[Error code: 006]");
        } catch (IOException ex) {
            throwErrorMessage("Something went wrong,\nwhile input/output process.\n[IOException]\n[Error code: 007]");
        }
    }

    public static void applySettings() {
        locationLabel.setBackground(new Color(b_red, b_green, b_blue));
        locationLabel.setForeground(new Color(f_red, f_green, f_blue));
        font = new Font(font_name, font_style, font_size);
        locationLabel.setFont(font);
    }

    public void logs() {
        logs_str += "[LOCATION]  X: "
                + String.valueOf(MouseInfo.getPointerInfo().getLocation().x)
                + " Y: "
                + String.valueOf(MouseInfo.getPointerInfo().getLocation().y)
                + " | [DATE] "
                + LocalDateTime.now().getDayOfMonth() + "."
                + LocalDateTime.now().getMonthValue() + "."
                + LocalDateTime.now().getYear() + " - "
                + LocalDateTime.now().getHour() + ":"
                + LocalDateTime.now().getMinute() + ":"
                + LocalDateTime.now().getSecond()
                + System.lineSeparator();
    }

    public void initLogs() {
        if (!user_logs_file.exists()) {
            if (save_logs_statistics) {
                try {
                    fileLogWriter = new FileWriter(user_logs_file);
                    bufferedLogWriter = new BufferedWriter(fileLogWriter);
                } catch (FileNotFoundException ex) {
                    throwErrorMessage("\"logs.txt\" file not found.\n[FileNotFoundException]\n[Error code: 008]");
                } catch (IOException ex) {
                    throwErrorMessage("Something went wrong,\nwhile input/output process.\n[IOException]\n[Error code: 009]");
                }
            }
        }
    }

    public void saveLastLocation() {
        pLastLoc.setProperty("LAST_LOCATION_X", String.valueOf(mainPanel.getLocationOnScreen().x));
        pLastLoc.setProperty("LAST_LOCATION_Y", String.valueOf(mainPanel.getLocationOnScreen().y));
        try {
            pLastLoc.store(new FileOutputStream(USER_SETTINGS_DIR + File.separator + "last_location.properties"),
                    "settings file of \"Cursor Location\" application. Do not change.");
        } catch (FileNotFoundException ex) {
            throwErrorMessage("\"last_location.properties\" file not found.\n[FileNotFoundException]\n[Error code: 010]");
        } catch (IOException ex) {
            throwErrorMessage("Something went wrong,\nwhile input/output process.\n[IOException]\n[Error code: 011]");
        }
    }

    public static void throwErrorMessage(String message) {
        Dialog d = new Dialog(1, 1, "ERROR", message);
        d.showDialog();
    }

    public static void throwInfoMessage(String message, String title) {
        Dialog d = new Dialog(1, 0, title, message);
        d.showDialog();
    }
    
    public static int throwQuestionMessage(String question, String title){
        Dialog d = new Dialog(1, 1, title, question);
        return d.showDialog();
    }

    public void closingAct() {
        try {
            if (save_logs_statistics) {
                initLogs();
                logs_str += System.lineSeparator() + "*** SESSION CLOSED ***" + " | [DATE] "
                        + LocalDateTime.now().getDayOfMonth() + "."
                        + LocalDateTime.now().getMonthValue() + "."
                        + LocalDateTime.now().getYear() + " - "
                        + LocalDateTime.now().getHour() + ":"
                        + LocalDateTime.now().getMinute() + "."
                        + LocalDateTime.now().getSecond()
                        + System.lineSeparator();
                Files.write(Paths.get(user_logs_file.getAbsolutePath()),
                        logs_str.getBytes(),
                        StandardOpenOption.APPEND);
            }
            saveLastLocation();
            System.exit(0);
        } catch (IOException ex) {
            throwErrorMessage("Something went wrong,\nwhile input/output process.\n[IOException]\n[Error code: 012]");
        } finally {
        }
    }

    public class TimeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            update();
        }
    }

    public class StatisticsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            logs();
        }
    }

    public class Recorder implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            recordMouseMotion();
        }
    }

    public void recordMouseMotion() {
        x_arr[recLoop] = MouseInfo.getPointerInfo().getLocation().x;
        y_arr[recLoop] = MouseInfo.getPointerInfo().getLocation().y;
        recLoop++;
    }

    public class Player implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            play();
        }
    }

    public void play() {
        if (recLoop < recLastLoop) {
            int x = x_arr[recLoop];
            int y = y_arr[recLoop];
            robot.mouseMove(x, y);
            recLoop++;
        } else if (recLoop >= recLastLoop) {
            pTimer.stop();
            play.setEnabled(false);
        }
    }

    public class ListenKeyboard implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_O) {
                options.doClick();
            }
            if (e.getKeyCode() == KeyEvent.VK_A) {
                about.doClick();
            }
            if (e.getKeyCode() == KeyEvent.VK_R) {
                record_stop.doClick();
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        options = new javax.swing.JMenuItem();
        separator0 = new javax.swing.JPopupMenu.Separator();
        record_stop = new javax.swing.JMenuItem();
        play = new javax.swing.JMenuItem();
        separator1 = new javax.swing.JPopupMenu.Separator();
        about = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        mainPanel = new javax.swing.JPanel();
        locationLabel = new javax.swing.JLabel();

        options.setText("Options...");
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });
        popupMenu.add(options);
        popupMenu.add(separator0);

        record_stop.setText("Record Cursor Movements");
        record_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                record_stopActionPerformed(evt);
            }
        });
        popupMenu.add(record_stop);

        play.setText("Play");
        play.setEnabled(false);
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        popupMenu.add(play);
        popupMenu.add(separator1);

        about.setText("About...");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        popupMenu.add(about);

        exit.setText("Exit");
        exit.setToolTipText("");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        popupMenu.add(exit);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Your Cursor Location");
        setAlwaysOnTop(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        locationLabel.setBackground(new java.awt.Color(27, 31, 35));
        locationLabel.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        locationLabel.setForeground(new java.awt.Color(255, 255, 255));
        locationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        locationLabel.setText("-");
        locationLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        locationLabel.setComponentPopupMenu(popupMenu);
        locationLabel.setOpaque(true);
        locationLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                locationLabelMouseDragged(evt);
            }
        });
        locationLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                locationLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(locationLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(locationLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Options o = new Options();
        o.setVisible(true);
    }                                       

    private void locationLabelMouseDragged(java.awt.event.MouseEvent evt) {                                           
        this.setLocation(evt.getXOnScreen() - mouse_x, evt.getYOnScreen() - mouse_y);
    }                                          

    private void locationLabelMousePressed(java.awt.event.MouseEvent evt) {                                           
        mouse_x = evt.getX();
        mouse_y = evt.getY();
    }                                          

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {                                      
        About a = new About();
        a.setVisible(true);
    }                                     

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        closingAct();
    }                                    

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        logs_str += System.lineSeparator() + "*** SESSION OPENED ***" + " | [DATE] "
                + LocalDateTime.now().getDayOfMonth() + "."
                + LocalDateTime.now().getMonthValue() + "."
                + LocalDateTime.now().getYear() + " - "
                + LocalDateTime.now().getHour() + ":"
                + LocalDateTime.now().getMinute() + "."
                + LocalDateTime.now().getSecond()
                + System.lineSeparator() + System.lineSeparator();
        initTimer();
    }                                 

    public void initRecTimer() {
        recTimer = new Timer(10, rec);
        recTimer.start();
    }

    private void record_stopActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (recording) {
            recTimer.stop();
            recLastLoop = recLoop;
            recLoop = 0;
            record_stop.setText("Record Cursor Movements");
            play.setEnabled(true);
            recording = false;
        } else if (!recording) {
            initRecTimer();
            recLoop = 0;
            record_stop.setText("Stop Recording");
            recording = true;
        }
    }                                           

    private void playActionPerformed(java.awt.event.ActionEvent evt) {                                     
        try {
            this.robot = new Robot();
            pTimer = new Timer(10, player);
            pTimer.start();
        } catch (AWTException ex) {
            throwErrorMessage("Something went wrong,\nwhile processing \"Robot\".\n[AWTException]\n[Error code: 013]");
        }
    }                                    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration                     
    public static javax.swing.JMenuItem about;
    public javax.swing.JMenuItem exit;
    public static javax.swing.JLabel locationLabel;
    public static javax.swing.JPanel mainPanel;
    public static javax.swing.JMenuItem options;
    public static javax.swing.JMenuItem play;
    public javax.swing.JPopupMenu popupMenu;
    public static javax.swing.JMenuItem record_stop;
    public static javax.swing.JPopupMenu.Separator separator0;
    public static javax.swing.JPopupMenu.Separator separator1;
    // End of variables declaration                   
}
