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

public class NguoiDung implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private String taiKhoan;
   
    private String passWord;
    
    private Date ngayTaoTaiKhoan;
    
    private Date ngayTruyCapGanNhat;
    
    private int idPhanQuyen;
    
    private int idNhanVien;

    public NguoiDung() {
    }

    public NguoiDung(Integer id) {
        this.id = id;
    }

    public NguoiDung(Integer id, String taiKhoan, String passWord, Date ngayTaoTaiKhoan, Date ngayTruyCapGanNhat, int idPhanQuyen, int idNhanVien) {
        this.id = id;
        this.taiKhoan = taiKhoan;
        this.passWord = passWord;
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
        this.ngayTruyCapGanNhat = ngayTruyCapGanNhat;
        this.idPhanQuyen = idPhanQuyen;
        this.idNhanVien = idNhanVien;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    public void setNgayTaoTaiKhoan(Date ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    public Date getNgayTruyCapGanNhat() {
        return ngayTruyCapGanNhat;
    }

    public void setNgayTruyCapGanNhat(Date ngayTruyCapGanNhat) {
        this.ngayTruyCapGanNhat = ngayTruyCapGanNhat;
    }

    public int getIdPhanQuyen() {
        return idPhanQuyen;
    }

    public void setIdPhanQuyen(int idPhanQuyen) {
        this.idPhanQuyen = idPhanQuyen;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
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
        if (!(object instanceof NguoiDung)) {
            return false;
        }
        NguoiDung other = (NguoiDung) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nhom28.quanlibanhang.pojo.NguoiDung[ id=" + id + " ]";
    }
    
}
