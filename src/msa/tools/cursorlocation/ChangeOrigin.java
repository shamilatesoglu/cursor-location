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
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author Samil Atesoglu
 */
public class ChangeOrigin extends javax.swing.JFrame {

    public int mouse_x;
    public int mouse_y;

    public ChangeOrigin() {
        initComponents();
        try {
            InputStream imgStream = ChangeOrigin.class.getResourceAsStream("cursor-x32.png");
            BufferedImage iconImg = ImageIO.read(imgStream);
            this.setIconImage(iconImg);
        } catch (IOException e) {
            Main.throwErrorMessage("Couldn\'t load icon file.\n[IOException]\n[Error code: 22]");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleL = new javax.swing.JLabel();
        innerPanel = new javax.swing.JPanel();
        o0 = new javax.swing.JButton();
        separatorX = new javax.swing.JSeparator();
        separatorY = new javax.swing.JSeparator();
        o1 = new javax.swing.JButton();
        o2 = new javax.swing.JButton();
        o3 = new javax.swing.JButton();
        descriptionL = new javax.swing.JLabel();
        xL = new javax.swing.JLabel();
        yL = new javax.swing.JLabel();
        defaultB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        okB = new javax.swing.JButton();
        orB = new javax.swing.JLabel();
        closeB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(192, 192, 192));
        mainPanel.setForeground(new java.awt.Color(102, 102, 102));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleL.setBackground(new java.awt.Color(153, 153, 153));
        titleL.setForeground(new java.awt.Color(255, 255, 255));
        titleL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/msa/tools/cursorlocation/cursor-x16.png"))); // NOI18N
        titleL.setText(" Change Origin - Cursor Location");
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
        mainPanel.add(titleL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 30));

