/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.model;

/**
 *
 * @author SownBanana
 */
public class Address {
    private String soNha;
    private String ngoNgach;
    private String duong;
    private String xaPhuong;
    private String quanHuyen;
    private String tinhTP;

    public Address() {
    }

    public Address(String soNha, String ngoNgach, String duong, String xaPhuong, String quanHuyen, String tinhTP) {
        this.soNha = soNha;
        this.ngoNgach = ngoNgach;
        this.duong = duong;
        this.xaPhuong = xaPhuong;
        this.quanHuyen = quanHuyen;
        this.tinhTP = tinhTP;
    }

    @Override
    public String toString() {
        return soNha + ", " + ngoNgach + ", " + duong + ", " + xaPhuong + ", " + quanHuyen + ", " + tinhTP;
    }
    
    
}
