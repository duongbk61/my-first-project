/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nhom1.view;

import Nhom1.controller.DAO;
import Nhom1.model.DonThuoc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class HoSoBNn extends javax.swing.JPanel implements ListSelectionListener {

    int i = 1;
    static String s;
    private Connection conn;
    static ArrayList<Nhom1.model.BenhNhan> list = new ArrayList<>();
    ArrayList<Nhom1.model.BenhNhan> list2 = new ArrayList<>();
    ArrayList<DonThuoc> list1 = new ArrayList<>();
    DefaultTableModel tm, model;

    public HoSoBNn() {
        initComponents();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=BenhVien;"
                            + "username=sa;password=123");
        } catch (Exception e) {
        }
        ListSelectionModel rowSelMod = jTable1.getSelectionModel();
        rowSelMod.addListSelectionListener(this);
        tm = (DefaultTableModel) jTable1.getModel();
        model = (DefaultTableModel) jTable2.getModel();
        list = new DAO().getListBenhNhan1();
        showTable();
    }

    public void valueChanged(ListSelectionEvent le) {
        int m = model.getRowCount();
        for (int j = 1; j <= m; j++) {
            model.removeRow(0);
        }
        if (jTable1.getSelectedRow() >= 0) {
            s = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 1);
        }
        for (Nhom1.model.BenhNhan a : list) {
            if (a.getId().equals(s)) {
                txtChuanDoan.setText(a.getKetQua());
                try {
                    PreparedStatement stmt = conn.prepareStatement("SELECT * FROM DonThuoc WHERE MSBN=?");
                    stmt.setString(1, a.getMSBN());
                    ResultSet rs = stmt.executeQuery();

                    while (rs.next()) {
                        PreparedStatement as = conn.prepareStatement("SELECT * FROM DanhSachThuoc WHERE MSThuoc=?");
                        as.setString(1, rs.getString("MSThuoc").trim());
                        ResultSet ss = as.executeQuery();
                        ss.next();
                        model.addRow(new Object[]{
                            jTable2.getRowCount() + 1, ss.getString("TenThuoc"), rs.getString("SoLuongThuocDung")
                        });
                    }
                } catch (Exception e) {
                }
                break;
            }
        }
    }

    public void showTable() {
        for (Nhom1.model.BenhNhan s : list) {
            tm.addRow(new Object[]{
                jTable1.getRowCount() + 1, s.getId(), s.getName(), s.getGioiTinh(), s.getNgaySinh(), s.getSoDienThoai(), s.getDiaChi(), s.getNgayKham(), s.getBS()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtChuanDoan = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setPreferredSize(new java.awt.Dimension(1118, 805));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Họ và tên");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 54, 0, 0);
        add(jLabel1, gridBagConstraints);

        txtTen.setPreferredSize(new java.awt.Dimension(250, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 244;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 29, 0, 0);
        add(txtTen, gridBagConstraints);

        btnTim.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnTim.setText("Tìm kiếm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 252, 0, 0);
        add(btnTim, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MSBN", "Họ Tên", "Giới tính", "Ngày sinh", "Số điện thoại", "Địa chỉ", "Ngày khám", "Bác sĩ khám"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(80);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1220;
        gridBagConstraints.ipady = 208;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(9, 2, 0, 1);
        add(jScrollPane1, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Kết quả khám");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 65, 0, 0);
        add(jLabel5, gridBagConstraints);

        jScrollPane2.setAutoscrolls(true);

        txtChuanDoan.setColumns(20);
        txtChuanDoan.setRows(5);
        txtChuanDoan.setMaximumSize(new java.awt.Dimension(150, 2147483647));
        txtChuanDoan.setPreferredSize(new java.awt.Dimension(150, 94));
        jScrollPane2.setViewportView(txtChuanDoan);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 980;
        gridBagConstraints.ipady = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(31, 51, 0, 0);
        add(jScrollPane2, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Đơn thuốc");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 65, 0, 0);
        add(jLabel6, gridBagConstraints);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên thuốc", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 980;
        gridBagConstraints.ipady = 122;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 51, 199, 0);
        add(jScrollPane3, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Trở về");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 7, 0, 0);
        add(jButton1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        if (txtTen.getText().length() == 0) {
            txtTen.requestFocus();
        }
        else{
            int m = model.getRowCount();
        for (int j = 1; j <= m; j++) {
            model.removeRow(0);
        }
        list.clear();
        
        try {
            list2 = new DAO().getListBenhNhan1();
            for (Nhom1.model.BenhNhan s:list2){
                if ((s.getName().toLowerCase()).trim().matches(".*"+txtTen.getText()+".*"))
                    list.add(s);
            }
            int n = tm.getRowCount();
            for (int j = 1; j <= n; j++) {
                tm.removeRow(0);
            }
            showTable();
        } catch (Exception e) {
        }
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int n = tm.getRowCount();
        for (int j = 1; j <= n; j++) {
            tm.removeRow(0);
        }
        list.clear();
        list = new DAO().getListBenhNhan1();
        showTable();
        txtTen.setText("");
        txtChuanDoan.setText("");
        int m = model.getRowCount();
        for (int j = 1; j <= m; j++) {
            model.removeRow(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTim;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea txtChuanDoan;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
