/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.controller;

import com.hust.model.Product;
import java.util.Scanner;

/**
 *
 * @author SownBanana
 */
public class ProductController {

    public static Product[] enterData (int n){
        Product[] rs = new Product[n];
        int index = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sản phẩm "+ (i+1));
            int id = scanInt("Nhập mã sản phẩm");
            String name = scanString("Nhập tên sản phẩm");
            rs[i] = new Product(id, name);
        }
        return rs;
    }
    private static int scanInt (String mess){
        System.out.println(mess);
        return new Scanner(System.in).nextInt();
    }
    private static double scanDouble (String mess){
        System.out.println(mess);
        return new Scanner(System.in).nextDouble();
    }
    private static long scanLong (String mess){
        System.out.println(mess);
        return new Scanner(System.in).nextLong();
    }
    private static String scanString (String mess){
        System.out.println(mess);
        return new Scanner(System.in).nextLine();
    }
    private static boolean  scanBoolean (String mess){
        System.out.println(mess);
        return new Scanner(System.in).nextBoolean();
    }
}
