/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author sonjaya
 */

@ManagedBean(name="datalelangcls")
@SessionScoped
public class Datalelang {
    
    private String namaToko;
    private String pengaju;
    private double JumlahAJuan;
    private String deskripsi;
    private int id_lelang;

    public int getId_lelang() {
        return id_lelang;
    }

    public void setId_lelang(int id_lelang) {
        this.id_lelang = id_lelang;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getPengaju() {
        return pengaju;
    }

    public void setPengaju(String pengaju) {
        this.pengaju = pengaju;
    }

    public double getJumlahAJuan() {
        return JumlahAJuan;
    }

    public void setJumlahAJuan(double JumlahAJuan) {
        this.JumlahAJuan = JumlahAJuan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    
    
}
