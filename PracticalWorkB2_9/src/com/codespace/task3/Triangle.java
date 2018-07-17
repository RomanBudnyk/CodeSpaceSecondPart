package com.codespace.task3;

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

    static Triangle parseTriangle(String string) {
        String[] shapes = string.split(":", 3);
        if (!shapes[0].equals("Triangle") ||
                Integer.parseInt(shapes[2].substring(shapes[2].indexOf(',') + 1, shapes[2].lastIndexOf(','))) < 0 ||
                (Integer.parseInt(shapes[2].substring(shapes[2].lastIndexOf(',') + 1))) < 0 ||
                Integer.parseInt(shapes[2].substring(shapes[2].lastIndexOf(',') + 1, shapes[2].length())) < 0) {
            throw new InvalidShapeStringException("Incorrect data");
        }
        return new Triangle(shapes[1], Integer.parseInt(shapes[2].substring(0, shapes[2].indexOf(','))),
                Integer.parseInt(shapes[2].substring(shapes[2].indexOf(',') + 1, shapes[2].lastIndexOf(','))),
                Integer.parseInt(shapes[2].substring(shapes[2].lastIndexOf(',') + 1, shapes[2].length())));
    }
}
