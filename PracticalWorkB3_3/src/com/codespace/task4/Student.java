package com.codespace.task4;

import java.util.concurrent.Semaphore;

public class Student implements Runnable {
    private DiningHall diningHall;
    private Semaphore semaphore;
//    Lock lock = new ReentrantLock();


    public Student(DiningHall diningHall) {
        this.diningHall = diningHall;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        synchronized (diningHall) {
            diningHall.servePizza();
        }
    }
}
