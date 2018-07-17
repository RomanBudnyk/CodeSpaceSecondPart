package com.codespace.task3;

import java.util.Scanner;

public class Runner {
    public void run() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please, enter shape parameters here in such format name:color:parameters -> ");
            String string = scanner.next();
            Shape res = Shape.parseShape(string);
            System.out.println(res);
        } catch (InvalidShapeStringException e) {
            System.out.println(e.getMessage());
        }
    }
}
