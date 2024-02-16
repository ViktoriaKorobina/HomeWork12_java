package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(
                100.0,
                new CategoryProduct("phone"),
                20,
                "Xiaomi");
        Product product2 = new Product(
                500.0,
                new CategoryProduct("laptop"),
                15,
                "Lenovo");
        Warehouse warehouse = new Warehouse();
        //System.out.println("warehouse.listProduct = " + warehouse.listProduct);
        warehouse.add(product1);
        warehouse.add(product2);
        List<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        DiscountedGoods discountedGoods = new DiscountedGoods(
                50.0,
                new CategoryProduct("phone"),
                5,
                "Siemens",
                "glass");
        warehouse.add(discountedGoods);
        OrderProduct orderProduct = new OrderProduct(warehouse);
        orderProduct.processOrder(list);
        for (int i = 0; i < warehouse.listProduct.size(); i++) {
            System.out.println(warehouse.listProduct.get(i));
        }
    }
}