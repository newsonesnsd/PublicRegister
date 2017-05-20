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
public class ViewProfile extends JFrame {

    static Connection con = ConnectionBuilder.getConnection();
    private final long std_id = Login.getStdId();
    // private long stdUsername = Login.getStdId();
    private String name, faculty, telephone, facebook, medicine, food, email, picture, image;
    private String path, abPath;
    private String search;
    private long stdID = Login.getStdId();
    private int result;

    /**
     * Creates new form Uploadphoto
     */
    public ViewProfile() {
        initComponents();
        setLocationRelativeTo(null);
        /*.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String> strings = Clubs.getAllClubs();
            @Override
            public int getSize() {
                return strings.size();
            }
            @Override
            public String getElementAt(int i) {
                return strings.get(i);
            }
        }*/
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
        logout = new javax.swing.JButton();
        ShowID = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
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
        getContentPane().add(Bottonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 87, 84, 27));

        boxphoto.setBackground(new java.awt.Color(255, 255, 255));
        boxphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ImageUpload.setFont(new java.awt.Font("Quark", 1, 48)); // NOI18N
        ImageUpload.setForeground(new java.awt.Color(204, 204, 204));
        ImageUpload.setText("UPLOADPICTURE");

        javax.swing.GroupLayout boxphotoLayout = new javax.swing.GroupLayout(boxphoto);
        boxphoto.setLayout(boxphotoLayout);
        boxphotoLayout.setHorizontalGroup(
            boxphotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageS, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxphotoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageUpload)
                .addGap(20, 20, 20))
        );
        boxphotoLayout.setVerticalGroup(
            boxphotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxphotoLayout.createSequentialGroup()
                .addComponent(ImageS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(136, 136, 136)
                .addComponent(ImageUpload)
                .addGap(202, 202, 202))
        );

        ImageS.setIcon(new ImageIcon((new ImageIcon("src/Images/"+(Students.getStd_pic(std_id))).getImage().getScaledInstance(395,335,Image.SCALE_SMOOTH))));

        getContentPane().add(boxphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 400, 340));

        Name.setFont(new java.awt.Font("Quark", 1, 22)); // NOI18N
        Name.setText("Name :");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        Surname.setFont(new java.awt.Font("Quark", 1, 22)); // NOI18N
        Surname.setText("Faculty :");
        getContentPane().add(Surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        Telephone.setFont(new java.awt.Font("Quark", 1, 22)); // NOI18N
        Telephone.setText("Telephone :");
        getContentPane().add(Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        Facebook.setFont(new java.awt.Font("Quark", 1, 22)); // NOI18N
        Facebook.setText("Facebook :");
        getContentPane().add(Facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        Email.setFont(new java.awt.Font("Quark", 1, 22)); // NOI18N
        Email.setText("E-mail :");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, -1, -1));

        แพ้ยาอะไร.setFont(new java.awt.Font("Quark", 1, 22)); // NOI18N
        แพ้ยาอะไร.setText("แพ้ยาอะไร :");
        getContentPane().add(แพ้ยาอะไร, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));

        แพ้อาหาอะไร.setFont(new java.awt.Font("Quark", 1, 22)); // NOI18N
        แพ้อาหาอะไร.setText("แพ้อาหารอะไร :");
        getContentPane().add(แพ้อาหาอะไร, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, -1, -1));

        Submitbotton.setBackground(new java.awt.Color(213, 186, 55));
        Submitbotton.setFont(new java.awt.Font("Quark", 1, 24)); // NOI18N
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
        getContentPane().add(Submitbotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 180, 40));

        UploadBotton.setBackground(new java.awt.Color(213, 186, 55));
        UploadBotton.setFont(new java.awt.Font("Quark", 1, 18)); // NOI18N
        UploadBotton.setForeground(new java.awt.Color(255, 255, 255));
        UploadBotton.setText("Upload");
        UploadBotton.setBorder(null);
        UploadBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadBottonActionPerformed(evt);
            }
        });
        getContentPane().add(UploadBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 205, 110, 30));

        NameTextField.setFont(new java.awt.Font("Quark", 0, 21)); // NOI18N
        NameTextField.setText("Kittiya");
        NameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 320, 40));
        NameTextField.setText(Students.getStd_name(std_id));

        SurnameTextField.setEditable(false);
        SurnameTextField.setFont(new java.awt.Font("Quark", 0, 22)); // NOI18N
        SurnameTextField.setText("IT");
        SurnameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SurnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurnameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SurnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 320, 40));
        SurnameTextField.setText(Students.getStd_faculty(std_id));

        TelephoneTextField.setFont(new java.awt.Font("Quark", 0, 20)); // NOI18N
        TelephoneTextField.setText("0907700443");
        TelephoneTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TelephoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelephoneTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(TelephoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 320, 40));
        TelephoneTextField.setText(Students.getStd_tel(std_id));

        FacebookTextField.setFont(new java.awt.Font("Quark", 0, 21)); // NOI18N
        FacebookTextField.setText("Noey");
        FacebookTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FacebookTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacebookTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(FacebookTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 320, 40));
        FacebookTextField.setText(Students.getStd_facebook(std_id));

        MedicineTextField.setFont(new java.awt.Font("Quark", 0, 22)); // NOI18N
        MedicineTextField.setText("-");
        MedicineTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MedicineTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicineTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(MedicineTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 320, 40));
        MedicineTextField.setText(Students.getStd_medicine(std_id));

        FoodTextField.setFont(new java.awt.Font("Quark", 0, 22)); // NOI18N
        FoodTextField.setText("-");
        FoodTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FoodTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(FoodTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 320, 40));
        FoodTextField.setText(Students.getStd_food(std_id));

        EmailTextField.setFont(new java.awt.Font("Quark", 0, 21)); // NOI18N
        EmailTextField.setText("kz_noey");
        EmailTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 320, 40));
        EmailTextField.setText(Students.getStd_email(std_id));

        SearchclubTextField.setFont(new java.awt.Font("Kanit", 0, 13)); // NOI18N
        SearchclubTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchclubTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SearchclubTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 88, 264, 27));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        logout.setBorder(null);
        logout.setBorderPainted(false);
        logout.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        logout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                logoutMouseMoved(evt);
            }
        });
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 40, 32, 32));

        ShowID.setFont(new java.awt.Font("Quark", 1, 18)); // NOI18N
        ShowID.setText("59130500005");
        getContentPane().add(ShowID, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 17, 120, 21));
        ShowID.setText(stdID+"");

        Id.setFont(new java.awt.Font("Quark", 1, 19)); // NOI18N
        Id.setText("ID :");
        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 17, -1, -1));

        logOut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 70, 40, 20));

        blackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/page.jpg"))); // NOI18N
        blackground.setText("jLabel1");
        blackground.setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(blackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

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
            System.out.println(search + " search la");
            ResultSet res = pre.executeQuery();
            System.out.println("EXE LAEW");
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
            // = allClubs.getSelectedIndex();
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

    private void UploadBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadBottonActionPerformed
        JFileChooser fileOpen = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG file", new String[] {"jpg", "jpeg" , "png"});
        fileOpen.setFileFilter(filter);
        fileOpen.addChoosableFileFilter(filter);
        result = fileOpen.showDialog(null, "Choose Image");
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
        System.out.println("437");

        InputStream filepic = null;

        try {
            //System.out.println("mk,nksds");
            // TODO add your handling code here:
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
            //ResultSet res = st.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        System.out.println("บบรรดทัด 409");

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
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        String role = null;
        try {
            System.out.println("Chk " + std_id);
            String sql = "SELECT * FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet res = pre.executeQuery();
            System.out.println("456");
            while (res.next()) {
                role = res.getString("std_role");
                System.out.println(role);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        if (role.isEmpty()) {
            System.out.println("465");
            LinkDataforUser user = new LinkDataforUser();
            this.setVisible(false);
            user.setVisible(true);
        } else {
            LinkData admin = new LinkData();
            this.setVisible(false);
            admin.setVisible(true);
        }
    }//GEN-LAST:event_SubmitbottonActionPerformed

    private void SubmitbottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitbottonMouseClicked
//      System.out.println("437");
//        
//        InputStream filepic = null;
// 
//            try {
//                //System.out.println("mk,nksds");
//                // TODO add your handling code here:
//                name = NameTextField.getText();
//                faculty = SurnameTextField.getText();
//                telephone = TelephoneTextField.getText();
//                facebook = FacebookTextField.getText();
//                medicine = MedicineTextField.getText();
//                food = FoodTextField.getText();
//                email = EmailTextField.getText();
//
//                String sql = "UPDATE students SET std_name=?, std_tel=?, std_facebook=?, std_medicine=?, std_food=?, std_email=? WHERE std_id=59130500004";
//                PreparedStatement pre = con.prepareStatement(sql);
//                pre.setString(1, name);
//                pre.setString(2, telephone);
//                pre.setString(3, facebook);
//                pre.setString(4, medicine);
//                pre.setString(5, food);
//                pre.setString(6, email);
//                //pre.setString(7, path);
//                pre.executeUpdate();
//                //ResultSet res = st.executeQuery(sql);
//
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//
//            System.out.println("บบรรดทัด 466");
//
//         if(abPath == null){
//            System.out.println("");
//        }else{
//              
//        try {
//    
//            filepic = new FileInputStream(abPath);
//            String sql = "UPDATE students SET std_picture=? WHERE std_id=59130500004";
//                PreparedStatement pre = con.prepareStatement(sql);
//                pre.setString(1, path);
//                pre.executeUpdate();
//            OutputStream ops = null;
//            try {
//                
//                //System.out.println("asdada");
//                System.out.println("Path :" + "/Users/taloey/Desktop/PublicRegister/src/Images/" + path);
//                ops = new FileOutputStream(new File("src/Images/" + path));
//                int read = 0;
//                byte[] b = new byte[1024];
//                while ((read = filepic.read(b)) != -1) {
//                    ops.write(b, 0, read);
//                }
//                filepic.close();
//            } catch (FileNotFoundException e) {
//                System.out.println(e);
//            } catch (IOException ex) {
//                System.out.println(ex);
//            } 
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//         }

    }//GEN-LAST:event_SubmitbottonMouseClicked

    private void TelephoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelephoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelephoneTextFieldActionPerformed

    private void MedicineTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicineTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicineTextFieldActionPerformed

    private void logoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseMoved
        logOut.setText("logout");
    }//GEN-LAST:event_logoutMouseMoved

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logOut.setText(" ");
    }//GEN-LAST:event_logoutMouseExited

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Homepage homep = new Homepage();
        this.setVisible(false);
        homep.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bottonsearch;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel Facebook;
    private javax.swing.JTextField FacebookTextField;
    private javax.swing.JTextField FoodTextField;
    private javax.swing.JLabel Id;
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
    private javax.swing.JLabel logOut;
    private javax.swing.JButton logout;
    private javax.swing.JLabel แพ้ยาอะไร;
    private javax.swing.JLabel แพ้อาหาอะไร;
    // End of variables declaration//GEN-END:variables
}
/*String fac=null;    
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM students WHERE std_id = 59130500004";
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                fac = res.getString("std_faculty");
                //System.out.println(res.getString("std_name"));
                SurnameTextField.setText(fac);
            }
            //string sql = "INSERT INTO students VALUES
            //NameTextField.setText(name);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
String tel=null;    
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM students WHERE std_id = 59130500004";
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                tel = res.getString("std_tel");
                
                TelephoneTextField.setText(tel);
            }
       
           
        } catch (SQLException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
String face=null;    
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM students WHERE std_id = 59130500004";
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                face = res.getString("std_facebook");
                
               FacebookTextField.setText(face);
            }
       
           
        } catch (SQLException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
*String pic=null;    
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM students WHERE std_id = 59130500004";
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                pic = res.getString("std_picture");
                ImageS.setIcon(new ImageIcon((new ImageIcon("src/Images/"+pic).getImage().getScaledInstance(395,335,Image.SCALE_SMOOTH))));
            }
       
           
        } catch (SQLException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }*/
