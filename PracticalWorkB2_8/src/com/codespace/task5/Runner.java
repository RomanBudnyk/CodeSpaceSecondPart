package com.codespace.task5;

import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please, enter shape parameters here in such format name:color:parameters -> ");
//        String string = scanner.next();
        //1-5
//        Shape res = Shape.parseShape(string);
//        System.out.println(res);

        //6-8
        //Shape.parseShape(string);

        //9-11
        System.out.print("Please enter size of the matrix: ");
        int size = scanner.nextInt();
        Shape[] shapes = new Shape[size];
        System.out.println("Please start entering parameters of shapes:");
        for (int i = 0; i < shapes.length; i++) {
            String string = scanner.next();
            shapes[i] = Shape.parseShape(string);
        }

        printShapes(shapes);
    }

    void printShapes(Shape[] shapes) {
        System.out.println("--------------------------");
        System.out.println("Yours matrix of shapes is here. Enjoy!");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
