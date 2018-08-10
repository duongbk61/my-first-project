/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nhom1.model;

import java.util.Date;

/**
 *
 * @author Geek
 */
public class DuocSi extends Person{
    private String Email,CMND,UserName;
     private String MatKhau,MSNV;
    public DuocSi() {
    }

    public DuocSi(String id, String Name, String GioiTinh, String NgaySinh,String SDT,
            String DiaChi, String Email,String CMND,String UserName,String MSNV) {
        super(id, Name, GioiTinh, SDT, DiaChi, NgaySinh);
        this.CMND=CMND;
        this.Email=Email;
        this.UserName=UserName;
    }

    public String getMSNV() {
        return MSNV;
    }

    public void setMSNV(String MSNV) {
        this.MSNV = MSNV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
    public void NhapThuoc(){
        
    }
    
  
}
