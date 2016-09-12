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

public class LichSuBanHang implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private int idHoaDon;
    
    private int idHangHoa;
    
    private String thaoTac;

    public LichSuBanHang() {
    }

    public LichSuBanHang(Integer id) {
        this.id = id;
    }

    public LichSuBanHang(Integer id, int idHoaDon, int idHangHoa, String thaoTac) {
        this.id = id;
        this.idHoaDon = idHoaDon;
        this.idHangHoa = idHangHoa;
        this.thaoTac = thaoTac;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public int getIdHangHoa() {
        return idHangHoa;
    }

    public void setIdHangHoa(int idHangHoa) {
        this.idHangHoa = idHangHoa;
    }

    public String getThaoTac() {
        return thaoTac;
    }

    public void setThaoTac(String thaoTac) {
        this.thaoTac = thaoTac;
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
        if (!(object instanceof LichSuBanHang)) {
            return false;
        }
        LichSuBanHang other = (LichSuBanHang) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nhom28.quanlibanhang.pojo.LichSuBanHang[ id=" + id + " ]";
    }
    
}
