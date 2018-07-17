package com.codespace.task45;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public static void info() {
        System.out.println("Figure = circle");
    }
}
