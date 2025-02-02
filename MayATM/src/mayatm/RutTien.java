/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mayatm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 2003l
 */
public class RutTien extends javax.swing.JFrame {
    String so;
    /**
     * Creates new form RutTien
     */
    public RutTien(String so) {
        initComponents();
        this.so = so;
        txtNhapSoTien.setVisible(false);
        jLabel1.setVisible(false);
    }

    public void ketnoi_2() {

        try {
            //Step1: load the driver class  
            //Step1: load the driver class  
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Step2: create  the connection object

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:ORCL", "c##SA", "SA");
            //Step3: create the statement object
            con.setAutoCommit(false);

            String updateString_TK = "UPDATE TTTK SET SODUTK = (SODUTK - " + Integer.parseInt(txtNhapSoTien.getText()) + ") WHERE SOTK like '" + this.so + "' ";
            PreparedStatement updateTK = con.prepareStatement(updateString_TK);

            if (updateTK.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "rút thành công " + txtNhapSoTien.getText() +" VND");
            } else {

            }
            con.commit();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
    
     public boolean xet_dk_2() {
        int tien = Integer.parseInt(txtNhapSoTien.getText());
        boolean xn = false;
        try {
            //Step1: load the driver class  
            //Step1: load the driver class  
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Step2: create  the connection object

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:ORCL", "c##SA", "SA");
            //Step3: create the statement object
            con.setAutoCommit(false);

            String selectString = "SELECT SODUTK FROM TTTK WHERE SOTK = '" + so + "' and SODUTK > (" + Integer.parseInt(txtNhapSoTien.getText()) + "+50000)";
            PreparedStatement selectTTTK = con.prepareStatement(selectString, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //Step4: execute query
            ResultSet rs = selectTTTK.executeQuery();
            while (rs.next()) {
                xn = true;
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return xn;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_khac = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNhapSoTien = new javax.swing.JTextField();
        btnThucHien = new javax.swing.JButton();
        btnHuyGiaoDich = new javax.swing.JButton();
        rb_200000 = new javax.swing.JRadioButton();
        rb_100000 = new javax.swing.JRadioButton();
        rb_500000 = new javax.swing.JRadioButton();
        rb_1000000 = new javax.swing.JRadioButton();
        rb_3000000 = new javax.swing.JRadioButton();
        rb_2000000 = new javax.swing.JRadioButton();
        rb_5000000 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_khac.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_khac.setText("Số khác");
        buttonGroup1.add(btn_khac);
        btn_khac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_khacActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Nhập số tiền cần rút:");

        txtNhapSoTien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnThucHien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnThucHien.setText("Thực hiện");
        btnThucHien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThucHienActionPerformed(evt);
            }
        });

        btnHuyGiaoDich.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnHuyGiaoDich.setText("Hủy giao dịch");
        btnHuyGiaoDich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyGiaoDichActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_200000);
        rb_200000.setText("200000");
        rb_200000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_200000ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_100000);
        rb_100000.setText("100000");
        rb_100000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_100000ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_500000);
        rb_500000.setText("500000");
        rb_500000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_500000ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_1000000);
        rb_1000000.setText("1000000");
        rb_1000000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_1000000ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_3000000);
        rb_3000000.setText("3000000");
        rb_3000000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_3000000ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_2000000);
        rb_2000000.setText("2000000");
        rb_2000000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_2000000ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_5000000);
        rb_5000000.setText("5000000");
        rb_5000000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_5000000ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNhapSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_200000)
                            .addComponent(rb_100000)
                            .addComponent(rb_500000)
                            .addComponent(rb_1000000))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_khac, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_3000000)
                            .addComponent(rb_2000000)
                            .addComponent(rb_5000000)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnThucHien)
                .addGap(18, 18, 18)
                .addComponent(btnHuyGiaoDich)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rb_100000)
                        .addGap(18, 18, 18)
                        .addComponent(rb_200000)
                        .addGap(18, 18, 18)
                        .addComponent(rb_500000))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rb_2000000)
                        .addGap(18, 18, 18)
                        .addComponent(rb_3000000)
                        .addGap(18, 18, 18)
                        .addComponent(rb_5000000)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_khac)
                    .addComponent(rb_1000000))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNhapSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThucHien)
                    .addComponent(btnHuyGiaoDich))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThucHienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThucHienActionPerformed
        if((Integer.parseInt(txtNhapSoTien.getText()) % 50000 == 0 && Integer.parseInt(txtNhapSoTien.getText()) >= 50000) && xet_dk_2()){
            System.out.println(txtNhapSoTien.getText());
            ketnoi_2();
        }else 
            JOptionPane.showMessageDialog(null, "Số tiền không hợp lệ ");
        
    }//GEN-LAST:event_btnThucHienActionPerformed

    private void btn_khacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_khacActionPerformed
       txtNhapSoTien.setVisible(true);
       jLabel1.setVisible(true);
    }//GEN-LAST:event_btn_khacActionPerformed

    private void btnHuyGiaoDichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyGiaoDichActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnHuyGiaoDichActionPerformed

    private void rb_100000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_100000ActionPerformed
        txtNhapSoTien.setText(rb_100000.getText());
    }//GEN-LAST:event_rb_100000ActionPerformed

    private void rb_200000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_200000ActionPerformed
        txtNhapSoTien.setText(rb_200000.getText());
    }//GEN-LAST:event_rb_200000ActionPerformed

    private void rb_500000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_500000ActionPerformed
        txtNhapSoTien.setText(rb_500000.getText());
    }//GEN-LAST:event_rb_500000ActionPerformed

    private void rb_1000000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_1000000ActionPerformed
        txtNhapSoTien.setText(rb_1000000.getText());
    }//GEN-LAST:event_rb_1000000ActionPerformed

    private void rb_2000000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_2000000ActionPerformed
        txtNhapSoTien.setText(rb_2000000.getText());
    }//GEN-LAST:event_rb_2000000ActionPerformed

    private void rb_3000000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_3000000ActionPerformed
        txtNhapSoTien.setText(rb_3000000.getText());
    }//GEN-LAST:event_rb_3000000ActionPerformed

    private void rb_5000000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_5000000ActionPerformed
       txtNhapSoTien.setText(rb_5000000.getText());
    }//GEN-LAST:event_rb_5000000ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyGiaoDich;
    private javax.swing.JButton btnThucHien;
    private javax.swing.JButton btn_khac;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rb_100000;
    private javax.swing.JRadioButton rb_1000000;
    private javax.swing.JRadioButton rb_200000;
    private javax.swing.JRadioButton rb_2000000;
    private javax.swing.JRadioButton rb_3000000;
    private javax.swing.JRadioButton rb_500000;
    private javax.swing.JRadioButton rb_5000000;
    private javax.swing.JTextField txtNhapSoTien;
    // End of variables declaration//GEN-END:variables
}
