package org.example;

import java.util.List;

public class OrderProduct implements Order {
    public Warehouse warehouse;
    @Override
    public void processOrder(List<Product> productList) {
        for (Product product: productList){
            if (warehouse.searchProduct(product)) {
                warehouse.remove(product, 1);
                //product.setQuantity(product.getQuantity() - 1);
            } else {
                System.out.println("Товара " + product.getName() + " нет на складе");
            }
        }
    }

    public OrderProduct(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
