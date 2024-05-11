/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.delidelivery.entities;

import com.google.gson.Gson;

/**
 *
 * @author darkheaven
 */
public class Delidelivery {

    /**
     * @return the business
     */
    public Business getBusiness() {
        return business;
    }

    /**
     * @param business the business to set
     */
    public void setBusiness(Business business) {
        this.business = business;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the order
     */
    public Order getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Order order) {
        this.order = order;
    }
    private Business business;
    private Client client;
    private Order order;
    
    
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