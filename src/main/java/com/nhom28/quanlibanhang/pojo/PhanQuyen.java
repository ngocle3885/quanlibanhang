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

public class PhanQuyen implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private String dienGiai;
    
    private String ten;
    
    private String heThong;
    
    private String baoMat;
    
    private String duLieu;

    public PhanQuyen() {
    }

    public PhanQuyen(Integer id) {
        this.id = id;
    }

    public PhanQuyen(Integer id, String dienGiai, String ten, String heThong, String baoMat, String duLieu) {
        this.id = id;
        this.dienGiai = dienGiai;
        this.ten = ten;
        this.heThong = heThong;
        this.baoMat = baoMat;
        this.duLieu = duLieu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDienGiai() {
        return dienGiai;
    }

    public void setDienGiai(String dienGiai) {
        this.dienGiai = dienGiai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHeThong() {
        return heThong;
    }

    public void setHeThong(String heThong) {
        this.heThong = heThong;
    }

    public String getBaoMat() {
        return baoMat;
    }

    public void setBaoMat(String baoMat) {
        this.baoMat = baoMat;
    }

    public String getDuLieu() {
        return duLieu;
    }

    public void setDuLieu(String duLieu) {
        this.duLieu = duLieu;
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
        if (!(object instanceof PhanQuyen)) {
            return false;
        }
        PhanQuyen other = (PhanQuyen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nhom28.quanlibanhang.pojo.PhanQuyen[ id=" + id + " ]";
    }
    
}
