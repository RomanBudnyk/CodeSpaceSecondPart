package com.codespace.task3;

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
        return Math.PI * Math.pow(radius, 2);
    }

    public static void info() {
        System.out.println("Figure = circle");
    }

    static Circle parseCircle(String string) {
        String[] shapes = string.split(":", 3);
        if ((shapes[1].equals("")) || Integer.parseInt(shapes[2]) < 0) {
            throw new InvalidShapeStringException("Incorrect data");
        }
        return new Circle(shapes[1], Integer.parseInt(shapes[2]));
    }
}
