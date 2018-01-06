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
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author Samil Atesoglu
 */
public class Dialog extends javax.swing.JDialog {

    private javax.swing.JButton cancelB;
    private javax.swing.JButton closeB;
    private javax.swing.JTextArea contentL;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton noB;
    private javax.swing.JButton okB;
    private javax.swing.JLabel titleL;
    private javax.swing.JButton yesB;

    public int mouse_x;
    public int mouse_y;

    public int result;
    public int option;

    public static Color THEME;

    public static boolean dialogFinished = false;

    public Dialog(int option, int type, String title, String content) {
        initializeComponents(option, type, title, content);
        initializeListeners();
    }

    private void initializeComponents(int option, int type, String title, String content) {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusCycleRoot(false);
        setUndecorated(true);

        setModal(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - 350 / 2, dim.height / 2 - 140 / 2);

        mainPanel = new javax.swing.JPanel();
        innerPanel = new javax.swing.JPanel();
        okB = new javax.swing.JButton();
        scrollPane1 = new javax.swing.JScrollPane();
        contentL = new javax.swing.JTextArea();
        titleL = new javax.swing.JLabel();
        closeB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        noB = new javax.swing.JButton();
        yesB = new javax.swing.JButton();

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainPanel.setBackground(new java.awt.Color(102, 102, 102));
        add(mainPanel);

        innerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        innerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        okB.setForeground(new java.awt.Color(204, 204, 204));
        okB.setText("OK");
        okB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 87, 111)));
        innerPanel.add(okB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 90, 30));

        scrollPane1.setBorder(null);

        contentL.setEditable(false);
        contentL.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        contentL.setForeground(new java.awt.Color(255, 255, 255));
        contentL.setTabSize(4);
        contentL.setBorder(null);
        scrollPane1.setViewportView(contentL);
        innerPanel.add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 330, 60));

        titleL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titleL.setForeground(new java.awt.Color(255, 255, 255));
        innerPanel.add(titleL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));

        closeB.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        closeB.setForeground(new java.awt.Color(204, 204, 204));
        closeB.setText("X");
        closeB.setBorder(null);
        closeB.setOpaque(false);
        closeB.setBackground(new Color(0, 0, 0));
        innerPanel.add(closeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, 30));

        cancelB.setForeground(new java.awt.Color(204, 204, 204));
        cancelB.setText("Cancel");
        cancelB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 87, 111)));
        innerPanel.add(cancelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 90, 30));

        noB.setForeground(new java.awt.Color(204, 204, 204));
        noB.setText("No");
        noB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 87, 111)));
        innerPanel.add(noB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 90, 30));

        yesB.setForeground(new java.awt.Color(204, 204, 204));
        yesB.setText("Yes");
        yesB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 87, 111)));
        innerPanel.add(yesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 30));

        mainPanel.add(innerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        if (option == 1) {
            okB.setVisible(true);
            yesB.setVisible(false);
            noB.setVisible(false);
            cancelB.setVisible(false);
        }
        if (option == 2) {
            okB.setVisible(false);
            yesB.setVisible(true);
            noB.setVisible(true);
            cancelB.setVisible(false);
        }
        if (option == 3) {
            okB.setVisible(false);
            yesB.setVisible(true);
            noB.setVisible(true);
            cancelB.setVisible(true);
        }

        if (type == 0) {
            THEME = new Color(98, 139, 75);
        }
        if (type == 1) {
            THEME = new Color(156, 99, 99);
        }
        if (type == 2) {
            THEME = new Color(190, 165, 123);
        }

        okB.setBorder(javax.swing.BorderFactory.createLineBorder(THEME.darker().darker()));
        yesB.setBorder(javax.swing.BorderFactory.createLineBorder(THEME.darker().darker()));
        noB.setBorder(javax.swing.BorderFactory.createLineBorder(THEME.darker().darker()));
        cancelB.setBorder(javax.swing.BorderFactory.createLineBorder(THEME.darker().darker()));
        contentL.setBackground(THEME);
        innerPanel.setBackground(THEME);
        mainPanel.setBackground(THEME);
        okB.setBackground(THEME.darker());
        yesB.setBackground(THEME.darker());
        noB.setBackground(THEME.darker());
        cancelB.setBackground(THEME.darker());
        innerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(THEME.darker().darker(), 2));

        titleL.setText("   " + title.toUpperCase());
        contentL.setText(content);

        setTitle(title.toUpperCase());

        ScrollBarUI newUI = new BasicScrollBarUI() {
            @Override
            protected JButton createDecreaseButton(int orientation) {
                JButton button = super.createDecreaseButton(orientation);
                button.setBackground(THEME.darker());
                button.setBorder(javax.swing.BorderFactory.createLineBorder(THEME.darker()));
                return button;
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                JButton button = super.createIncreaseButton(orientation);
                button.setBackground(THEME.darker());
                button.setBorder(javax.swing.BorderFactory.createLineBorder(THEME.darker()));
                return button;
            }
            
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = THEME.darker();
                this.thumbDarkShadowColor = THEME.darker();
            }                                                               
        };
        
        scrollPane1.getVerticalScrollBar().setUI(newUI);
        scrollPane1.getHorizontalScrollBar().setUI(newUI);
        scrollPane1.getHorizontalScrollBar().setBackground(THEME);
        scrollPane1.getVerticalScrollBar().setBackground(THEME);
        
        contentL.setCaretPosition(0);

        pack();
    }

    @SuppressWarnings("Convert2Lambda")
    private void initializeListeners() {
        okB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result = 2;
                setVisible(false);
                dispose();
            }
        });

        yesB.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result = 1;
                setVisible(false);
                dispose();
            }
        });

        noB.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result = 0;
                setVisible(false);
                dispose();
            }
        });

        cancelB.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result = 2;
                setVisible(false);
                dispose();
            }
        });

        closeB.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeB.setForeground(Color.white);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeB.setForeground(new Color(204, 204, 204));
            }
        });
        closeB.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result = 2;
                setVisible(false);
                dispose();
            }
        });

        titleL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                setLocation(evt.getXOnScreen() - mouse_x, evt.getYOnScreen() - mouse_y);
            }
        });
        titleL.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mouse_x = evt.getX();
                mouse_y = evt.getY();
            }
        });
    }

    public int showDialog() {
        setVisible(true);
        return result;
    }
}
