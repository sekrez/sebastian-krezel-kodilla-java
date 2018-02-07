package com.kodilla.testing.shape;

public class Square implements Shape {
    double sideLenght;

    public Square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    public String getShapeName() {
        return "square";
    }

    public double getField() {
        double field = this.sideLenght * this.sideLenght;
        return field;
    }
}
