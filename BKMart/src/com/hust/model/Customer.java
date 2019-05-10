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
public class Customer {
    private int id;                         //mã khách hàng
    private String name;                    //tên khách hàng
    private String gender;                  //giới tính
    private String picture;                 //ảnh khách hàng
    private int idNumber;                   //CMND
    private String username;                //tài khoản đăng nhập
    private String password;                //mật khẩu đăng nhập
    private String email;                   //email khách hàng
    private String address;                 //địa chỉ
    private int phoneNumber;                //số điện thoại
    private Order[] historyOrder;           //lịch sử mua hàng
    private double wallet;                  //ví của khách hàng
    private int bankAcount;                 //Tài khoản ngân hàng
    private String level;                   //cấp độ thân thiết
    private String[] voucher;               //mã giảm giá
    
    public Customer(){
        System.out.println("Init New Customer!");
    }
    
    public Customer (int id, String name){
        this.id = id;
        this.name = name;
    }

    public Customer(int id, String name, String gender, String picture, int idNumber, String username, String password, String email,
            String address, int phoneNumber, Order[] historyOrder, double wallet, int bankAcount, String level, String[] voucher) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.picture = picture;
        this.idNumber = idNumber;
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.historyOrder = historyOrder;
        this.wallet = wallet;
        this.bankAcount = bankAcount;
        this.level = level;
        this.voucher = voucher;
    }

    public Customer(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setHistoryOrder(Order[] historyOrder) {
        this.historyOrder = historyOrder;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void setBankAcount(int bankAcount) {
        this.bankAcount = bankAcount;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setVoucher(String[] voucher) {
        this.voucher = voucher;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPicture() {
        return picture;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Order[] getHistoryOrder() {
        return historyOrder;
    }

    public double getWallet() {
        return wallet;
    }

    public int getBankAcount() {
        return bankAcount;
    }

    public String getLevel() {
        return level;
    }

    public String[] getVoucher() {
        return voucher;
    }

    
    
}
