package puzzle2;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.*;
import java.io.*;

public class PuzzleGame extends javax.swing.JFrame {

    String playerName;
    /**
     * Creates new form PuzzleGame
     */
    public PuzzleGame(String s) {
        super("PUZZLE");
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\udeshay\\Documents\\NetBeansProjects\\Puzzle2\\src\\puzzle2\\PuzzleImage.png"));
        initComponents();
        this.setDisable();//for disabling all the buttons (user defined method)
        this.playerName=s;
    }
   
    public String time;
    Th t = null;

    class Th extends Thread {

        public void run() {
            int sec = 0, min = 0;
            while (true) {
                if (sec == 59) {
                    sec = 0;

                    if (min < 9) {
                        jLabelTime.setText("0" + String.valueOf(++min) + ":0" + String.valueOf(sec));
                    } else {
                        jLabelTime.setText(String.valueOf(++min) + ":0" + String.valueOf(sec));
                    }

                } else {

                    if (sec >= 9 && min <= 9) {
                        jLabelTime.setText("0" + String.valueOf(min) + ":" + String.valueOf(++sec));
                    }
                    if (sec >= 9 && min >= 10) {
                        jLabelTime.setText(String.valueOf(min) + ":" + String.valueOf(++sec));
                    }
                    if (sec < 9 && min >= 10) {
                        jLabelTime.setText(String.valueOf(min) + ":0" + String.valueOf(++sec));
                    }

                    if (sec < 9 && min <= 9) {
                        jLabelTime.setText("0" + String.valueOf(min) + ":0" + String.valueOf(++sec));
                    }

                }
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                }

            }

        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelStart = new javax.swing.JPanel();
        bStart = new javax.swing.JButton();
        jPanelReset = new javax.swing.JPanel();
        bReset = new javax.swing.JButton();
        jPanelButton = new javax.swing.JPanel();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        jPanelTimer = new javax.swing.JPanel();
        jLabelTimer = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelStart.setBackground(new java.awt.Color(153, 0, 153));

