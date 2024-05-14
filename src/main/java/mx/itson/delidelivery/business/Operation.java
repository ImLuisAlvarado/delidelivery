/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.delidelivery.business;

/**
 * Contains methods to perform operations related to a delivery service.
 * @author Aurelio
 */
public class Operation {
    
    
    /**
     * Calculates the subtotal cost of products, considering whether a discount coupon is applied.
     * @param discountTicket Determines if the customer has a discount coupon.
     * @param price The price of the product.
     * @return The cost of the products with or without discount.
     */
    public static double subtotal(boolean discountTicket, double price){
        double productSubtotal = discountTicket ? (price)-(price * 0.20) : price;
        return productSubtotal;
    }
   
    
   /**
    * Calculates the shipping cost based on the distance the delivery driver has to travel.
     * @param distance The distance our delivery driver has to travel.
     * @return The cost the customer has to pay according to the distance our delivery driver has to travel.
    */
    public static int shipping(int distance){
        // Predefined distance ranges and their corresponding shipping prices
        int distances[]={5,7,9,10,20,25};
        int shippingPrice[] = {25,35,55,75,95,120};
        
        // Iterate through the predefined distance ranges to find the corresponding shipping price
        for(int i = 0; i<distances.length; i++){
        if(distance <=distances[i]){
            return shippingPrice[i];
        }
    }return 500;
    }
    
    
    
    /**
     * Calculates the total cost the customer has to pay after taxes (IVA) and shipping costs.
     * @param subtotal The cost of the products after discounts.
     * @param iva The taxes (IVA) applied to the subtotal amount of money.
     * @param shipping The cost of shipping.
     * @return The total the customer has to pay after taxes (IVA) and shipping costs.
     */
    public static double total(double subtotal,double iva, double shipping){
       return subtotal + iva + shipping;
    }
    
    
   /**
     * Calculates the taxes (IVA) applied to the subtotal amount of money and rounds them.
     * @param subtotal The cost of the products after discounts.
     * @return The taxes (IVA) applied to the subtotal amount of money and rounded.
     */
    public static double iva(double subtotal){
        return Math.round((subtotal * .16) * 100.0) / 100.0;
    }

    
   /**
     * Calculates the total cost of a product after discounts multiplied by the quantity.
     * @param productSubtotal The price of the product after discount.
     * @param quantity The amount of the product the customer wants.
     * @return The result of the multiplication between our product price after discounts with the amount of the same product the customer wants.
     */
    public static double productTotal(double productSubtotal, int quantity){
        return productSubtotal*quantity;
    }
    
    
     /**
     * Calculates the discount amount based on whether the customer has a discount coupon.
     * @param discountTicket Determines if the customer has a discount coupon.
     * @param price The price of the product.
     * @param quantity The quantity of the product.
     * @return The price of the product multiplied by the discount percentage (The discount amount).
     */
    public static double discountAmount(boolean discountTicket, double price, int quantity){
        return discountTicket ? (price * quantity)* .20 : 0;
    }
    
    
    /**
     * Calculates the commission that the company receives.
     * @param subtotal The total amount received from the customer.
     * @return The total that we as a company receive.
     */
    public static double commission(double subtotal){
        return subtotal*0.15;
    }
}


// Change discounTicket to discountCoupon.