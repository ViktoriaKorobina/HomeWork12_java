package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Warehouse implements AddProduct, RemoveProduct {

    List<Product> listProduct = new ArrayList<>();
    @Override
    public void remove(Product product, int amount) {
        while(product.getQuantity() > 0 && amount > 0){
            amount--;
            product.setQuantity(product.getQuantity() - 1);
        }
    }

    @Override
    public void add(Product product) {
//        for (int i = 0; i < product.getQuantity(); i++) {
//
//            product.setQuantity(product.getQuantity() + 1);
//        }
        listProduct.add(product);
    }
    public boolean searchProduct(Product product){
        return listProduct.contains(product);
    }
}
