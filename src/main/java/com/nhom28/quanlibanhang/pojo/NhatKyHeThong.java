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

public class NhatKyHeThong implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private int idNguoiDung;
   
    private String thaoTac;
   
    private String chiTiet;

    public NhatKyHeThong() {
    }

    public NhatKyHeThong(Integer id) {
        this.id = id;
    }

    public NhatKyHeThong(Integer id, int idNguoiDung, String thaoTac, String chiTiet) {
        this.id = id;
        this.idNguoiDung = idNguoiDung;
        this.thaoTac = thaoTac;
        this.chiTiet = chiTiet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdNguoiDung(int idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public String getThaoTac() {
        return thaoTac;
    }

    public void setThaoTac(String thaoTac) {
        this.thaoTac = thaoTac;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
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
        if (!(object instanceof NhatKyHeThong)) {
            return false;
        }
        NhatKyHeThong other = (NhatKyHeThong) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nhom28.quanlibanhang.pojo.NhatKyHeThong[ id=" + id + " ]";
    }
    
}
