/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom28.quanlibanhang.pojo;

import java.io.Serializable;

/**
 *
 * @author Google
 */

public class LoaiHangHoa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private String tenLoaiHang;
    
    private String donViTinh;

    public LoaiHangHoa() {
    }

    public LoaiHangHoa(Integer id) {
        this.id = id;
    }

    public LoaiHangHoa(Integer id, String tenLoaiHang, String donViTinh) {
        this.id = id;
        this.tenLoaiHang = tenLoaiHang;
        this.donViTinh = donViTinh;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenLoaiHang() {
        return tenLoaiHang;
    }

    public void setTenLoaiHang(String tenLoaiHang) {
        this.tenLoaiHang = tenLoaiHang;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
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
        if (!(object instanceof LoaiHangHoa)) {
            return false;
        }
        LoaiHangHoa other = (LoaiHangHoa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nhom28.quanlibanhang.pojo.LoaiHangHoa[ id=" + id + " ]";
    }
    
}
