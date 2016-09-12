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

public class ThongTinPhanMem implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private String tenDonVi;
    
    private String diaChi;
    
    private String dienThoai;
    
    private String fax;
    
    private String website;
    
    private String email;
    
    private String linhVuc;
    
    private String maSoThue;
    
    private String gpkd;

    public ThongTinPhanMem() {
    }

    public ThongTinPhanMem(Integer id) {
        this.id = id;
    }

    public ThongTinPhanMem(Integer id, String tenDonVi, String diaChi, String dienThoai, String fax, String website, String email, String linhVuc, String maSoThue, String gpkd) {
        this.id = id;
        this.tenDonVi = tenDonVi;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.fax = fax;
        this.website = website;
        this.email = email;
        this.linhVuc = linhVuc;
        this.maSoThue = maSoThue;
        this.gpkd = gpkd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenDonVi() {
        return tenDonVi;
    }

    public void setTenDonVi(String tenDonVi) {
        this.tenDonVi = tenDonVi;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinhVuc() {
        return linhVuc;
    }

    public void setLinhVuc(String linhVuc) {
        this.linhVuc = linhVuc;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public String getGpkd() {
        return gpkd;
    }

    public void setGpkd(String gpkd) {
        this.gpkd = gpkd;
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
        if (!(object instanceof ThongTinPhanMem)) {
            return false;
        }
        ThongTinPhanMem other = (ThongTinPhanMem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nhom28.quanlibanhang.pojo.ThongTinPhanMem[ id=" + id + " ]";
    }
    
}
