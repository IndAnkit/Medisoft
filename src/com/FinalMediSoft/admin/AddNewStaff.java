/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.FinalMediSoft.admin;

/**
 *
 * @author ankit
 */
import com.FinalMediSoft.main.*;
import com.FinalMediSoft.medicine.AddMedicine;
import com.FinalMediSoft.medicine.DeleteMedicine;
import com.FinalMediSoft.medicine.UpdateMedicine;
import com.FinalMediSoft.medicine.ViewMedicine;
import com.FinalMediSoft.medicine.ViewStock;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class AddNewStaff extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel tm;

    /**
     * Creates new form AddNewStaff
     */
    public AddNewStaff() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        smobile = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        saddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        viewall = new javax.swing.JButton();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        spassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        doj = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        staffRecord = new javax.swing.JMenu();
        addstaff = new javax.swing.JMenuItem();
        deletestaff = new javax.swing.JMenuItem();
        billing = new javax.swing.JMenu();
        createbill = new javax.swing.JMenuItem();
        viewbills = new javax.swing.JMenuItem();
        stock = new javax.swing.JMenu();
        viewstocks = new javax.swing.JMenuItem();
        medicine = new javax.swing.JMenu();
        addmedicine = new javax.swing.JMenuItem();
        updatemedicine = new javax.swing.JMenuItem();
        deletemedicine = new javax.swing.JMenuItem();
        viewmedicine = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Add New Staff");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(360, 40, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("MediSoft");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(340, 10, 210, 30);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Staff Name :-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 20));

        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });
        jPanel1.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 200, -1));

        smobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smobileActionPerformed(evt);
            }
        });
        jPanel1.add(smobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 200, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mobile No:-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, 20));

        saddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saddressActionPerformed(evt);
            }
        });
        jPanel1.add(saddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address :-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 100, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Join Date:-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 100, 20));

        viewall.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewall.setText("View All");
        viewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallActionPerformed(evt);
            }
        });
        jPanel1.add(viewall, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 120, -1));

        save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 120, -1));

        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 120, -1));
        jPanel1.add(spassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 200, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Password:-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 100, 20));

        staffTable.setBackground(new java.awt.Color(102, 102, 255));
        staffTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S_NAME", "S_ADDRESS", "S_MOBILE", "Joining Date"
            }
        ));
        jScrollPane1.setViewportView(staffTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 900, 190));
        jPanel1.add(doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 200, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 480);

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(102, 102, 255));

        home.setBackground(new java.awt.Color(51, 51, 255));
        home.setBorder(null);
        home.setText("Home         ");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jMenuBar1.add(home);

        staffRecord.setText("Staff  Record    ");

        addstaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addstaff.setText("Add New Staff");
        addstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstaffActionPerformed(evt);
            }
        });
        staffRecord.add(addstaff);

        deletestaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletestaff.setText("Delete Staff Record");
        deletestaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletestaffActionPerformed(evt);
            }
        });
        staffRecord.add(deletestaff);

        jMenuBar1.add(staffRecord);

        billing.setText("    Billing     ");

        createbill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createbill.setText("Create Bill");
        billing.add(createbill);

        viewbills.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewbills.setText("View Bills");
        billing.add(viewbills);

        jMenuBar1.add(billing);

        stock.setText("   Stock  ");

        viewstocks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewstocks.setText("View Stock");
        viewstocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewstocksActionPerformed(evt);
            }
        });
        stock.add(viewstocks);

        jMenuBar1.add(stock);

        medicine.setText("   Medicine   ");

        addmedicine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addmedicine.setText("Add Medicine");
        addmedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmedicineActionPerformed(evt);
            }
        });
        medicine.add(addmedicine);

        updatemedicine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatemedicine.setText("Update Medicine");
        updatemedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatemedicineActionPerformed(evt);
            }
        });
        medicine.add(updatemedicine);

        deletemedicine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletemedicine.setText("Delete Medicine");
        deletemedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletemedicineActionPerformed(evt);
            }
        });
        medicine.add(deletemedicine);

        viewmedicine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewmedicine.setText("View Medicine");
        viewmedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewmedicineActionPerformed(evt);
            }
        });
        medicine.add(viewmedicine);

        jMenuBar1.add(medicine);

        jMenu1.setText("                                                                                                                                             ");
        jMenuBar1.add(jMenu1);

        logout.setText(" Log Out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(logout);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void smobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smobileActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_smobileActionPerformed

    private void saddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saddressActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       
        //Connect connect = new Connect();
     // String url="jdbc:oracle:thin:@localhost:1521:medisoft";
     String url="jdbc:mysql://localhost:3306/medisoft";
       try {
        Class.forName("com.mysql.jdbc.Driver");  
          // Class.forName("oracle.jdbc.driver.OracleDriver");
          con=DriverManager.getConnection(url,"ajjugami","ajjugami123");
           // con=DriverManager.getConnection(url,"hr","hrmedi");
       } catch (ClassNotFoundException ex) {
          System.out.println("Driver not loaded");
       } catch (SQLException ex) {
           System.out.println("connection not stablish"+ex);
       }
       
       
        try {
           // int mobile=Integer.parseInt(smobile.getT());
            ps=con.prepareStatement("insert into staff values(?,?,?,?,?)");
            
            ps.setString(1,sname.getText());
            ps.setString(2,saddress.getText());
            ps.setString(3,smobile.getText());
            ps.setString(4,spassword.getText());
            SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
            String date=sdf.format(doj.getDate());
            //ps.setDate(5,sjoindate.getText());
            ps.setString(5,date);
             ps.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(this,"saved successFully");
            sname.setText("");
            saddress.setText("");
            smobile.setText("");
            spassword.setText("");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddNewStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        
        
        
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void viewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallActionPerformed
        // TODO add your handling code here:
        String url="jdbc:oracle:thin:@localhost:1521:medisoft";
       try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection(url,"hr","hrmedi");
       } catch (ClassNotFoundException ex) {
          System.out.println("Driver not loaded");
       } catch (SQLException ex) {
           System.out.println("connection not stablish"+ex);
       }
       
       
        try {
             ps=con.prepareStatement("select * from staff");
             rs=ps.executeQuery();
            tm=(DefaultTableModel) staffTable.getModel();
           tm.setRowCount(0);
           while(rs.next()){
           Object o[] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(5)};
           tm.addRow(o);
            }
        }catch (SQLException ex) {
            Logger.getLogger(AddNewStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewallActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
            sname.setText("");
            saddress.setText("");
            smobile.setText("");
            spassword.setText("");        // TODO add your handling code here:
            tm.setRowCount(0);
    }//GEN-LAST:event_clearActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        new AdminHome().setVisible(true);
        setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_homeMouseClicked

    private void addstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstaffActionPerformed
        setVisible(false);
        new AddNewStaff().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_addstaffActionPerformed

    private void deletestaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletestaffActionPerformed
        setVisible(false);
        new DeleteStaff().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_deletestaffActionPerformed

    private void viewstocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewstocksActionPerformed
        //setVisible(false);
        new ViewStock().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_viewstocksActionPerformed

    private void addmedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmedicineActionPerformed
        new AddMedicine().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_addmedicineActionPerformed

    private void updatemedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatemedicineActionPerformed
        new UpdateMedicine().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_updatemedicineActionPerformed

    private void deletemedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletemedicineActionPerformed
        new DeleteMedicine().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_deletemedicineActionPerformed

    private void viewmedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewmedicineActionPerformed
        new ViewMedicine().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_viewmedicineActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Front().setVisible(true);
        setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(AddNewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addmedicine;
    private javax.swing.JMenuItem addstaff;
    private javax.swing.JMenu billing;
    private javax.swing.JButton clear;
    private javax.swing.JMenuItem createbill;
    private javax.swing.JMenuItem deletemedicine;
    private javax.swing.JMenuItem deletestaff;
    private com.toedter.calendar.JDateChooser doj;
    private javax.swing.JMenu home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu logout;
    private javax.swing.JMenu medicine;
    private javax.swing.JTextField saddress;
    private javax.swing.JButton save;
    private javax.swing.JTextField smobile;
    private javax.swing.JTextField sname;
    private javax.swing.JPasswordField spassword;
    private javax.swing.JMenu staffRecord;
    private javax.swing.JTable staffTable;
    private javax.swing.JMenu stock;
    private javax.swing.JMenuItem updatemedicine;
    private javax.swing.JButton viewall;
    private javax.swing.JMenuItem viewbills;
    private javax.swing.JMenuItem viewmedicine;
    private javax.swing.JMenuItem viewstocks;
    // End of variables declaration//GEN-END:variables
}
