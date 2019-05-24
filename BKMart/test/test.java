
import com.hust.controller.ProductController;
import com.hust.model.Customer;
import com.hust.model.Product;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SownBanana
 */
public class test {
    public static void main(String[] args) {
        Product [] product = ProductController.enterData(2);
        System.out.println("Danh sách sản phẩm trong kho: ");
        for (Product product1 : product) {
            System.out.println(product1);
        }
    }
}
