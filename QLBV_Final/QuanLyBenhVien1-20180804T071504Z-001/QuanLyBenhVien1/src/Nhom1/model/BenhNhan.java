/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nhom1.model;



public class BenhNhan extends Person{
    private String MSBS,NgayKham,KetQua,TrangThai,BS,MSBN;  
    private int SLKham;
    public BenhNhan(){
        super();
    }
    public BenhNhan(String id, String Name, String GioiTinh, String SoDienThoai,
        String DiaChi, String NgaySinh,String MSBS,String NgayKham,String KetQua,int SLKham,String TrangThai){
        super( id,  Name, GioiTinh,  SoDienThoai, DiaChi,  NgaySinh);
        this.MSBS=MSBS;
        this.NgayKham=NgayKham;
        this.KetQua=KetQua;
        this.SLKham=SLKham;
        this.TrangThai=TrangThai;
    }

    public String getMSBN() {
        return MSBN;
    }

    public void setMSBN(String MSBN) {
        this.MSBN = MSBN;
    }

    public String getBS() {
        return BS;
    }

    public void setBS(String BS) {
        this.BS = BS;
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

    public String getNgayKham() {
        return NgayKham;
    }

    public void setNgayKham(String NgayKham) {
        this.NgayKham = NgayKham;
    }

    public String getKetQua() {
        return KetQua;
    }

    public void setKetQua(String KetQua) {
        this.KetQua = KetQua;
    }

    public int  getSLKham() {
        return SLKham;
    }

    public void setSLKham(int SLKham) {
        this.SLKham = SLKham;
    }
    
}
