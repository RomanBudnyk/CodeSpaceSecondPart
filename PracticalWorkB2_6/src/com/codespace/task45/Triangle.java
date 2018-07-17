package com.codespace.task45;

public class Triangle extends Shape {
    private int a, b, c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", a = " + a +
                ", b = " + b +
                ", c = " + c;
    }

    @Override
    public double calcArea() {
        double halfPer = (a + b + c) / 2.0;
        return Math.sqrt(halfPer * (halfPer - a) * (halfPer - b) * (halfPer - c));
    }
}
