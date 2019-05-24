/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.model;

import java.util.Date;

/**
 *
 * @author SownBanana
 */
public class Product {

    private int id; //  mã sản phẩm
    private String name; // tên sản phẩm
    private String picture; // ảnh sản phẩm
    private String introduction; // giới thiệu sản phẩm
    private String detail; // chi tiết sản phẩm
    private String vendor; // nha cung cap
    private Date expiryDate; // hết hạn sử dụng
    private int quantityBought; // so luong đã bán
    private int quantityAvailable; // số lượng hàng có sẵn
    private double purchasePrice; // gia mua
    private double salePrice; // giá bán
    public double MSRP; // gia niem yết
    private float scale; // phần trăm giảm giá
    private String wareHouse; // kho hàng

    public Product() {
    }

    public Product(int id, String name, String picture, String introduction, String detail, String vendor, Date expiryDate, int quantityBought, int quantityAvailable, double purchasePrice, double salePrice, double MSRP, float scale, String wareHouse) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        this.introduction = introduction;
        this.detail = detail;
        this.vendor = vendor;
        this.expiryDate = expiryDate;
        this.quantityBought = quantityBought;
        this.quantityAvailable = quantityAvailable;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.MSRP = MSRP;
        this.scale = scale;
        this.wareHouse = wareHouse;
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPicture() {
        return picture;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getDetail() {
        return detail;
    }

    public String getVendor() {
        return vendor;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public int getQuantityBought() {
        return quantityBought;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getMSRP() {
        return MSRP;
    }

    public float getScale() {
        return scale;
    }

    public String getWareHouse() {
        return wareHouse;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setQuantityBought(int quantityBought) {
        this.quantityBought = quantityBought;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public void setMSRP(double MSRP) {
        this.MSRP = MSRP;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public void setWareHouse(String wareHouse) {
        this.wareHouse = wareHouse;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + "}";
    }

    
    
    
    
}
