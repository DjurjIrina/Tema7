package org.fasttrackit.tema7;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private String category;

    public Product(String name, int price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        boolean result = false;
        if (this.quantity != 0) {
            result = true;

        }
        return result;
    }

    public boolean isCategory(String category) {
        boolean result = true;
        if (this.category.equals( category != null)) {
            result = true;
        }

        return result;
    }
}

