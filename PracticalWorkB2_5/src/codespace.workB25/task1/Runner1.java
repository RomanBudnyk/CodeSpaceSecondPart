package codespace.workB25.task1;

import java.util.Scanner;

public class Runner1 {
    public void run () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter count of elements: ");
        int n = scan.nextInt();

        double pi = MyCalculate.calcPi(n);
        System.out.println("Number Pi = " + pi);
    }
}


