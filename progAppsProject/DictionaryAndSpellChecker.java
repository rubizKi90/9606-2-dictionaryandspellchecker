import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class DictionaryAndSpellChecker extends javax.swing.JFrame {

    private String record;
    private BufferedReader textReader;
    private boolean isCorrectlySpelled = false;
    private String filename = "F:\\Dictionary & Spell Checker\\src\\Dictionary.txt";

    /**
     * Creates new form DictionaryAndSpellChecker
     */
    public DictionaryAndSpellChecker() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultStatusArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        definitionArea = new javax.swing.JTextArea();
        clearButton = new javax.swing.JButton();
        wordTextBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary & Spell Checker");
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 20));
        jLabel1.setText("DICTIONARY & SPELL CHECKER");
        jLabel1.setBounds(10, 0, 380, 39);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabel1.getAccessibleContext().setAccessibleName("titleLabel");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18));
        jLabel2.setText("Word:");
        jLabel2.setBounds(10, 40, 50, 26);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabel2.getAccessibleContext().setAccessibleName("wordLabel");

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        searchButton.setBounds(350, 40, 97, 40);
        jLayeredPane1.add(searchButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        searchButton.getAccessibleContext().setAccessibleName("searchButton");

        resultStatusArea.setColumns(20);
        resultStatusArea.setEditable(false);
        resultStatusArea.setFont(new java.awt.Font("Monospaced", 0, 14));
        resultStatusArea.setRows(5);
        jScrollPane1.setViewportView(resultStatusArea);
        resultStatusArea.getAccessibleContext().setAccessibleName("resultStatusArea");

        jScrollPane1.setBounds(10, 110, 440, 150);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18));
        jLabel3.setText("Result");
        jLabel3.setBounds(10, 80, 131, 24);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabel3.getAccessibleContext().setAccessibleName("resultLabel");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18));
        jLabel4.setText("Definition");
        jLabel4.setBounds(10, 260, 109, 26);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabel4.getAccessibleContext().setAccessibleName("definitionLabel");

        definitionArea.setColumns(20);
        definitionArea.setEditable(false);
        definitionArea.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        definitionArea.setRows(5);
        definitionArea.setAutoscrolls(false);
        jScrollPane2.setViewportView(definitionArea);
        definitionArea.getAccessibleContext().setAccessibleName("definitionArea");

        jScrollPane2.setBounds(10, 290, 440, 150);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        clearButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        clearButton.setBounds(10, 450, 90, 25);
        jLayeredPane1.add(clearButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        clearButton.getAccessibleContext().setAccessibleName("clearButton");

        wordTextBox.setFont(new java.awt.Font("SansSerif", 0, 18));
        wordTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordTextBoxActionPerformed(evt);
            }
        });
        wordTextBox.setBounds(60, 40, 280, 40);
        jLayeredPane1.add(wordTextBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        wordTextBox.getAccessibleContext().setAccessibleName("wordTextBox");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3d-clip-art-of-3d-random-silver-letters-on-a-white-background-by-jiri-moucka-20.jpg"))); // NOI18N
        jLabel5.setBounds(0, 0, 470, 490);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        definitionArea.setText("");
        resultStatusArea.setText("");
        wordTextBox.setText("");
        isCorrectlySpelled = false;
    }//GEN-LAST:event_clearButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        definitionArea.setText("");
        resultStatusArea.setText("");
        try {
            textReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("F:\\Dictionary & Spell Checker\\src\\Dictionary.txt"), "Windows-1252"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(DictionaryAndSpellChecker.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            record = textReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(DictionaryAndSpellChecker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(record != null){
            String[] field = record.split("\t");
            if(wordTextBox.getText().equalsIgnoreCase(field[0])){
                String[] meaning = field[1].split("; ");
                resultStatusArea.setText("The word \"" + wordTextBox.getText() + "\" is correctly spelled.");
                if(meaning.length == 1){
                    definitionArea.setText(definitionArea.getText() + field[1] + "\n");
                } else {
                    for(int i = 0; i < (meaning.length - 1); i++){
                        definitionArea.setText(definitionArea.getText() + meaning[i] + "\n");
                    }
                }
                
                isCorrectlySpelled = true;
            }
            try {
                record = textReader.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(!isCorrectlySpelled){
            resultStatusArea.setText("Wrong Spelling. Try to revise the word.\nSuggestions:\n");
        }
        isCorrectlySpelled = false;
    }//GEN-LAST:event_searchButtonActionPerformed

    private void wordTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordTextBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DictionaryAndSpellChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryAndSpellChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryAndSpellChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryAndSpellChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryAndSpellChecker().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JTextArea definitionArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea resultStatusArea;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField wordTextBox;
    // End of variables declaration//GEN-END:variables
}
