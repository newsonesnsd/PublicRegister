/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.view;

/**
 *
 * @author taloey
 */
public class LinkData extends javax.swing.JFrame {

    /**
     * Creates new form Uploadphoto
     */
    public LinkData() {
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

        jTextField1 = new javax.swing.JTextField();
        Bottonsearch = new javax.swing.JButton();
        UsernameID = new javax.swing.JLabel();
        Box1 = new javax.swing.JPanel();
        changeprofilebotton = new javax.swing.JButton();
        Box2 = new javax.swing.JPanel();
        checkclubbotton = new javax.swing.JButton();
        Box3 = new javax.swing.JPanel();
        clubbotton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        blackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setMinimumSize(new java.awt.Dimension(8, 22));
        jTextField1.setPreferredSize(new java.awt.Dimension(8, 22));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 91, 261, 22));

        Bottonsearch.setFont(new java.awt.Font("Kanit", 0, 13)); // NOI18N
        Bottonsearch.setText("OK");
        Bottonsearch.setMaximumSize(new java.awt.Dimension(55, 30));
        Bottonsearch.setMinimumSize(new java.awt.Dimension(55, 30));
        Bottonsearch.setPreferredSize(new java.awt.Dimension(55, 30));
        Bottonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonsearchActionPerformed(evt);
            }
        });
        getContentPane().add(Bottonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 80, 25));

        UsernameID.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        getContentPane().add(UsernameID, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 220, 30));

        Box1.setBackground(new java.awt.Color(77, 77, 77));
        Box1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(205, 77, 40)));

        changeprofilebotton.setFont(new java.awt.Font("Quark", 0, 48)); // NOI18N
        changeprofilebotton.setForeground(new java.awt.Color(204, 204, 204));
        changeprofilebotton.setText("แก้ไขข้อมูลส่วนตัว");
        changeprofilebotton.setBorder(null);
        changeprofilebotton.setContentAreaFilled(false);
        changeprofilebotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeprofilebotton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        changeprofilebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeprofilebottonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Box1Layout = new javax.swing.GroupLayout(Box1);
        Box1.setLayout(Box1Layout);
        Box1Layout.setHorizontalGroup(
            Box1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Box1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeprofilebotton, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Box1Layout.setVerticalGroup(
            Box1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Box1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeprofilebotton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(Box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 480, 90));

        Box2.setBackground(new java.awt.Color(77, 77, 77));
        Box2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(205, 77, 40)));

        checkclubbotton.setFont(new java.awt.Font("Quark", 0, 48)); // NOI18N
        checkclubbotton.setForeground(new java.awt.Color(204, 204, 204));
        checkclubbotton.setText("เช็ค club activities");
        checkclubbotton.setBorder(null);
        checkclubbotton.setContentAreaFilled(false);
        checkclubbotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkclubbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkclubbottonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Box2Layout = new javax.swing.GroupLayout(Box2);
        Box2.setLayout(Box2Layout);
        Box2Layout.setHorizontalGroup(
            Box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Box2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkclubbotton, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Box2Layout.setVerticalGroup(
            Box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Box2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkclubbotton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(Box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 480, 90));

        Box3.setBackground(new java.awt.Color(77, 77, 77));
        Box3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(205, 77, 40)));

        clubbotton.setFont(new java.awt.Font("Quark", 0, 48)); // NOI18N
        clubbotton.setForeground(new java.awt.Color(204, 204, 204));
        clubbotton.setText("ดูข้อมูลชมรม");
        clubbotton.setBorder(null);
        clubbotton.setContentAreaFilled(false);
        clubbotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clubbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubbottonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Box3Layout = new javax.swing.GroupLayout(Box3);
        Box3.setLayout(Box3Layout);
        Box3Layout.setHorizontalGroup(
            Box3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Box3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clubbotton, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Box3Layout.setVerticalGroup(
            Box3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Box3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clubbotton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(Box3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 480, 90));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, 400, 40));

        blackground.setIcon(new javax.swing.ImageIcon("/Users/taloey/Desktop/PublicRegister/src/Images/page.jpg")); // NOI18N
        blackground.setText("jLabel1");
        getContentPane().add(blackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BottonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BottonsearchActionPerformed

    private void checkclubbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkclubbottonActionPerformed
     CheckAllActivity check = new CheckAllActivity();
       this.setVisible(false);
       check.setVisible(true);
    }//GEN-LAST:event_checkclubbottonActionPerformed

    private void clubbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubbottonActionPerformed
        Uploadphoto upload = new Uploadphoto();
       this.setVisible(false);
       upload.setVisible(true);
    }//GEN-LAST:event_clubbottonActionPerformed

    private void changeprofilebottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeprofilebottonActionPerformed
      ViewProfile profile = new ViewProfile();
       this.setVisible(false);
       profile.setVisible(true);
    }//GEN-LAST:event_changeprofilebottonActionPerformed

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
            java.util.logging.Logger.getLogger(LinkData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinkData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinkData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinkData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinkData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bottonsearch;
    private javax.swing.JPanel Box1;
    private javax.swing.JPanel Box2;
    private javax.swing.JPanel Box3;
    private javax.swing.JLabel UsernameID;
    private javax.swing.JLabel blackground;
    private javax.swing.JButton changeprofilebotton;
    private javax.swing.JButton checkclubbotton;
    private javax.swing.JButton clubbotton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
