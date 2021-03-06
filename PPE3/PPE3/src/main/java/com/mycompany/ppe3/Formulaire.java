/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ppe3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author FIGUERES Adrien
 */
public class Formulaire extends javax.swing.JPanel {

    //Connection connexion;
    
    //DaoSIO monDao = DaoSIO.getInstance();
    
    /**
     * Creates new form Formulaire
     */
    public Formulaire() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsernameLogging = new javax.swing.JTextField();
        jButtonLogging = new javax.swing.JButton();
        jLabelEtatConnexion = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Username :");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Password :");

        jTextFieldUsernameLogging.setText("Adriraxor");
        jTextFieldUsernameLogging.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonLogging.setText("Connexion");
        jButtonLogging.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLogging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoggingActionPerformed(evt);
            }
        });

        jLabelEtatConnexion.setText("Non Connecter");

        jPasswordField.setText("root");
        jPasswordField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelEtatConnexion)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUsernameLogging)
                            .addComponent(jPasswordField)
                            .addComponent(jButtonLogging, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                        .addGap(142, 142, 142))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldUsernameLogging, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButtonLogging, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEtatConnexion)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cette méthode permet l'authentification d'un utilisateur Elle appelle une
     * méthode de la classe BDDsql qui permet la connexion a la base de donnée
     */
    private void connexion() {
        
        
        String loginUsername = jTextFieldUsernameLogging.getText();
        String loginPassword = jPasswordField.getText();
        

        //Traitement
        if (DaoSIO.getInstance() != null) {
            
            try {
                ResultSet result = DaoSIO.getInstance().requeteSelection("SELECT * FROM profil WHERE username = '" + loginUsername + "' AND password = '" + loginPassword + "'");
                if (result.next()) {
                    
                    JFrameAgent jfrm2 = new JFrameAgent();
                    
                    jfrm2.setVisible(true);
                    
                    ResultSet resultPerm = DaoSIO.getInstance().requeteSelection("SELECT * FROM profil WHERE permission = 1");
                    if (resultPerm.next()) {
                        
                        jfrm2.setTitle("Vous êtes authentifié en tant que Agent : " + loginUsername);
                    } else {
                        jfrm2.setTitle("Vous êtes authentifié en tant que Administrateur : " + loginUsername);
                    }
                    
                    jTextFieldUsernameLogging.setEnabled(false);
                    jPasswordField.setEnabled(false);
                    jButtonLogging.setEnabled(false);
                    jLabelEtatConnexion.setText("Connecté avec : " + jTextFieldUsernameLogging.getText());
                    
                    System.out.println("Authentification enabled, user was founded");
                    
                } else {
                    //JOptionPane.showMessageDialog(this, "Connexion échoué, utilisateur non existant !");
                    Object[] options = {"OK"};
                    System.out.println("Authentification Failed not user found");
                    JOptionPane.showOptionDialog(null, "Connexion échouée, utilisateur non trouvé !", "Erreur de connexion",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                            null, options, options[0]);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Formulaire.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    private void jButtonLoggingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoggingActionPerformed
        
        this.connexion();
    }//GEN-LAST:event_jButtonLoggingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogging;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEtatConnexion;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsernameLogging;
    // End of variables declaration//GEN-END:variables

}
