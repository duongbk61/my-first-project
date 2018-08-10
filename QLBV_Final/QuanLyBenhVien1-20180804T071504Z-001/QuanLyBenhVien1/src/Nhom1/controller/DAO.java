/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nhom1.controller;

import Nhom1.model.DuocSi;
import Nhom1.model.BacSi;
import Nhom1.model.TiepTan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Than
 */
public class DAO extends javax.swing.JFrame {

    private Connection conn;

    public DAO() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=BenhVien;"
                    + "username=sa;password=123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addDoctor(BacSi s) {

        String sql = "INSERT INTO DanhSachBacSi(MSBS, Ten, GioiTinh, NgaySinh, SDT, DiaCHi, Email, CMND,UserName) "
                + "VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement as = conn.prepareStatement("SELECT * FROM DanhSachBacSi WHERE MSBS=?");
            as.setString(1, s.getMSBS());
            ResultSet ss = as.executeQuery();
            if (ss.next()) {
                return false;
            }
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMSBS());
            ps.setString(2, s.getName());
            ps.setString(3, s.getGioiTinh());
            ps.setString(4, s.getNgaySinh());
            ps.setString(5, s.getSoDienThoai());
            ps.setString(6, s.getDiaChi());
            ps.setString(7, s.getEmail());
            ps.setString(8, s.getCMND());
            ps.setString(9, s.getUserName());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addTKDoctor(BacSi s) {
        try {
            PreparedStatement as = conn.prepareStatement("SELECT * FROM TaiKhoanDangNhap WHERE User_Name=?");
            as.setString(1, s.getUserName());
            ResultSet ss = as.executeQuery();
            if (ss.next()) {
                return false;
            }
            PreparedStatement ps = conn.prepareStatement("INSERT INTO TaiKhoanDangNhap(User_Name,Pass_Word,LoaiTK,TrangThai)" + "VALUES(?,?,?,?)");

            ps.setString(1, s.getUserName());
            ps.setString(2, s.getMatKhau());
            ps.setString(3, "bac si");
            ps.setString(4, "1");
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("" + e);
        }
        return false;
    }

    public boolean addDuocSi(DuocSi s) {

        String sql = "INSERT INTO DanhSachNguoiBanThuoc(MSNV, Ten, GioiTinh, NgaySinh, SDT, DiaCHi, Email, CMND,UserName) "
                + "VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement as = conn.prepareStatement("SELECT * FROM DanhSachNguoiBanThuoc WHERE MSNV=?");
            as.setString(1, s.getMSNV());
            ResultSet ss = as.executeQuery();
            if (ss.next()) {
                return false;
            }
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMSNV());
            ps.setString(2, s.getName());
            ps.setString(3, s.getGioiTinh());
            ps.setString(4, s.getNgaySinh());
            ps.setString(5, s.getSoDienThoai());
            ps.setString(6, s.getDiaChi());
            ps.setString(7, s.getEmail());
            ps.setString(8, s.getCMND());
            ps.setString(9, s.getUserName());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addTKDuocSi(DuocSi s) {
        try {
            PreparedStatement as = conn.prepareStatement("SELECT * FROM TaiKhoanDangNhap WHERE User_Name=?");
            as.setString(1, s.getUserName());
            ResultSet ss = as.executeQuery();
            if (ss.next()) {
                return false;
            }
            PreparedStatement ps = conn.prepareStatement("INSERT INTO TaiKhoanDangNhap(User_Name,Pass_Word,LoaiTK,TrangThai)" + "VALUES(?,?,?,?)");
            ps.setString(1, s.getUserName());
            ps.setString(2, s.getMatKhau());
            ps.setString(3, "ban thuoc");
            ps.setString(4, "1");
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("" + e);
        }
        return false;
    }

    public boolean addTiepTan(TiepTan s) {

        String sql = "INSERT INTO DanhSachNguoiPhatSo(MSNV, Ten, GioiTinh, NgaySinh, SDT, DiaCHi, Email, CMND,UserName) "
                + "VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement as = conn.prepareStatement("SELECT * FROM DanhSachNguoiPhatso WHERE MSNV=?");
            as.setString(1, s.getMSNV());
            ResultSet ss = as.executeQuery();
            if (ss.next()) {
                return false;
            }
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMSNV());
            ps.setString(2, s.getName());
            ps.setString(3, s.getGioiTinh());
            ps.setString(4, s.getNgaySinh());
            ps.setString(5, s.getSoDienThoai());
            ps.setString(6, s.getDiaChi());
            ps.setString(7, s.getEmail());
            ps.setString(8, s.getCMND());
            ps.setString(9, s.getUserName());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addTKTiepTan(TiepTan s) {
        try {
            PreparedStatement as = conn.prepareStatement("SELECT * FROM TaiKhoanDangNhap WHERE User_Name=?");
            as.setString(1, s.getUserName());
            ResultSet ss = as.executeQuery();
            if (ss.next()) {
                return false;
            }
            PreparedStatement ps = conn.prepareStatement("INSERT INTO TaiKhoanDangNhap(User_Name,Pass_Word,LoaiTK,TrangThai)" + "VALUES(?,?,?,?)");
            ps.setString(1, s.getUserName());
            ps.setString(2, s.getMatKhau());
            ps.setString(3, "phat so");
            ps.setString(4, "1");
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("" + e);
        }
        return false;
    }

    public ArrayList<BacSi> getListBacSi() {
        ArrayList<BacSi> list = new ArrayList<>();
        String sql = "SELECT * FROM DanhSachBacSi";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BacSi s = new BacSi();
                PreparedStatement ss = conn.prepareStatement("SELECT * FROM TaiKhoanDangnhap " + "where User_Name=?");
                ss.setString(1, rs.getString("UserName"));
                ResultSet as = ss.executeQuery();
                as.next();
                s.setId(rs.getString("MSBS").trim());
                s.setName(rs.getString("Ten").trim());
                s.setGioiTinh(rs.getString("GioiTinh").trim());
                s.setNgaySinh(rs.getString("NgaySinh"));
                s.setSoDienThoai(rs.getString("SDT").trim());
                s.setDiaChi(rs.getString("DiaCHi").trim());
                s.setEmail(rs.getString("Email").trim());
                s.setCMND(rs.getString("CMND").trim());
                s.setUserName(rs.getString("UserName").trim());
                s.setMatKhau(as.getString("Pass_Word").trim());
                s.setTrangThai(as.getString("TrangThai").trim());
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<DuocSi> getListDuocSi() {
        ArrayList<DuocSi> list1 = new ArrayList<>();
        String sql = "SELECT * FROM DanhSachNguoiBanThuoc";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DuocSi s = new DuocSi();
                PreparedStatement ss = conn.prepareStatement("select * from TaiKhoanDangnhap " + "where User_Name=?");
                ss.setString(1, rs.getString("UserName"));
                ResultSet as = ss.executeQuery();
                as.next();
                s.setId(rs.getString("MSNV").trim());
                s.setName(rs.getString("Ten").trim());
                s.setGioiTinh(rs.getString("GioiTinh").trim());
                s.setNgaySinh(rs.getString("NgaySinh"));
                s.setSoDienThoai(rs.getString("SDT").trim());
                s.setDiaChi(rs.getString("DiaCHi").trim());
                s.setEmail(rs.getString("Email").trim());
                s.setCMND(rs.getString("CMND").trim());
                s.setUserName(rs.getString("UserName").trim());
                s.setMatKhau(as.getString("Pass_Word").trim());
                list1.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list1;
    }

    public ArrayList<TiepTan> getListTiepTan() {
        ArrayList<TiepTan> list2 = new ArrayList<>();
        String sql = "SELECT * FROM DanhSachNguoiPhatSo";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TiepTan s = new TiepTan();
                PreparedStatement ss = conn.prepareStatement("select * from TaiKhoanDangnhap " + "where User_Name=?");
                ss.setString(1, rs.getString("UserName"));
                ResultSet as = ss.executeQuery();
                as.next();
                s.setId(rs.getString("MSNV").trim());
                s.setName(rs.getString("Ten").trim());
                s.setGioiTinh(rs.getString("GioiTinh").trim());
                s.setNgaySinh(rs.getString("NgaySinh"));
                s.setSoDienThoai(rs.getString("SDT").trim());
                s.setDiaChi(rs.getString("DiaCHi").trim());
                s.setEmail(rs.getString("Email").trim());
                s.setCMND(rs.getString("CMND").trim());
                s.setUserName(rs.getString("UserName").trim());
                s.setMatKhau(as.getString("Pass_Word").trim());
                list2.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list2;
    }

    public ArrayList<Nhom1.model.BenhNhan> getListBenhNhan() {
        ArrayList<Nhom1.model.BenhNhan> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM HoSoBenhNhan where TrangThai=?");
            ps.setString(1, "chua kham");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Nhom1.model.BenhNhan s = new Nhom1.model.BenhNhan();
                s.setId(rs.getString("MSBN").trim());
                s.setName(rs.getString("Ten").trim());
                s.setGioiTinh(rs.getString("GioiTinh").trim());
                s.setNgaySinh(rs.getString("NgaySinh"));
                s.setDiaChi(rs.getString("DiaCHi").trim());
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Nhom1.model.BenhNhan> getListBenhNhan1() {
        ArrayList<Nhom1.model.BenhNhan> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM HoSoBenhNhan ");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Nhom1.model.BenhNhan s = new Nhom1.model.BenhNhan();
                s.setId(rs.getString("MSBN").trim());
                s.setName(rs.getString("Ten").trim());
                s.setGioiTinh(rs.getString("GioiTinh").trim());
                s.setNgaySinh(rs.getString("NgaySinh").trim());
                s.setSoDienThoai(rs.getString("SDT").trim());
                s.setDiaChi(rs.getString("DiaCHi").trim());
                s.setMSBN(rs.getString("MSBN").trim());
                s.setNgayKham(rs.getString("NgayKham").trim());
                s.setKetQua(rs.getString("KetQuaKhamBenh").trim());
                PreparedStatement ss = conn.prepareStatement("SELECT * FROM DanhSachBacSi where MSBS=?");
                ss.setString(1, rs.getString("MSBS").trim());
                ResultSet as = ss.executeQuery();
                as.next();
                s.setBS(as.getString("Ten").trim());
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
