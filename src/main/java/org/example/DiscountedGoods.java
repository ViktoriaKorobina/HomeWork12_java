package org.example;

public class DiscountedGoods extends Product{
    private String damage;

    public DiscountedGoods(double price, CategoryProduct category, int quantity, String name, String damage) {
        super(price, category, quantity, name);
        this.damage = damage;
    }
}
