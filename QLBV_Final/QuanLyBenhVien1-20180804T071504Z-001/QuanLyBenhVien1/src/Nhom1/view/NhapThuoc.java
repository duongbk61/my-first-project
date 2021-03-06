/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nhom1.view;

import Nhom1.model.DSThuoc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NhapThuoc extends javax.swing.JPanel {

    Boolean checkSua = false;
    int r = -1;
    Connection conn;
    int tong = 0;
    DefaultTableModel model;
    Login a = new Login();
    ArrayList<DSThuoc> list = new ArrayList<>();

    /**
     * Creates new form Thuoc
     */
    public NhapThuoc() {
        initComponents();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=BenhVien;"
                    + "username=sa;password=123");
        } catch (Exception e) {
        }
        model = (DefaultTableModel) jTable1.getModel();
        lblName.setText(a.ten);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnNhap = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        txtTenThuoc = new javax.swing.JTextField();
        txtXuatXU = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblTong = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setPreferredSize(new java.awt.Dimension(1118, 805));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên thuốc", "Xuất xứ", "Số lượng", "Giá thành"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(40);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        btnNhap.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnNhap.setText("Nhập");
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Người nhập:");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblName.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblName.setPreferredSize(new java.awt.Dimension(200, 26));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Tên  thuốc");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Xuất xứ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Số lượng");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Giá");

        btnOK.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        txtTenThuoc.setMinimumSize(new java.awt.Dimension(200, 26));
        txtTenThuoc.setPreferredSize(new java.awt.Dimension(200, 26));

        txtXuatXU.setMinimumSize(new java.awt.Dimension(200, 26));
        txtXuatXU.setPreferredSize(new java.awt.Dimension(200, 26));

        txtSoLuong.setPreferredSize(new java.awt.Dimension(200, 26));

        txtGia.setPreferredSize(new java.awt.Dimension(200, 26));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Tổng:");

        lblTong.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTong.setToolTipText("");
        lblTong.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTong.setPreferredSize(new java.awt.Dimension(250, 26));

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(774, 774, 774)
                        .addComponent(btnSua)
                        .addGap(41, 41, 41)
                        .addComponent(btnOK))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(856, 856, 856)
                        .addComponent(btnNhap)
                        .addGap(50, 50, 50)
                        .addComponent(btnHuy))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtXuatXU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(380, 380, 380)
                                .addComponent(jLabel5)
                                .addGap(73, 73, 73)
                                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTenThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(380, 380, 380)
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTenThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtXuatXU, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua)
                    .addComponent(btnOK))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        if (list.isEmpty()) {
            txtTenThuoc.requestFocus();
        } else {
            try {
                for (DSThuoc s : list) {
                    PreparedStatement stmt = conn.prepareStatement("SELECT * FROM DanhSachThuoc WHERE TenThuoc=?");
                    stmt.setString(1, s.getTenThuoc());
                    ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        PreparedStatement ps = conn.prepareStatement(
                                "update DanhSachThuoc "
                                + "set SoLuong= ? "
                                + "where TenThuoc=?"
                        );
                        ps.setInt(1, rs.getInt("SoLuong") + s.getSoLuong());
                        ps.setString(2, s.getTenThuoc());
                        ps.executeUpdate();
                    } else {
                        Statement ss = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                ResultSet.CONCUR_READ_ONLY);
                        ResultSet as = ss.executeQuery("select * from DanhSachThuoc");
                        if (!as.next()) {
                            s.setMSThuoc("100000");
                        } else {
                            as.last();
                            String a = as.getString("MSThuoc").trim();
                            a = "" + (Integer.parseInt(a) + 1);
                            s.setMSThuoc(a);
                        }
                        PreparedStatement ms = conn.prepareStatement("INSERT INTO DanhSachThuoc(MSThuoc,TenThuoc,SoLuong,Gia,XuatXu)"
                                + "VALUES(?,?,?,?,?)");
                        ms.setString(1, s.getMSThuoc());
                        ms.setString(2, s.getTenThuoc());
                        ms.setInt(3, s.getSoLuong());
                        ms.setInt(4, s.getGia());
                        ms.setString(5, s.getXuatXu());
                        ms.executeUpdate();
                    }
                }
                int m = model.getRowCount();
                for (int j = 1; j <= m; j++) {
                    model.removeRow(0);
                }
                lblTong.setText("");
                tong = 0;
                list.clear();
                JOptionPane.showMessageDialog(jTable1, "Đã nhập");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnNhapActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        try {
            if (txtTenThuoc.getText().length() == 0) {
                txtTenThuoc.requestFocus();
            } else if (txtSoLuong.getText().length() == 0 || !txtSoLuong.getText().matches("\\d{1,}")) {
                txtSoLuong.requestFocus();
            } else if (txtGia.getText().length() == 0 || !txtGia.getText().matches("\\d{1,}")) {
                txtGia.requestFocus();
            } else if (txtXuatXU.getText().length() == 0) {
                txtXuatXU.requestFocus();
            } else if (r != -1) {
                DSThuoc s = new DSThuoc();
                model.setValueAt(txtTenThuoc.getText(), r, 1);
                model.setValueAt(txtXuatXU.getText(), r, 2);
                model.setValueAt(txtSoLuong.getText(), r, 3);
                model.setValueAt(txtGia.getText(), r, 4);
                s.setTenThuoc(txtTenThuoc.getText());
                s.setSoLuong(Integer.valueOf(txtSoLuong.getText()));
                s.setGia(Integer.valueOf(txtGia.getText()));
                s.setXuatXu(txtXuatXU.getText());
                list.set(r, s);
                tong = 0;
                for (DSThuoc a : list) {
                    tong += a.getGia() * a.getSoLuong();
                }
                lblTong.setText(String.valueOf(tong) + " VNĐ");
                txtTenThuoc.setText("");
                txtSoLuong.setText("");
                txtGia.setText("");
                txtXuatXU.setText("");
                r = -1;
            } else {
                DSThuoc s = new DSThuoc();
                model.addRow(new Object[]{
                    jTable1.getRowCount() + 1, txtTenThuoc.getText(), txtXuatXU.getText(), txtSoLuong.getText(), txtGia.getText()
                });
                try {
                    int n=Integer.parseInt(txtSoLuong.getText());
                    s.setTenThuoc(txtTenThuoc.getText());
                    s.setSoLuong(n);
                    try {
                        int a=Integer.parseInt(txtGia.getText());
                    } catch (Exception e) {
                        txtGia.requestFocus();
                    }
                    s.setGia(Integer.valueOf(txtGia.getText()));
                    s.setXuatXu(txtXuatXU.getText());
                    tong += s.getGia() * s.getSoLuong();
                    lblTong.setText(String.valueOf(tong) + " VNĐ");
                    list.add(s);
                    txtTenThuoc.setText("");
                    txtSoLuong.setText("");
                    txtGia.setText("");
                    txtXuatXU.setText("");
                } catch (Exception e) {
                    txtSoLuong.requestFocus();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        int m = model.getRowCount();
        for (int j = 1; j <= m; j++) {
            model.removeRow(0);
        }
        lblTong.setText("");
        tong = 0;
        list.clear();  
        txtTenThuoc.setText("");
        txtSoLuong.setText("");
        txtGia.setText("");
        txtXuatXU.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        r = jTable1.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(txtXuatXU, "Bạn chưa chọn thông tin!");
        } else {
            txtTenThuoc.setText(jTable1.getValueAt(r, 1).toString());
            txtXuatXU.setText(jTable1.getValueAt(r, 2).toString());
            txtSoLuong.setText(jTable1.getValueAt(r, 3).toString());
            txtGia.setText(jTable1.getValueAt(r, 4).toString());
        }
    }//GEN-LAST:event_btnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnSua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTong;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenThuoc;
    private javax.swing.JTextField txtXuatXU;
    // End of variables declaration//GEN-END:variables
}
