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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.Timer;

/**
 *
 * @author Samil Atesoglu
 */
public class ColorChooser extends javax.swing.JFrame {

    public int mouse_x;
    public int mouse_y;

    public Timer timer;

    public String operation = "";

    public ColorChooser() {
        initComponents();
        try {
            InputStream imgStream = ColorChooser.class.getResourceAsStream("cursor-x32.png");
            BufferedImage iconImg = ImageIO.read(imgStream);
            this.setIconImage(iconImg);
        } catch (IOException e) {
            Main.throwErrorMessage("Couldn\'t load icon file.\n[IOException]\n[Error code: 21]");
        }
    }

    public void initTimer() {
        TimeListener listener = new TimeListener();
        timer = new Timer(10, listener);
        timer.start();
    }

    public void which(String w) {
        operation = w;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        colorChooser = new javax.swing.JColorChooser();
        okB = new javax.swing.JButton();
        l0 = new javax.swing.JLabel();
        cancelB = new javax.swing.JButton();
        titleL = new javax.swing.JLabel();
        closeB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Choose Color");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(192, 192, 192));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colorChooser.setBackground(new java.awt.Color(192, 192, 192));
        mainPanel.add(colorChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 320));

        okB.setBackground(new java.awt.Color(230, 230, 230));
        okB.setForeground(new java.awt.Color(0, 0, 0));
        okB.setText("OK");
        okB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        okB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBActionPerformed(evt);
            }
        });
        mainPanel.add(okB, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 60, 30));

        l0.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        l0.setForeground(new java.awt.Color(0, 0, 0));
        l0.setText("   Homeless Man Software © 2016");
        mainPanel.add(l0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 180, 30));

        cancelB.setBackground(new java.awt.Color(230, 230, 230));
        cancelB.setForeground(new java.awt.Color(0, 0, 0));
        cancelB.setText("Cancel");
        cancelB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });
        mainPanel.add(cancelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 60, 30));

        titleL.setBackground(new java.awt.Color(153, 153, 153));
        titleL.setForeground(new java.awt.Color(0, 0, 0));
        titleL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/msa/tools/cursorlocation/cursor-x16.png"))); // NOI18N
        titleL.setText(" Choose Color - Cursor Location");
        titleL.setIconTextGap(1);
        titleL.setOpaque(true);
        titleL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleLMouseDragged(evt);
            }
        });
        titleL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titleLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titleLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleLMousePressed(evt);
            }
        });

        closeB.setBackground(new java.awt.Color(162, 75, 93));
        closeB.setForeground(new java.awt.Color(255, 255, 255));
        closeB.setText("X");
        closeB.setBorder(null);
        closeB.setMargin(new java.awt.Insets(0, 14, 0, 14));
        closeB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBMouseExited(evt);
            }
        });
        closeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleL, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(closeB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void okBActionPerformed(java.awt.event.ActionEvent evt) {                                    
        timer.stop();
        if ("BackColor".equals(operation)) {
            Main.locationLabel.setBackground(colorChooser.getColor());
        }
        if ("ForeColor".equals(operation)) {
            Main.locationLabel.setForeground(colorChooser.getColor());
        }
        this.setVisible(false);
        Options o = new Options();
        o.setVisible(true);
    }                                   

    private void titleLMouseDragged(java.awt.event.MouseEvent evt) {                                    
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouse_x, y - mouse_y);
    }                                   

    private void titleLMousePressed(java.awt.event.MouseEvent evt) {                                    
        mouse_x = evt.getX();
        mouse_y = evt.getY();
    }                                   

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {                                        
        timer.stop();
        if ("BackColor".equals(operation)) {
            Main.b_red = Options.TEMP_BACK_COLOR.getRed();
            Main.b_green = Options.TEMP_BACK_COLOR.getGreen();
            Main.b_blue = Options.TEMP_BACK_COLOR.getBlue();
        }
        if ("ForeColor".equals(operation)) {
            Main.f_red = Options.TEMP_FORE_COLOR.getRed();
            Main.f_green = Options.TEMP_FORE_COLOR.getGreen();
            Main.f_blue = Options.TEMP_FORE_COLOR.getBlue();
        }
        this.setVisible(false);
        Options o = new Options();
        o.setVisible(true);
    }                                       

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        if ("BackColor".equals(operation)) {
            Options.TEMP_BACK_COLOR = Main.locationLabel.getBackground();
            colorChooser.setColor(Main.locationLabel.getBackground());
        }
        if ("ForeColor".equals(operation)) {
            Options.TEMP_FORE_COLOR = Main.locationLabel.getForeground();
            colorChooser.setColor(Main.locationLabel.getForeground());
        }
        initTimer();
    }                                 

    private void titleLMouseEntered(java.awt.event.MouseEvent evt) {                                    
        titleL.setBackground(titleL.getBackground().darker());
    }                                   

    private void titleLMouseExited(java.awt.event.MouseEvent evt) {                                   
        titleL.setBackground(titleL.getBackground().brighter());
    }                                  

    private void closeBMouseEntered(java.awt.event.MouseEvent evt) {                                    
        closeB.setBackground(Options.CLOSE_COLOR.darker());
    }                                   

    private void closeBMouseExited(java.awt.event.MouseEvent evt) {                                   
        closeB.setBackground(Options.CLOSE_COLOR);
    }                                  

    private void closeBActionPerformed(java.awt.event.ActionEvent evt) {                                       
        cancelB.doClick();
    }                                      

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ColorChooser().setVisible(true);
        });
    }

    public class TimeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            l0.setForeground(colorChooser.getColor());
            titleL.setForeground(colorChooser.getColor().brighter());
            okB.setBorder(javax.swing.BorderFactory.createLineBorder(colorChooser.getColor()));
            cancelB.setBorder(javax.swing.BorderFactory.createLineBorder(colorChooser.getColor()));
            mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(colorChooser.getColor(), 3));
            if ("BackColor".equals(operation)) {
                Main.b_red = colorChooser.getColor().getRed();
                Main.b_green = colorChooser.getColor().getGreen();
                Main.b_blue = colorChooser.getColor().getBlue();
            }
            if ("ForeColor".equals(operation)) {
                Main.f_red = colorChooser.getColor().getRed();
                Main.f_green = colorChooser.getColor().getGreen();
                Main.f_blue = colorChooser.getColor().getBlue();
            }
        }

    }

    // Variables declaration                     
    private javax.swing.JButton cancelB;
    private javax.swing.JButton closeB;
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JLabel l0;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton okB;
    private javax.swing.JLabel titleL;
    // End of variables declaration                   

}
