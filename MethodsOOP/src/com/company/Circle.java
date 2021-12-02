package com.company;

public class Circle extends Shapes{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(100.00);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double draw() {
        return 0;
    }
}
