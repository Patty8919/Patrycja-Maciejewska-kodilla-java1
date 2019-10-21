package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetExtra() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String extra = theOrder.getExtra();
        //Then
        assertEquals("Take a pizza", extra);
    }

    @Test
    public void testExtraCheeseeGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseeOrder(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(17), calculatedCost);
    }

    @Test
    public void testExtraCheeseeGetExtra() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseeOrder(theOrder);
        //When
        String extra = theOrder.getExtra();
        //Then
        assertEquals("Take a pizza + extra cheese", extra);
    }
    @Test
    public void testExtraHamGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraHamOrder(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(17), calculatedCost);
    }

    @Test
    public void testExtraHamGetExtra() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraHamOrder(theOrder);
        //When
        String extra = theOrder.getExtra();
        //Then
        assertEquals("Take a pizza + extra ham", extra);
    }
    @Test
    public void testExtraPepperoniGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraPepperoniOrder(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(18), calculatedCost);
    }

    @Test
    public void testExtraPepperoniGetExtra() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraPepperoniOrder(theOrder);
        //When
        String extra = theOrder.getExtra();
        //Then
        assertEquals("Take a pizza + extra pepperoni", extra);
    }

    @Test
    public void testNetworkOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new NetworkOrderDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testNetworkOrderGetExtra() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new NetworkOrderDecorator(theOrder);
        //When
        String extra = theOrder.getExtra();
        //Then
        assertEquals("Take a pizza by network", extra);
    }
    @Test
    public void testNetworkOrderWithExtraHamGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new NetworkOrderDecorator(theOrder);
        theOrder = new ExtraHamOrder(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(27), calculatedCost);
    }

    @Test
    public void testNetworkOrderWithExtraHamGetExtra() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new NetworkOrderDecorator(theOrder);
        theOrder = new ExtraHamOrder(theOrder);
        //When
        String extra = theOrder.getExtra();
        //Then
        assertEquals("Take a pizza by network + extra ham", extra);
    }

}
