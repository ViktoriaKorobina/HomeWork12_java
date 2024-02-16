package org.example;

public class CategoryProduct implements Category {
    private String category;

    public CategoryProduct(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category='" + category + '\'' +
                '}';
    }
}
