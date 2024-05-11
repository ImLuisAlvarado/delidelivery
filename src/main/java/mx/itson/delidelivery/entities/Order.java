/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.delidelivery.entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author darkheaven
 */
public class Order {

    /**
     * @return the payMethod
     */
    public String getPayMethod() {
        return payMethod;
    }

    /**
     * @param payMethod the payMethod to set
     */
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * @return the productsAcquired
     */
    public List<Product> getProductsAcquired() {
        return productsAcquired;
    }

    /**
     * @param productsAcquired the productsAcquired to set
     */
    public void setProductsAcquired(List<Product> productsAcquired) {
        this.productsAcquired = productsAcquired;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    private String id;
    public Date date;
    private List<Product> productsAcquired;
    private String payMethod;
    private String status;
}
