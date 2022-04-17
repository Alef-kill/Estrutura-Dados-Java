/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package products;

import java.text.DecimalFormat;

/**
 *
 * @author Olafi
 */
public class Product {
    private String name;
    private double price;
    private int quantity;
    private String description;
    private double total;

    public Product(String name, double price, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.total = Double.parseDouble(new DecimalFormat("#.00").format(price * (quantity > 0 ? quantity : 1)).replaceAll(",", "."));
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    @Override
    public String toString() {
        return "Product{" + "name:" + name + ", price:" + price + ", quantity:" + quantity + ", description:" + description + ", total:" + total + '}';
    }
}
