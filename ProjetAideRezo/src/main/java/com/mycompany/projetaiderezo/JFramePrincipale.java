package com.mycompany.projetaiderezo;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author xadriraxor
 */
public class JFramePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipale
     */
    public JFramePrincipale() {
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

        jButtonClasseM2 = new javax.swing.JButton();
        jButtonInfoSuppM1 = new javax.swing.JButton();
        jButtonInfoSuppM2 = new javax.swing.JButton();
        jButtonClasseM1 = new javax.swing.JButton();
        jButtonPing = new javax.swing.JButton();
        machine1 = new com.mycompany.projetaiderezo.Machine();
        machine2 = new com.mycompany.projetaiderezo.Machine();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonClasseM2.setText("Classe Machine n°2");
        jButtonClasseM2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClasseM2MouseClicked(evt);
            }
        });
        jButtonClasseM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClasseM2ActionPerformed(evt);
            }
        });

        jButtonInfoSuppM1.setText("Info Supplémentaire");
        jButtonInfoSuppM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoSuppM1ActionPerformed(evt);
            }
        });

        jButtonInfoSuppM2.setText("Info Supplémentaire");
        jButtonInfoSuppM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoSuppM2ActionPerformed(evt);
            }
        });

        jButtonClasseM1.setText("Classe Machine n°1");
        jButtonClasseM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClasseM1MouseClicked(evt);
            }
        });
        jButtonClasseM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClasseM1ActionPerformed(evt);
            }
        });

        jButtonPing.setText("Ping");
        jButtonPing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(machine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240)
                .addComponent(machine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonInfoSuppM1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClasseM1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134)
                .addComponent(jButtonPing, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonInfoSuppM2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClasseM2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(machine1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(machine2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonClasseM1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonClasseM2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonInfoSuppM1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonInfoSuppM2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonPing, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClasseM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClasseM1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButtonClasseM1ActionPerformed

    private void jButtonInfoSuppM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoSuppM1ActionPerformed
        // TODO add your handling code here:
        
        //recup resultat sous forme xxxxx/xxxxx/xxxxx/xxxx
        String resultMachine1 = machine1.reseauIP();
        String[] texteArray = resultMachine1.split("\\/");
        String TexteEcran = "@IP reseau : " + texteArray[0] + "\n@Nombre IP disponible : " + texteArray[1]+ "\n@IP min : " + texteArray[2]+ "\n@IP Max : " + texteArray[3];
        JOptionPane.showMessageDialog(this,TexteEcran);
    }//GEN-LAST:event_jButtonInfoSuppM1ActionPerformed

    private void jButtonPingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPingActionPerformed
        // TODO add your handling code here:
        String resultMachine1 = machine1.reseauIP();
        String resultMachine2 = machine2.reseauIP();
        String result;
        
        if(resultMachine1.equals(resultMachine2)){
            result = "PossibilitÃ© de ping \n Une communication est possible";
        }else{
            result = "|!| Erreur de communication.\n Pas de communication possible |!|";
        }
        JOptionPane.showMessageDialog(this, result);
    }//GEN-LAST:event_jButtonPingActionPerformed

    private void jButtonClasseM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClasseM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClasseM2ActionPerformed

    private void jButtonInfoSuppM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoSuppM2ActionPerformed
        // TODO add your handling code here:
        //recup resultat sous forme xxxxx/xxxxx/xxxxx/xxxx
        String resultMachine2 = machine2.reseauIP();
        String[] texteArray = resultMachine2.split("\\/");
        String TexteEcran = "@IP reseau : " + texteArray[0] + "\n@Nombre IP disponible: " + texteArray[1]+ "\n@IP min : " + texteArray[2]+ "\n@IP Max : " + texteArray[3];
        JOptionPane.showMessageDialog(this,TexteEcran);
    }//GEN-LAST:event_jButtonInfoSuppM2ActionPerformed

    private void jButtonClasseM1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClasseM1MouseClicked
        // M1 MouseClickClass
        JOptionPane.showMessageDialog(this, machine1.classeAdresseIp());
        
    }//GEN-LAST:event_jButtonClasseM1MouseClicked

    private void jButtonClasseM2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClasseM2MouseClicked
        // M2 MouseclickClass
        
       JOptionPane.showMessageDialog(this, machine2.classeAdresseIp()); 
        
    }//GEN-LAST:event_jButtonClasseM2MouseClicked

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
            java.util.logging.Logger.getLogger(JFramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClasseM1;
    private javax.swing.JButton jButtonClasseM2;
    private javax.swing.JButton jButtonInfoSuppM1;
    private javax.swing.JButton jButtonInfoSuppM2;
    private javax.swing.JButton jButtonPing;
    private com.mycompany.projetaiderezo.Machine machine1;
    private com.mycompany.projetaiderezo.Machine machine2;
    // End of variables declaration//GEN-END:variables
}
