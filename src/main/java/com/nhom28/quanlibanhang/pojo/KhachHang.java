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

public class KhachHang implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private String tenKhachHang;
    
    private Date ngaySinh;
    
    private String diaChi;
    
    private String dienThoai;
    
    private String cmnd;
    
    private int gioiTinh;
   
    private Date ngayBatDau;
    
    private Date ngayGiaoDichGanNhat;
    
    private int idKhuVuc;
   
    private String thongTinLienQuan;

    public KhachHang() {
    }

    public KhachHang(Integer id) {
        this.id = id;
    }

    public KhachHang(Integer id, String tenKhachHang, Date ngaySinh, String diaChi, String dienThoai, String cmnd, int gioiTinh, Date ngayBatDau, Date ngayGiaoDichGanNhat, int idKhuVuc, String thongTinLienQuan) {
        this.id = id;
        this.tenKhachHang = tenKhachHang;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.cmnd = cmnd;
        this.gioiTinh = gioiTinh;
        this.ngayBatDau = ngayBatDau;
        this.ngayGiaoDichGanNhat = ngayGiaoDichGanNhat;
        this.idKhuVuc = idKhuVuc;
        this.thongTinLienQuan = thongTinLienQuan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayGiaoDichGanNhat() {
        return ngayGiaoDichGanNhat;
    }

    public void setNgayGiaoDichGanNhat(Date ngayGiaoDichGanNhat) {
        this.ngayGiaoDichGanNhat = ngayGiaoDichGanNhat;
    }

    public int getIdKhuVuc() {
        return idKhuVuc;
    }

    public void setIdKhuVuc(int idKhuVuc) {
        this.idKhuVuc = idKhuVuc;
    }

    public String getThongTinLienQuan() {
        return thongTinLienQuan;
    }

    public void setThongTinLienQuan(String thongTinLienQuan) {
        this.thongTinLienQuan = thongTinLienQuan;
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
        if (!(object instanceof KhachHang)) {
            return false;
        }
        KhachHang other = (KhachHang) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nhom28.quanlibanhang.pojo.KhachHang[ id=" + id + " ]";
    }
    
}
