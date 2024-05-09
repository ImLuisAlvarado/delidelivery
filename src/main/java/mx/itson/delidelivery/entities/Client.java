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
public class Client {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the addressReferences
     */
    public String getAddressReferences() {
        return addressReferences;
    }

    /**
     * @param addressReferences the addressReferences to set
     */
    public void setAddressReferences(String addressReferences) {
        this.addressReferences = addressReferences;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

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

    private String name;
    private String address;
    private String addressReferences;
    private String phoneNumber;
    private String emailAddress;
    private Date date;
    private String payMethod;
    private List<Product> productsAcquired;
}
