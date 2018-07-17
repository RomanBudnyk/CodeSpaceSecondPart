package com.codespace.task123;

public class Rectangle extends Shape {
    private int widht, height;

    public Rectangle(String color, int widht, int height) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", widht = " + widht +
                ", height = " + height;
    }

    @Override
    public double calcArea() {
        return widht*height;
    }
}
