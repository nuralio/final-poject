package puzzle2;

import javax.swing.JOptionPane;

public class Welcome extends javax.swing.JFrame {

    public Welcome() {
        initComponents();
        this.setResizable(false);
    }
    public String playerName;
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanelCongratulation = new javax.swing.JPanel();
        jPanelNameInput = new javax.swing.JPanel();
        jLabelEnterName = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        bSubmit = new javax.swing.JButton();
        jLabelCongratulation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCongratulation.setBackground(new java.awt.Color(0, 0, 0));

        jPanelNameInput.setBackground(new java.awt.Color(0, 204, 255));
        jPanelNameInput.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(255, 0, 51)));

        jLabelEnterName.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelEnterName.setText("Enter your Name: ");

        bSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bSubmit.setText("Submit");
        bSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bSubmitMouseReleased(evt);
            }
        });
        bSubmit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bSubmitKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelNameInputLayout = new javax.swing.GroupLayout(jPanelNameInput);
        jPanelNameInput.setLayout(jPanelNameInputLayout);
        jPanelNameInputLayout.setHorizontalGroup(
            jPanelNameInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNameInputLayout.createSequentialGroup()
                .addGroup(jPanelNameInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNameInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelEnterName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNameInputLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelNameInputLayout.setVerticalGroup(
            jPanelNameInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNameInputLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanelNameInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEnterName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jLabelCongratulation.setFont(new java.awt.Font("Showcard Gothic", 3, 40)); // NOI18N
        jLabelCongratulation.setForeground(new java.awt.Color(51, 255, 0));
        jLabelCongratulation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCongratulation.setText("Welcome");

        javax.swing.GroupLayout jPanelCongratulationLayout = new javax.swing.GroupLayout(jPanelCongratulation);
        jPanelCongratulation.setLayout(jPanelCongratulationLayout);
        jPanelCongratulationLayout.setHorizontalGroup(
            jPanelCongratulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCongratulationLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabelCongratulation, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCongratulationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanelCongratulationLayout.setVerticalGroup(
            jPanelCongratulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCongratulationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCongratulation, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanelNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCongratulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCongratulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void bSubmitMouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        playerName = jTextName.getText();
        if (!(playerName.equals(""))) {
            PuzzleStart PS = new PuzzleStart(playerName);
            PS.setVisible(true);
            this.setVisible(false);
            PuzzleGame PG = new PuzzleGame(playerName);
        } else {
            JOptionPane.showMessageDialog(null, "Enter your name");
        }

    }

    private void bSubmitKeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        playerName = jTextName.getText();
        if (!(playerName.equals(""))) {
            PuzzleStart PS = new PuzzleStart(playerName);
            PS.setVisible(true);
            this.setVisible(false);
            PuzzleGame PG = new PuzzleGame(playerName);
        } else {
            JOptionPane.showMessageDialog(null, "Enter your name");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSubmit;
    private javax.swing.JLabel jLabelCongratulation;
    private javax.swing.JLabel jLabelEnterName;
    private javax.swing.JPanel jPanelCongratulation;
    private javax.swing.JPanel jPanelNameInput;
    public javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
}
