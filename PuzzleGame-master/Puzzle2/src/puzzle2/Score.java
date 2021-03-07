package puzzle2;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JLabel;
public class Score extends javax.swing.JFrame {

    public Score() {
        initComponents();
        try {
            bestPlayerNameReader();
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanelPlayerScore = new javax.swing.JPanel();
        jPanelScoreLabel = new javax.swing.JPanel();
        jLabelScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelPlayerScore.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPlayerScore.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelPlayerScoreLayout = new javax.swing.GroupLayout(jPanelPlayerScore);
        jPanelPlayerScore.setLayout(jPanelPlayerScoreLayout);
        jPanelPlayerScoreLayout.setHorizontalGroup(
            jPanelPlayerScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        jPanelPlayerScoreLayout.setVerticalGroup(
            jPanelPlayerScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        jPanelScoreLabel.setBackground(new java.awt.Color(0, 0, 0));

        jLabelScore.setFont(new java.awt.Font("Snap ITC", 2, 48)); // NOI18N
        jLabelScore.setForeground(new java.awt.Color(0, 255, 0));
        jLabelScore.setText("Score");

        javax.swing.GroupLayout jPanelScoreLabelLayout = new javax.swing.GroupLayout(jPanelScoreLabel);
        jPanelScoreLabel.setLayout(jPanelScoreLabelLayout);
        jPanelScoreLabelLayout.setHorizontalGroup(
            jPanelScoreLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScoreLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelScoreLabelLayout.setVerticalGroup(
            jPanelScoreLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScoreLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelScore)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPlayerScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPlayerScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JPanel jPanelPlayerScore;
    private javax.swing.JPanel jPanelScoreLabel;

    public static void main(String[] args) {
        new Score().setVisible(true);
    }

    public void bestPlayerNameReader() throws Exception //Name And Time Reader from file
    {
        try {
            FileReader fr
                    = new FileReader("C:\\Users\\udeshay\\Documents\\NetBeansProjects\\Puzzle2\\src\\puzzle2\\BestPlayerName.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            int i = 0;
            
            while ((s = br.readLine()) != null) {
                i++;
                JLabel lbl = new JLabel(s.split("  ")[0]);
                JLabel lbl2 = new JLabel(s.split("  ")[1]);
                jPanelPlayerScore.add(lbl);
                jPanelPlayerScore.add(lbl2);
            }
            jPanelPlayerScore.setLayout(new GridLayout(i, 2));
            
        } catch (Exception e) {
        }
        
    }
}
