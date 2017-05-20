/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.view;

import java.sql.Connection;
import publicregistergroup.controller.ConnectionBuilder;
import publicregistergroup.model.*;

/**
 *
 * @author kz_no
 */
public class ViewClubFromSearch extends javax.swing.JFrame {
    static Connection con = ConnectionBuilder.getConnection();
    private String clubName = Clubs.getClub_name(LoginHomepage.getClubIndex());
    private String clubDescription = Clubs.getClub_description(LoginHomepage.getClubIndex());
    private int club_id = Clubs.getClub_id(LoginHomepage.getClubIndex());
    
    
    /**
     * Creates new form ViewClub
     */
    public ViewClubFromSearch() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * This is the part of my method 
     * This zone is about getMethod to call Club: name, id, description
     * @return 
     */

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Picture = new javax.swing.JLabel();
        Clubname = new javax.swing.JLabel();
        Club = new javax.swing.JLabel();
        Registclubbotton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        AddDescription = new javax.swing.JLabel();
        jlbClubId = new javax.swing.JLabel();
        AddName = new javax.swing.JLabel();
        Backbotton = new javax.swing.JButton();
        blackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Club Detail");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Picture.setFont(new java.awt.Font("Quark", 1, 70)); // NOI18N
        Picture.setForeground(new java.awt.Color(153, 153, 153));
        Picture.setText("      PIC");
        Picture.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(Picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 360, 320));

        Clubname.setFont(new java.awt.Font("Quark", 1, 45)); // NOI18N
        getContentPane().add(Clubname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 660, 80));
        Clubname.setText(Clubs.getClub_name(club_id));

        Club.setFont(new java.awt.Font("Quark", 1, 19)); // NOI18N
        Club.setText("<html> CLUB ID:  <br> <br>CLUB NAME:  <br> <br>DESCRIPTION:  </html>");
        Club.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(Club, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, 170));

        Registclubbotton.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        Registclubbotton.setText("สมัครเข้าร่วมชมรม");
        Registclubbotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistclubbottonMouseClicked(evt);
            }
        });
        Registclubbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistclubbottonActionPerformed(evt);
            }
        });
        getContentPane().add(Registclubbotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 630, 130, 30));

        jLabel2.setText("____________________________________________________________________________________________________________________");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        AddDescription.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        getContentPane().add(AddDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 230, 30));
        AddDescription.setText(clubDescription);

        jlbClubId.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        getContentPane().add(jlbClubId, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 220, 30));
        jlbClubId.setText(club_id+"");

        AddName.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        getContentPane().add(AddName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 210, 30));
        AddName.setText(clubName);

        Backbotton.setText("Back");
        Backbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbottonActionPerformed(evt);
            }
        });
        getContentPane().add(Backbotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, -1, -1));

        blackground.setFont(new java.awt.Font("Quark", 0, 19)); // NOI18N
        blackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/page.jpg"))); // NOI18N
        blackground.setText("jLabel1");
        getContentPane().add(blackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistclubbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistclubbottonActionPerformed
        ViewRegist view = new ViewRegist();
        this.setVisible(true);
        view.setVisible(true);
    }//GEN-LAST:event_RegistclubbottonActionPerformed

    private void RegistclubbottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistclubbottonMouseClicked

    }//GEN-LAST:event_RegistclubbottonMouseClicked

    private void BackbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbottonActionPerformed
            this.setVisible(false);
            LoginHomepage login = new LoginHomepage();
            login.setVisible(true);
    }//GEN-LAST:event_BackbottonActionPerformed

//    public void getClubName() {
//        try {
//            String sql = "SELECT club_id from clubs where club_id = ?";
//            PreparedStatement statement = con.prepareStatement(sql);
//            statement.setInt(1, WIDTH);
//        } 
//        catch (SQLException ex) {
//            Logger.getLogger(ViewClub.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println(ex + "\n" + ex.getMessage());
//        }
//    }
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
            java.util.logging.Logger.getLogger(ViewClubFromSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewClubFromSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewClubFromSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewClubFromSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewClubFromSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddDescription;
    private javax.swing.JLabel AddName;
    private javax.swing.JButton Backbotton;
    private javax.swing.JLabel Club;
    private javax.swing.JLabel Clubname;
    private javax.swing.JLabel Picture;
    private javax.swing.JButton Registclubbotton;
    private javax.swing.JLabel blackground;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlbClubId;
    // End of variables declaration//GEN-END:variables
}
