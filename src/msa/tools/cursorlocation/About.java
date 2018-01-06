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
public class About extends javax.swing.JFrame {

    public int mouse_x;
    public int mouse_y;

    public About() {
        initComponents();
        try {
            InputStream imgStream = About.class.getResourceAsStream("cursor-x32.png");
            BufferedImage iconImg = ImageIO.read(imgStream);
            this.setIconImage(iconImg);
        } catch (IOException e) {
            Main.throwErrorMessage("Couldn\'t load icon file.\n[IOException\n[Error code: 27]");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleL = new javax.swing.JLabel();
        closeB = new javax.swing.JButton();
        innerPanel = new javax.swing.JPanel();
        okB = new javax.swing.JButton();
        sp1 = new javax.swing.JScrollPane();
        tp1 = new javax.swing.JTextPane();
        contactL = new javax.swing.JLabel();
        visitL = new javax.swing.JLabel();
//        jLabel1 = new javax.swing.JLabel();
//        jLabel2 = new javax.swing.JLabel();
//        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("About");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleL.setBackground(new java.awt.Color(153, 153, 153));
        titleL.setForeground(new java.awt.Color(255, 255, 255));
        titleL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/msa/tools/cursorlocation/cursor-x16.png"))); // NOI18N
        titleL.setText(" About - Cursor Location");
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
        mainPanel.add(titleL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

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
        mainPanel.add(closeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 50, 30));

        innerPanel.setBackground(new java.awt.Color(192, 192, 192));
        innerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        innerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        okB.setBackground(new java.awt.Color(138, 138, 138));
        okB.setForeground(new java.awt.Color(255, 255, 255));
        okB.setText("Okay");
        okB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBActionPerformed(evt);
            }
        });
        innerPanel.add(okB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 280, 30));

        sp1.setBorder(null);
        sp1.setForeground(new java.awt.Color(255, 255, 255));

        tp1.setEditable(false);
        tp1.setBackground(new java.awt.Color(153, 153, 153));
        tp1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tp1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tp1.setForeground(new java.awt.Color(255, 255, 255));
        tp1.setText("Cursor Location © 2016\n\nDisplays your cursor's coordination,\nyeah, pretty useful.");
        sp1.setViewportView(tp1);

        innerPanel.add(sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 70));
//
//        jLabel1.setText("Contact us;");
//        innerPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 260, 20));
//
//        contactL.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
//        contactL.setText("https://github.com/shamilatesoglu/cursor-location");
//        contactL.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                contactLMouseClicked(evt);
//            }
//            public void mouseEntered(java.awt.event.MouseEvent evt) {
//                contactLMouseEntered(evt);
//            }
//            public void mouseExited(java.awt.event.MouseEvent evt) {
//                contactLMouseExited(evt);
//            }
//        });
//        innerPanel.add(contactL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 20));

//        jLabel2.setText("Visit Github page");
//        innerPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 20));
//
//        visitL.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
//        visitL.setText("    https://github.com/shamilatesoglu/cursor-location");
//        visitL.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                visitLMouseClicked(evt);
//            }
//            public void mouseEntered(java.awt.event.MouseEvent evt) {
//                visitLMouseEntered(evt);
//            }
//            public void mouseExited(java.awt.event.MouseEvent evt) {
//                visitLMouseExited(evt);
//            }
//        });
//        innerPanel.add(visitL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 220, 30));

        //jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/msa/tools/cursorlocation/hms.png"))); // NOI18N
//        innerPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 50));

        mainPanel.add(innerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 300, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void titleLMouseDragged(java.awt.event.MouseEvent evt) {                                    
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouse_x, y - mouse_y);
    }                                   

    private void titleLMouseEntered(java.awt.event.MouseEvent evt) {                                    
        titleL.setBackground(titleL.getBackground().darker());
    }                                   

    private void titleLMouseExited(java.awt.event.MouseEvent evt) {                                   
        titleL.setBackground(titleL.getBackground().brighter());
    }                                  

    private void titleLMousePressed(java.awt.event.MouseEvent evt) {                                    
        mouse_x = evt.getX();
        mouse_y = evt.getY();
    }                                   

    private void closeBMouseEntered(java.awt.event.MouseEvent evt) {                                    
        closeB.setBackground(Options.CLOSE_COLOR.darker());
    }                                   

    private void closeBMouseExited(java.awt.event.MouseEvent evt) {                                   
        closeB.setBackground(Options.CLOSE_COLOR);
    }                                  

    private void closeBActionPerformed(java.awt.event.ActionEvent evt) {                                       
        this.setVisible(false);
        try {
            Main.about.setEnabled(true);
        } catch (Exception e) {
        }
        try {
            Options.aboutB.setEnabled(true);
        } catch (Exception e) {
        }
    }                                      

    private void okBActionPerformed(java.awt.event.ActionEvent evt) {                                    
        closeB.doClick();
    }                                   

    private void contactLMouseEntered(java.awt.event.MouseEvent evt) {                                      
        contactL.setForeground(new Color(0, 0, 255));
    }                                     

    private void contactLMouseExited(java.awt.event.MouseEvent evt) {                                     
        contactL.setForeground(new Color(51, 51, 51));
    }                                    

    private void visitLMouseEntered(java.awt.event.MouseEvent evt) {                                    
        visitL.setForeground(new Color(0, 0, 255));
    }                                   

    private void visitLMouseExited(java.awt.event.MouseEvent evt) {                                   
        visitL.setForeground(new Color(51, 51, 51));
    }                                  

//    private void visitLMouseClicked(java.awt.event.MouseEvent evt) {                                    
//        if (System.getProperty("os.name").startsWith("Windows")) {
//            try {
//                Runtime.getRuntime().exec("cmd /c start https://github.com/shamilatesoglu/cursor-location");
//            } catch (IOException ex) {
//                Main.throwErrorMessage("Something went wrong,\nwhile processing given command.\n[Unknown]\n[Error code: 23]");
//            }
//        } else if (!System.getProperty("os.name").startsWith("Windows")) {
//            Main.throwErrorMessage("This feature is available only\nin a Windows OS, yet.\n[OSException]\n[Error code: 024]");
//        }
//    }                                   
//
//    private void contactLMouseClicked(java.awt.event.MouseEvent evt) {                                      
//        if (System.getProperty("os.name").startsWith("Windows")) {
//            try {
//                Runtime.getRuntime().exec("cmd /c start https://github.com/shamilatesoglu/cursor-location");
//            } catch (IOException ex) {
//                Main.throwErrorMessage("Something went wrong,\nwhile processing given command.\n[Unknown]\n[Error code: 25]");
//            }
//        } else if (!System.getProperty("os.name").startsWith("Windows")) {
//            Main.throwErrorMessage("This feature is available only\nin a Windows OS, yet.\n[OSException]\n[Error code: 026]");
//        }
//    }                                     

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        try {
            Main.about.setEnabled(false);
        } catch (Exception e) {
        }
        try {
            Options.aboutB.setEnabled(false);
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new About().setVisible(true);
        });
    }

    // Variables declaration                   
    private javax.swing.JButton closeB;
    private javax.swing.JLabel contactL;
    private javax.swing.JPanel innerPanel;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel2;
//    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton okB;
    private javax.swing.JScrollPane sp1;
    private javax.swing.JLabel titleL;
    private javax.swing.JTextPane tp1;
    private javax.swing.JLabel visitL;
    // End of variables declaration                   

}
