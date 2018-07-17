package com.codespace.task3;

public class Printer implements Runnable {
    private Storage storage;
    private int number;

    public Printer(Storage storage, int number) {
        this.storage = storage;
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (storage) {
            for (int i = 0; i < number; i++) {
                try {
                    while (!storage.isFlag())
                        storage.wait();
                    System.out.println(storage.getMyNumber());
                    storage.setFlag(false);
                    storage.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
