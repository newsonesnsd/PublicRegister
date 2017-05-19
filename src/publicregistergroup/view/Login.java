/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.view;

import java.sql.*;
import javax.swing.*;
import publicregistergroup.controller.*;
import publicregistergroup.model.*;
/**
 *
 * @author newso
 */
public class Login extends JFrame {
    private static long stdUserName;
    public static long getStdIndex() {
        long id = Long.parseLong(jtfInputUsername.getText());
        return id;
    }
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnLogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        jpfInputPassword = new javax.swing.JPasswordField();
        jlbUsername = new javax.swing.JLabel();
        jtfInputUsername = new javax.swing.JTextField();
        jlbPassword = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);

        jpnLogin.setBackground(new java.awt.Color(255, 255, 255));
        jpnLogin.setMaximumSize(new java.awt.Dimension(1024, 768));
        jpnLogin.setMinimumSize(new java.awt.Dimension(1024, 768));
        jpnLogin.setPreferredSize(new java.awt.Dimension(1024, 768));
        jpnLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(77, 77, 77));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));

        loginButton.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jpfInputPassword.setBackground(new java.awt.Color(204, 204, 204));
        jpfInputPassword.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        jpfInputPassword.setForeground(new java.awt.Color(255, 255, 255));
        jpfInputPassword.setBorder(null);
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

        jlbUsername.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        jlbUsername.setForeground(new java.awt.Color(255, 102, 51));
        jlbUsername.setFocusTraversalPolicyProvider(true);

        jtfInputUsername.setBackground(new java.awt.Color(204, 204, 204));
        jtfInputUsername.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        jtfInputUsername.setForeground(new java.awt.Color(248, 155, 124));
        jtfInputUsername.setText(" Username");
        jtfInputUsername.setBorder(null);
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

        jlbPassword.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        jlbPassword.setForeground(new java.awt.Color(255, 102, 51));
        jlbPassword.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfInputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpfInputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jlbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jtfInputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jlbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpfInputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jpnLogin.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 520, 430));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/page.jpg"))); // NOI18N
        jpnLogin.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));
        background.getAccessibleContext().setAccessibleName("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        if (Users.getLogin(jtfInputUsername, jpfInputPassword) == true) {
            stdUserName = Long.parseLong(jtfInputUsername.getText());
            JOptionPane frame = new JOptionPane();
            JOptionPane.showMessageDialog(frame,"Login Success","Login",JOptionPane.PLAIN_MESSAGE);
            this.setVisible(false);
            Homepage newHome = new Homepage();
            newHome.setVisible(true);
        }
        else {
            JOptionPane frame = new JOptionPane();
            JOptionPane.showMessageDialog(frame,"Failed to Login \n Please reenter your username or password","Login",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void jtfInputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfInputUsernameActionPerformed
       // jpfInputPassword.setText("Username");
    }//GEN-LAST:event_jtfInputUsernameActionPerformed

    private void jtfInputUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfInputUsernameMouseClicked
        // TODO add your handling code here:
        jtfInputUsername.setText("");
        jlbUsername.setText("Username");
    }//GEN-LAST:event_jtfInputUsernameMouseClicked

    private void jpfInputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfInputPasswordActionPerformed
        // TODO add your handling code here:
        jpfInputPassword.setText("Password");
    }//GEN-LAST:event_jpfInputPasswordActionPerformed

    private void jpfInputPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpfInputPasswordMouseClicked
        // TODO add your handling code here:
        jpfInputPassword.setText("");
        jlbPassword.setText("Password");
    }//GEN-LAST:event_jpfInputPasswordMouseClicked
    
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
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbPassword;
    private javax.swing.JLabel jlbUsername;
    private javax.swing.JPasswordField jpfInputPassword;
    private javax.swing.JPanel jpnLogin;
    private static javax.swing.JTextField jtfInputUsername;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables
}