        innerPanel.setBackground(new java.awt.Color(192, 192, 192));
        innerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        innerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        o0.setBackground(new java.awt.Color(73, 73, 73));
        o0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o0ActionPerformed(evt);
            }
        });
        innerPanel.add(o0, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 90, 60));

        separatorX.setBackground(new java.awt.Color(51, 51, 51));
        separatorX.setForeground(new java.awt.Color(51, 51, 51));
        separatorX.setOpaque(true);
        innerPanel.add(separatorX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 410, 10));

        separatorY.setBackground(new java.awt.Color(51, 51, 51));
        separatorY.setForeground(new java.awt.Color(51, 51, 51));
        separatorY.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separatorY.setOpaque(true);
        innerPanel.add(separatorY, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 10, 230));

        o1.setBackground(new java.awt.Color(73, 73, 73));
        o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o1ActionPerformed(evt);
            }
        });
        innerPanel.add(o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 90, 60));

        o2.setBackground(new java.awt.Color(73, 73, 73));
        o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o2ActionPerformed(evt);
            }
        });
        innerPanel.add(o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 90, 60));

        o3.setBackground(new java.awt.Color(73, 73, 73));
        o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o3ActionPerformed(evt);
            }
        });
        innerPanel.add(o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 90, 60));

        descriptionL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descriptionL.setText("-");
        innerPanel.add(descriptionL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 410, 50));

        xL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xL.setText("X");
        innerPanel.add(xL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 10, -1));

        yL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yL.setText("Y");
        innerPanel.add(yL, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 20, -1));

        defaultB.setBackground(new java.awt.Color(51, 51, 51));
        defaultB.setForeground(new java.awt.Color(255, 255, 255));
        defaultB.setText("Default");
        defaultB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultBActionPerformed(evt);
            }
        });
        innerPanel.add(defaultB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, -1));

        cancelB.setBackground(new java.awt.Color(51, 51, 51));
        cancelB.setForeground(new java.awt.Color(255, 255, 255));
        cancelB.setText("Cancel");
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });
        innerPanel.add(cancelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 80, -1));

        okB.setBackground(new java.awt.Color(51, 51, 51));
        okB.setForeground(new java.awt.Color(255, 255, 255));
        okB.setText("OK");
        okB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBActionPerformed(evt);
            }
        });
        innerPanel.add(okB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 90, -1));

        orB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orB.setText("(0, 0)");
        orB.setToolTipText("");
        innerPanel.add(orB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 40, 20));

        mainPanel.add(innerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 430, 350));

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
        mainPanel.add(closeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void titleLMouseDragged(java.awt.event.MouseEvent evt) {                                    
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouse_x, y - mouse_y);
    }                                   

    private void titleLMousePressed(java.awt.event.MouseEvent evt) {                                    
        mouse_x = evt.getX();
        mouse_y = evt.getY();
    }                                   

    private void titleLMouseEntered(java.awt.event.MouseEvent evt) {                                    
        titleL.setBackground(titleL.getBackground().darker());
    }                                   

    private void titleLMouseExited(java.awt.event.MouseEvent evt) {                                   
        titleL.setBackground(titleL.getBackground().brighter());
    }                                  

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        if (Main.origin == 0) {
            o0.setText("Screen");
            o0.setBackground(o0.getBackground().brighter().brighter());
            o1.setText("");
            o1.setBackground(o0.getBackground().darker().darker());
            o2.setText("");
            o2.setBackground(o0.getBackground().darker().darker());
            o3.setText("");
            o3.setBackground(o0.getBackground().darker().darker());
            descriptionL.setText("Top-left corner of the screen selected as origin.");
        }
        if (Main.origin == 1) {
            o1.setText("Screen");
            o1.setBackground(o1.getBackground().brighter().brighter());
            o2.setText("");
            o2.setBackground(o1.getBackground().darker().darker());
            o3.setText("");
            o3.setBackground(o1.getBackground().darker().darker());
            o0.setText("");
            o0.setBackground(o1.getBackground().darker().darker());
            descriptionL.setText("Bottom-left corner of the screen selected as origin.");
        }
        if (Main.origin == 2) {
            o2.setText("Screen");
            o2.setBackground(o2.getBackground().brighter().brighter());
            o0.setText("");
            o0.setBackground(o2.getBackground().darker().darker());
            o1.setText("");
            o1.setBackground(o2.getBackground().darker().darker());
            o3.setText("");
            o3.setBackground(o2.getBackground().darker().darker());
            descriptionL.setText("Bottom-right corner of the screen selected as origin.");
        }
        if (Main.origin == 3) {
            o3.setText("Screen");
            o3.setBackground(o3.getBackground().brighter().brighter());
            o0.setText("");
            o0.setBackground(o3.getBackground().darker().darker());
            o1.setText("");
            o1.setBackground(o3.getBackground().darker().darker());
            o2.setText("");
            o2.setBackground(o3.getBackground().darker().darker());
            descriptionL.setText("Top-right corner of the screen selected as origin.");
        }
        Options.originB.setEnabled(false);
    }                                 

    private void o0ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        o0.setText("Screen");
        o0.setBackground(o0.getBackground().brighter().brighter());
        o1.setText("");
        o1.setBackground(o0.getBackground().darker().darker());
        o2.setText("");
        o2.setBackground(o0.getBackground().darker().darker());
        o3.setText("");
        o3.setBackground(o0.getBackground().darker().darker());
        descriptionL.setText("Top-left corner of the screen selected as origin.");
        Main.origin = 0;
    }                                  

    private void o1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        o1.setText("Screen");
        o1.setBackground(o1.getBackground().brighter().brighter());
        o2.setText("");
        o2.setBackground(o1.getBackground().darker().darker());
        o3.setText("");
        o3.setBackground(o1.getBackground().darker().darker());
        o0.setText("");
        o0.setBackground(o1.getBackground().darker().darker());
        descriptionL.setText("Bottom-left corner of the screen selected as origin.");
        Main.origin = 1;
    }                                  

    private void o2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        o2.setText("Screen");
        o2.setBackground(o2.getBackground().brighter().brighter());
        o0.setText("");
        o0.setBackground(o2.getBackground().darker().darker());
        o1.setText("");
        o1.setBackground(o2.getBackground().darker().darker());
        o3.setText("");
        o3.setBackground(o2.getBackground().darker().darker());
        descriptionL.setText("Bottom-right corner of the screen selected as origin.");
        Main.origin = 2;
    }                                  

    private void o3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        o3.setText("Screen");
        o3.setBackground(o3.getBackground().brighter().brighter());
        o0.setText("");
        o0.setBackground(o3.getBackground().darker().darker());
        o1.setText("");
        o1.setBackground(o3.getBackground().darker().darker());
        o2.setText("");
        o2.setBackground(o3.getBackground().darker().darker());
        descriptionL.setText("Top-right corner of the screen selected as origin.");
        Main.origin = 3;
    }                                  

    private void closeBMouseClicked(java.awt.event.MouseEvent evt) {                                    
        cancelB.doClick();
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

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Main.origin = Options.TEMP_ORIGIN;
        Options.originB.setEnabled(true);
        this.setVisible(false);
    }                                       

    private void okBActionPerformed(java.awt.event.ActionEvent evt) {                                    
        Options.originB.setEnabled(true);
        this.setVisible(false);
    }                                   

    private void defaultBActionPerformed(java.awt.event.ActionEvent evt) {                                         
        o0.doClick();
        o1.setBackground(new Color(73, 73, 73));
        o2.setBackground(new Color(73, 73, 73));
        o3.setBackground(new Color(73, 73, 73));
        o0.setBackground(new Color(73, 73, 73).brighter().brighter());
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
            java.util.logging.Logger.getLogger(ChangeOrigin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ChangeOrigin().setVisible(true);
        });
    }

    // Variables declaration                     
    private javax.swing.JButton cancelB;
    private javax.swing.JButton closeB;
    private javax.swing.JButton defaultB;
    private javax.swing.JLabel descriptionL;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton o0;
    private javax.swing.JButton o1;
    private javax.swing.JButton o2;
    private javax.swing.JButton o3;
    private javax.swing.JButton okB;
    private javax.swing.JLabel orB;
    private javax.swing.JSeparator separatorX;
    private javax.swing.JSeparator separatorY;
    private javax.swing.JLabel titleL;
    private javax.swing.JLabel xL;
    private javax.swing.JLabel yL;
    // End of variables declaration                   

}
