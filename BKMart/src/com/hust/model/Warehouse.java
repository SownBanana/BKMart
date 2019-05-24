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
public class Warehouse {
    private int id;
    private String name;
    private int witdh;          //rộng
    private int length;         //dài
    private int height;         //cao
    private String adress;      //địa chỉ
    private String surrogate;   //người đại diện
    private String phoneNo;     //số điện thoại
    private String bankAccount; //tknh
    private boolean isFull;     //kho đầy chưa

    public Warehouse() {
    }

    public Warehouse(int id, String name, int witdh, int length, int height, String adress, String surrogate, String phoneNo, String bankAccount, boolean isFull) {
        this.id = id;
        this.name = name;
        this.witdh = witdh;
        this.length = length;
        this.height = height;
        this.adress = adress;
        this.surrogate = surrogate;
        this.phoneNo = phoneNo;
        this.bankAccount = bankAccount;
        this.isFull = isFull;
    }

    public Warehouse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Warehouse(int witdh, int length, int height) {
        this.witdh = witdh;
        this.length = length;
        this.height = height;
    }

    public Warehouse(int id, String name, int witdh, int length, int height) {
        this.id = id;
        this.name = name;
        this.witdh = witdh;
        this.length = length;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWitdh() {
        return witdh;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getAdress() {
        return adress;
    }

    public String getSurrogate() {
        return surrogate;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public boolean isIsFull() {
        return isFull;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWitdh(int witdh) {
        this.witdh = witdh;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setSurrogate(String surrogate) {
        this.surrogate = surrogate;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setIsFull(boolean isFull) {
        this.isFull = isFull;
    }
    
    
}
