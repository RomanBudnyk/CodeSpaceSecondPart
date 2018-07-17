package com.codespace.task45;

public class Runner {
    public void run() {
        Shape[] shapes = createShapes();
        printShapes(shapes);

        System.out.println();
        System.out.println("Total area = " + totalCalcArea(shapes));

        double[] areas = eachTypeAre(shapes);
        System.out.println("Area Circle = " + areas[0]);
        System.out.println("Area Rectangle = " + areas[1]);
        System.out.println("Area Triangle = " + areas[2]);
//        System.out.println(shapes[0]);
//        shapes[0].info();
//        ((Circle)shapes[0]).info();
    }

    public Shape[] createShapes() {
        return new Shape[]{
                new Circle("Red", 5),
                new Rectangle("Black", 2, 3),
                new Rectangle("White", 4, 6),
                new Triangle("Yellow", 3, 4, 5),
                new Circle("Green", 9),
                new Rectangle("Brown", 4, 9),
                new Triangle("Lemon", 5, 11, 12),
                new Circle("Purple", 23),
                new Rectangle("Blue", 1, 7)
        };

    }

    public void printShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape + "     -> area = " + shape.calcArea());
        }
    }

    public double totalCalcArea(Shape[] shapes) {
        double result = 0.0;
        for (Shape shape : shapes) {
            result += shape.calcArea();
        }
        return result;
    }

    public double[] eachTypeAre(Shape[] shapes) {
        double[] areas = new double[3];
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                areas[0] += shape.calcArea();
            } else if (shape instanceof Rectangle) {
                areas[1] += shape.calcArea();
            } else if (shape instanceof Triangle) {
                areas[2] += shape.calcArea();
            }
        }
        return areas;
    }
}
