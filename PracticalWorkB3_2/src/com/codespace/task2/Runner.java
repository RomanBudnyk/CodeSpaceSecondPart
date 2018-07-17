package com.codespace.task2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public void run() throws IOException {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.print("First name: ");
        user.setFirsName(scanner.nextLine());
        System.out.print("Second cname: ");
        user.setLastName(scanner.nextLine());
        System.out.print("Age: ");
        try{
            user.setAge(scanner.nextInt());
        } catch (InputMismatchException e){
            System.out.println("Wrong input!");
            System.exit(-1);
        }

        writeIntoFile(user.toString());
        printObject(user);
    }

    private void writeIntoFile(String s) throws IOException {
        RandomAccessFile file = new RandomAccessFile("user.txt", "rw");
        file.writeBytes(s);
    }

//    private void writeIntoFile(Object o) {
//        File file = new File("C:\\temp\\user.txt");
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
//            objectOutputStream.writeObject(o);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private void printObject(Object o) {
        System.out.println(o);
    }
}
