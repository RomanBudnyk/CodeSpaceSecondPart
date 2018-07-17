package com.codespace.task3;

public class Counter implements Runnable {
    private Storage storage;
    private int number;

    public Counter(Storage storage, int number) {
        this.storage = storage;
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (storage) {
            for (int i = 0; i < number; i++) {
                try {
                    while (storage.isFlag())
                        storage.wait();
                    storage.setMyNumber(i);
                    storage.setFlag(true);
                    storage.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
