/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom28.quanlibanhang.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Google
 */

public class HoaDon implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Integer id;
    
    private int idHangHoa;
    
    private int idKhachHang;
    
    private int giaBan;
    
    private int khuyenMai;
    
    private int soLuong;
    
    private int thanhTien;
    
    private String thongTinGiaoHang;
    
    private Date ngayLapHoaDon;

    public HoaDon() {
    }

    public HoaDon(Integer id) {
        this.id = id;
    }

    public HoaDon(Integer id, int idHangHoa, int idKhachHang, int giaBan, int khuyenMai, int soLuong, int thanhTien, String thongTinGiaoHang, Date ngayLapHoaDon) {
        this.id = id;
        this.idHangHoa = idHangHoa;
        this.idKhachHang = idKhachHang;
        this.giaBan = giaBan;
        this.khuyenMai = khuyenMai;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.thongTinGiaoHang = thongTinGiaoHang;
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdHangHoa() {
        return idHangHoa;
    }

    public void setIdHangHoa(int idHangHoa) {
        this.idHangHoa = idHangHoa;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(int khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getThongTinGiaoHang() {
        return thongTinGiaoHang;
    }

    public void setThongTinGiaoHang(String thongTinGiaoHang) {
        this.thongTinGiaoHang = thongTinGiaoHang;
    }

    public Date getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public void setNgayLapHoaDon(Date ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HoaDon)) {
            return false;
        }
        HoaDon other = (HoaDon) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nhom28.quanlibanhang.pojo.HoaDon[ id=" + id + " ]";
    }
    
}
