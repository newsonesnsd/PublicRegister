/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.view;

import java.awt.*;
import java.io.*;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import publicregistergroup.controller.ConnectionBuilder;
import publicregistergroup.model.Students;

/**
 *
 * @author taloey
 */
public class EditProfile extends JFrame {

    static Connection con = ConnectionBuilder.getConnection();
    private final long std_id = Login.getStdId();
    // private long stdUsername = Login.getStdId();
    private String name, faculty, telephone, facebook, medicine, food, email, picture, image;
    private String path, abPath;
    private String search;
    private long stdID = Login.getStdId();

    /**
     * Creates new form Uploadphoto
     */
    public EditProfile() {
        initComponents();
        setLocationRelativeTo(null);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bottonsearch = new javax.swing.JButton();
        boxphoto = new javax.swing.JPanel();
        ImageUpload = new javax.swing.JLabel();
        ImageS = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Surname = new javax.swing.JLabel();
        Telephone = new javax.swing.JLabel();
        Facebook = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        แพ้ยาอะไร = new javax.swing.JLabel();
        แพ้อาหาอะไร = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        ShowID = new javax.swing.JLabel();
        Submitbotton = new javax.swing.JButton();
        UploadBotton = new javax.swing.JButton();
        NameTextField = new javax.swing.JTextField();
        SurnameTextField = new javax.swing.JTextField();
        TelephoneTextField = new javax.swing.JTextField();
        FacebookTextField = new javax.swing.JTextField();
        MedicineTextField = new javax.swing.JTextField();
        FoodTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        SearchclubTextField = new javax.swing.JTextField();
        ChangePage = new javax.swing.JButton();
        blackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bottonsearch.setText("OK");
        Bottonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonsearchActionPerformed(evt);
            }
        });
        getContentPane().add(Bottonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 80, 25));

        boxphoto.setBackground(new java.awt.Color(255, 255, 255));
        boxphoto.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 51, 0)));

        ImageUpload.setFont(new java.awt.Font("Quark", 0, 48)); // NOI18N
        ImageUpload.setForeground(new java.awt.Color(204, 204, 204));
        ImageUpload.setText("Uploadphoto");

        javax.swing.GroupLayout boxphotoLayout = new javax.swing.GroupLayout(boxphoto);
        boxphoto.setLayout(boxphotoLayout);
        boxphotoLayout.setHorizontalGroup(
            boxphotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageS, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addGroup(boxphotoLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(ImageUpload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        boxphotoLayout.setVerticalGroup(
            boxphotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxphotoLayout.createSequentialGroup()
                .addComponent(ImageS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(139, 139, 139)
                .addComponent(ImageUpload)
                .addGap(175, 175, 175))
        );

        ImageS.setIcon(new ImageIcon((new ImageIcon("src/Images/"+(Students.getStd_pic(std_id))).getImage().getScaledInstance(395,335,Image.SCALE_SMOOTH))));

        getContentPane().add(boxphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 400, 340));

        Name.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        Name.setText("Name :");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        Surname.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        Surname.setText("Faculty :");
        getContentPane().add(Surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        Telephone.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        Telephone.setText("Telephone :");
        getContentPane().add(Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        Facebook.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        Facebook.setText("Facebook :");
        getContentPane().add(Facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        Email.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        Email.setText("E-mail :");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, -1, -1));

        แพ้ยาอะไร.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        แพ้ยาอะไร.setText("แพ้ยาอะไร :");
        getContentPane().add(แพ้ยาอะไร, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        แพ้อาหาอะไร.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        แพ้อาหาอะไร.setText("แพ้อาหารอะไร :");
        getContentPane().add(แพ้อาหาอะไร, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        ID.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        ID.setText("ID :");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 40, 30));

        ShowID.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        getContentPane().add(ShowID, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 220, 30));
        ShowID.setText(std_id+"");

        Submitbotton.setBackground(new java.awt.Color(213, 186, 55));
        Submitbotton.setFont(new java.awt.Font("Quark", 0, 30)); // NOI18N
        Submitbotton.setForeground(new java.awt.Color(255, 255, 255));
        Submitbotton.setText("Submit");
        Submitbotton.setBorder(null);
        Submitbotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitbottonMouseClicked(evt);
            }
        });
        Submitbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbottonActionPerformed(evt);
            }
        });
        getContentPane().add(Submitbotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, 240, 40));

        UploadBotton.setBackground(new java.awt.Color(213, 186, 55));
        UploadBotton.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        UploadBotton.setForeground(new java.awt.Color(255, 255, 255));
        UploadBotton.setText("Upload");
        UploadBotton.setBorder(null);
        UploadBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadBottonActionPerformed(evt);
            }
        });
        getContentPane().add(UploadBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 160, 40));

        NameTextField.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        NameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 320, 40));
        NameTextField.setText(Students.getStd_name(std_id));

        SurnameTextField.setEditable(false);
        SurnameTextField.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        SurnameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        SurnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurnameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SurnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 320, 40));
        SurnameTextField.setText(Students.getStd_faculty(std_id));

        TelephoneTextField.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        TelephoneTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        TelephoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelephoneTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(TelephoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 320, 40));
        TelephoneTextField.setText(Students.getStd_tel(std_id));

        FacebookTextField.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        FacebookTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        FacebookTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacebookTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(FacebookTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 320, 40));
        FacebookTextField.setText(Students.getStd_facebook(std_id));

        MedicineTextField.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        MedicineTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        MedicineTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicineTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(MedicineTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 320, 40));
        MedicineTextField.setText(Students.getStd_medicine(std_id));

        FoodTextField.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        FoodTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        FoodTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(FoodTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 320, 40));
        FoodTextField.setText(Students.getStd_food(std_id));

        EmailTextField.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        EmailTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 320, 40));
        EmailTextField.setText(Students.getStd_email(std_id));

        SearchclubTextField.setFont(new java.awt.Font("Kanit", 0, 13)); // NOI18N
        SearchclubTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchclubTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SearchclubTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 261, 30));

        ChangePage.setBorder(null);
        ChangePage.setContentAreaFilled(false);
        ChangePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChangePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePageActionPerformed(evt);
            }
        });
        getContentPane().add(ChangePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 230, 40));

        blackground.setIcon(new javax.swing.ImageIcon("/Users/taloey/Desktop/PublicRegister/src/Images/page.jpg")); // NOI18N
        blackground.setText("jLabel1");
        getContentPane().add(blackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1030, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BottonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonsearchActionPerformed
        search = SearchclubTextField.getText();
        String club = "";
        try {

            String sql = "SELECT * FROM clubs where club_name LIKE '%" + search + "%'";
            PreparedStatement pre = con.prepareStatement(sql);
//            pre.setString(1, "%"+search+"%");
            ResultSet res = pre.executeQuery();
            while (res.next()) {
                club = res.getString("club_name");
                System.out.println(club + " clubname");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (search.equals(club)) {
            JOptionPane frame = new JOptionPane();
            JOptionPane.showMessageDialog(frame, "Search success", "Search club", JOptionPane.PLAIN_MESSAGE);
            ViewClubFromSearch view = new ViewClubFromSearch();
            this.setVisible(false);
            view.setVisible(true);
        } else {
            JOptionPane frame = new JOptionPane();
            JOptionPane.showMessageDialog(frame, "Failed club name", "Search club", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BottonsearchActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed

    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void FacebookTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacebookTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FacebookTextFieldActionPerformed

    private void SurnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SurnameTextFieldActionPerformed

    private void FoodTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FoodTextFieldActionPerformed

    private void SearchclubTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchclubTextFieldActionPerformed

    }//GEN-LAST:event_SearchclubTextFieldActionPerformed

    private void ChangePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePageActionPerformed

        Homepage home = new Homepage();
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_ChangePageActionPerformed

    private void UploadBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadBottonActionPerformed
        JFileChooser fileOpen = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG file", new String[] {"jpg", "jpeg" , "png"});
        fileOpen.setFileFilter(filter);
        fileOpen.addChoosableFileFilter(filter);
        int result = fileOpen.showDialog(null, "Choose Image");
        File selecFile = fileOpen.getSelectedFile();
        if (selecFile == null) {
            System.out.println(" ");
        } else {
            abPath = selecFile.getAbsolutePath();
            path = selecFile.getName();
            ImageS.setIcon(new ImageIcon((new ImageIcon(abPath).getImage().getScaledInstance(395, 335, Image.SCALE_SMOOTH))));
            System.out.println(path);
        }

    }//GEN-LAST:event_UploadBottonActionPerformed

    private void SubmitbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbottonActionPerformed

        InputStream filepic = null;

        try {
            name = NameTextField.getText();
            faculty = SurnameTextField.getText();
            telephone = TelephoneTextField.getText();
            facebook = FacebookTextField.getText();
            medicine = MedicineTextField.getText();
            food = FoodTextField.getText();
            email = EmailTextField.getText();

            String sql = "UPDATE students SET std_name=?, std_tel=?, std_facebook=?, std_medicine=?, std_food=?, std_email=? WHERE std_id=?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, telephone);
            pre.setString(3, facebook);
            pre.setString(4, medicine);
            pre.setString(5, food);
            pre.setString(6, email);
            pre.setLong(7, std_id);
            //pre.setString(7, path);
            pre.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (abPath == null) {
            System.out.println("");
        } else {
            try {

                filepic = new FileInputStream(abPath);
                String sql = "UPDATE students SET std_picture=? WHERE std_id=?";
                PreparedStatement pre = con.prepareStatement(sql);
                pre.setString(1, path);
                pre.setLong(2, std_id);
                pre.executeUpdate();
                OutputStream ops = null;
                try {

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
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        String role = null;
        try {
            String sql = "SELECT * FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet res = pre.executeQuery();
            while (res.next()) {
                role = res.getString("std_role");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        ViewRegist regist = new ViewRegist();
        this.setVisible(false);
        regist.setVisible(true);

    }//GEN-LAST:event_SubmitbottonActionPerformed

    private void SubmitbottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitbottonMouseClicked

    }//GEN-LAST:event_SubmitbottonMouseClicked

    private void TelephoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelephoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelephoneTextFieldActionPerformed

    private void MedicineTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicineTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicineTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bottonsearch;
    private javax.swing.JButton ChangePage;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel Facebook;
    private javax.swing.JTextField FacebookTextField;
    private javax.swing.JTextField FoodTextField;
    private javax.swing.JLabel ID;
    public static javax.swing.JLabel ImageS;
    private javax.swing.JLabel ImageUpload;
    private javax.swing.JTextField MedicineTextField;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField SearchclubTextField;
    private javax.swing.JLabel ShowID;
    private javax.swing.JButton Submitbotton;
    private javax.swing.JLabel Surname;
    private javax.swing.JTextField SurnameTextField;
    private javax.swing.JLabel Telephone;
    private javax.swing.JTextField TelephoneTextField;
    private javax.swing.JButton UploadBotton;
    private javax.swing.JLabel blackground;
    private javax.swing.JPanel boxphoto;
    private javax.swing.JLabel แพ้ยาอะไร;
    private javax.swing.JLabel แพ้อาหาอะไร;
    // End of variables declaration//GEN-END:variables
}
