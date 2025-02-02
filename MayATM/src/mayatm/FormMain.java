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

/**
 *
 * @author 2003l
 */
public class FormMain extends javax.swing.JFrame {
    HeThong h1 = new HeThong();
    private String soTK = this.h1.getTempsotk();
    String pin = "";
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSodu() {
        return sodu;
    }

    public void setSodu(String sodu) {
        this.sodu = sodu;
    }
    private String ten = "", sodu = "";
    /**
     * Creates new form FormMain
     */
    public FormMain(String so) {
        initComponents();
        soTK = so;
        ket_noi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbChao = new javax.swing.JLabel();
        lbSoDu = new javax.swing.JLabel();
        btnDoiMatKhau = new javax.swing.JButton();
        btnThongTinTaiKhoan = new javax.swing.JButton();
        btnNopTien = new javax.swing.JButton();
        btnChuyenKhoan = new javax.swing.JButton();
        btnRutTien = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lbten = new javax.swing.JLabel();
        lbsodu = new javax.swing.JLabel();
        btncapnhat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 450));

        lbChao.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbChao.setText("Chào:");

        lbSoDu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbSoDu.setText("Số dư tài khoản:");

        btnDoiMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDoiMatKhau.setText("Đổi Mật Khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });

        btnThongTinTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnThongTinTaiKhoan.setText("In Thông Tin Tài Khoản");
        btnThongTinTaiKhoan.setPreferredSize(new java.awt.Dimension(163, 70));
        btnThongTinTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinTaiKhoanActionPerformed(evt);
            }
        });

        btnNopTien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnNopTien.setText("Nộp tiền");
        btnNopTien.setPreferredSize(new java.awt.Dimension(163, 70));
        btnNopTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNopTienActionPerformed(evt);
            }
        });

        btnChuyenKhoan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnChuyenKhoan.setText("Chuyển Khoản");
        btnChuyenKhoan.setPreferredSize(new java.awt.Dimension(163, 70));
        btnChuyenKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenKhoanActionPerformed(evt);
            }
        });

        btnRutTien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRutTien.setText("Rút Tiền");
        btnRutTien.setPreferredSize(new java.awt.Dimension(163, 70));
        btnRutTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutTienActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnThoat.setText("Thoát Tài Khoản");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lbten.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbten.setForeground(new java.awt.Color(51, 51, 255));
        lbten.setText("ten");

        lbsodu.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbsodu.setForeground(new java.awt.Color(51, 51, 255));
        lbsodu.setText("sodu");

        btncapnhat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btncapnhat.setText("Cập Nhật");
        btncapnhat.setPreferredSize(new java.awt.Dimension(163, 70));
        btncapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapnhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThongTinTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(167, 167, 167)
                            .addComponent(lbChao))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addComponent(lbSoDu))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbten)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lbsodu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addComponent(btncapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnChuyenKhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNopTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRutTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbChao)
                            .addComponent(lbten))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSoDu)
                            .addComponent(lbsodu)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btncapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnChuyenKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNopTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRutTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean ket_noi(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Step2: create  the connection object
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:ORCL", "c##SA", "SA");
            //Step3: create the statement object
            String selectString = "SELECT b.HOTENKH, a.SODUTK, a.MAPIN FROM TTTK a, KHACHHANG b WHERE a.CCCD = b.CCCD and a.SOTK like '" + soTK +"'";
            PreparedStatement stmt = con.prepareStatement(selectString, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            //Step4: execute query
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lbten.setText(rs.getString(1));
                lbsodu.setText(rs.getInt(2) + " VND");
                this.pin = rs.getString(3);
                this.ten = rs.getString(1);
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return true;
    }
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
       this.setVisible(false);
       h1.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        new DoiMatKhau(soTK, pin).setVisible(true);
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void btnThongTinTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinTaiKhoanActionPerformed
        new InThongTinTaiKhoan(soTK).setVisible(true);
    }//GEN-LAST:event_btnThongTinTaiKhoanActionPerformed

    private void btnChuyenKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenKhoanActionPerformed
        new ChuyenKhoan(soTK,pin,ten).setVisible(true);
    }//GEN-LAST:event_btnChuyenKhoanActionPerformed

    private void btnNopTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNopTienActionPerformed
        new NopTien(soTK).setVisible(true);
    }//GEN-LAST:event_btnNopTienActionPerformed

    private void btnRutTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutTienActionPerformed
        new RutTien(soTK).setVisible(true);
    }//GEN-LAST:event_btnRutTienActionPerformed

    private void btncapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapnhatActionPerformed

        ket_noi();
    }//GEN-LAST:event_btncapnhatActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenKhoan;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnNopTien;
    private javax.swing.JButton btnRutTien;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThongTinTaiKhoan;
    private javax.swing.JButton btncapnhat;
    private javax.swing.JLabel lbChao;
    private javax.swing.JLabel lbSoDu;
    private javax.swing.JLabel lbsodu;
    private javax.swing.JLabel lbten;
    // End of variables declaration//GEN-END:variables
}
