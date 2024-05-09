/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.delidelivery.entities;

import java.util.Date;

/**
 *
 * @author darkheaven
 */
public class Client {

    /**
     * @return the productsAdquired
     */
    public Product getProductsAdquired() {
        return productsAdquired;
    }

    /**
     * @param productsAdquired the productsAdquired to set
     */
    public void setProductsAdquired(Product productsAdquired) {
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
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the adressReferences
     */
    public String getAdressReferences() {
        return adressReferences;
    }

    /**
     * @param adressReferences the adressReferences to set
     */
    public void setAdressReferences(String adressReferences) {
        this.adressReferences = adressReferences;
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
    private Product productsAdquired;
    private String name;
    private String adress;
    private String adressReferences;
    private String telephoneNumber;
    private String emailAdress;
    private Date date;
    private String payMethod;
}
