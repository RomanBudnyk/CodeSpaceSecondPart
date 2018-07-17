package com.codespace.task12;

public class Runner {
    public void run() {
        //1
        Integer[] integers = {4, 5, -23, 43, 23, 0};
        Double[] doubles = {-3.54, 4.65, 4.23, 54.44, -45.3, -33.4};
        System.out.println("For ints -> " + MyTestMethod.<Integer>calcNum(integers, 0));
        System.out.println("For doubles -> " + MyTestMethod.<Double>calcNum(doubles, 0.0));

        //2
        System.out.println("-------------------------------------");
        System.out.println("Sum of ints = " + MyTestMethod.<Integer>calcSum(integers, 0));
        System.out.println("Sum for doubles = " + MyTestMethod.<Double>calcSum(doubles,0.0));
    }
}
