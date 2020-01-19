/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.FinalMediSoft.main;

/**
 *
 * @author ankit
 */
import com.FinalMediSoft.admin.*;
import com.FinalMediSoft.staff.*;

public class Front extends javax.swing.JFrame {

    /**
     * Creates new form Front
     */
    public Front() {
        initComponents();
        setSize(900,550);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        admin = new javax.swing.JButton();
        staff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin.setBackground(new java.awt.Color(102, 102, 255));
        admin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        admin.setForeground(new java.awt.Color(204, 204, 0));
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/FinalMediSoft/main/user-male-circle.png"))); // NOI18N
        admin.setText("ADMIN");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 240, 130));

        staff.setBackground(new java.awt.Color(102, 102, 255));
        staff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        staff.setForeground(new java.awt.Color(204, 204, 0));
        staff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/FinalMediSoft/main/iconfinder_Manager_131484 (2).png"))); // NOI18N
        staff.setText("Staff");
        staff.setBorder(null);
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });
        jPanel1.add(staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 210, 130));

        jLabel1.setFont(new java.awt.Font("Calisto MT", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("MediSoft");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 210, 70));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
       new AdminLogIn().setVisible(true);
       setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_adminActionPerformed

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
        setVisible(false);
        new StaffLogIn().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_staffActionPerformed

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
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Front().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton staff;
    // End of variables declaration//GEN-END:variables
}
