/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.delidelivery.entities;
import java.util.Date;
import java.util.List;

/**
 * Represents an order entity. 
 * An order contains information about products acquired, payment method, and status.
 * Each order is uniquely identified by an ID.
 * @author darkheaven
 */
public class Order {

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the payMethod
     */
    public String getPayMethod() {
        return payMethod;
    }

    /**
     * Sets the payment method of the order.
     * @param payMethod the payMethod to set
     */
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * Gets the list of products acquired in the order.
     * 
     * @return the productsAcquired
     */
    public List<Product> getProductsAcquired() {
        return productsAcquired;
    }

    /**
     * Sets the list of products acquired in the order.
     * @param productsAcquired the productsAcquired to set
     */
    public void setProductsAcquired(List<Product> productsAcquired) {
        this.productsAcquired = productsAcquired;
    }

    /**
     * Gets the ID of the order.
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the order.
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the status of the order.
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status of the order.
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    private String id;
    private Date date;
    private List<Product> productsAcquired;
    private String payMethod;
    private String status;

}
