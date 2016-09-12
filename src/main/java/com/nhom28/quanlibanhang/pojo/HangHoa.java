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
public class HangHoa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private int idLoaiHangHoa;
    
    private int idNhomHang;
    
    private int giaNhap;
    
    private int giaBan;
    
    private String maVach;
    
    private int soLuongTon;
    
    private String tenHangHoa;
    
    private String thongTinNhaSanXuat;
    
    private int idNhaPhanPhoi;
    
    private int idKho;
    
    private Date ngayNhap;

    public HangHoa() {
    }

    public HangHoa(Integer id) {
        this.id = id;
    }

    public HangHoa(Integer id, int idLoaiHangHoa, int idNhomHang, int giaNhap, int giaBan, String maVach, int soLuongTon, String tenHangHoa, String thongTinNhaSanXuat, int idNhaPhanPhoi, int idKho, Date ngayNhap) {
        this.id = id;
        this.idLoaiHangHoa = idLoaiHangHoa;
        this.idNhomHang = idNhomHang;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.maVach = maVach;
        this.soLuongTon = soLuongTon;
        this.tenHangHoa = tenHangHoa;
        this.thongTinNhaSanXuat = thongTinNhaSanXuat;
        this.idNhaPhanPhoi = idNhaPhanPhoi;
        this.idKho = idKho;
        this.ngayNhap = ngayNhap;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdLoaiHangHoa() {
        return idLoaiHangHoa;
    }

    public void setIdLoaiHangHoa(int idLoaiHangHoa) {
        this.idLoaiHangHoa = idLoaiHangHoa;
    }

    public int getIdNhomHang() {
        return idNhomHang;
    }

    public void setIdNhomHang(int idNhomHang) {
        this.idNhomHang = idNhomHang;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getMaVach() {
        return maVach;
    }

    public void setMaVach(String maVach) {
        this.maVach = maVach;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getThongTinNhaSanXuat() {
        return thongTinNhaSanXuat;
    }

    public void setThongTinNhaSanXuat(String thongTinNhaSanXuat) {
        this.thongTinNhaSanXuat = thongTinNhaSanXuat;
    }

    public int getIdNhaPhanPhoi() {
        return idNhaPhanPhoi;
    }

    public void setIdNhaPhanPhoi(int idNhaPhanPhoi) {
        this.idNhaPhanPhoi = idNhaPhanPhoi;
    }

    public int getIdKho() {
        return idKho;
    }

    public void setIdKho(int idKho) {
        this.idKho = idKho;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
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
        if (!(object instanceof HangHoa)) {
            return false;
        }
        HangHoa other = (HangHoa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nhom28.quanlibanhang.pojo.HangHoa[ id=" + id + " ]";
    }
    
}
