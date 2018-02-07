package com.kodilla.testing.shape;


import java.util.ArrayList;

class ShapeCollector {
   ArrayList<Shape> shapeCollection = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeCollection.contains(shape)) {
            shapeCollection.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape shape = null;
        if (n >= 0 && n < shapeCollection.size()) {
            shape = shapeCollection.get(n);}
        return shape;
    }

    public void showFigures(){
        //Shape shape
        if (shapeCollection.size() >= 1) {
            for(Shape shape : shapeCollection) {
                System.out.println(shape.getShapeName());
            }
        } else {System.out.println("I have noting to show");}
    }
}
