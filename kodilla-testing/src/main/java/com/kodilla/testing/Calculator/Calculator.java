package com.kodilla.testing.Calculator;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int add(){
        return a + b;
    }

    public int subtract(){
        return a - b;
    }

}
