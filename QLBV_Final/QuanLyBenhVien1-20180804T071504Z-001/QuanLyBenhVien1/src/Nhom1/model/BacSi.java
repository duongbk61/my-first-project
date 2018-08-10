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
public class BacSi extends Person{
    private String MatKhau;
    private String Email;
    private String CMND;
    private String UserName,MSBS,TrangThai;
    public BacSi(){
        super();
    }
    public BacSi(String id, String Name, String GioiTinh, String SoDienThoai,
            String DiaChi, String NgaySinh,String MatKhau,String MSBS) {
        super( id,  Name, GioiTinh,  SoDienThoai, DiaChi,  NgaySinh);
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMSBS() {
        return MSBS;
    }

    public void setMSBS(String MSBS) {
        this.MSBS = MSBS;
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
