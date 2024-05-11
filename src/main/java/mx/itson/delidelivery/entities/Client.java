/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.delidelivery.entities;

/**
 * Represents a client entity
* @author darkheaven
 */
public class Client {

    /**
     * Gets the name of the client.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the client.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the address of the client.
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the client.
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the address references of the client.
     * @return the addressReferences
     */
    public String getAddressReferences() {
        return addressReferences;
    }

    /**
     * Sets the address references of the client.
     * @param addressReferences the addressReferences to set
     */
    public void setAddressReferences(String addressReferences) {
        this.addressReferences = addressReferences;
    }

    /**
     * Gets the phone number of the client.
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the client.
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the email address of the client.
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the email address of the client.
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    private String name;
    private String address;
    private String addressReferences;
    private String phoneNumber;
    private String emailAddress;
}
