/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import javax.swing.JOptionPane;
import java.sql.*;
import project.*;
        

/**
 *
 * @author Admin
 */
public class ForgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
    }
    
    String email;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailtext = new javax.swing.JTextField();
        SQ = new javax.swing.JTextField();
        Ans = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        login = new javax.swing.JButton();
        search = new javax.swing.JButton();
        newpass = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hotelbg.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Forgot Password?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Security Question");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Answer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("New Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        emailtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 289, -1));

        SQ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SQActionPerformed(evt);
            }
        });
        getContentPane().add(SQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 289, -1));

        Ans.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 289, -1));

        save.setBackground(new java.awt.Color(0, 153, 0));
        save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 92, -1));

        signup.setBackground(new java.awt.Color(0, 0, 153));
        signup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Signup");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 80, -1));

        login.setBackground(new java.awt.Color(153, 0, 0));
        login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 85, -1));

        search.setBackground(new java.awt.Color(255, 51, 51));
        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, -1, -1));

        newpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        getContentPane().add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 289, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 640, 310));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, -1, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hotelbg.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1350, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        
        setVisible(false);
        new Signup().setVisible(true);
        
        
    }//GEN-LAST:event_signupActionPerformed

    private void SQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SQActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
      
        setVisible(false);
        new Signup().setVisible(true);
        
        
    }//GEN-LAST:event_loginActionPerformed

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          int a=JOptionPane.showConfirmDialog(null, "Do you really want to close application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }  
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        int check =0;
        email=emailtext.getText();
        if(email.equals(""))
        {
            check=1;
            JOptionPane.showMessageDialog(null, "Email Field Is Required!");
        }
        else
        {
            ResultSet rs = Select.getData("select * from users where Email  = '"+email+"'");
            try
            {
                if (rs.next())
                {
                    check=1;
                    SQ.setEditable(false);
                    emailtext.setEditable(false);
                    SQ.setText(rs.getString(6));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e );
            }
        }
        
        if(check==0){
            JOptionPane.showMessageDialog(null, "Incorrect Email");
        }

    }//GEN-LAST:event_searchActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        int check=0;
        String securityquestion = SQ.getText();
        String answer =Ans.getText();
        String newPassword =newpass.getText();
        if(answer.equals("") || newPassword.equals(""))
        {
        check=1;
        JOptionPane.showMessageDialog(null, "All Field Is Required!");
        
        }
        else
        {
            ResultSet rs = Select.getData("select * from users where Email='"+email+"' and SecurityQuestion ='"+securityquestion+"' and Answer ='"+answer+"'");
            
            try
            {
                if (rs.next())
                {
                   check=1;
                   InsertUpdateDelete.setData("Update users set Password='"+newPassword+"' where Email='"+email+"'", "Password Set Successfully!");
                   setVisible(false);
                   new ForgotPassword().setVisible(true);
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        
        }

        if(check==0)
        {
            JOptionPane.showMessageDialog(null, "Incorrect Answer!");
        }
        
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ans;
    private javax.swing.JTextField SQ;
    private javax.swing.JTextField emailtext;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
