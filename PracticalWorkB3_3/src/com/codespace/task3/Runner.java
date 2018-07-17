package com.codespace.task3;

public class Runner {
    public void run() {
        Storage storage = new Storage();
        new Thread(new Counter(storage, 100)).start();
        new Thread(new Printer(storage, 100)).start();
    }
}
