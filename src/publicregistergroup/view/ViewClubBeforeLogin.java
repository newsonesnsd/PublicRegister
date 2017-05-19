/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.view;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import publicregistergroup.controller.ConnectionBuilder;
import publicregistergroup.model.*;
import static publicregistergroup.view.ViewProfile.con;

/**
 *
 * @author kz_no
 */
public class ViewClubBeforeLogin extends javax.swing.JFrame {
    static Connection con = ConnectionBuilder.getConnection();
    private String clubName = Clubs.getClub_name(Homepage.getClubIndex());
    private String clubDescription = Clubs.getClub_description(Homepage.getClubIndex());
    private int club_id = Clubs.getClub_id(Homepage.getClubIndex());
    //private int Picture = Clubs.getClub_description(LoginHomepage.getClubIndex());
    private String search;
    
    /**
     * Creates new form ViewClub
     */
    public ViewClubBeforeLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * This is the part of my method 
     * This zone is about getMethod to call Club: name, id, description
     * @return 
     */
    
    
//    public String getClubName() {
//        club_id = clubIndex+1;        
//        try {
//            String sql = "SELECT * FROM clubs WHERE club_id = ?";
//            PreparedStatement pre = con.prepareStatement(sql);
//            pre.setInt(1, club_id);
//            ResultSet rs = pre.executeQuery();
//            if(rs.next()) {
//                clubName = rs.getString("club_name");
//                //System.out.println(clubName);
//            }
//        } 
//        catch (SQLException e) {
//            System.out.println(e + "\n" + e.getMessage());
//        }
//        return clubName;      
//    }
    
    
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
        SearchclubTextField = new javax.swing.JTextField();
        Bottonsearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        AddDescription = new javax.swing.JLabel();
        jlbClubId = new javax.swing.JLabel();
        AddName = new javax.swing.JLabel();
        Backbotton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        blackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Club Detail");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Picture.setFont(new java.awt.Font("Quark", 1, 70)); // NOI18N
        Picture.setForeground(new java.awt.Color(153, 153, 153));
        Picture.setText("      PIC");
        Picture.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(Picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 360, 320));
        Picture.setIcon(new ImageIcon((new ImageIcon("src/Images/"+(Clubs.getClub_pic(club_id))).getImage().getScaledInstance(395,335,Image.SCALE_SMOOTH))));

        Clubname.setFont(new java.awt.Font("Quark", 1, 36)); // NOI18N
        getContentPane().add(Clubname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 660, 80));
        Clubname.setText(Clubs.getClub_name(club_id));

        Club.setFont(new java.awt.Font("Quark", 0, 19)); // NOI18N
        Club.setText("<html> CLUB ID:  <br> <br>CLUB NAME:  <br> <br>DESCRIPTION:  </html>");
        Club.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(Club, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, 170));

        SearchclubTextField.setFont(new java.awt.Font("Kanit", 0, 13)); // NOI18N
        SearchclubTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchclubTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SearchclubTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 91, 261, 22));
        SearchclubTextField.getAccessibleContext().setAccessibleDescription("");

        Bottonsearch.setText("OK");
        Bottonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonsearchActionPerformed(evt);
            }
        });
        getContentPane().add(Bottonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 80, 25));

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

        Backbotton.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        Backbotton.setText("Back");
        Backbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbottonActionPerformed(evt);
            }
        });
        getContentPane().add(Backbotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 633, 100, 30));

        jButton2.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 90, -1));

        blackground.setFont(new java.awt.Font("Quark", 0, 19)); // NOI18N
        blackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/page.jpg"))); // NOI18N
        blackground.setText("jLabel1");
        getContentPane().add(blackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchclubTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchclubTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchclubTextFieldActionPerformed

    private void BottonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonsearchActionPerformed
        search = SearchclubTextField.getText();
        String club="";    
        try {
            
           
            String sql = "SELECT * FROM clubs where club_name LIKE '%"+search+"%'";
            PreparedStatement pre = con.prepareStatement(sql);
//            pre.setString(1, "%"+search+"%");
            System.out.println(search+" search la");
             ResultSet res = pre.executeQuery();
             System.out.println("EXE LAEW");
                if(res.next()) {
                    club =res.getString("club_name");
                    System.out.println(club+" clubname");
                }
                
        } catch (SQLException ex) {
            ex.printStackTrace();
        }if (search .equals(club)) {
            JOptionPane frame = new JOptionPane();
            JOptionPane.showMessageDialog(frame,"Search success","Search club",JOptionPane.PLAIN_MESSAGE);
             // = allClubs.getSelectedIndex();
             ViewClubFromSearch view = new ViewClubFromSearch();
            this.setVisible(false);
             view.setVisible(true);
        }
        else {
            JOptionPane frame = new JOptionPane();
            JOptionPane.showMessageDialog(frame,"Failed club name","Search club",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BottonsearchActionPerformed

    private void BackbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbottonActionPerformed
            this.setVisible(false);
            Homepage login = new Homepage();
            login.setVisible(true);
    }//GEN-LAST:event_BackbottonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
        this.setVisible(false);
        log.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewClubBeforeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewClubBeforeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewClubBeforeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewClubBeforeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewClubBeforeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddDescription;
    private javax.swing.JLabel AddName;
    private javax.swing.JButton Backbotton;
    private javax.swing.JButton Bottonsearch;
    private javax.swing.JLabel Club;
    private javax.swing.JLabel Clubname;
    private javax.swing.JLabel Picture;
    private javax.swing.JTextField SearchclubTextField;
    private javax.swing.JLabel blackground;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlbClubId;
    // End of variables declaration//GEN-END:variables
}