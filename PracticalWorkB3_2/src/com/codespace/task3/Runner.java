package com.codespace.task3;

import java.io.*;

public class Runner {
    public void run() throws IOException, ClassNotFoundException {
        User[] users = new User[]{new User("Roman", "Budnyk", 26),
                new User("Sidorov", "Petr", 22)};
        File file = new File("C:\\temp\\usersfortask3.txt");
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream is = new ObjectInputStream(new FileInputStream(file))) {
            os.writeObject(users);
            User[] us = (User[]) is.readObject();
            for (User user : us) {
                System.out.println(user);
            }
        }
    }
}
