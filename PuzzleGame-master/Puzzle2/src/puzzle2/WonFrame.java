package puzzle2;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Statement;

/**
 *
 * @author udeshay
 */
public class WonFrame extends javax.swing.JFrame {

    String playerName;
    public WonFrame(String s) {
        initComponents();
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\udeshay\\Documents\\NetBeansProjects\\Puzzle2\\src\\puzzle2\\PuzzleImage.png"));
        this.playerName = s;
        jLabelName.setText(s);
      
        // System.out.println(WC.playerName);
    }

    public void elapsedTimeWriter(String s) {
        jLabelElapsedTime.setText(s);
        try {
           
             this.playerNameFileWriter(s);
            
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WinPanel = new javax.swing.JPanel();
        WinImageLabel = new javax.swing.JLabel();
        bYes = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        jLabelCongratulation = new javax.swing.JLabel();
        jLabelTimeElapsed = new javax.swing.JLabel();
        jLabelElapsedTime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bScore = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WinPanel.setBackground(new java.awt.Color(0, 0, 0));
        WinPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));

        WinImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzle2/You-Win.png"))); // NOI18N

        bYes.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        bYes.setText("YES");
        bYes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bYesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bYesFocusLost(evt);
            }
        });
        bYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bYesMouseReleased(evt);
            }
        });
        bYes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bYesKeyReleased(evt);
            }
        });

        bExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bExit.setText("EXIT");
        bExit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bExitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bExitFocusLost(evt);
            }
        });
        bExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bExitMouseReleased(evt);
            }
        });
        bExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bExitKeyReleased(evt);
            }
        });

        jLabelCongratulation.setFont(new java.awt.Font("Showcard Gothic", 2, 40)); // NOI18N
        jLabelCongratulation.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCongratulation.setText("Congratulation");

        jLabelTimeElapsed.setFont(new java.awt.Font("Andalus", 2, 36)); // NOI18N
        jLabelTimeElapsed.setForeground(new java.awt.Color(51, 255, 0));
        jLabelTimeElapsed.setText("Time Elapsed ");

        jLabelElapsedTime.setFont(new java.awt.Font("Engravers MT", 2, 52)); // NOI18N
        jLabelElapsedTime.setForeground(new java.awt.Color(51, 255, 0));
        jLabelElapsedTime.setText("00:00");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Would you like to play it again..");

        bScore.setFont(new java.awt.Font("Snap ITC", 2, 48)); // NOI18N
        bScore.setText("Score");
        bScore.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bScoreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bScoreFocusLost(evt);
            }
        });
        bScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bScoreMouseReleased(evt);
            }
        });
        bScore.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bScoreKeyReleased(evt);
            }
        });

        jLabelName.setFont(new java.awt.Font("Script MT Bold", 3, 36)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 0, 255));
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelName.setText("jLabel1");

        javax.swing.GroupLayout WinPanelLayout = new javax.swing.GroupLayout(WinPanel);
        WinPanel.setLayout(WinPanelLayout);
        WinPanelLayout.setHorizontalGroup(
            WinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WinPanelLayout.createSequentialGroup()
                .addGroup(WinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WinPanelLayout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabelTimeElapsed, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WinPanelLayout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabelElapsedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(bScore, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WinPanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(bYes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WinPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(WinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WinPanelLayout.createSequentialGroup()
                        .addComponent(WinImageLabel)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WinPanelLayout.createSequentialGroup()
                        .addGroup(WinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelCongratulation, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(281, 281, 281))))
        );
        WinPanelLayout.setVerticalGroup(
            WinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCongratulation, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WinImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTimeElapsed, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(WinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelElapsedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bScore))
                .addGap(6, 6, 6)
                .addGroup(WinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(WinPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(WinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bYes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WinPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bYesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bYesMouseReleased
        // TODO add your handling code here:

        PuzzleGame PG = new PuzzleGame(playerName);
        PG.setVisible(true);
        PG.resetMethod();

        this.setVisible(false);
    }//GEN-LAST:event_bYesMouseReleased


    private void bExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseReleased
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_bExitMouseReleased

    private void bYesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bYesKeyReleased
        // TODO add your handling code here:

        PuzzleGame PG = new PuzzleGame(playerName);
        PG.setVisible(true);
        PG.resetMethod();

        this.setVisible(false);
    }//GEN-LAST:event_bYesKeyReleased

    private void bExitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bExitKeyReleased
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bExitKeyReleased

    private void bScoreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bScoreKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            Score SC = new Score();
            SC.setVisible(true);
        }

    }//GEN-LAST:event_bScoreKeyReleased

    private void bScoreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bScoreMouseReleased
        // TODO add your handling code here:
        Score SC = new Score();
        SC.setVisible(true);
    }//GEN-LAST:event_bScoreMouseReleased

    private void bScoreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bScoreFocusGained

        // TODO add your handling code here:
        bScore.setBackground(Color.green);
    }//GEN-LAST:event_bScoreFocusGained

    private void bScoreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bScoreFocusLost
        // TODO add your handling code here:
        bScore.setBackground(Color.white);
    }//GEN-LAST:event_bScoreFocusLost

    private void bYesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bYesFocusGained
        // TODO add your handling code here:
        bYes.setBackground(Color.green);
    }//GEN-LAST:event_bYesFocusGained

    private void bYesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bYesFocusLost
        // TODO add your handling code here:
        bYes.setBackground(Color.white);
    }//GEN-LAST:event_bYesFocusLost

    private void bExitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bExitFocusGained
        // TODO add your handling code here:
        bExit.setBackground(Color.green);
    }//GEN-LAST:event_bExitFocusGained

    private void bExitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bExitFocusLost
        // TODO add your handling code here:
        bExit.setBackground(Color.white);
    }//GEN-LAST:event_bExitFocusLost

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WinImageLabel;
    private javax.swing.JPanel WinPanel;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bScore;
    private javax.swing.JButton bYes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCongratulation;
    public javax.swing.JLabel jLabelElapsedTime;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTimeElapsed;
    // End of variables declaration//GEN-END:variables

    public void playerNameFileWriter(String time) throws IOException {
        File fout = new File("C:\\Users\\udeshay\\Documents\\NetBeansProjects\\Puzzle2\\src\\puzzle2\\BestPlayerName.txt");
        FileOutputStream fos = new FileOutputStream(fout,true);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        bw.write(playerName+"  "+time);
        bw.newLine();

        bw.close();
    }

  /*  public void playerTimeFileWriter(String time) throws IOException {
        File fout = new File("C:\\Users\\udeshay\\Documents\\NetBeansProjects\\Puzzle2\\src\\puzzle2\\TimeTaken.txt");
        FileOutputStream fos = new FileOutputStream(fout, true);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        bw.write(time);
        bw.newLine();

        bw.close();
    }*/
}
