/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ppe3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author FIGUERES Adrien
 */
public class Formulaire extends javax.swing.JPanel {


    /**
     * Composant qui comporte le formulaire complet
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

        jPanelLogin = new javax.swing.JPanel();
        jTextFieldUsernameLogging = new javax.swing.JTextField();
        jLabelUsernameLogin = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelPasswordLogin = new javax.swing.JLabel();
        jLabelLoginTitle = new javax.swing.JLabel();
        jPanelQuitApp = new javax.swing.JPanel();
        jLabelCroixQuit = new javax.swing.JLabel();
        jButtonLogging = new javax.swing.JButton();
        jLabelTestConnection = new javax.swing.JLabel();
        jPanelBackgroundIcon = new javax.swing.JPanel();
        jLabelTitreProjet = new javax.swing.JLabel();
        jLabelCopyright = new javax.swing.JLabel();
        jLabelDescApp = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldUsernameLogging.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N

        jLabelUsernameLogin.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabelUsernameLogin.setText("Nom de profil :");

        jPasswordField.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N

        jLabelPasswordLogin.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabelPasswordLogin.setText("Mot de passe :");

        jLabelLoginTitle.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabelLoginTitle.setText("Se connecter");

        jPanelQuitApp.setBackground(new java.awt.Color(0, 102, 204));
        jPanelQuitApp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelQuitApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelQuitAppMouseClicked(evt);
            }
        });

        jLabelCroixQuit.setText("X");

        javax.swing.GroupLayout jPanelQuitAppLayout = new javax.swing.GroupLayout(jPanelQuitApp);
        jPanelQuitApp.setLayout(jPanelQuitAppLayout);
        jPanelQuitAppLayout.setHorizontalGroup(
            jPanelQuitAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuitAppLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCroixQuit)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelQuitAppLayout.setVerticalGroup(
            jPanelQuitAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQuitAppLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabelCroixQuit)
                .addGap(14, 14, 14))
        );

        jButtonLogging.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jButtonLogging.setText("Connexion");
        jButtonLogging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoggingActionPerformed(evt);
            }
        });

        jLabelTestConnection.setText("jLabel1");

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPasswordField)
            .addComponent(jTextFieldUsernameLogging)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addGap(0, 168, Short.MAX_VALUE)
                .addComponent(jLabelLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(jPanelQuitApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogging, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPasswordLogin)
                            .addComponent(jLabelUsernameLogin))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTestConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabelLoginTitle))
                    .addComponent(jPanelQuitApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jLabelUsernameLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsernameLogging, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabelPasswordLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabelTestConnection)
                .addGap(26, 26, 26)
                .addComponent(jButtonLogging, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelBackgroundIcon.setBackground(new java.awt.Color(0, 102, 204));

        jLabelTitreProjet.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitreProjet.setText("Perpi&Co App Project ");

        jLabelCopyright.setText("Application développé par Adrien F. ©");

        jLabelDescApp.setText("Vente et Gestion de produit");

        javax.swing.GroupLayout jPanelBackgroundIconLayout = new javax.swing.GroupLayout(jPanelBackgroundIcon);
        jPanelBackgroundIcon.setLayout(jPanelBackgroundIconLayout);
        jPanelBackgroundIconLayout.setHorizontalGroup(
            jPanelBackgroundIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundIconLayout.createSequentialGroup()
                .addComponent(jLabelCopyright)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundIconLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(jPanelBackgroundIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitreProjet, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescApp))
                .addGap(160, 160, 160))
        );
        jPanelBackgroundIconLayout.setVerticalGroup(
            jPanelBackgroundIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundIconLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabelTitreProjet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelBackgroundIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBackgroundIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cette méthode permet l'authentification d'un utilisateur Elle appelle une
     * méthode de la classe BDDsql qui permet la connexion a la base de donnée
     */
    private void connexion() {

        String loginUsername = jTextFieldUsernameLogging.getText();
        String loginPassword = jPasswordField.getText();
        jLabelTestConnection.setText("non connecté au serveur");
        //Si une connexion est active
        if (DaoSIO.getInstance() != null) {
            jLabelTestConnection.setText("Connecté au serveur");
            try {
                //On cherche le profil saisie dans le formulaire pour voir si le profil existe (Username et Password)
                ResultSet result = DaoSIO.getInstance().requeteSelection("SELECT * FROM profil WHERE username = '" + loginUsername + "' AND password = '" + loginPassword + "'");
                if (result.next()) {
                    //On définis nos trois objet JFrame 
                    JFrameAgent JFrameAgent = new JFrameAgent();
                    JFrameAdmin JFrameAdmin = new JFrameAdmin();
                    JFrameMain JFrameMain = new JFrameMain();
                    try {
                         //Si le profil à pour permission = 1 alors il se connecte en admin   
                        ResultSet resultPermAdmin = DaoSIO.getInstance().requeteSelection("SELECT * FROM profil WHERE username = '" + loginUsername +"' AND permission = 1");
                        //Si le profil à pour permission = 0 alors il se connecte en tant que agent
                        ResultSet resultPermAgent = DaoSIO.getInstance().requeteSelection("SELECT * FROM profil WHERE username = '" + loginUsername + "' AND permission = 0");
                        
                        if (resultPermAdmin.next()) {
                            JFrameAgent.setVisible(false);
                            JFrameAdmin.setTitle("Vous êtes authentifié en tant que Administrateur : " + loginUsername);
                            JFrameAdmin.setVisible(true); //On ouvre la fenêtre administrateur
                            JFrameMain.setVisible(false);
                        } 
                        
                        if (resultPermAgent.next()) {
                            JFrameAdmin.setVisible(false);
                            JFrameAgent.setTitle("Vous êtes authentifié en tant que Agent : " + loginUsername);
                            JFrameAgent.setVisible(true); //On ouvre la fenêtre Agent       
                        }
                        
                    } catch (SQLException e) {
                        Logger.getLogger(Formulaire.class.getName()).log(Level.SEVERE, null, e);
                    }
                   
                    jTextFieldUsernameLogging.setEnabled(false);
                    jPasswordField.setEnabled(false);
                    jButtonLogging.setEnabled(false);
                    

                    System.out.println("Authentification réussi, utilisateur trouvée"); 

                } else {
                    
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

    private void jPanelQuitAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelQuitAppMouseClicked
        // TODO add your handling code here:       
        System.exit(0);
    }//GEN-LAST:event_jPanelQuitAppMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogging;
    private javax.swing.JLabel jLabelCopyright;
    private javax.swing.JLabel jLabelCroixQuit;
    private javax.swing.JLabel jLabelDescApp;
    private javax.swing.JLabel jLabelLoginTitle;
    private javax.swing.JLabel jLabelPasswordLogin;
    private javax.swing.JLabel jLabelTestConnection;
    private javax.swing.JLabel jLabelTitreProjet;
    private javax.swing.JLabel jLabelUsernameLogin;
    private javax.swing.JPanel jPanelBackgroundIcon;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelQuitApp;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsernameLogging;
    // End of variables declaration//GEN-END:variables

    private void addMouseListener(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
