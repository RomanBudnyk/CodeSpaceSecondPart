package com.codespace.task1;

import static java.lang.Thread.sleep;

public class MyTimeBomb_2 implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("BOOOOOOOOOOOOOOM!!");
    }
}
