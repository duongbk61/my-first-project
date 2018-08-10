/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nhom1.view;

import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class TTCaNhan extends javax.swing.JPanel {
    private Connection conn;
    Login a=new Login();
    public TTCaNhan() {
        initComponents();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=BenhVien;"
                    + "username=sa;password=123");
        } catch (Exception e) {
        }
        create();
    }
    public void create(){
        try {
            if (a.loaitk.equals("bac si")){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
            		"select * from dbo.DanhSachBacSi "+
            		"where (UserName='"+a.taikhoan+"' ) "
            		);
            rs.next();
            txtDate.setText(rs.getString("NgaySinh"));
            txtName.setText(rs.getString("Ten"));
            jLabel4.setText(rs.getString("MSBS"));
            lblChucVu.setText("bác sĩ");
            jTextField1.setText(rs.getString("GioiTinh"));
            txtID.setText(rs.getString("CMND"));
            txtSDT.setText(rs.getString("SDT"));
            txtEmail.setText(rs.getString("Email"));
            txtAddress.setText(rs.getString("DiaCHi"));
            
        }
            else if (a.loaitk.equals("ban thuoc")){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
            		"select * from dbo.DanhSachNguoiBanThuoc "+
            		"where (UserName='"+a.taikhoan+"' ) "
            		);
            rs.next();
            txtDate.setText(rs.getString("NgaySinh"));
            txtName.setText(rs.getString("Ten"));
            jLabel4.setText(rs.getString("MSNV"));
            lblChucVu.setText("dược sĩ");
            jTextField1.setText(rs.getString("GioiTinh"));
            txtID.setText(rs.getString("CMND"));
            txtSDT.setText(rs.getString("SDT"));
            txtEmail.setText(rs.getString("Email"));
            txtAddress.setText(rs.getString("DiaCHi"));
        }
            else if (a.loaitk.equals("phat so")){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
            		"select * from dbo.DanhSachNguoiPhatSo "+
            		"where (UserName='"+a.taikhoan+"' ) "
            		);
            rs.next();
            txtDate.setText(rs.getString("NgaySinh"));
            txtName.setText(rs.getString("Ten"));
            jLabel4.setText(rs.getString("MSNV"));
            lblChucVu.setText("tiếp tân");
            jTextField1.setText(rs.getString("GioiTinh"));
            txtID.setText(rs.getString("CMND"));
            txtSDT.setText(rs.getString("SDT"));
            txtEmail.setText(rs.getString("Email"));
            txtAddress.setText(rs.getString("DiaCHi"));
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        lblChucVu = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setMinimumSize(new java.awt.Dimension(1118, 805));
        setPreferredSize(new java.awt.Dimension(1118, 805));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Họ và tên");
        jLabel9.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Chức vụ");
        jLabel10.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Số CMND");
        jLabel12.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Mã");
        jLabel13.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Giới tính");
        jLabel14.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("Số ĐT");
        jLabel15.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Email");
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Địa chỉ");
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Ngày sinh");
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 20));

        txtName.setPreferredSize(new java.awt.Dimension(250, 26));

        txtID.setPreferredSize(new java.awt.Dimension(250, 26));

        txtEmail.setPreferredSize(new java.awt.Dimension(250, 26));

        txtAddress.setPreferredSize(new java.awt.Dimension(250, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtSDT.setPreferredSize(new java.awt.Dimension(250, 26));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Cập nhật");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("Hủy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblChucVu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblChucVu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblChucVu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblChucVu.setPreferredSize(new java.awt.Dimension(250, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(lblChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jButton1)
                .addGap(104, 104, 104)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(lblChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDate)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtName.getText().length()==0){
            txtName.requestFocus();
        }else if(txtID.getText().length()==0){
            txtID.requestFocus();
        }
        else if(txtDate.getText().length()==0){
            txtDate.requestFocus();
        }
        else {
            try {
            if (a.loaitk.equals("bac si")){
            
            PreparedStatement stmt = conn.prepareStatement(
            		"update DanhSachBacSi "+
                        "set Ten= ?,"+
                        "GioiTinh= ?,"+
                        "SDT= ?,"+
                        "DiaCHi= ?,"+
                        "Email= ?,"+
                        "CMND= ? "+
            		"where UserName=?"
            		);
            stmt.setString(1,txtName.getText());
            stmt.setString(2,jTextField1.getText());
            stmt.setString(3,txtSDT.getText());
            stmt.setString(4,txtAddress.getText());
            stmt.setString(5,txtEmail.getText());
            stmt.setString(6,txtID.getText());
            stmt.setString(7,a.taikhoan);
            stmt.executeUpdate();
        }
            else if (a.loaitk.equals("ban thuoc")){
            PreparedStatement stmt = conn.prepareStatement(
            		"update DanhSachNguoiBanThuoc "+
                        "set Ten=?,"+
                        "GioiTinh=?,"+
                        "SDT=?,"+
                        "DiaCHi=?,"+
                        "Email=?,"+
                        "CMND=? "+
            		"where UserName=?"
            		);
            stmt.setString(1,txtName.getText());
            stmt.setString(2,jTextField1.getText());
            stmt.setString(3,txtSDT.getText());
            stmt.setString(4,txtAddress.getText());
            stmt.setString(5,txtEmail.getText());
            stmt.setString(6,txtID.getText());
            stmt.setString(7,a.taikhoan);
            stmt.executeUpdate();
        }
            else if (a.loaitk.equals("phat so")){
            PreparedStatement stmt = conn.prepareStatement(
            		"update DanhSachNguoiPhatSo "+
                        "set Ten=?,"+
                        "GioiTinh=?,"+
                        "SDT=?,"+
                        "DiaCHi=?,"+
                        "Email=?,"+
                        "CMND=? "+
            		"where UserName=?"
            		);
            stmt.setString(1,txtName.getText());
            stmt.setString(2,jTextField1.getText());
            stmt.setString(3,txtSDT.getText());
            stmt.setString(4,txtAddress.getText());
            stmt.setString(5,txtEmail.getText());
            stmt.setString(6,txtID.getText());
            stmt.setString(7,a.taikhoan);
            stmt.executeUpdate();
        }
                JOptionPane.showMessageDialog(jButton1, "cập nhật thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        create();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
