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

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.Timer;
import say.swing.JFontChooser;

/**
 *
 * @author Samil Atesoglu
 */
public class Options extends javax.swing.JFrame {

    public int mouse_x;
    public int mouse_y;

    public static final Color CLOSE_COLOR = new Color(162, 75, 93);
    public static final Color KINDA_GRAY = new Color(153, 153, 153);
    public static final Color TYPE0_GRAY = new Color(131, 131, 131);
    public static final Color TYPE1_GRAY = new Color(113, 113, 113);
    public static final Color TYPE2_GRAY = new Color(107, 107, 107);
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color SETTINGS_MOUSE_ENTERED_COLOR = WHITE.darker();

    public static final Color FATAL_ERR_BACK_COLOR = new Color(56, 28, 28);
    public static final Color FATAL_ERR_FRAME_COLOR = new Color(139, 75, 78);
    public static final Color FATAL_ERR_BTN_COLOR = new Color(36, 28, 28);

    public boolean catched = false;

    public Options() {
        initComponents();
        visualProperties();
    }

    public void visualProperties() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        try {
            InputStream imgStream = Options.class.getResourceAsStream("cursor-x32.png");
            BufferedImage iconImg = ImageIO.read(imgStream);
            this.setIconImage(iconImg);
        } catch (IOException e) {
            Main.throwErrorMessage("Couldn\'t load icon file.\n[IOException\n[Error code: 14]");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        innerPanel = new javax.swing.JPanel();
        visualGroupBox = new javax.swing.JPanel();
        mainGroupBox = new javax.swing.JPanel();
        textBeforeX = new javax.swing.JTextField();
        textBetweenXY = new javax.swing.JTextField();
        textAfterY = new javax.swing.JTextField();
        xL = new javax.swing.JLabel();
        yL = new javax.swing.JLabel();
        fontB = new javax.swing.JButton();
        textColorB = new javax.swing.JButton();
        backColorB = new javax.swing.JButton();
        sizeX = new javax.swing.JTextField();
        sXL = new javax.swing.JLabel();
        sYL = new javax.swing.JLabel();
        sizeY = new javax.swing.JTextField();
        boGroupBox = new javax.swing.JPanel();
        borderOptionsB = new javax.swing.JButton();
        oL = new javax.swing.JLabel();
        opacity = new javax.swing.JTextField();
        and = new javax.swing.JLabel();
        iconL = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        cursorLocationL = new javax.swing.JTextArea();
        aboutB = new javax.swing.JButton();
        saveB = new javax.swing.JButton();
        defaultB = new javax.swing.JButton();
        originB = new javax.swing.JButton();
        alwaysOnTopC = new javax.swing.JCheckBox();
        // = new javax.swing.JButton();
        logsStatsC = new javax.swing.JCheckBox();
        openDir = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        closeB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Options");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(192, 192, 192));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        innerPanel.setBackground(new java.awt.Color(153, 153, 153));
        innerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        visualGroupBox.setBackground(new java.awt.Color(153, 153, 153));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        visualGroupBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                visualGroupBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                visualGroupBoxMouseExited(evt);
            }
        });
        visualGroupBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainGroupBox.setBackground(new java.awt.Color(153, 153, 153));
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        mainGroupBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainGroupBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainGroupBoxMouseExited(evt);
            }
        });
        mainGroupBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textBeforeX.setBackground(new java.awt.Color(131, 131, 131));
        textBeforeX.setForeground(new java.awt.Color(255, 255, 255));
        textBeforeX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textBeforeX.setToolTipText("The text before the \"x\" component");
        textBeforeX.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(89, 89, 89)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 134, 134))));
        textBeforeX.setCaretColor(new java.awt.Color(255, 255, 255));
        textBeforeX.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textBeforeXCaretUpdate(evt);
            }
        });
        textBeforeX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textBeforeXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textBeforeXMouseExited(evt);
            }
        });
        mainGroupBox.add(textBeforeX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, 30));

        textBetweenXY.setBackground(new java.awt.Color(131, 131, 131));
        textBetweenXY.setForeground(new java.awt.Color(255, 255, 255));
        textBetweenXY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textBetweenXY.setToolTipText("The text between \"x\" and \"y\" components");
        textBetweenXY.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(89, 89, 89)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 134, 134))));
        textBetweenXY.setCaretColor(new java.awt.Color(255, 255, 255));
        textBetweenXY.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textBetweenXYCaretUpdate(evt);
            }
        });
        textBetweenXY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textBetweenXYMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textBetweenXYMouseExited(evt);
            }
        });
        mainGroupBox.add(textBetweenXY, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 30));

        textAfterY.setBackground(new java.awt.Color(131, 131, 131));
        textAfterY.setForeground(new java.awt.Color(255, 255, 255));
        textAfterY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAfterY.setToolTipText("The text after the \"y\" component");
        textAfterY.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(89, 89, 89)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 134, 134))));
        textAfterY.setCaretColor(new java.awt.Color(255, 255, 255));
        textAfterY.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textAfterYCaretUpdate(evt);
            }
        });
        textAfterY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textAfterYMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textAfterYMouseExited(evt);
            }
        });
        mainGroupBox.add(textAfterY, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 40, 30));

        xL.setForeground(new java.awt.Color(255, 255, 255));
        xL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xL.setText("*x*");
        xL.setToolTipText("\"x\" coordinate of the cursor");
        xL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xLMouseEntered(evt);
            }
        });
        mainGroupBox.add(xL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 20, 30));

        yL.setForeground(new java.awt.Color(255, 255, 255));
        yL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yL.setText("*y*");
        yL.setToolTipText("\"y\" coordinate of the cursor");
        yL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yLMouseEntered(evt);
            }
        });
        mainGroupBox.add(yL, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 20, 30));

        fontB.setBackground(new java.awt.Color(113, 113, 113));
        fontB.setForeground(new java.awt.Color(255, 255, 255));
        fontB.setText("Font");
        fontB.setToolTipText("This is obvious");
        fontB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 193, 193)));
        fontB.setMargin(new java.awt.Insets(2, 2, 2, 2));
        fontB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fontBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fontBMouseExited(evt);
            }
        });
        fontB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontBActionPerformed(evt);
            }
        });
        mainGroupBox.add(fontB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 40, 30));

        textColorB.setBackground(new java.awt.Color(113, 113, 113));
        textColorB.setForeground(new java.awt.Color(255, 255, 255));
        textColorB.setText("Fore Color");
        textColorB.setToolTipText("This is obvious");
        textColorB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 193, 193)));
        textColorB.setMargin(new java.awt.Insets(2, 2, 2, 2));
        textColorB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textColorBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textColorBMouseExited(evt);
            }
        });
        textColorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textColorBActionPerformed(evt);
            }
        });
        mainGroupBox.add(textColorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 30));

        backColorB.setBackground(new java.awt.Color(113, 113, 113));
        backColorB.setForeground(new java.awt.Color(255, 255, 255));
        backColorB.setText("Back Color");
        backColorB.setToolTipText("This is obvious");
        backColorB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 193, 193)));
        backColorB.setMargin(new java.awt.Insets(2, 2, 2, 2));
        backColorB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backColorBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backColorBMouseExited(evt);
            }
        });
        backColorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backColorBActionPerformed(evt);
            }
        });
        mainGroupBox.add(backColorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 70, 30));

        sizeX.setBackground(new java.awt.Color(131, 131, 131));
        sizeX.setForeground(new java.awt.Color(255, 255, 255));
        sizeX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sizeX.setToolTipText("Scroll to change \"x\" size of the main frame");
        sizeX.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(89, 89, 89)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 134, 134))));
        sizeX.setCaretColor(new java.awt.Color(255, 255, 255));
        sizeX.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                sizeXCaretUpdate(evt);
            }
        });
        sizeX.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                sizeXMouseWheelMoved(evt);
            }
        });
        sizeX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sizeXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sizeXMouseExited(evt);
            }
        });
        mainGroupBox.add(sizeX, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 50, 30));

        sXL.setForeground(new java.awt.Color(255, 255, 255));
        sXL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sXL.setText("Width : ");
        sXL.setToolTipText("");
        sXL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sXLMouseEntered(evt);
            }
        });
        mainGroupBox.add(sXL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 90, 30));

        sYL.setForeground(new java.awt.Color(255, 255, 255));
        sYL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sYL.setText("Height : ");
        sYL.setToolTipText("");
        sYL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sYLMouseEntered(evt);
            }
        });
        mainGroupBox.add(sYL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 90, 30));

        sizeY.setBackground(new java.awt.Color(131, 131, 131));
        sizeY.setForeground(new java.awt.Color(255, 255, 255));
        sizeY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sizeY.setToolTipText("Scroll to change \"y\" size of the main frame");
        sizeY.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(89, 89, 89)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 134, 134))));
        sizeY.setCaretColor(new java.awt.Color(255, 255, 255));
        sizeY.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                sizeYCaretUpdate(evt);
            }
        });
        sizeY.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                sizeYMouseWheelMoved(evt);
            }
        });
        sizeY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sizeYMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sizeYMouseExited(evt);
            }
        });
        mainGroupBox.add(sizeY, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 50, 30));

        visualGroupBox.add(mainGroupBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 380, 110));

        boGroupBox.setBackground(new java.awt.Color(153, 153, 153));
        boGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Border / Opacity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        boGroupBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boGroupBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boGroupBoxMouseExited(evt);
            }
        });
        boGroupBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borderOptionsB.setBackground(new java.awt.Color(113, 113, 113));
        borderOptionsB.setForeground(new java.awt.Color(255, 255, 255));
        borderOptionsB.setText("Border Options");
        borderOptionsB.setToolTipText("Available soon...");
        borderOptionsB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 193, 193)));
        borderOptionsB.setEnabled(false);
        borderOptionsB.setMargin(new java.awt.Insets(2, 2, 2, 2));
        borderOptionsB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borderOptionsBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borderOptionsBMouseExited(evt);
            }
        });
        boGroupBox.add(borderOptionsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 130, 30));

        oL.setForeground(new java.awt.Color(255, 255, 255));
        oL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oL.setText("Opacity (%): ");
        oL.setToolTipText("");
        oL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oLMouseEntered(evt);
            }
        });
        boGroupBox.add(oL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 30));

        opacity.setBackground(new java.awt.Color(131, 131, 131));
        opacity.setForeground(new java.awt.Color(255, 255, 255));
        opacity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        opacity.setToolTipText("Scroll to change opacity of the main frame.");
        opacity.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(89, 89, 89)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 134, 134))));
        opacity.setCaretColor(new java.awt.Color(255, 255, 255));
        opacity.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                opacityCaretUpdate(evt);
            }
        });
        opacity.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                opacityMouseWheelMoved(evt);
            }
        });
        opacity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opacityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opacityMouseExited(evt);
            }
        });
        boGroupBox.add(opacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 70, 30));

        and.setForeground(new java.awt.Color(255, 255, 255));
        and.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        and.setText("and...");
        and.setToolTipText("");
        and.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                andMouseEntered(evt);
            }
        });
        boGroupBox.add(and, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 40, 30));

        visualGroupBox.add(boGroupBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 380, 60));

        innerPanel.add(visualGroupBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 200));

        iconL.setBackground(new java.awt.Color(113, 113, 113));
        iconL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/msa/tools/cursorlocation/cursor-x32.png"))); // NOI18N
        iconL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 193, 193)));
        iconL.setOpaque(true);
        iconL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconLMouseExited(evt);
            }
        });
        innerPanel.add(iconL, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 90, 90));

        scrollPane.setBackground(new java.awt.Color(51, 51, 51));
        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        cursorLocationL.setEditable(false);
        cursorLocationL.setBackground(new java.awt.Color(113, 113, 113));
        cursorLocationL.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        cursorLocationL.setForeground(new java.awt.Color(255, 255, 255));
        cursorLocationL.setText("  Cursor Location\n     Version: 2.2\n\n  2016");
        cursorLocationL.setAutoscrolls(false);
        cursorLocationL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 193, 193)));
        cursorLocationL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cursorLocationL.setFocusable(false);
        cursorLocationL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cursorLocationLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cursorLocationLMouseExited(evt);
            }
        });
        scrollPane.setViewportView(cursorLocationL);

        innerPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 90, 60));

        aboutB.setBackground(new java.awt.Color(113, 113, 113));
        aboutB.setForeground(new java.awt.Color(255, 255, 255));
        aboutB.setText("About...");
        aboutB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 193, 193)));
        aboutB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutBMouseExited(evt);
            }
        });
        aboutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBActionPerformed(evt);
            }
        });
        innerPanel.add(aboutB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 90, 30));

        saveB.setBackground(new java.awt.Color(113, 113, 113));
        saveB.setForeground(new java.awt.Color(255, 255, 255));
        saveB.setText("Save");
        saveB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 193, 193)));
        saveB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveBMouseExited(evt);
            }
        });
        saveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBActionPerformed(evt);
            }
        });
        innerPanel.add(saveB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 90, 30));

        defaultB.setBackground(new java.awt.Color(113, 113, 113));
        defaultB.setForeground(new java.awt.Color(255, 255, 255));
        defaultB.setText("Default");
        defaultB.setToolTipText("Bring back the \"factory\" settings.");
        defaultB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 193, 193)));
        defaultB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                defaultBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                defaultBMouseExited(evt);
            }
        });
        defaultB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultBActionPerformed(evt);
            }
        });
        innerPanel.add(defaultB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 70, 30));

        originB.setBackground(new java.awt.Color(113, 113, 113));
        originB.setForeground(new java.awt.Color(255, 255, 255));
        originB.setText("Change Origin (|x|, |y|)");
        originB.setToolTipText("Change origin of the screen.");
        originB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 193, 193)));
        originB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                originBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                originBMouseExited(evt);
            }
        });
        originB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originBActionPerformed(evt);
            }
        });
        innerPanel.add(originB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 160, 30));

        alwaysOnTopC.setBackground(new java.awt.Color(41, 41, 41));
        alwaysOnTopC.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        alwaysOnTopC.setForeground(new java.awt.Color(255, 255, 255));
        alwaysOnTopC.setSelected(true);
        alwaysOnTopC.setText("Always on top");
        alwaysOnTopC.setOpaque(false);
        alwaysOnTopC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alwaysOnTopCActionPerformed(evt);
            }
        });
        innerPanel.add(alwaysOnTopC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 30));

