/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import project.Select;

/**
 *
 * @author Admin
 */
public class Statistics extends javax.swing.JFrame {

    /**
     * Creates new form Statistics
     */
    public Statistics() {
        initComponents();
                
        Date.setEditable(false);
        SimpleDateFormat myFormat=new SimpleDateFormat("yyy/MM/dd");
        Calendar cal=Calendar.getInstance();
        Date.setText(myFormat.format(cal.getTime()));
        
       
        available.setText(String.valueOf(getAvailableRoom()));
        totalRoom.setText(String.valueOf(getAllRoom()));
        occupied.setText(String.valueOf(getAllRoom() - getAvailableRoom()));
        revenue.setText(String.valueOf(getTotalRevenue()));     
        foodTotal.setText(String.valueOf(getFoodTotalRevenue()));
      
        totalRoom.setEditable(false);
        Date.setEditable(false);
        available.setEditable(false);
        occupied.setEditable(false);
        revenue.setEditable(false);
        foodTotal.setEditable(false);
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        totalRoom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        available = new javax.swing.JTextField();
        occupied = new javax.swing.JTextField();
        revenue = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        foodTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Statistics");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        backBtn.setBackground(new java.awt.Color(204, 0, 0));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Total Rooms: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 90, -1, -1));

        totalRoom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalRoomActionPerformed(evt);
            }
        });
        getContentPane().add(totalRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 50, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 60, 20));

        Date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Total Rooms Available");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 20));

        available.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(available, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 190, -1));

        occupied.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        occupied.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupiedActionPerformed(evt);
            }
        });
        getContentPane().add(occupied, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 200, -1));

        revenue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(revenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Total Revenue");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Total Rooms Occupied");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, 20));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 215, -1, -1));

        foodTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(foodTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 190, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Total Food Revenue:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 190, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stat.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 340));

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown


    }//GEN-LAST:event_formComponentShown

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        new AllUsers().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void totalRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalRoomActionPerformed


    }//GEN-LAST:event_totalRoomActionPerformed

    private void occupiedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupiedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupiedActionPerformed

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
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistics().setVisible(true);
            }
        });
    }
    
    public int getAvailableRoom() {
        int count = 0;
        ResultSet rs = Select.getData("select * from room where status='Not Booked'");
        try {
            while (rs.next()) {
                count++;
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return count;
    }

    public int getAllRoom() {
        int count = 0;
        ResultSet rs = Select.getData("select * from room");
        try {
            while (rs.next()) {
                count++;
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return count;
    }

    public double getTotalRevenue() {
        double value = 0;
        ResultSet rs = Select.getData("select * from customer where TotalAmount is not null");
        try {
            while (rs.next()) {
                value += Double.parseDouble(rs.getString("TotalAmount"));
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return value;
    }
    
     public double getFoodTotalRevenue() {
        double value = 0;
        ResultSet rs = Select.getData("select total from food");
        try {
            while (rs.next()) {
                value += Double.parseDouble(rs.getString("total"));
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return value;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Date;
    private javax.swing.JTextField available;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField foodTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField occupied;
    private javax.swing.JTextField revenue;
    private javax.swing.JTextField totalRoom;
    // End of variables declaration//GEN-END:variables
}
