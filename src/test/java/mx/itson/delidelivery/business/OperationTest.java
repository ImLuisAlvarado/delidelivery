/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.delidelivery.business;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USER
 */
public class OperationTest {
    
    public OperationTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of subtotal method, of class Operation.
     */
    @org.junit.jupiter.api.Test
    public void testSubtotal() {
        System.out.println("subtotal");
        boolean discountTicket = false;
        double price = 100.0; 
        double expResult = 100.0;
        double result = Operation.subtotal(discountTicket, price);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of shipping method, of class Operation.
     */
    @org.junit.jupiter.api.Test
    public void testShipping() {
        System.out.println("shipping");
        int distance = 7;
        int expResult = 35;
        int result = Operation.shipping(distance);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of total method, of class Operation.
     */
    @org.junit.jupiter.api.Test
    public void testTotal() {
        System.out.println("total");
        double subtotal = 100.0;
        double iva = 16.0;
        double shipping = 35.0;
        double expResult = 151.0;
        double result = Operation.total(subtotal, iva, shipping);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of iva method, of class Operation.
     */
    @org.junit.jupiter.api.Test
    public void testIva() {
        System.out.println("iva");
        double subtotal = 100.0;
        double expResult = 16.0;
        double result = Operation.iva(subtotal);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of productTotal method, of class Operation.
     */
    @org.junit.jupiter.api.Test
    public void testProductTotal() {
        System.out.println("productTotal");
        double productSubtotal = 80.0;
        int quantity = 3;
        double expResult = 240;
        double result = Operation.productTotal(productSubtotal, quantity);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of discountAmount method, of class Operation.
     */
    @org.junit.jupiter.api.Test
    public void testDiscountAmount() {
        System.out.println("discountAmount");
        boolean discountTicket = false;
        double price = 100.0;
        int quantity = 3;
        double expResult = 0.0;
        double result = Operation.discountAmount(discountTicket, price, quantity);
        assertEquals(expResult, result, 0.0);
      
    }

    /**
     * Test of commission method, of class Operation.
     */
    @org.junit.jupiter.api.Test
    public void testCommission() {
        System.out.println("commission");
        double subtotal = 100.0;
        double expResult =15.0;
        double result = Operation.commission(subtotal);
        assertEquals(expResult, result, 0);
     
    }
    
}
