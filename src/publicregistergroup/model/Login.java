/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import publicregistergroup.controller.*;
/**
 *
 * @author newso
 */
public class Login extends JFrame {
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    
   /*public static boolean getLogin(){
        ConnectBuilder con = new ConnectBuilder();
                String sql = "SELECT * FROM user WHERE username = ? AND password = ? ";

        PreparedStatement pre = con.preparedStatemented(sql);
        boolean status = false;
        //String sql = "SELECT * FROM user WHERE username = ? AND password = ? ";
        try {
            
            
            
        } 
        catch (Exception e) {
        }
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnLogin = new javax.swing.JPanel();
        jpnLoginHead = new javax.swing.JPanel();
        separator1 = new javax.swing.JSeparator();
        jtfInputUsername = new javax.swing.JTextField();
        jlbUsername = new javax.swing.JLabel();
        separator2 = new javax.swing.JSeparator();
        jlbPassword = new javax.swing.JLabel();
        jpfInputPassword = new javax.swing.JPasswordField();
        jbtLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("jfLogin"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jpnLogin.setBackground(new java.awt.Color(255, 255, 255));

        jpnLoginHead.setBackground(new java.awt.Color(255, 77, 40));

        javax.swing.GroupLayout jpnLoginHeadLayout = new javax.swing.GroupLayout(jpnLoginHead);
        jpnLoginHead.setLayout(jpnLoginHeadLayout);
        jpnLoginHeadLayout.setHorizontalGroup(
            jpnLoginHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
        jpnLoginHeadLayout.setVerticalGroup(
            jpnLoginHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jtfInputUsername.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        jtfInputUsername.setText("Username");
        jtfInputUsername.setToolTipText("");
        jtfInputUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfInputUsernameMouseClicked(evt);
            }
        });
        jtfInputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfInputUsernameActionPerformed(evt);
            }
        });

        jlbUsername.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N

        jlbPassword.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N

        jpfInputPassword.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        jpfInputPassword.setToolTipText("");
        jpfInputPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpfInputPasswordMouseClicked(evt);
            }
        });
        jpfInputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfInputPasswordActionPerformed(evt);
            }
        });

        jbtLogin.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        jbtLogin.setForeground(new java.awt.Color(255, 255, 255));
        jbtLogin.setText("Login");
        jbtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnLoginLayout = new javax.swing.GroupLayout(jpnLogin);
        jpnLogin.setLayout(jpnLoginLayout);
        jpnLoginLayout.setHorizontalGroup(
            jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLoginLayout.createSequentialGroup()
                .addComponent(jpnLoginHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlbUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpfInputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfInputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        jpnLoginLayout.setVerticalGroup(
            jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLoginHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnLoginLayout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jlbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfInputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpfInputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(separator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jbtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jtfInputUsername.setBorder(null);
        jpfInputPassword.setBorder(null);
        jpfInputPassword.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfInputUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfInputUsernameMouseClicked
        // TODO add your handling code here:
        jtfInputUsername.setText("");
        jlbUsername.setText("Username");
    }//GEN-LAST:event_jtfInputUsernameMouseClicked

    private void jtfInputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfInputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfInputUsernameActionPerformed

    private void jpfInputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfInputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpfInputPasswordActionPerformed

    private void jpfInputPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpfInputPasswordMouseClicked
        // TODO add your handling code here:
        jpfInputPassword.setText("");
        jlbPassword.setText("Password");
    }//GEN-LAST:event_jpfInputPasswordMouseClicked

    private void jbtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLoginActionPerformed
        // TODO add your handling code here:
        String stdUsername;
        String stdPassword;
        Connection con = ConnectionBuilder.getConnection();
        stdUsername = jtfInputUsername.getText();
        stdPassword = String.valueOf(jpfInputPassword.getPassword()); // Password not Hash 
        System.out.println(stdUsername);
        System.out.println(stdPassword);
//        String sql = "select * from user where username like ? and password like ? ";
//        PreparedStatement statment = conn.prepareStatement(sql);
        
        
//        System.out.println(stdUsername + "\n" + stdPassword );
    }//GEN-LAST:event_jbtLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtLogin;
    private javax.swing.JLabel jlbPassword;
    private javax.swing.JLabel jlbUsername;
    private javax.swing.JPasswordField jpfInputPassword;
    private javax.swing.JPanel jpnLogin;
    private javax.swing.JPanel jpnLoginHead;
    private javax.swing.JTextField jtfInputUsername;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    // End of variables declaration//GEN-END:variables
}
