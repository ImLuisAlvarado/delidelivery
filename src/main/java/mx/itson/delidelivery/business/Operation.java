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
    public static double shipping(int distance, int shippingPrice){
        if (distance < 5){
            return shippingPrice = 25;
        } else if (distance >= 5 && distance <7){
            return shippingPrice = 35;
        } else if (distance >= 7 && distance < 9){
            return shippingPrice = 55;
        } else if (distance >= 9 && distance <11){
            return shippingPrice = 75;
        } else if (distance >= 11 && distance < 13){
            return shippingPrice = 95;
        } else if (distance >= 13 && distance < 15){
            return shippingPrice = 120;
        }else{
            return shippingPrice = 10000000;}  
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
     * @return = The taxes(IVA) applied to the subtotal amount of money.
     */
    public static double iva(double subtotal){
        return subtotal * .16;
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
    public static double discountAmount(boolean discountTicket, double price){
        return discountTicket ? price * .20 : 0;
    }
    
    /**
     * 
     * @param subtotal = 
     * @return = The total that we as a company receive.
     */
    public static double commission(double subtotal){
        return subtotal*0.5;
    }
}


// Change discounTicket to discountCoupon.