        bStart.setFont(new java.awt.Font("Snap ITC", 2, 36)); // NOI18N
        bStart.setForeground(new java.awt.Color(255, 51, 51));
        bStart.setText("START");
        bStart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        bStart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bStartFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bStartFocusLost(evt);
            }
        });
        bStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bStartMouseReleased(evt);
            }
        });
        bStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bStartKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelStartLayout = new javax.swing.GroupLayout(jPanelStart);
        jPanelStart.setLayout(jPanelStartLayout);
        jPanelStartLayout.setHorizontalGroup(
            jPanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bStart, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanelStartLayout.setVerticalGroup(
            jPanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelReset.setBackground(new java.awt.Color(255, 255, 0));
        jPanelReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        bReset.setBackground(new java.awt.Color(0, 0, 0));
        bReset.setFont(new java.awt.Font("Snap ITC", 1, 50)); // NOI18N
        bReset.setForeground(new java.awt.Color(255, 0, 0));
        bReset.setText("RESET");
        bReset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        bReset.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bResetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bResetFocusLost(evt);
            }
        });
        bReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bResetMouseReleased(evt);
            }
        });
        bReset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bResetKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelResetLayout = new javax.swing.GroupLayout(jPanelReset);
        jPanelReset.setLayout(jPanelResetLayout);
        jPanelResetLayout.setHorizontalGroup(
            jPanelResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanelResetLayout.setVerticalGroup(
            jPanelResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelButton.setBackground(new java.awt.Color(0, 0, 0));
        jPanelButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), null));
        jPanelButton.setEnabled(false);
        jPanelButton.setLayout(new java.awt.GridBagLayout());

        b2.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 51, 255));
        b2.setText("2");
        b2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                b2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                b2FocusLost(evt);
            }
        });
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b2MouseReleased(evt);
            }
        });
        b2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b2KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelButton.add(b2, gridBagConstraints);

        b1.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 0, 255));
        b1.setText("1");
        b1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                b1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                b1FocusLost(evt);
            }
        });
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b1MouseReleased(evt);
            }
        });
        b1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b1KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelButton.add(b1, gridBagConstraints);

        b3.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 10, 239));
        b3.setText("3");
        b3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                b3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                b3FocusLost(evt);
            }
        });
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b3MouseReleased(evt);
            }
        });
        b3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b3KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelButton.add(b3, gridBagConstraints);

        b5.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        b5.setForeground(new java.awt.Color(25, 26, 23));
        b5.setText("5");
        b5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                b5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                b5FocusLost(evt);
            }
        });
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b5MouseReleased(evt);
            }
        });
        b5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b5KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelButton.add(b5, gridBagConstraints);

        b4.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        b4.setForeground(new java.awt.Color(0, 204, 0));
        b4.setText("4");
        b4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                b4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                b4FocusLost(evt);
            }
        });
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b4MouseReleased(evt);
            }
        });
        b4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b4KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelButton.add(b4, gridBagConstraints);

        b6.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        b6.setForeground(new java.awt.Color(0, 17, 101));
        b6.setText("6");
        b6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                b6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                b6FocusLost(evt);
            }
        });
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b6MouseReleased(evt);
            }
        });
        b6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b6KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelButton.add(b6, gridBagConstraints);

        b7.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        b7.setForeground(new java.awt.Color(0, 204, 204));
        b7.setText("7");
        b7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                b7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                b7FocusLost(evt);
            }
        });
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b7MouseReleased(evt);
            }
        });
        b7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b7KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelButton.add(b7, gridBagConstraints);

        b8.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        b8.setForeground(new java.awt.Color(204, 0, 0));
        b8.setText("8");
        b8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                b8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                b8FocusLost(evt);
            }
        });
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b8MouseReleased(evt);
            }
        });
        b8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b8KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelButton.add(b8, gridBagConstraints);

        b9.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        b9.setText(" ");
        b9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                b9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                b9FocusLost(evt);
            }
        });
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b9MouseReleased(evt);
            }
        });
        b9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b9KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 10, 10, 10);
        jPanelButton.add(b9, gridBagConstraints);

        jPanelTimer.setBackground(new java.awt.Color(0, 0, 0));

        jLabelTimer.setFont(new java.awt.Font("Stencil", 3, 36)); // NOI18N
        jLabelTimer.setForeground(new java.awt.Color(255, 255, 0));
        jLabelTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTimer.setText("TIMER :");

        jLabelTime.setFont(new java.awt.Font("Engravers MT", 3, 52)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(0, 255, 0));
        jLabelTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTime.setText("00:00");

        javax.swing.GroupLayout jPanelTimerLayout = new javax.swing.GroupLayout(jPanelTimer);
        jPanelTimer.setLayout(jPanelTimerLayout);
        jPanelTimerLayout.setHorizontalGroup(
            jPanelTimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTimerLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabelTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanelTimerLayout.setVerticalGroup(
            jPanelTimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTimerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTime, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelTimerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addComponent(jPanelReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }

    private void b1MouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        String label = b1.getText();
        if (b1.isEnabled()) {
            if (b2.getText().equals(" ")) {
                b2.setText(label);
                b1.setText(" ");
            } else if (b4.getText().equals(" ")) {
                b4.setText(label);
                b1.setText(" ");
            }
        }
        winGameCheck();

    }

    private void b2MouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String label = b2.getText();
        if (b2.isEnabled()) {
            if (b1.getText().equals(" ")) {
                b1.setText(label);
                b2.setText(" ");
            }
            if (b3.getText().equals(" ")) {
                b3.setText(label);
                b2.setText(" ");
            }
            if (b5.getText().equals(" ")) {
                b2.setText(" ");
                b5.setText(label);

            }
        }
        winGameCheck();
    }

    private void b3MouseReleased(java.awt.event.MouseEvent evt) {
        String label = b3.getText();
        if (b3.isEnabled()) {
            if (b2.getText().equals(" ")) {
                b2.setText(label);
                b3.setText(" ");
            }
            if (b6.getText().equals(" ")) {
                b6.setText(label);
                b3.setText(" ");
            }
        }
        winGameCheck();
    }

    private void b4MouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        String label = b4.getText();
        if (b4.isEnabled()) {
            if (b1.getText().equals(" ")) {
                b1.setText(label);
                b4.setText(" ");
            }
            if (b5.getText().equals(" ")) {
                b5.setText(label);
                b4.setText(" ");
            }
            if (b7.getText().equals(" ")) {
                b7.setText(label);
                b4.setText(" ");
            }
        }
        winGameCheck();
    }

    private void b5MouseReleased(java.awt.event.MouseEvent evt) {

        String label = b5.getText();
        if (b5.isEnabled()) {
            if (b2.getText().equals(" ")) {
                b2.setText(label);
                b5.setText(" ");
            }
            if (b4.getText().equals(" ")) {
                b4.setText(label);
                b5.setText(" ");
            }
            if (b6.getText().equals(" ")) {
                b6.setText(label);
                b5.setText(" ");
            }
            if (b8.getText().equals(" ")) {
                b8.setText(label);
                b5.setText(" ");
            }
        }

        winGameCheck();
    }

    private void b6MouseReleased(java.awt.event.MouseEvent evt) {
        String label = b6.getText();
        if (b6.isEnabled()) {
            if (b3.getText().equals(" ")) {
                b3.setText(label);
                b6.setText(" ");
            }
            if (b5.getText().equals(" ")) {
                b5.setText(label);
                b6.setText(" ");
            }
            if (b9.getText().equals(" ")) {
                b9.setText(label);
                b6.setText(" ");
            }
        }

        winGameCheck();
    }

    private void b7MouseReleased(java.awt.event.MouseEvent evt) {

        String label = b7.getText();
        if (b7.isEnabled()) {
            if (b1.isEnabled()) {
                if (b4.getText().equals(" ")) {
                    b4.setText(label);
                    b7.setText(" ");
                }
                if (b8.getText().equals(" ")) {
                    b8.setText(label);
                    b7.setText(" ");
                }
            }
        }
        winGameCheck();
    }

    private void b8MouseReleased(java.awt.event.MouseEvent evt) {
        String label = b8.getText();
        if (b8.isEnabled()) {
            if (b8.isEnabled()) {
                if (b7.getText().equals(" ")) {
                    b7.setText(label);
                    b8.setText(" ");
                }
                if (b5.getText().equals(" ")) {
                    b5.setText(label);
                    b8.setText(" ");
                }
                if (b9.getText().equals(" ")) {
                    b9.setText(label);
                    b8.setText(" ");
                }
            }
        }
        winGameCheck();
    }
    private void b9MouseReleased(java.awt.event.MouseEvent evt) {
        String label = b9.getText();
        if (b9.isEnabled()) {
            if (b6.getText().equals(" ")) {
                b6.setText(label);
                b9.setText(" ");
            }
            if (b8.getText().equals(" ")) {
                b8.setText(label);
                b9.setText(" ");
            }
        }
        winGameCheck();
    }
    private void bResetMouseReleased(java.awt.event.MouseEvent evt) {
        if (bReset.isEnabled()) {
            this.resetMethod();
        }

    }

    private void b1KeyReleased(java.awt.event.KeyEvent evt) {
        if (b1.isEnabled()) {
            if (evt.getKeyCode() == 39) {
                String label = b1.getText();
                if (b2.getText().equals(" ")) {
                    b2.setText(label);
                    b1.setText(" ");
                } else {
                    b2.requestFocus();
                }

                winGameCheck();
            }

            if (evt.getKeyCode() == 40) {
                String label = b1.getText();

                if (b4.getText().equals(" ")) {
                    b4.setText(label);
                    b1.setText(" ");
                } else {
                    b4.requestFocus();
                }
                winGameCheck();
            }
        }

    }

    private void b2KeyReleased(java.awt.event.KeyEvent evt) {
        if (b2.isEnabled()) {
            if (evt.getKeyCode() == 37)//left
            {
                String label = b2.getText();
                if (b1.getText().equals(" ")) {
                    b1.setText(label);
                    b2.setText(" ");
                } else {
                    b1.requestFocus();
                }

                winGameCheck();
            }

            if (evt.getKeyCode() == 39)//right
            {
                String label = b2.getText();

                if (b3.getText().equals(" ")) {
                    b3.setText(label);
                    b2.setText(" ");
                } else {
                    b3.requestFocus();
                }
                winGameCheck();
            }

            if (evt.getKeyCode() == 40)//down
            {
                String label = b2.getText();

                if (b5.getText().equals(" ")) {
                    b2.setText(" ");
                    b5.setText(label);

                } else {
                    b5.requestFocus();
                }
                winGameCheck();
            }

        }

    }

    private void b3KeyReleased(java.awt.event.KeyEvent evt) {
        if (b3.isEnabled()) {
            if (evt.getKeyCode() == 37)//left
            {
                String label = b3.getText();
                if (b2.getText().equals(" ")) {
                    b2.setText(label);
                    b3.setText(" ");
                } else {
                    b2.requestFocus();
                }
                winGameCheck();
            }

            if (evt.getKeyCode() == 40)//down
            {
                String label = b3.getText();

                if (b6.getText().equals(" ")) {
                    b6.setText(label);
                    b3.setText(" ");
                } else {
                    b6.requestFocus();
                }
                winGameCheck();
            }
        }
    }
    private void b4KeyReleased(java.awt.event.KeyEvent evt) {
        if (b4.isEnabled()) {
            if (evt.getKeyCode() == 38)//up(b1)
            {

                String label = b4.getText();
                if (b1.getText().equals(" ")) {
                    b1.setText(label);
                    b4.setText(" ");
                } else {
                    b1.requestFocus();
                }
                winGameCheck();
            }

            if (evt.getKeyCode() == 39)//Right(b5)
            {

                String label = b4.getText();

                if (b5.getText().equals(" ")) {
                    b5.setText(label);
                    b4.setText(" ");
                } else {
                    b5.requestFocus();
                }
                winGameCheck();
            }

            if (evt.getKeyCode() == 40)//down(b7)
            {

                String label = b4.getText();

                if (b7.getText().equals(" ")) {
                    b7.setText(label);
                    b4.setText(" ");
                } else {
                    b7.requestFocus();
                }
                winGameCheck();
            }
        }
    }
    private void b5KeyReleased(java.awt.event.KeyEvent evt) {
        if (b5.isEnabled()) {
            if (evt.getKeyCode() == 37)//left(b4)
            {
                String label = b5.getText();

                if (b4.getText().equals(" ")) {
                    b4.setText(label);
                    b5.setText(" ");
                } else {
                    b4.requestFocus();
                }

                winGameCheck();
            }

            if (evt.getKeyCode() == 38)//up(b2)
            {
                String label = b5.getText();
                if (b2.getText().equals(" ")) {
                    b2.setText(label);
                    b5.setText(" ");
                } else {
                    b2.requestFocus();
                }

                winGameCheck();
            }

            if (evt.getKeyCode() == 39)//right(b6)
            {
                String label = b5.getText();

                if (b6.getText().equals(" ")) {
                    b6.setText(label);
                    b5.setText(" ");
                } else {
                    b6.requestFocus();
                }
                winGameCheck();
            }

            if (evt.getKeyCode() == 40)//down(b8)
            {
                String label = b5.getText();

                if (b8.getText().equals(" ")) {
                    b8.setText(label);
                    b5.setText(" ");
                } else {
                    b8.requestFocus();
                }
                winGameCheck();
            }
        }
    }

    private void b6KeyReleased(java.awt.event.KeyEvent evt) {
        if (b6.isEnabled()) {
            if (evt.getKeyCode() == 37)//left(b5)
            {
                String label = b6.getText();

                if (b5.getText().equals(" ")) {
                    b5.setText(label);
                    b6.setText(" ");
                } else {
                    b5.requestFocus();
                }
                winGameCheck();
            }
            if (evt.getKeyCode() == 38)//up(b3)
            {
                String label = b6.getText();
                if (b3.getText().equals(" ")) {
                    b3.setText(label);
                    b6.setText(" ");
                } else {
                    b3.requestFocus();
                }

                winGameCheck();
            }
            if (evt.getKeyCode() == 40)//down(b9)
            {
                String label = b6.getText();

                if (b9.getText().equals(" ")) {
                    b9.setText(label);
                    b6.setText(" ");
                } else {
                    b9.requestFocus();
                }
                winGameCheck();
            }
        }
    }

    private void b7KeyReleased(java.awt.event.KeyEvent evt) {
        if (b7.isEnabled()) {
            if (evt.getKeyCode() == 38)//up(b4)
            {

                String label = b7.getText();
                if (b4.getText().equals(" ")) {
                    b4.setText(label);
                    b7.setText(" ");
                } else {
                    b4.requestFocus();
                }
                winGameCheck();
            }
            if (evt.getKeyCode() == 39)//right(b8)
            {

                String label = b7.getText();

                if (b8.getText().equals(" ")) {
                    b8.setText(label);
                    b7.setText(" ");
                } else {
                    b8.requestFocus();
                }
                winGameCheck();
            }
        }
    }

    private void b8KeyReleased(java.awt.event.KeyEvent evt) {
        if (b8.isEnabled()) {
            if (evt.getKeyCode() == 37)//left(b7)
            {
                String label = b8.getText();
                if (b7.getText().equals(" ")) {
                    b7.setText(label);
                    b8.setText(" ");
                } else {
                    b7.requestFocus();
                }

                winGameCheck();
            }
            if (evt.getKeyCode() == 38)//up(b5)
            {
                String label = b8.getText();

                if (b5.getText().equals(" ")) {
                    b5.setText(label);
                    b8.setText(" ");
                } else {
                    b5.requestFocus();
                }

                winGameCheck();
            }
            if (evt.getKeyCode() == 39)//right(b9)
            {
                String label = b8.getText();

                if (b9.getText().equals(" ")) {
                    b9.setText(label);
                    b8.setText(" ");
                } else {
                    b9.requestFocus();
                }
                winGameCheck();
            }
        }
    }

    private void b9KeyReleased(java.awt.event.KeyEvent evt) {
        if (b9.isEnabled()) {
            if (evt.getKeyCode() == 37)//left(b8)
            {
                String label = b9.getText();

                if (b8.getText().equals(" ")) {
                    b8.setText(label);
                    b9.setText(" ");
                } else {
                    b8.requestFocus();
                }
                winGameCheck();
            }
            if (evt.getKeyCode() == 38)//up(b6)
            {
                String label = b9.getText();
                if (b6.getText().equals(" ")) {
                    b6.setText(label);
                    b9.setText(" ");
                } else {
                    b6.requestFocus();
                }

                winGameCheck();
            }
        }
    }
    private void b1FocusGained(java.awt.event.FocusEvent evt) {
        b1.setBackground(Color.green);
    }

    private void b1FocusLost(java.awt.event.FocusEvent evt) {
        b1.setBackground(Color.white);
    }

    private void b2FocusGained(java.awt.event.FocusEvent evt) {
        b2.setBackground(Color.green);
    }

    private void b2FocusLost(java.awt.event.FocusEvent evt) {
        b2.setBackground(Color.white);
    }
    private void b3FocusGained(java.awt.event.FocusEvent evt) {
        b3.setBackground(Color.green);
    }
    private void b3FocusLost(java.awt.event.FocusEvent evt) {
        b3.setBackground(Color.white);
    }

    private void b4FocusGained(java.awt.event.FocusEvent evt) {
        b4.setBackground(Color.green);
    }
    private void b4FocusLost(java.awt.event.FocusEvent evt) {
        b4.setBackground(Color.white);
    }
    private void b5FocusGained(java.awt.event.FocusEvent evt) {
        b5.setBackground(Color.green);
    }
    private void b5FocusLost(java.awt.event.FocusEvent evt) {
        b5.setBackground(Color.white);
    }
    private void b6FocusGained(java.awt.event.FocusEvent evt) {
        b6.setBackground(Color.green);
    }

    private void b6FocusLost(java.awt.event.FocusEvent evt) {
        b6.setBackground(Color.white);
    }

    private void b7FocusGained(java.awt.event.FocusEvent evt) {
        b7.setBackground(Color.green);
    }
    private void b7FocusLost(java.awt.event.FocusEvent evt) {
        b7.setBackground(Color.white);
    }

    private void b8FocusGained(java.awt.event.FocusEvent evt) {
        b8.setBackground(Color.green);
    }
    private void b8FocusLost(java.awt.event.FocusEvent evt) {
        b8.setBackground(Color.white);
    }

    private void b9FocusGained(java.awt.event.FocusEvent evt) {
        b9.setBackground(Color.green);
    }
    private void b9FocusLost(java.awt.event.FocusEvent evt) {
        b9.setBackground(Color.white);
    }

    private void bResetFocusGained(java.awt.event.FocusEvent evt) {
        bReset.setBackground(Color.green);
    }

    private void bResetFocusLost(java.awt.event.FocusEvent evt) {
        bReset.setBackground(Color.white);
    }

    private void bStartFocusGained(java.awt.event.FocusEvent evt) {
        bStart.setBackground(Color.green);
    }

    private void bStartFocusLost(java.awt.event.FocusEvent evt) {
        bStart.setBackground(Color.white);
    }

    private void bResetKeyReleased(java.awt.event.KeyEvent evt) {
        if (bReset.isEnabled()) {
            if (evt.getKeyCode() == 10) {
                this.resetMethod();
            }
        }
    }

    private void bStartMouseReleased(java.awt.event.MouseEvent evt) {

        t = new Th();
        t.start();
        bStart.setVisible(false);
        this.setEnable();
        b1.requestFocus();
    }

    private void bStartKeyReleased(java.awt.event.KeyEvent evt) {

        if (evt.getKeyCode() == 10) {
            t = new Th();
            t.start();
            bStart.setVisible(false);
            this.setEnable();
            b1.requestFocus();
        }
    }
   

    // Variables declaration - do not modify
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bStart;
    public javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTimer;
    private javax.swing.JPanel jPanelButton;
    private javax.swing.JPanel jPanelReset;
    private javax.swing.JPanel jPanelStart;
    private javax.swing.JPanel jPanelTimer;
    // End of variables declaration

     public void resetMethod() {
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("1");
        mylist.add("2");
        mylist.add("3");
        mylist.add("4");
        mylist.add("5");
        mylist.add("6");
        mylist.add("7");
        mylist.add("8");
        mylist.add(" ");

        Collections.shuffle(mylist);

        String s1[] = new String[10];
        int i = 1;
        for (String s : mylist) {
            if (i <= 9) {
                s1[i] = s;
            }
            i++;
        }
        b1.setText(s1[1]);
        b2.setText(s1[2]);
        b3.setText(s1[3]);
        b4.setText(s1[4]);
        b5.setText(s1[5]);
        b6.setText(s1[6]);
        b7.setText(s1[7]);
        b8.setText(s1[8]);
        b9.setText(s1[9]);

    }
    public void setDisable() {

        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        bReset.setEnabled(false);
    }

    public void setEnable() {

        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        bReset.setEnabled(true);
    }
  
    
    public void winGameCheck() {

       
        String elapsedTime;

        if (b1.getText().equals("1") && b2.getText().equals("2") && b3.getText()
                .equals("3") && b4.getText().equals("4") && b5.getText().equals("5")
                && b6.getText().equals("6") && b7.getText().equals("7") && b8.getText()
                .equals("8") && b9.getText().equals(" ")) {

            elapsedTime = jLabelTime.getText();
            //  char Et[] = elapsedTime.toCharArray();

            WonFrame WF = new WonFrame(playerName);
            WF.setVisible(true);
            WF.elapsedTimeWriter(elapsedTime);
                
            this.setVisible(false);
        }
    }
  
}
