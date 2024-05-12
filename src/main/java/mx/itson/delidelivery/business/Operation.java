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
    
    public static double subtotal(boolean discountTicket, double price){
        double productSubtotal = discountTicket ? (price)-(price * 0.20) : price;
        return productSubtotal;
    }
    public static double total(double subtotal){
       return subtotal * .16;
    }
    public static double productTotal(double productSubtotal, int quantity){
        return productSubtotal*quantity;
    }
    public static double comision(double subtotal){
        return subtotal*0.5;
    }
//int quantity
    //String productName
    //double productPrice
    //
    //boolean or String discountTicket
    //
    //if (discountTicket == False){int iva = ((quantity * productPrice)* .16)
    // }else {int iva = (((quantity * productPrice) - ((quantity * productPrice) * .20) * .16)
    //
    //double total == (quantity * productPrice) - iva
    //double totalWithDiscount == ((quantity * productPrice) - ((quantity * productPrice) * .20) - iva
    //(discountTicket == True or certain String value) ? totalWithDiscount : total;
    //
}