//        hmsB.setBackground(new java.awt.Color(107, 107, 107));
//        hmsB.setForeground(new java.awt.Color(204, 204, 204));
//        hmsB.setText("Github");
//        hmsB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
//        hmsB.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseEntered(java.awt.event.MouseEvent evt) {
//                hmsBMouseEntered(evt);
//            }
//            public void mouseExited(java.awt.event.MouseEvent evt) {
//                hmsBMouseExited(evt);
//            }
//        });
//        hmsB.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                hmsBActionPerformed(evt);
//            }
//        });
//        innerPanel.add(hmsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 340, 30));

        logsStatsC.setBackground(new java.awt.Color(41, 41, 41));
        logsStatsC.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        logsStatsC.setForeground(new java.awt.Color(255, 255, 255));
        logsStatsC.setSelected(true);
        logsStatsC.setText("Save logs (" + String.valueOf(Main.logs_str.length()) + " chars)");
        logsStatsC.setToolTipText("Saves mouse movements to user's home direction. Right click to open directory.");
        logsStatsC.setOpaque(false);
        logsStatsC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logsStatsCActionPerformed(evt);
            }
        });
        innerPanel.add(logsStatsC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 232, 160, 30));

        openDir.setBackground(new java.awt.Color(113, 113, 113));
        openDir.setForeground(new java.awt.Color(255, 255, 255));
        openDir.setText("Open Storage Directory");
        openDir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 193, 193)));
        openDir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                openDirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                openDirMouseExited(evt);
            }
        });
        openDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openDirActionPerformed(evt);
            }
        });
        innerPanel.add(openDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, /*150*/500, 30));

        mainPanel.add(innerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 520, 300));

        titleLabel.setBackground(new java.awt.Color(153, 153, 153));
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/msa/tools/cursorlocation/cursor-x16.png"))); // NOI18N
        titleLabel.setText("Options - Cursor Location");
        titleLabel.setIconTextGap(2);
        titleLabel.setOpaque(true);
        titleLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleLabelMouseDragged(evt);
            }
        });
        titleLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titleLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titleLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleLabelMousePressed(evt);
            }
        });
        mainPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 30));

        closeB.setBackground(new java.awt.Color(162, 75, 93));
        closeB.setForeground(new java.awt.Color(255, 255, 255));
        closeB.setText("X");
        closeB.setBorder(null);
        closeB.setMargin(new java.awt.Insets(0, 14, 0, 14));
        closeB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBMouseClicked(evt);
            }
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
        mainPanel.add(closeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void titleLabelMouseEntered(java.awt.event.MouseEvent evt) {                                        
        titleLabel.setBackground(KINDA_GRAY.darker());
    }                                       

    private void titleLabelMouseExited(java.awt.event.MouseEvent evt) {                                       
        titleLabel.setBackground(KINDA_GRAY);
    }                                      

    private void titleLabelMousePressed(java.awt.event.MouseEvent evt) {                                        
        mouse_x = evt.getX();
        mouse_y = evt.getY();
    }                                       

    private void titleLabelMouseDragged(java.awt.event.MouseEvent evt) {                                        
        this.setLocation(evt.getXOnScreen() - mouse_x, evt.getYOnScreen() - mouse_y);
    }                                       

    private void closeBMouseEntered(java.awt.event.MouseEvent evt) {                                    
        closeB.setBackground(CLOSE_COLOR.darker());
    }                                   

    private void closeBMouseExited(java.awt.event.MouseEvent evt) {                                   
        closeB.setBackground(CLOSE_COLOR);
    }                                  

    private void closeBMouseClicked(java.awt.event.MouseEvent evt) {                                    
        //this.setVisible(false);
    }                                   
// <editor-fold defaultstate="collapsed" desc="Border Events">
    private void visualGroupBoxMouseEntered(java.awt.event.MouseEvent evt) {                                            
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
    }                                           

    private void visualGroupBoxMouseExited(java.awt.event.MouseEvent evt) {                                           
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
    }                                          

    private void mainGroupBoxMouseEntered(java.awt.event.MouseEvent evt) {                                          
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
    }                                         

    private void mainGroupBoxMouseExited(java.awt.event.MouseEvent evt) {                                         
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
    }                                        

    private void boGroupBoxMouseEntered(java.awt.event.MouseEvent evt) {                                        
        boGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Border / Opacity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
    }                                       

    private void boGroupBoxMouseExited(java.awt.event.MouseEvent evt) {                                       
        boGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true),
                "Border / Opacity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
    }                                      

    private void textBeforeXMouseEntered(java.awt.event.MouseEvent evt) {                                         
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        textBeforeX.setBackground(SETTINGS_MOUSE_ENTERED_COLOR.darker().darker());
    }                                        

    private void textBeforeXMouseExited(java.awt.event.MouseEvent evt) {                                        
        textBeforeX.setBackground(TYPE0_GRAY);
    }                                       

    private void xLMouseEntered(java.awt.event.MouseEvent evt) {                                
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
    }                               

    private void textBetweenXYMouseEntered(java.awt.event.MouseEvent evt) {                                           
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        textBetweenXY.setBackground(SETTINGS_MOUSE_ENTERED_COLOR.darker().darker());
    }                                          

    private void textBetweenXYMouseExited(java.awt.event.MouseEvent evt) {                                          
        textBetweenXY.setBackground(TYPE0_GRAY);
    }                                         

    private void yLMouseEntered(java.awt.event.MouseEvent evt) {                                
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
    }                               

    private void textAfterYMouseEntered(java.awt.event.MouseEvent evt) {                                        
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        textAfterY.setBackground(SETTINGS_MOUSE_ENTERED_COLOR.darker().darker());
    }                                       

    private void textAfterYMouseExited(java.awt.event.MouseEvent evt) {                                       
        textAfterY.setBackground(TYPE0_GRAY);
    }                                      

    private void sXLMouseEntered(java.awt.event.MouseEvent evt) {                                 
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
    }                                

    private void sYLMouseEntered(java.awt.event.MouseEvent evt) {                                 
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
    }                                

    private void sizeXMouseEntered(java.awt.event.MouseEvent evt) {                                   
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        sizeX.setBackground(SETTINGS_MOUSE_ENTERED_COLOR.darker().darker());
    }                                  

    private void sizeXMouseExited(java.awt.event.MouseEvent evt) {                                  
        sizeX.setBackground(TYPE0_GRAY);
    }                                 

    private void oLMouseEntered(java.awt.event.MouseEvent evt) {                                
        boGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Border / Opacity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
    }                               

    private void sizeYMouseEntered(java.awt.event.MouseEvent evt) {                                   
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        sizeY.setBackground(SETTINGS_MOUSE_ENTERED_COLOR.darker().darker());
    }                                  

    private void sizeYMouseExited(java.awt.event.MouseEvent evt) {                                  
        sizeY.setBackground(TYPE0_GRAY);
    }                                 

    private void textColorBMouseEntered(java.awt.event.MouseEvent evt) {                                        
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        textColorB.setBackground(SETTINGS_MOUSE_ENTERED_COLOR);
    }                                       

    private void textColorBMouseExited(java.awt.event.MouseEvent evt) {                                       
        textColorB.setBackground(TYPE1_GRAY);
    }                                      

    private void fontBMouseEntered(java.awt.event.MouseEvent evt) {                                   
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        fontB.setBackground(SETTINGS_MOUSE_ENTERED_COLOR);
    }                                  

    private void fontBMouseExited(java.awt.event.MouseEvent evt) {                                  
        fontB.setBackground(TYPE1_GRAY);
    }                                 

    private void backColorBMouseEntered(java.awt.event.MouseEvent evt) {                                        
        mainGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Main", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        backColorB.setBackground(SETTINGS_MOUSE_ENTERED_COLOR);
    }                                       

    private void backColorBMouseExited(java.awt.event.MouseEvent evt) {                                       
        backColorB.setBackground(TYPE1_GRAY);
    }                                      

    private void opacityMouseEntered(java.awt.event.MouseEvent evt) {                                     
        boGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Border / Opacity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        opacity.setBackground(SETTINGS_MOUSE_ENTERED_COLOR.darker().darker());
    }                                    

    private void opacityMouseExited(java.awt.event.MouseEvent evt) {                                    
        opacity.setBackground(TYPE0_GRAY);
    }                                   

    private void andMouseEntered(java.awt.event.MouseEvent evt) {                                 
        boGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Border / Opacity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
    }                                

    private void borderOptionsBMouseEntered(java.awt.event.MouseEvent evt) {                                            
        boGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Border / Opacity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        visualGroupBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(SETTINGS_MOUSE_ENTERED_COLOR, 1, true),
                "Visual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)));
        borderOptionsB.setBackground(SETTINGS_MOUSE_ENTERED_COLOR);
    }                                           
