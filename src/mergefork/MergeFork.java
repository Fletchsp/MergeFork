/*
 *  CSC 220 MergeFork project.
 *  Used to demonstrate merging Git repository changes via fork.
 *  
 *  See contributorArray below for the list of all who contributed to the project.
 *  K. Weber
 *  weberk@mountunion.edu
 *  Modified to use different format for braces--April, 16, 2015
 */
package mergefork;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author weberk
 */
public class MergeFork extends javax.swing.JFrame {
    
    private final String[] contributorArray = new String[] {
        "Ken Weber ", "Scott Fletcher",
    };
    
    /**
     * Creates new form TestMerge
     */
    public MergeFork() {
        initComponents();
        //  Display alphabetically by last name.
        Arrays.sort(contributorArray, new LastNameComparator());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JScrollPane contributorsScrollPane = new javax.swing.JScrollPane();
        contributorsArea = new javax.swing.JTextArea();
        javax.swing.JButton contributorsButton = new javax.swing.JButton();
        javax.swing.JLabel titleLabel = new javax.swing.JLabel();
        javax.swing.JLabel contributorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contributorsArea.setColumns(20);
        contributorsArea.setRows(5);
        contributorsScrollPane.setViewportView(contributorsArea);

        contributorsButton.setText("Display Contributors");
        contributorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contributorsButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setText("MergeFork Project");

        contributorLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contributorLabel.setText("Contributor List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(titleLabel)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(contributorsScrollPane)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contributorsButton)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(contributorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(titleLabel)
                .addGap(21, 21, 21)
                .addComponent(contributorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contributorsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(contributorsButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contributorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contributorsButtonActionPerformed
        contributorsArea.setText("");  //  Start with no text and append.
        for (String name: contributorArray) {
            contributorsArea.append(name + "\n");
        }
    }//GEN-LAST:event_contributorsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MergeFork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MergeFork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MergeFork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MergeFork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MergeFork().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea contributorsArea;
    // End of variables declaration//GEN-END:variables

    //  This comparator compares two names in "First Last" format according to the
    //  last name.
    private static class LastNameComparator implements Comparator<String> {
        @Override
        public int compare(String n1, String n2) {
            String[] names1 = n1.toLowerCase().split(" ");
            String[] names2 = n2.toLowerCase().split(" ");
            int answer = names1[names1.length-1].compareTo(names2[names2.length-1]);
            if (answer == 0) {
                answer = names1[0].compareTo(names2[0]);
            }
            return answer;
        }
    }
}
