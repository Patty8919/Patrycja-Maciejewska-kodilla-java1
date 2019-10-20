package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int result = calculator.add(20, 5);

        if (result == 25){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int result1 = calculator.subtract(20, 5);

        if (result1 == 15){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}
