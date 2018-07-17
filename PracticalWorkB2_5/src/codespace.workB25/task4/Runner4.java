package codespace.workB25.task4;


import com.codespace.workB25.task4.calcarea.Calculate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner4 {
    public void run() {
        try {
            System.out.print("Enter the radius of the circle: ");
            Scanner scanner = new Scanner(System.in);
            double radius = scanner.nextDouble();
            double areaCircle = Calculate.areaCircle(radius);
            System.out.println("Area of the circle with inputted radius: " + areaCircle);
        } catch (InputMismatchException e) {
            System.out.println("Incorrect format!");
        }
        System.out.println("------------------------------------------");
        try {
            System.out.print("Enter the side of the square: ");
            Scanner scanner = new Scanner(System.in);
            int side = scanner.nextInt();
            int areaSquare = Calculate.areaSquare(side);
            System.out.println("Area of the square with inputted side: " + areaSquare);
        } catch (InputMismatchException e) {
            System.out.println("Incorrect format!");
        }
    }
}