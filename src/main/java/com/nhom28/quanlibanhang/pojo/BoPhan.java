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

public class BoPhan implements Serializable {

    private static final long serialVersionUID = 1L;    
    
    private Integer id;
   
    private String tenBoPhan;
    
    private int idNguoiQuanLy;

    public BoPhan() {
    }

    public BoPhan(Integer id) {
        this.id = id;
    }

    public BoPhan(Integer id, String tenBoPhan, int idNguoiQuanLy) {
        this.id = id;
        this.tenBoPhan = tenBoPhan;
        this.idNguoiQuanLy = idNguoiQuanLy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public int getIdNguoiQuanLy() {
        return idNguoiQuanLy;
    }

    public void setIdNguoiQuanLy(int idNguoiQuanLy) {
        this.idNguoiQuanLy = idNguoiQuanLy;
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
        if (!(object instanceof BoPhan)) {
            return false;
        }
        BoPhan other = (BoPhan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nhom28.quanlibanhang.pojo.BoPhan[ id=" + id + " ]";
    }
    
}
