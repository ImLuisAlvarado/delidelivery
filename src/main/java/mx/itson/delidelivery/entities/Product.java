/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.delidelivery.entities;

/**
 * Represents a product entity
 * @author darkheaven
 */
public class Product {

    /**
     * Indicates whether the product has a discount ticket.
     * @return the discountTicket
     */
    public boolean isDiscountTicket() {
        return discountTicket;
    }

    /**
     * Sets whether the product has a discount ticket.
     * @param discountTicket the discountTicket to set
     */
    public void setDiscountTicket(boolean discountTicket) {
        this.discountTicket = discountTicket;
    }

    /** 
     * Gets the name of the product.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the quantity of the product.
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product.
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the price of the product.
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the products.
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    private String name;
    private int quantity;
    private double price;
    private boolean discountTicket;
}
