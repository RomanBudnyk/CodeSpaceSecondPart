package com.codespace.task4;

public class Runner {
    public void run() {
        DiningHall d = new DiningHall();
        for (int i = 0; i < 10; i++) {
            d.makePizza();
        }
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread(new Student(d));
        }
        for (int i = 0; i < 20; i++) {
            threads[i].start();
        }

    }
}
