package com.codespace.task123;

import java.util.Arrays;

public class Runner {
    public void run() throws CloneNotSupportedException {
        //1 & 2
        Shape[] shape = createShapes();
        printShapes(shape);
        // 3
        System.out.println("----------------------------");
        Shape rect1 = new Rectangle("Red", 5, 6);
        Shape rect2 = new Rectangle("Blue", 5, 6);
        if (rect1.compareTo(rect2) > 0) {
            System.out.println("rectangle1 > rectangle2");
        } else if (rect1.compareTo(rect2) < 0) {
            System.out.println("rectangle1 < rectangle2");
        } else {
            System.out.println("rectangle1 = rectangle2");
        }

        Arrays.sort(shape);
        System.out.println("----------------------------");
        printShapes(shape);

        //4
        System.out.println("----------------------------");
        Arrays.sort(shape, new MyComparatorColor());
        printShapes(shape);

        System.out.println("----------------------------");
        System.out.println(new MyComparatorColor().compare(shape[2], shape[4]));
        //clonning
        System.out.println("----------------------------");

        Circle circle = new Circle("Red", 3);
        Circle object = (Circle) circle.clone();
        System.out.println("First object: " + circle);
        System.out.println("Second object: " + object);
        System.out.println(circle.equals(object));
        System.out.println(circle.getColor() == object.getColor());
        System.out.println(circle.getColor().equals(object.getColor()));
//        object.setColor("Brown");
//        System.out.println();
//        System.out.println("First object: " + circle);
//        System.out.println("Second object: " + object);
    }

    public Shape[] createShapes() {
        return new Shape[]{
                new Circle("Red", 5),
                new Rectangle("Black", 2, 3),
                new Rectangle("White", 4, 6),
                new Triangle("Yellow", 3, 4, 5),
                new Triangle("Blue", 6, 7, 10),
                new Circle("Green", 9),
                new Rectangle("Brown", 4, 9),
                new Triangle("Lemon", 5, 11, 12),
                new Circle("Purple", 23),
                new Rectangle("Blue", 1, 7)
        };
    }

    public void printShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            //1
//            System.out.println(shape + "     -> area = " + shape.calcArea());
            //2
            shape.draw();
        }
    }
}
