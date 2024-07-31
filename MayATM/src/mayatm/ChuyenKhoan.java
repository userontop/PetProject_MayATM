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
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author 2003l
 */
public class ChuyenKhoan extends javax.swing.JFrame {

    String so = "";
    String pin = "";
    String ten = "";
    String sogd = "";

    /**
     * Creates new form ChuyenKhoan
     */
    public ChuyenKhoan(String so, String pin, String t) {
        initComponents();
        this.so = so;
        this.pin = pin;
        this.ten = t;
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

            String updateString_TK = "UPDATE TTTK SET SODUTK = (SODUTK - " + Integer.parseInt(txtSoTien.getText()) + ") WHERE SOTK like '" + this.so + "' ";
            PreparedStatement updateTK = con.prepareStatement(updateString_TK);
            if (updateTK.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Chuyển thành công thành công " + txtSoTien.getText() + " VND");
            } else {
                JOptionPane.showMessageDialog(null, "Đã gặp lỗi");
            }

            String updateString_TK_nhan = "UPDATE TTTK SET SODUTK = (SODUTK + " + Integer.parseInt(txtSoTien.getText()) + ") WHERE SOTK like '" + this.txtSoTaiKhoanNhan.getText() + "' ";
            PreparedStatement updateTK_nhan = con.prepareStatement(updateString_TK_nhan);
            updateTK_nhan.executeUpdate();

            sogd = rand(10000, 90000) + "";
            String insertString_TTGD = "INSERT INTO TTGD (SOTK,TK_NHAN, TEN_NHAN, SOGD, NGAYGD, SOTIENGD) VALUES ('" + so + "', '" + txtSoTaiKhoanNhan.getText() + "' ,N'" + ten + "', '" + sogd + "', to_date('" + java.time.LocalDate.now() + "','YYYY-MM-DD'),'" + Integer.parseInt(txtSoTien.getText()) + "')";
            PreparedStatement insertTTGD = con.prepareStatement(insertString_TTGD);
            insertTTGD.executeUpdate();

            con.commit();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }

    public int rand(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }

    public boolean xet_dk() {
        int tien = Integer.parseInt(txtSoTien.getText());
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

            String selectString = "SELECT SODUTK FROM TTTK WHERE SOTK = '" + txtSoTaiKhoanNhan.getText() + "'";
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

    public boolean xet_dk_2() {
        int tien = Integer.parseInt(txtSoTien.getText());
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

            String selectString = "SELECT SODUTK FROM TTTK WHERE SOTK = '" + so + "' and MAPIN = '" + txt_Mapin.getText() + "' and SODUTK > (" + Integer.parseInt(txtSoTien.getText()) + "+50000)";
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Mapin = new javax.swing.JTextField();
        txtSoTaiKhoanNhan = new javax.swing.JTextField();
        txtSoTien = new javax.swing.JTextField();
        btnThucHien = new javax.swing.JButton();
        btnHuyGiaoDich = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Mã PIN:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Số tài khoản nhận:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Số tiền:");

        txt_Mapin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtSoTaiKhoanNhan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtSoTien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoTaiKhoanNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Mapin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnThucHien)
                        .addGap(18, 18, 18)
                        .addComponent(btnHuyGiaoDich)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Mapin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoTaiKhoanNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThucHien)
                    .addComponent(btnHuyGiaoDich))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyGiaoDichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyGiaoDichActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnHuyGiaoDichActionPerformed

    private void btnThucHienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThucHienActionPerformed
        if (xet_dk() && xet_dk_2()) {
            ketnoi_2();
            new InThongTinGiaoDich(sogd).setVisible(true);
        } else
            JOptionPane.showMessageDialog(null, "Thông tin tài khoảng không hợp lệ");
    }//GEN-LAST:event_btnThucHienActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyGiaoDich;
    private javax.swing.JButton btnThucHien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtSoTaiKhoanNhan;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JTextField txt_Mapin;
    // End of variables declaration//GEN-END:variables
}
