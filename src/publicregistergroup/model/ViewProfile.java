/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import publicregistergroup.controller.ConnectBuilder;

/**
 *
 * @author taloey
 */
public class ViewProfile extends javax.swing.JFrame {

    /**
     * Creates new form Uploadphoto
     */
    public ViewProfile() {
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

        textsearchclub = new javax.swing.JLabel();
        Bottonsearch = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
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

        textsearchclub.setFont(new java.awt.Font("Kanit", 0, 13)); // NOI18N
        textsearchclub.setText("serach from club or organize for you interest");
        getContentPane().add(textsearchclub, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 290, 20));

        Bottonsearch.setText("OK");
        Bottonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonsearchActionPerformed(evt);
            }
        });
        getContentPane().add(Bottonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 80, 30));

        Title.setFont(new java.awt.Font("Kailasa", 0, 36)); // NOI18N
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, 50));

        boxphoto.setBackground(new java.awt.Color(255, 255, 255));
        boxphoto.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 51, 0)));

        ImageUpload.setFont(new java.awt.Font("Kanit", 0, 48)); // NOI18N
        ImageUpload.setForeground(new java.awt.Color(204, 204, 204));
        ImageUpload.setText("Uploadphoto");

        javax.swing.GroupLayout boxphotoLayout = new javax.swing.GroupLayout(boxphoto);
        boxphoto.setLayout(boxphotoLayout);
        boxphotoLayout.setHorizontalGroup(
            boxphotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxphotoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(ImageUpload)
                .addContainerGap(79, Short.MAX_VALUE))
            .addComponent(ImageS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        boxphotoLayout.setVerticalGroup(
            boxphotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxphotoLayout.createSequentialGroup()
                .addComponent(ImageS, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImageUpload)
                .addGap(199, 199, 199))
        );

        getContentPane().add(boxphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 440, 440));

        Name.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        Name.setText("Name :");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        Surname.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        Surname.setText("Surname :");
        getContentPane().add(Surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        Telephone.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        Telephone.setText("Telephone :");
        getContentPane().add(Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        Facebook.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        Facebook.setText("Facebook :");
        getContentPane().add(Facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        Email.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        Email.setText("E-mail :");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, -1, -1));

        แพ้ยาอะไร.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        แพ้ยาอะไร.setText("แพ้ยาอะไร :");
        getContentPane().add(แพ้ยาอะไร, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        แพ้อาหาอะไร.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        แพ้อาหาอะไร.setText("แพ้อาหารอะไร :");
        getContentPane().add(แพ้อาหาอะไร, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, -1, -1));

        ID.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        ID.setText("ID :");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 40, 30));
        getContentPane().add(ShowID, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 210, 20));

        Submitbotton.setBackground(new java.awt.Color(213, 186, 55));
        Submitbotton.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        Submitbotton.setForeground(new java.awt.Color(255, 255, 255));
        Submitbotton.setText("Submit");
        Submitbotton.setBorder(null);
        Submitbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbottonActionPerformed(evt);
            }
        });
        getContentPane().add(Submitbotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 640, 240, 40));

        UploadBotton.setBackground(new java.awt.Color(213, 186, 55));
        UploadBotton.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        UploadBotton.setForeground(new java.awt.Color(255, 255, 255));
        UploadBotton.setText("Upload");
        UploadBotton.setBorder(null);
        UploadBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadBottonActionPerformed(evt);
            }
        });
        getContentPane().add(UploadBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 580, 70, 40));

        NameTextField.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        NameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 320, 40));

        SurnameTextField.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        SurnameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        SurnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurnameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SurnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 320, 40));

        TelephoneTextField.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        TelephoneTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(TelephoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 320, 40));

        FacebookTextField.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        FacebookTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        FacebookTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacebookTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(FacebookTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 320, 40));

        MedicineTextField.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        MedicineTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(MedicineTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 320, 40));

        FoodTextField.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        FoodTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        FoodTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(FoodTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 320, 40));

        EmailTextField.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        EmailTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 320, 40));

        SearchclubTextField.setFont(new java.awt.Font("Kanit", 0, 13)); // NOI18N
        SearchclubTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchclubTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SearchclubTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 300, 30));

        ChangePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePageActionPerformed(evt);
            }
        });
        getContentPane().add(ChangePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 230, 40));

        blackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        blackground.setText("jLabel1");
        getContentPane().add(blackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1030, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BottonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BottonsearchActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchclubTextFieldActionPerformed

    private void ChangePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePageActionPerformed
       LinkData data = new LinkData();
       this.setVisible(false);
       data.setVisible(true);
    }//GEN-LAST:event_ChangePageActionPerformed

    private void UploadBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadBottonActionPerformed
        JFileChooser fileOpen = new JFileChooser();
        fileOpen.showDialog(null , "Choose Image");
        fileOpen.setAcceptAllFileFilterUsed(false);
        fileOpen.addChoosableFileFilter(new FileNameExtensionFilter(".jpg","jpg"));
        fileOpen.addChoosableFileFilter(new FileNameExtensionFilter(".gif","gif"));
        fileOpen.addChoosableFileFilter(new FileNameExtensionFilter(".png","png"));
        int result = fileOpen.showDialog(null, "Choose Image");
            File selecFile = fileOpen.getSelectedFile();
            String path = selecFile.getAbsolutePath();
            ImageS.setIcon(new ImageIcon((new ImageIcon(path).getImage().getScaledInstance(434,434,Image.SCALE_SMOOTH))));
            
            
    }//GEN-LAST:event_UploadBottonActionPerformed

    private void SubmitbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbottonActionPerformed
       ConnectBuilder conn = new ConnectBuilder();
       conn.getConnection();
       
       
        
       LinkData data = new LinkData();
       this.setVisible(false);
       data.setVisible(true);
    }//GEN-LAST:event_SubmitbottonActionPerformed

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
    private javax.swing.JButton ChangePage;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel Facebook;
    private javax.swing.JTextField FacebookTextField;
    private javax.swing.JTextField FoodTextField;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel ImageS;
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
    private javax.swing.JLabel Title;
    private javax.swing.JButton UploadBotton;
    private javax.swing.JLabel blackground;
    private javax.swing.JPanel boxphoto;
    private javax.swing.JLabel textsearchclub;
    private javax.swing.JLabel แพ้ยาอะไร;
    private javax.swing.JLabel แพ้อาหาอะไร;
    // End of variables declaration//GEN-END:variables
}
