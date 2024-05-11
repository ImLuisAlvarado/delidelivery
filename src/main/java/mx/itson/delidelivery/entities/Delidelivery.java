/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.delidelivery.entities;

import com.google.gson.Gson;

/**
 * Represent a Delidelivery entity.
 * 
 * Delidelivery is a class that encapsulates information about a delivery order.
 * It contains references to the business, client, and order associated with the delivery.
 * It also provides functionality to deserialize JSON data into Delidelivery objects.
 * 
 * @author darkheaven
 */
public class Delidelivery {

    /**
     * Gets the business associated with the delivery.
     * @return the business
     */
    public Business getBusiness() {
        return business;
    }

    /**
     * Sets the business associated with the delivery.
     * @param business the business to set
     */
    public void setBusiness(Business business) {
        this.business = business;
    }

    /**
     * Gets the client associated with the delivery.
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * Sets the client associated with the delivery.
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Gets the order associated with the delivery.
     * @return the order
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Sets the order associated with the delivery.
     * @param order the order to set
     */
    public void setOrder(Order order) {
        this.order = order;
    }
    private Business business;
    private Client client;
    private Order order;
    
     /**
     * Deserializes a JSON string into a Delidelivery object.
     * @param json the JSON string to deserialize
     * @return the deserialized Delidelivery object
     **/
    public Delidelivery deserialize (String json){
        Delidelivery delidelivery = new Delidelivery();
        try{
             delidelivery = new Gson().fromJson(json, Delidelivery.class);
        }catch(Exception ex){
            System.err.println("Couldn't deserialize because of an error"+(ex.getMessage()));
    }
        return delidelivery;
}
}