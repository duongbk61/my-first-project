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
public class TiepTan extends Person{
    private String MatKhau;
    private String Email;
    private String CMND;
    private String UserName,MSNV;
    public TiepTan(){
        super();
    }
    public TiepTan(String id, String Name, String GioiTinh, String SoDienThoai,
            String DiaChi, String NgaySinh, String MatKhau) {
        super( id,  Name, GioiTinh,  SoDienThoai, DiaChi,  NgaySinh);
        this.MatKhau=MatKhau;
    }
    public String getMatKhau(){
        return MatKhau;
    }
    public void setMatKhau(String MatKhau){
        this.MatKhau=MatKhau;
    }
    public String KeDon( String id){
        return "Don thuoc";
    }

    public String getMSNV() {
        return MSNV;
    }

    public void setMSNV(String MSNV) {
        this.MSNV = MSNV;
    }
    
    public String ChanDoan( String id){
        return "Chan doan";
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

    
}
