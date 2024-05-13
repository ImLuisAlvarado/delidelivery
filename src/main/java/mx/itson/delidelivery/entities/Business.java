/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.delidelivery.entities;


/**
 * Represent a business entity
 * @author darkheaven
 */
public class Business {

    /**
     * Gets the name of the business.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the business.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the address of the business.
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the business.
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the phone number of the business.
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the business.
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the email adress of the business.
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the email address of the business.
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    }
