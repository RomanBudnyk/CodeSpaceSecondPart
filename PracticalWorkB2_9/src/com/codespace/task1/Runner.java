package com.codespace.task1;

import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a here = ");
//        int a = scanner.nextInt();
//        System.out.print("Enter b here = ");
//        int b = scanner.nextInt();

        System.out.print("Enter a here = ");
        double a = scanner.nextDouble();
        System.out.print("Enter b here = ");
        double b = scanner.nextDouble();

//        try {
//            System.out.println("Result of the division = " + divisionInt(a, b));
//        } catch (ArithmeticException e) {
//            System.err.println("Argument is not correct!");
//        }

        try {
            System.out.println("Result of the division = " + divisionDouble(a, b));
        } catch (ArithmeticException e) {
            System.err.println("Argument is not correct!");
        }
    }


    public int divisionInt(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public double divisionDouble(double a, double b) throws ArithmeticException {
        double result =  Math.abs(a / b);
        if (b == 0.0){
            throw new ArithmeticException();
        }
        return result;
    }

//    public int divisionInt(int a, int b) {
//        int result = -1;
//        try {
//            result = Math.abs(a / b);
//
//        } catch (ArithmeticException e) {
//            System.err.print("Argument is not correct -> ");
//        }
//        return result;
//    }

//    public int divisionDouble(double a, double b) {
//        int result = -1;
//        try {
//            if (Double.compare(b, 0.0) == 0) {
//                throw new ArithmeticException();
//            }
//            result = Math.abs((int) (a / b));
//        } catch (ArithmeticException e) {
//            System.err.print("Argument is not correct -> ");
//        }
//        return result;
//    }
}
