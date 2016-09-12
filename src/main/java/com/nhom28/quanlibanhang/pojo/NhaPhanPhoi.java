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

public class NhaPhanPhoi implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private String tenNhaPhanPhoi;
    
    private Date ngayKyHopDong;
    
    private String diaChi;
    
    private String dienThoai;
    
    private String email;
    
    private String nguoiDaiDien;
    
    private Date ngayGiaoDichGanNhat;
    
    private int idKhuVuc;
    
    private int chietKhau;
   
    private String thongTinLienQuan;

    public NhaPhanPhoi() {
    }

    public NhaPhanPhoi(Integer id) {
        this.id = id;
    }

    public NhaPhanPhoi(Integer id, String tenNhaPhanPhoi, Date ngayKyHopDong, String diaChi, String dienThoai, String email, String nguoiDaiDien, Date ngayGiaoDichGanNhat, int idKhuVuc, int chietKhau, String thongTinLienQuan) {
        this.id = id;
        this.tenNhaPhanPhoi = tenNhaPhanPhoi;
        this.ngayKyHopDong = ngayKyHopDong;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.email = email;
        this.nguoiDaiDien = nguoiDaiDien;
        this.ngayGiaoDichGanNhat = ngayGiaoDichGanNhat;
        this.idKhuVuc = idKhuVuc;
        this.chietKhau = chietKhau;
        this.thongTinLienQuan = thongTinLienQuan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenNhaPhanPhoi() {
        return tenNhaPhanPhoi;
    }

    public void setTenNhaPhanPhoi(String tenNhaPhanPhoi) {
        this.tenNhaPhanPhoi = tenNhaPhanPhoi;
    }

    public Date getNgayKyHopDong() {
        return ngayKyHopDong;
    }

    public void setNgayKyHopDong(Date ngayKyHopDong) {
        this.ngayKyHopDong = ngayKyHopDong;
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

    public String getNguoiDaiDien() {
        return nguoiDaiDien;
    }

    public void setNguoiDaiDien(String nguoiDaiDien) {
        this.nguoiDaiDien = nguoiDaiDien;
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

    public int getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(int chietKhau) {
        this.chietKhau = chietKhau;
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
        if (!(object instanceof NhaPhanPhoi)) {
            return false;
        }
        NhaPhanPhoi other = (NhaPhanPhoi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nhom28.quanlibanhang.pojo.NhaPhanPhoi[ id=" + id + " ]";
    }
    
}
