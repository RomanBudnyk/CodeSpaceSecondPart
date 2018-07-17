package com.codespace.task1;

import java.io.*;

public class Runner {
    public void run() throws IOException, ClassNotFoundException {
        Employee employee = new Employee();
        employee.setAddress("Address");
        employee.setName("Ivan");
        employee.setNumber(123322);
        employee.setSSN(222);
//        PrintWriter writer = new PrintWriter("employee.txt", "Unicode");
        File file = new File("C:\\temp\\employee.txt");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            objectOutputStream.writeObject(employee);
            employee = null;
            Employee employee1 = (Employee) objectInputStream.readObject();
            System.out.println(employee1);
        }
    }
}
