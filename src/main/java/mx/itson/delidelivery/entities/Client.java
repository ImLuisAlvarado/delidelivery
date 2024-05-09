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
     * @return the productsAdquired
     */
    public List<Product> getProductsAdquired() {
        return productsAdquired;
    }

    /**
     * @param productsAdquired the productsAdquired to set
     */
    public void setProductsAdquired(List<Product> productsAdquired) {
        this.productsAdquired = productsAdquired;
    }

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
     * @return the adress
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param adress the adress to set
     */
    public void setAddress(String adress) {
        this.address = adress;
    }

    /**
     * @return the adressReferences
     */
    public String getAddressReferences() {
        return addressReferences;
    }

    /**
     * @param adressReferences the adressReferences to set
     */
    public void setAddressReferences(String adressReferences) {
        this.addressReferences = adressReferences;
    }

    /**
     * @return the telephoneNumber
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * @param telephoneNumber the telephoneNumber to set
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    /**
     * @return the emailAdress
     */
    public String getEmailAdress() {
        return emailAdress;
    }

    /**
     * @param emailAdress the emailAdress to set
     */
    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
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
    public String isPayMethod() {
        return payMethod;
    }

    /**
     * @param payMethod the payMethod to set
     */
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }
    private List<Product> productsAdquired;
    private String name;
    private String address;
    private String addressReferences;
    private String telephoneNumber;
    private String emailAdress;
    private Date date;
    private String payMethod;
}
