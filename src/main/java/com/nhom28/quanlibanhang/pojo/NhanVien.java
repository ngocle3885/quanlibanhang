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

public class NhanVien implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Integer id;
    
    private String tenDayDu;
    
    private Date ngaySinh;
    
    private String diaChi;
    
    private String dienThoai;
    
    private String email;
   
    private int gioiTinh;
    
    private Date ngayBatDau;
    
    private int loaiNhanVien;
    
    private int idBoPhan;

    public NhanVien() {
    }

    public NhanVien(Integer id) {
        this.id = id;
    }

    public NhanVien(Integer id, String tenDayDu, Date ngaySinh, String diaChi, String dienThoai, String email, int gioiTinh, Date ngayBatDau, int loaiNhanVien, int idBoPhan) {
        this.id = id;
        this.tenDayDu = tenDayDu;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.ngayBatDau = ngayBatDau;
        this.loaiNhanVien = loaiNhanVien;
        this.idBoPhan = idBoPhan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenDayDu() {
        return tenDayDu;
    }

    public void setTenDayDu(String tenDayDu) {
        this.tenDayDu = tenDayDu;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(int loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    public int getIdBoPhan() {
        return idBoPhan;
    }

    public void setIdBoPhan(int idBoPhan) {
        this.idBoPhan = idBoPhan;
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
        if (!(object instanceof NhanVien)) {
            return false;
        }
        NhanVien other = (NhanVien) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nhom28.quanlibanhang.pojo.NhanVien[ id=" + id + " ]";
    }
    
}
