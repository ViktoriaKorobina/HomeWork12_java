package org.example;



public class Product {
    private double price;
    private CategoryProduct category;
    private int quantity;
    private String name;

    public Product(double price, CategoryProduct category, int quantity, String name) {
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public CategoryProduct getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "price=" + price +
                ", category=" + category +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                '}';
    }

    public void decreaseQuantity(int amount){
        this.setQuantity(this.getQuantity() - amount);
    }
    public void increaseQuantity(int amount){
        this.setQuantity(this.getQuantity() + amount);
    }
}
