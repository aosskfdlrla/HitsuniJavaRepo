package com.hitsuni.level01.basic;

public class Circle extends Shape implements Resizeable {

    private double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void resize(double factor) {
        radius = (radius * factor);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
