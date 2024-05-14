/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.delidelivery.business;

/**
 *
 * @author Aurelio
 */
public class Operation {
    
    
    /**
     * 
     * @param discountTicket = Determine if the customer has a discount coupon.
     * @param price = The price of the product.
     * @return = The cost of the products whether if it has discount or not.
     */
    public static double subtotal(boolean discountTicket, double price){
        double productSubtotal = discountTicket ? (price)-(price * 0.20) : price;
        return productSubtotal;
    }
   
    
    /**
     * 
     * @param distance = The distance our delivery driver has to travel.
     * @param shippingPrice = The cost of the shipping.
     * @return = The cost our customer has to pay accord to the distance our delivery driver has to travel.
     */
    public static int shipping(int distance){
        int distances[]={5,7,9,10,20,25};
        int shippingPrice[] = {25,35,55,75,95,120};
        for(int i = 0; i<distances.length; i++){
        if(distance <=distances[i]){
            return shippingPrice[i];
        }
    }return 500;
    }
    
    
    
    /**
     * 
     * @param subtotal = The cost of the products after discounts.
     * @param shipping = The cost of the shipping.
     * @return = The total the customer has to pay after taxes(IVA) and after the shipping cost.
     */
    public static double total(double subtotal,double iva, double shipping){
       return subtotal + iva + shipping;
    }
    
    
    /**
     * 
     * @param subtotal = The cost of the products after discounts.
     * @return = The taxes(IVA) applied to the subtotal amount of money and rounded them with de math.round method.
     */
    public static double iva(double subtotal){
        return Math.round((subtotal * .16) * 100.0) / 100.0;
    }

    
    /**
     * 
     * @param productSubtotal = The price of the product after discount.
     * @param quantity = The amount of the product the customer wants.
     * @return = the result of the multiplication between our product price after discounts with the amount of the same product the customer wants.
     */
    public static double productTotal(double productSubtotal, int quantity){
        return productSubtotal*quantity;
    }
    
    
    /**
     * @param discountTicket = Determine if the customer has a discount coupon.
     * @param price = The price of the product.
     * @return = The price of the product multiplying the percentage of the discount = (The discount amount).
     */
    public static double discountAmount(boolean discountTicket, double price, int quantity){
        return discountTicket ? (price * quantity)* .20 : 0;
    }
    
    
    /**
     * 
     * @param subtotal = 
     * @return = The total that we as a company receive.
     */
    public static double commission(double subtotal){
        return subtotal*0.15;
    }
}


// Change discounTicket to discountCoupon.