// </editor-fold>
    private void borderOptionsBMouseExited(java.awt.event.MouseEvent evt) {                                           
        borderOptionsB.setBackground(TYPE1_GRAY);
    }                                          

    private void iconLMouseEntered(java.awt.event.MouseEvent evt) {                                   
        iconL.setBackground(SETTINGS_MOUSE_ENTERED_COLOR);
    }                                  

    private void iconLMouseExited(java.awt.event.MouseEvent evt) {                                  
        iconL.setBackground(TYPE1_GRAY);
    }                                 

    private void cursorLocationLMouseEntered(java.awt.event.MouseEvent evt) {                                             
        cursorLocationL.setBackground(SETTINGS_MOUSE_ENTERED_COLOR);
    }                                            

    private void cursorLocationLMouseExited(java.awt.event.MouseEvent evt) {                                            
        cursorLocationL.setBackground(TYPE1_GRAY);
    }                                           

    private void aboutBMouseEntered(java.awt.event.MouseEvent evt) {                                    
        aboutB.setBackground(SETTINGS_MOUSE_ENTERED_COLOR);
    }                                   

    private void aboutBMouseExited(java.awt.event.MouseEvent evt) {                                   
        aboutB.setBackground(TYPE1_GRAY);
    }                                  

    private void saveBMouseEntered(java.awt.event.MouseEvent evt) {                                   
        saveB.setBackground(SETTINGS_MOUSE_ENTERED_COLOR);
    }                                  

    private void saveBMouseExited(java.awt.event.MouseEvent evt) {                                  
        saveB.setBackground(TYPE1_GRAY);
    }                                 

    private void defaultBMouseEntered(java.awt.event.MouseEvent evt) {                                      
        defaultB.setBackground(SETTINGS_MOUSE_ENTERED_COLOR);
    }                                     

    private void defaultBMouseExited(java.awt.event.MouseEvent evt) {                                     
        defaultB.setBackground(TYPE1_GRAY);
    }                                    

    private void originBMouseEntered(java.awt.event.MouseEvent evt) {                                     
        originB.setBackground(SETTINGS_MOUSE_ENTERED_COLOR);
    }                                    

    private void originBMouseExited(java.awt.event.MouseEvent evt) {                                    
        originB.setBackground(TYPE1_GRAY);
    }                                   

