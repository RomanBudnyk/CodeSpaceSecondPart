package com.codespace.task3;

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
        if (!(o instanceof Shape)) {
            System.err.println("Wrong type of the object");
            System.exit(-1);
        }
        Shape other = (Shape) o;
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
    //1-5
//    static Shape parseShape(String string) {
//        String[] shapes = string.split(":", 3);
//        int figure = 0;
//        if (shapes[0].equalsIgnoreCase("Circle")){
//            figure = 1;
//        } else if (shapes[0].equalsIgnoreCase("Rectangle")){
//            figure = 2;
//        } else if (shapes[0].equalsIgnoreCase("Triangle")){
//            figure = 3;
//        } else {
//            System.out.println("No such figures here!");
//        }
//        switch (figure) {
//            case 1:
//                Circle circle = new Circle(shapes[1], Integer.parseInt(shapes[2]));
//                return circle;
//            case 2:
//                Rectangle rectangle = new Rectangle(shapes[1],Integer.parseInt(shapes[2].substring(0,shapes[2].indexOf(','))),
//                        Integer.parseInt(shapes[2].substring(shapes[2].lastIndexOf(',')+1,shapes[2].length())));
//                return rectangle;
//            case 3:
//                Triangle triangle = new Triangle(shapes[1],Integer.parseInt(shapes[2].substring(0,shapes[2].indexOf(','))),
//                        Integer.parseInt(shapes[2].substring(shapes[2].indexOf(',')+1,shapes[2].lastIndexOf(','))),
//                        Integer.parseInt(shapes[2].substring(shapes[2].lastIndexOf(',')+1,shapes[2].length())));
//                return triangle;
//            }
//
//        return null;
//    }

    //6-8
    static Shape parseShape(String string) throws InvalidShapeStringException {
        String[] shapes = string.split(":", 3);
        int figure = 0;
        if (shapes[0].equalsIgnoreCase("Circle")) {
            figure = 1;
        } else if (shapes[0].equalsIgnoreCase("Rectangle")) {
            figure = 2;
        } else if (shapes[0].equalsIgnoreCase("Triangle")) {
            figure = 3;
        }

        switch (figure){
            case 1:
                //System.out.println(Circle.parseCircle(string));break;
                return Circle.parseCircle(string);
            case 2:
                //System.out.println(Rectangle.parseRectangle(string));break;
                return Rectangle.parseRectangle(string);
            case 3:
                //System.out.println(Triangle.parseTriangle(string));
                return Triangle.parseTriangle(string);
            case 0:
                throw new InvalidShapeStringException("Wrong shape!");
        }
        return null;
    }
}
