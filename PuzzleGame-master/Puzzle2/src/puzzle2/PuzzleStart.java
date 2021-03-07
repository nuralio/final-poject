package puzzle2;
import java.awt.Toolkit;
public class PuzzleStart extends javax.swing.JFrame {

    String playerName;
    public PuzzleStart(String s) {
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\udeshay\\Documents\\NetBeansProjects\\Puzzle2\\src\\puzzle2\\PuzzleImage.png"));
        initComponents();
        this.playerName=s;
   
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PuzzleImazeLable = new javax.swing.JLabel();
        bPlay = new javax.swing.JButton();
        mindImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));

        jPanel1.setBackground(new java.awt.Color(46, 47, 53));

        PuzzleImazeLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzle2/PuzzleImage.png"))); // NOI18N

        bPlay.setFont(new java.awt.Font("Snap ITC", 2, 70)); // NOI18N
        bPlay.setForeground(new java.awt.Color(51, 0, 255));
        bPlay.setText("PLAY");
        bPlay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 7, true));
        bPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bPlayMouseReleased(evt);
            }
        });
        bPlay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bPlayKeyReleased(evt);
            }
        });

        mindImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzle2/mind.jpg"))); // NOI18N
        mindImageLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 10, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PuzzleImazeLable)
                    .addComponent(bPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(mindImageLabel)
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PuzzleImazeLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(mindImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void bPlayMouseReleased(java.awt.event.MouseEvent evt) {
        
            PuzzleGame PG = new PuzzleGame(playerName);

            this.setVisible(false);
    

            PG.resetMethod();
            PG.setVisible(true);
      

    }

    private void bPlayKeyReleased(java.awt.event.KeyEvent evt) {
      
            if (evt.getKeyCode() == 10) {
                PuzzleGame PG = new PuzzleGame(playerName);

                this.setVisible(false);

               
                PG.resetMethod();
                PG.setVisible(true);

            }
        
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel PuzzleImazeLable;
    private javax.swing.JButton bPlay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mindImageLabel;
    // End of variables declaration

}
