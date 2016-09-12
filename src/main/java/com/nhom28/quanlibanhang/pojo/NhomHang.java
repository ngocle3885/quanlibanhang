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

public class NhomHang implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private String tenNhomHang;

    public NhomHang() {
    }

    public NhomHang(Integer id) {
        this.id = id;
    }

    public NhomHang(Integer id, String tenNhomHang) {
        this.id = id;
        this.tenNhomHang = tenNhomHang;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenNhomHang() {
        return tenNhomHang;
    }

    public void setTenNhomHang(String tenNhomHang) {
        this.tenNhomHang = tenNhomHang;
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
        if (!(object instanceof NhomHang)) {
            return false;
        }
        NhomHang other = (NhomHang) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nhom28.quanlibanhang.pojo.NhomHang[ id=" + id + " ]";
    }
    
}
