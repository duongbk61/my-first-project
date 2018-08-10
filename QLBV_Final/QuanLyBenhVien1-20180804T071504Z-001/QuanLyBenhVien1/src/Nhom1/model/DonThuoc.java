/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nhom1.model;

public class DonThuoc {
    private String MSBN,MSThuoc,TenThuoc;
    private int SoLuong;

    public String getMSBN() {
        return MSBN;
    }

    public String getTenThuoc() {
        return TenThuoc;
    }

    public void setTenThuoc(String TenThuoc) {
        this.TenThuoc = TenThuoc;
    }

    public void setMSBN(String MSBN) {
        this.MSBN = MSBN;
    }

    public String getMSThuoc() {
        return MSThuoc;
    }

    public void setMSThuoc(String MSThuoc) {
        this.MSThuoc = MSThuoc;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
}
