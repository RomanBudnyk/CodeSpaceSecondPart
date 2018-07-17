package com.codespace.task2;


public class Runner {
    public void run() {
        MyNumGenerator myNumGenerator = new MyNumGenerator(5, 4);
        System.out.println(myNumGenerator.generateList());
        System.out.println(myNumGenerator.generateSet());
    }
}
