package com.hitsuni.level01.basic;

public class Rectangle extends Shape implements Resizeable {

    private double width;
    private double height;

    public Rectangle() {
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double factor) {
        width = width * factor;
        height = height * factor;
    }

    @Override
    public double calculateArea() {
        return (width * height);
    }

    @Override
    public double calculatePerimeter() {
        return (2 * width) + (2 * height);
    }
}
