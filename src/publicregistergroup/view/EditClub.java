/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.view;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import publicregistergroup.controller.ConnectionBuilder;
import static publicregistergroup.view.ViewProfile.con;

/**
 *
 * @author taloey
 */
public class EditClub extends JFrame {
     static Connection con = ConnectionBuilder.getConnection();
     private String nameclub,detailclub;
     private String path,abPath;
    /**
     * Creates new form Uploadphoto
     */
    public EditClub() {
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

        Boxphoto = new javax.swing.JPanel();
        textupload = new javax.swing.JLabel();
        Uploadphotos = new javax.swing.JLabel();
        textDetail1 = new javax.swing.JLabel();
        SearchTextField = new javax.swing.JTextField();
        Bottonsearch = new javax.swing.JButton();
        savebotton = new javax.swing.JButton();
        uploadbotton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailArea = new javax.swing.JTextArea();
        blackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Club");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boxphoto.setBackground(new java.awt.Color(255, 255, 255));
        Boxphoto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 51)));

        textupload.setFont(new java.awt.Font("Quark", 0, 48)); // NOI18N
        textupload.setForeground(new java.awt.Color(204, 204, 204));
        textupload.setText("อัพโหลดรูปภาพ");

        javax.swing.GroupLayout BoxphotoLayout = new javax.swing.GroupLayout(Boxphoto);
        Boxphoto.setLayout(BoxphotoLayout);
        BoxphotoLayout.setHorizontalGroup(
            BoxphotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoxphotoLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(textupload, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addComponent(Uploadphotos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BoxphotoLayout.setVerticalGroup(
            BoxphotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoxphotoLayout.createSequentialGroup()
                .addComponent(Uploadphotos, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textupload, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        String clubpicture=null;
        try {
            Statement st = con.createStatement();
            String sql = "SELECT std_role FROM students WHERE std_id = 59130500004";
            ResultSet res = st.executeQuery(sql);
            int club_id =0;
            String std_role=null;
            while (res.next()) {
                std_role = res.getString("std_role");
                club_id = Integer.parseInt(std_role);
                sql = "SELECT club_picture FROM clubs WHERE club_id = ?";
                PreparedStatement pre = con.prepareStatement(sql);
                pre.setInt(1, club_id);
                ResultSet rs = pre.executeQuery();
                if(rs.next()) {
                    clubpicture =rs.getString("club_picture");
                }

                if(std_role!=null){
                    Uploadphotos.setIcon(new ImageIcon((new ImageIcon("src/Images/"+clubpicture).getImage().getScaledInstance(436,366,Image.SCALE_SMOOTH))));
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        getContentPane().add(Boxphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 440, 370));

        textDetail1.setFont(new java.awt.Font("Quark", 0, 52)); // NOI18N
        textDetail1.setForeground(new java.awt.Color(77, 77, 77));
        textDetail1.setText("รายละเอียด");
        getContentPane().add(textDetail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));
        getContentPane().add(SearchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 260, 30));

        Bottonsearch.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        Bottonsearch.setText("OK");
        Bottonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonsearchActionPerformed(evt);
            }
        });
        getContentPane().add(Bottonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 80, 30));

        savebotton.setBackground(new java.awt.Color(213, 186, 55));
        savebotton.setFont(new java.awt.Font("Quark", 0, 48)); // NOI18N
        savebotton.setForeground(new java.awt.Color(255, 255, 255));
        savebotton.setText("Save");
        savebotton.setBorder(null);
        savebotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebottonMouseClicked(evt);
            }
        });
        savebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebottonActionPerformed(evt);
            }
        });
        getContentPane().add(savebotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 230, 60));

        uploadbotton.setBackground(new java.awt.Color(213, 186, 55));
        uploadbotton.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        uploadbotton.setForeground(new java.awt.Color(255, 255, 255));
        uploadbotton.setText("upload");
        uploadbotton.setBorder(null);
        uploadbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbottonActionPerformed(evt);
            }
        });
        getContentPane().add(uploadbotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 130, 40));

        detailArea.setColumns(20);
        detailArea.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        detailArea.setRows(5);
        detailArea.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 51, 0)));
        jScrollPane1.setViewportView(detailArea);
        String club_description=null;
        try {
            Statement st = con.createStatement();
            String sql = "SELECT std_role FROM students WHERE std_id = 59130500004";
            ResultSet res = st.executeQuery(sql);
            int club_id =0;
            String std_role=null;
            while (res.next()) {
                std_role = res.getString("std_role");
                club_id = Integer.parseInt(std_role);
                sql = "SELECT club_description FROM clubs WHERE club_id = ?";
                PreparedStatement pre = con.prepareStatement(sql);
                pre.setInt(1, club_id);
                ResultSet rs = pre.executeQuery();
                if(rs.next()) {
                    club_description =rs.getString("club_description");
                }

                if(std_role!=null){
                    detailArea.setText(club_description);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 450, 330));

        blackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/page.jpg"))); // NOI18N
        blackground.setText("jLabel1");
        getContentPane().add(blackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BottonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BottonsearchActionPerformed

    private void uploadbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbottonActionPerformed
    JFileChooser fileOpen = new JFileChooser();
        fileOpen.showDialog(null , "Choose Image");
        fileOpen.setAcceptAllFileFilterUsed(false);
        fileOpen.addChoosableFileFilter(new FileNameExtensionFilter(".jpg","jpg"));
        fileOpen.addChoosableFileFilter(new FileNameExtensionFilter(".gif","gif"));
        fileOpen.addChoosableFileFilter(new FileNameExtensionFilter(".png","png"));
        int result = fileOpen.showDialog(null, "Choose Image");
            File selecFile = fileOpen.getSelectedFile();
            path = selecFile.getName();
            abPath = selecFile.getAbsolutePath();
           Uploadphotos.setIcon(new ImageIcon((new ImageIcon(abPath).getImage().getScaledInstance(436,366,Image.SCALE_SMOOTH))));
            
    }//GEN-LAST:event_uploadbottonActionPerformed

    private void savebottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebottonActionPerformed
        InputStream filepic = null;
        
        
            try{
            detailclub = detailArea.getText();
            String sql = "UPDATE clubs SET club_description=? WHERE club_id=6";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, detailclub);
            //System.out.println("2");
            pre.executeUpdate();
            System.out.println("Yes");
            
        } catch (SQLException ex) {
                System.out.println(ex);
        }
        if(abPath == null){
            System.out.println("");
        }else{
            
        
        try {
    
            filepic = new FileInputStream(abPath);
            String sql = "UPDATE clubs SET club_picture=? WHERE club_id=6";
                PreparedStatement pre = con.prepareStatement(sql);
                pre.setString(1, path);
                pre.executeUpdate();
            OutputStream ops = null;
            try {
                
                //System.out.println("asdada");
                System.out.println("Path :" + "/Users/taloey/Desktop/PublicRegister/src/Images/" + path);
                ops = new FileOutputStream(new File("src/Images/" + path));
                int read = 0;
                byte[] b = new byte[1024];
                while ((read = filepic.read(b)) != -1) {
                    ops.write(b, 0, read);
                }
                filepic.close();
            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException ex) {
                System.out.println(ex);
            } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
                    Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        LinkData data = new LinkData();
        this.setVisible(false);
        data.setVisible(true);
    }//GEN-LAST:event_savebottonActionPerformed

    private void savebottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebottonMouseClicked
        /*InputStream filepic = null;
        
        
            try{
            detailclub = detailArea.getText();
            String sql = "UPDATE clubs SET club_description=? WHERE club_id=6";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, detailclub);
            //System.out.println("2");
            pre.executeUpdate();
            System.out.println("Yes");
            
        } catch (SQLException ex) {
                System.out.println(ex);
        }
        if(abPath == null){
            System.out.println("");
        }else{
            
        
        try {
    
            filepic = new FileInputStream(abPath);
            String sql = "UPDATE clubs SET club_picture=? WHERE club_id=6";
                PreparedStatement pre = con.prepareStatement(sql);
                pre.setString(1, path);
                pre.executeUpdate();
            OutputStream ops = null;
            try {
                
                //System.out.println("asdada");
                System.out.println("Path :" + "/Users/taloey/Desktop/PublicRegister/src/Images/" + path);
                ops = new FileOutputStream(new File("src/Images/" + path));
                int read = 0;
                byte[] b = new byte[1024];
                while ((read = filepic.read(b)) != -1) {
                    ops.write(b, 0, read);
                }
                filepic.close();
            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException ex) {
                System.out.println(ex);
            } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
                    Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
        }finally {
            try {
                filepic.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        */
    }//GEN-LAST:event_savebottonMouseClicked

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
            java.util.logging.Logger.getLogger(EditClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bottonsearch;
    private javax.swing.JPanel Boxphoto;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JLabel Uploadphotos;
    private javax.swing.JLabel blackground;
    private javax.swing.JTextArea detailArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton savebotton;
    private javax.swing.JLabel textDetail1;
    private javax.swing.JLabel textupload;
    private javax.swing.JButton uploadbotton;
    // End of variables declaration//GEN-END:variables
}
