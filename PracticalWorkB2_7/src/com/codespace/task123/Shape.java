package com.codespace.task123;

public abstract class Shape implements Drawable, Comparable, Cloneable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName() +
                ", color = " + color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcArea();

//    public static void info() {
//        System.out.println("Figure");
//    }


    @Override
    public void draw() {
        System.out.println(this + "; area = " + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Shape)){
            System.err.println("Wrong type of the object");
            System.exit(-1);
        }
        Shape other = (Shape)o;
        if (this.calcArea() < other.calcArea()) return -1;
        if (this.calcArea() > other.calcArea()) return 1;
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Shape other = (Shape) super.clone();
        other.setColor(new String(this.getColor()));
        return other;
    }
}
