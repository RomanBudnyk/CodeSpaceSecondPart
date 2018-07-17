package com.codespace.task1;

public class Runner {
    public void run() {
        Thread thread = new MyTimeBomb_1();
        thread.start();
        try {
            thread.join(); // main продолжит свою работу после того, как закончит работу thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new MyTimeBomb_2()).start();
    }
}