//    private void hmsBMouseEntered(java.awt.event.MouseEvent evt) {                                  
//        hmsB.setBackground(TYPE1_GRAY.darker().darker());
//    }                                 
//
//    private void hmsBMouseExited(java.awt.event.MouseEvent evt) {                                 
//        hmsB.setBackground(TYPE2_GRAY);
//    }                                

    private void backColorBActionPerformed(java.awt.event.ActionEvent evt) {                                           
        ColorChooser color = new ColorChooser();
        color.which("BackColor");
        color.setVisible(true);
        this.setVisible(false);
    }                                          

    private void closeBActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Main.getSettings();
        Main.save_logs_statistics = TEMP_SAVE_LOGS_STATS;
        Main.opacity = TEMP_OPACITY;
        Main.options.setEnabled(true);
        this.setVisible(false);
    }                                      

    public static Color TEMP_BACK_COLOR;
    public static Color TEMP_FORE_COLOR;
    public static int TEMP_OPACITY;
    public static boolean TEMP_SAVE_LOGS_STATS;
    public static boolean TEMP_ALWAYS_ON_TOP;
    public static int TEMP_ORIGIN;
    public static int LOGS_STR_LENGHT;

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        Main.options.setEnabled(false);
        TEMP_BACK_COLOR = new Color(Main.b_red, Main.b_green, Main.b_blue);
        TEMP_FORE_COLOR = new Color(Main.f_red, Main.f_green, Main.f_blue);
        TEMP_OPACITY = Main.opacity;
        TEMP_SAVE_LOGS_STATS = Main.save_logs_statistics;
        TEMP_ALWAYS_ON_TOP = Main.always_on_top;
        textBeforeX.setText(Main.before_x);
        textBetweenXY.setText(Main.between);
        textAfterY.setText(Main.after_y);
        sizeX.setText(String.valueOf(Main.size_x));
        sizeY.setText(String.valueOf(Main.size_y));
        opacity.setText(String.valueOf(Main.opacity));
        logsStatsC.setSelected(Main.save_logs_statistics);
        alwaysOnTopC.setSelected(Main.always_on_top);
        TEMP_ORIGIN = Main.origin;
        initTimer();
    }                                 

    private void saveBActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (!catched) {
            this.setVisible(false);
            Main.saveSettings();
            Main.options.setEnabled(true);
        }
        if (catched) {
            Main.throwErrorMessage("Please enter valid value.\n[NumberFormatException]\n[Error code: 015]");
        }
    }                                     

    private void textBeforeXCaretUpdate(javax.swing.event.CaretEvent evt) {                                        
        Main.before_x = textBeforeX.getText();
    }                                       

    private void textBetweenXYCaretUpdate(javax.swing.event.CaretEvent evt) {                                          
        Main.between = textBetweenXY.getText();
    }                                         

    private void textAfterYCaretUpdate(javax.swing.event.CaretEvent evt) {                                       
        Main.after_y = textAfterY.getText();
    }                                      

    private void sizeXCaretUpdate(javax.swing.event.CaretEvent evt) {                                  
        try {
            Main.size_x = Integer.valueOf(sizeX.getText());
            catched = false;
        } catch (Exception e) {
            catched = true;
        }
    }                                 

    private void sizeYCaretUpdate(javax.swing.event.CaretEvent evt) {                                  
        try {
            Main.size_y = Integer.valueOf(sizeY.getText());
            catched = false;
        } catch (Exception e) {
            catched = true;
        }
    }                                 

    private void opacityCaretUpdate(javax.swing.event.CaretEvent evt) {                                    
        try {
            Main.opacity = Integer.valueOf(opacity.getText());
            catched = false;
        } catch (Exception e) {
            catched = true;
        }
    }                                   

    private void textColorBActionPerformed(java.awt.event.ActionEvent evt) {                                           
        ColorChooser color = new ColorChooser();
        color.which("ForeColor");
        color.setVisible(true);
        this.setVisible(false);
    }                                          

    private void sizeXMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {                                      
        try {
            int x = Integer.valueOf(sizeX.getText());
            if (evt.getWheelRotation() < 0) {
                x++;
            }
            if (evt.getWheelRotation() > 0) {
                x--;
            }
            sizeX.setText(String.valueOf(x));
        } catch (Exception e) {
            // Do nothing.
        }
    }                                     

    private void sizeYMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {                                      
        try {
            int y = Integer.valueOf(sizeY.getText());
            if (evt.getWheelRotation() < 0) {
                y++;
            }
            if (evt.getWheelRotation() > 0) {
                y--;
            }
            sizeY.setText(String.valueOf(y));
        } catch (Exception e) {
            // Do nothing.
        }
    }                                     

    private void fontBActionPerformed(java.awt.event.ActionEvent evt) {                                      
        JFontChooser font = new JFontChooser();
        font.setSelectedFont(Main.locationLabel.getFont());
        int result = font.showDialog(Main.locationLabel);
        if (result == 0) {
            Main.locationLabel.setFont(font.getSelectedFont());
        }
    }                                     

    private void defaultBActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Dialog d = new Dialog(3, 2, "Restore default settıngs", "Do you really want to\nrestore default settings?\nYour current settings will be lost.");
        int result = d.showDialog();
        if (result == 1) {
            Main.saveDefaultSettings();
            Main.getSettings();
            Main.applySettings();
            updateOptions();
        }
    }                                        

    private void alwaysOnTopCActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Main.always_on_top = alwaysOnTopC.isSelected();
    }                                            

    private void logsStatsCActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Main.save_logs_statistics = logsStatsC.isSelected();
    }                                          

    private void opacityMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {                                        
        try {
            opacity.setText(Integer.valueOf(opacity.getText()) > 0 ? (((Integer.valueOf(opacity.getText()) > 100 ? "100" : (opacity.getText())))) : "0");
            int o = Integer.valueOf(opacity.getText());
            if (evt.getWheelRotation() > 0) {
                if (o <= 100 && o >= 0) {
                    o--;
                }
            }
            if (evt.getWheelRotation() < 0) {
                if (o <= 100 && o >= 0) {
                    o++;
                }
            }
            if (o < 101 && o > 0) {
                opacity.setText(String.valueOf(o));
            } else if (o > 100 | o < 0) {
                o--;
                opacity.setText(String.valueOf(o));
            }
        } catch (Exception e) {
            // Do nothing.
        }
    }                                       

    private void hmsBActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if (System.getProperty("os.name").startsWith("Windows")) {
            try {
                Runtime.getRuntime().exec("cmd /c start https://github.com/shamilatesoglu/cursor-location");
            } catch (IOException ex) {
                Main.throwErrorMessage("Something went wrong,\nwhile processing given command.\n[Unknown]\n[Error code: 016]");
            }
        } else if (!System.getProperty("os.name").startsWith("Windows")) {
            Main.throwErrorMessage("This feature is available only\nin a Windows OS, yet.\n[OSException]\n[Error code: 028]");
        }
    }                                    

    private void originBActionPerformed(java.awt.event.ActionEvent evt) {                                        
        ChangeOrigin co = new ChangeOrigin();
        co.setVisible(true);
    }                                       

    private void aboutBActionPerformed(java.awt.event.ActionEvent evt) {                                       
        About a = new About();
        a.setVisible(true);
    }                                      

    private void openDirMouseEntered(java.awt.event.MouseEvent evt) {                                     
        openDir.setBackground(SETTINGS_MOUSE_ENTERED_COLOR);
    }                                    

    private void openDirMouseExited(java.awt.event.MouseEvent evt) {                                    
        openDir.setBackground(TYPE1_GRAY);
    }                                   

    private void openDirActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(Main.USER_FILE_DIR);
        } catch (IllegalArgumentException iae) {
            Main.throwErrorMessage("Something went wrong,\nwhile processing given command.\n[IllegalArgumentException]\n[Error code: 17]");
        } catch (IOException ex) {
            Main.throwErrorMessage("Something went wrong,\nwhile input/output process.\n[IOException]\n[Error code: 18]");
        }
    }                                       

    public void initTimer() {
        TimeListener listener = new TimeListener();
        Timer timer = new Timer(1, listener);
        timer.start();
    }

    public void updateOptions() {
        textBeforeX.setText(Main.before_x);
        textBetweenXY.setText(Main.between);
        textAfterY.setText(Main.after_y);
        sizeX.setText(String.valueOf(Main.size_x));
        sizeY.setText(String.valueOf(Main.size_y));
        opacity.setText(String.valueOf(Main.opacity));
        logsStatsC.setSelected(Main.save_logs_statistics);
        alwaysOnTopC.setSelected(Main.always_on_top);
    }

    public class TimeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.valueOf(opacity.getText()) < 0) {
                opacity.setText("0");
            }
            if (Integer.valueOf(opacity.getText()) > 100) {
                opacity.setText("100");
            }
            logsStatsC.setText("Save logs (" + String.valueOf(Main.logs_str.length()) + " chars)");
            logsStatsC.setToolTipText("Contains " + String.valueOf(Main.logs_str.length()) + " characters. " + "Saves mouse movements to user's home direction.");
        }
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
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Options().setVisible(true);
        });
    }

    // Variables declaration                   
    public static javax.swing.JButton aboutB;
    private javax.swing.JCheckBox alwaysOnTopC;
    private javax.swing.JLabel and;
    private javax.swing.JButton backColorB;
    private javax.swing.JPanel boGroupBox;
    private javax.swing.JButton borderOptionsB;
    private javax.swing.JButton closeB;
    private javax.swing.JTextArea cursorLocationL;
    private javax.swing.JButton defaultB;
    private javax.swing.JButton fontB;
    private javax.swing.JButton hmsB;
    private javax.swing.JLabel iconL;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JCheckBox logsStatsC;
    private javax.swing.JPanel mainGroupBox;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel oL;
    private javax.swing.JTextField opacity;
    private javax.swing.JButton openDir;
    public static javax.swing.JButton originB;
    private javax.swing.JLabel sXL;
    private javax.swing.JLabel sYL;
    private javax.swing.JButton saveB;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField sizeX;
    private javax.swing.JTextField sizeY;
    private javax.swing.JTextField textAfterY;
    private javax.swing.JTextField textBeforeX;
    private javax.swing.JTextField textBetweenXY;
    private javax.swing.JButton textColorB;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel visualGroupBox;
    private javax.swing.JLabel xL;
    private javax.swing.JLabel yL;
    // End of variables declaration                   
}
