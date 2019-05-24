/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.controller;
/**
 *
 * @author SownBanana
 */
import com.hust.model.Address;
public class CustomerController {
    public static String getAddress (Address address){
        String rs = null;
        rs = address.toString();
        return rs;
    }
}
