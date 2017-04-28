/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import publicregistergroup.controller.ConnectionBuilder;
import publicregistergroup.model.*;

/**
 *
 * @author kz_no
 */
public class ViewClub extends javax.swing.JFrame {
    static Connection con = ConnectionBuilder.getConnection();
    private String clubName;
    private String clubDescription;
    Homepage hp = new Homepage();
    private int clubIndex = 10;
    private int clubId;

    /**
     * Creates new form ViewClub
     */
    public ViewClub() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * This is the part of my method 
     * This zone is about getMethod to call Club: name, id, description
     * @return 
     */
    
    public int getClubID() {
        clubId = clubIndex+1;        
        try {
            String sql = "SELECT * FROM clubs WHERE club_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, ""+clubIndex);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                clubId = rs.getInt("club_id");
                System.out.println(clubId);
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
        }
        return clubId;        
    }
    
    public abstract String getClubName();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        SearchclubTextField = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        textsearchclub = new javax.swing.JLabel();
        Bottonsearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        AddDescription = new javax.swing.JLabel();
        AddID = new javax.swing.JLabel();
        AddName = new javax.swing.JLabel();
        blackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Quark", 1, 70)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("      PIC");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 360, 360));

        jLabel8.setFont(new java.awt.Font("Quark", 1, 45)); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 370, 80));
        jLabel8.setText(getClubID()+"");

        jLabel9.setFont(new java.awt.Font("Quark", 0, 19)); // NOI18N
        jLabel9.setText("<html> CLUB ID:  <br> <br>CLUB NAME:  <br> <br>DESCRIPTION:  </html>");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, 170));

        jButton3.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        jButton3.setText("สมัครเข้าร่วมชมรม");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 630, -1, -1));

        SearchclubTextField.setFont(new java.awt.Font("Kanit", 0, 13)); // NOI18N
        SearchclubTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchclubTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SearchclubTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 300, 30));

        Title.setFont(new java.awt.Font("Kailasa", 0, 36)); // NOI18N
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, 50));

        textsearchclub.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        textsearchclub.setText("serach from club or organize for you interest");
        getContentPane().add(textsearchclub, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 290, 20));

        Bottonsearch.setText("OK");
        Bottonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonsearchActionPerformed(evt);
            }
        });
        getContentPane().add(Bottonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 80, 30));

        jLabel2.setText("____________________________________________________________________________________________________________________");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        AddDescription.setText("jLabel1");
        getContentPane().add(AddDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 230, 30));

        AddID.setText("jLabel1");
        getContentPane().add(AddID, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 230, 30));

        AddName.setText("jLabel1");
        getContentPane().add(AddName, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 230, 30));

        blackground.setFont(new java.awt.Font("Quark", 0, 19)); // NOI18N
        blackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        blackground.setText("jLabel1");
        getContentPane().add(blackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ViewRegist view = new ViewRegist();
        this.setVisible(false);
        view.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void SearchclubTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchclubTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchclubTextFieldActionPerformed

    private void BottonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonsearchActionPerformed

    }//GEN-LAST:event_BottonsearchActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
//       try {
//            // TODO add your handling code here:
//            //name = NameTextField.getText();
//            //faculty = SurnameTextField.getText();
//            //telephone = TelephoneTextField.getText();
//            //facebook = FacebookTextField.getText();
//            //medicineloss = MedicineTextField.getText();
//            //foodloss = FoodTextField.getText();
//            //email = EmailTextField.getText();
////            clubID =  Integer.parseInt(AddID.getText()); 
////            clubName = AddName.getText();
////            clubDescription = AddDescription.getText();
////            Statement st = con.createStatement();
////            String sql = "SELECT * FROM clubs SET club_name=?, club_description=? where club_id=1";
////            PreparedStatement pre = con.prepareStatement(sql);
////            pre.setString(1, clubName);
////            pre.setString(2, clubDescription);
////            //pre.setString(3, telephone);
////            ResultSet res = pre.executeQuery();
////            //ResultSet res = st.executeQuery(sql);
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(ViewClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddDescription;
    private javax.swing.JLabel AddID;
    private javax.swing.JLabel AddName;
    private javax.swing.JButton Bottonsearch;
    private javax.swing.JTextField SearchclubTextField;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel blackground;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel textsearchclub;
    // End of variables declaration//GEN-END:variables
}
