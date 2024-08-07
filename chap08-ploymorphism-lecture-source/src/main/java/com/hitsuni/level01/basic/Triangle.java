package com.hitsuni.level01.basic;

public class Triangle extends Shape implements Resizeable {

    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.base = 0.0;
        this.height = 0.0;
        this.side1 = 0.0;
        this.side2 = 0.0;
        this.side3 = 0.0;
    }

    public Triangle(int base, int height, int side1, int side2, int side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void resize(double factor) {
        base = base * factor;
        height = height * factor;
        side1 = side1 * factor;
        side2 = side2 * factor;
        side3 = side3 * factor;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
