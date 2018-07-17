package com.codespace.task2;

import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Enter persons first name: ");
        person.setFirstName(scanner.next());
        System.out.print("Enter persons last name: ");
        person.setLastName(scanner.next());
        System.out.print("Enter persons age: ");

        try {
            person.setAge(scanner.nextInt());
            System.out.println(person.toString());
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
