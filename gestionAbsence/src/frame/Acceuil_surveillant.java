/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import javax.swing.JFrame;

/**
 *
 * @author seck
 */
public class Acceuil_surveillant extends javax.swing.JFrame {

    /**
     * Creates new form acceuil
     */
    public Acceuil_surveillant() {
        initComponents();
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_etudiant8 = new javax.swing.JButton();
        jButton_prof4 = new javax.swing.JButton();
        jButton_etudiant9 = new javax.swing.JButton();
        jButton_etudiant10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRANSMISSION DE DONNEES ET SECURITE DE L'INFORMATION");

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GESTION DES PROFESSEURS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(367, 367, 367))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(80, 30, 1180, 110);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_etudiant8.setBackground(new java.awt.Color(255, 255, 255));
        jButton_etudiant8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_etudiant8.setForeground(new java.awt.Color(255, 255, 255));
        jButton_etudiant8.setText("ETUDIANTS");
        jButton_etudiant8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 1, new java.awt.Color(0, 0, 153)));
        jButton_etudiant8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_etudiant8jButton_etudiantActionPerformed(evt);
            }
        });

        jButton_prof4.setBackground(new java.awt.Color(255, 255, 255));
        jButton_prof4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_prof4.setForeground(new java.awt.Color(255, 255, 255));
        jButton_prof4.setText("PROFESSEURS");
        jButton_prof4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 1, new java.awt.Color(153, 0, 0)));
        jButton_prof4.setMaximumSize(new java.awt.Dimension(85, 23));
        jButton_prof4.setMinimumSize(new java.awt.Dimension(85, 23));
        jButton_prof4.setPreferredSize(new java.awt.Dimension(85, 23));
        jButton_prof4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_prof4jButton_profActionPerformed(evt);
            }
        });

        jButton_etudiant9.setBackground(new java.awt.Color(255, 255, 255));
        jButton_etudiant9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_etudiant9.setForeground(new java.awt.Color(255, 255, 255));
        jButton_etudiant9.setText("UTILISATEURS");
        jButton_etudiant9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 1, new java.awt.Color(0, 102, 102)));
        jButton_etudiant9.setMaximumSize(new java.awt.Dimension(93, 23));
        jButton_etudiant9.setMinimumSize(new java.awt.Dimension(93, 23));
        jButton_etudiant9.setPreferredSize(new java.awt.Dimension(93, 23));

        jButton_etudiant10.setBackground(new java.awt.Color(255, 255, 255));
        jButton_etudiant10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_etudiant10.setForeground(new java.awt.Color(255, 255, 255));
        jButton_etudiant10.setText("LISTE DE PRESENCE");
        jButton_etudiant10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 1, new java.awt.Color(153, 0, 153)));
        jButton_etudiant10.setMaximumSize(new java.awt.Dimension(93, 23));
        jButton_etudiant10.setMinimumSize(new java.awt.Dimension(93, 23));
        jButton_etudiant10.setPreferredSize(new java.awt.Dimension(93, 23));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_prof4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_etudiant9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_etudiant10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_etudiant8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton_etudiant8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton_prof4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_etudiant9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_etudiant10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 170, 160, 360);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 410, 360, 210);

        jButton2.setText("jButton1");
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 190, 360, 210);

        jButton3.setText("jButton1");
        getContentPane().add(jButton3);
        jButton3.setBounds(590, 410, 360, 210);

        jButton4.setText("jButton1");
        getContentPane().add(jButton4);
        jButton4.setBounds(580, 190, 360, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_etudiant8jButton_etudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_etudiant8jButton_etudiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_etudiant8jButton_etudiantActionPerformed

    private void jButton_prof4jButton_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_prof4jButton_profActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_prof4jButton_profActionPerformed

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
            java.util.logging.Logger.getLogger(Acceuil_surveillant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil_surveillant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil_surveillant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil_surveillant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil_surveillant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_etudiant10;
    private javax.swing.JButton jButton_etudiant8;
    private javax.swing.JButton jButton_etudiant9;
    private javax.swing.JButton jButton_prof4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}