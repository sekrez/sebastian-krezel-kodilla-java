package com.kodilla.testing;

import com.kodilla.testing.Calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calTest = new Calculator(6, 4);

        Integer addResult = calTest.add();
        Integer subtractResult = calTest.subtract();

        if (addResult.equals(calTest.getA() + calTest.getB())) {
            System.out.println("Aadding test is correct");
        } else {
            System.out.println("Adding generate ERRORS!!!");
        }

        if (subtractResult.equals(calTest.getA() - calTest.getB())) {
            System.out.println("Subtracting test is correct");
        } else {
            System.out.println("Subtracting generate ERRORS!!!");
        }
    }
}