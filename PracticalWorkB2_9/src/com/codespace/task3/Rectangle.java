package com.codespace.task3;

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
        return widht * height;
    }

    static Rectangle parseRectangle(String string) {
        String[] shapes = string.split(":", 3);
        if (!shapes[0].equals("") || Integer.parseInt(shapes[2].substring(0, shapes[2].indexOf(','))) < 0 ||
                Integer.parseInt(shapes[2].substring(shapes[2].lastIndexOf(',') + 1, shapes[2].length())) < 0) {
            throw new InvalidShapeStringException("Incorrect data");
        }
        return new Rectangle(shapes[1], Integer.parseInt(shapes[2].substring(0, shapes[2].indexOf(','))),
                Integer.parseInt(shapes[2].substring(shapes[2].lastIndexOf(',') + 1, shapes[2].length())));
    }
}
