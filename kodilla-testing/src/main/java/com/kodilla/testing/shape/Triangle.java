package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double triangleHeight;
    double triangleBase;

    public Triangle(double triangleHeight, double triangleBase) {
        this.triangleHeight = triangleHeight;
        this.triangleBase = triangleBase;
    }

    public String getShapeName() {
        return "triangle";
    }

    public double getField() {
        double field = (triangleBase * triangleHeight) /2;
        return field;
    }
}
