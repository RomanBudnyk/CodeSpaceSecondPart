package com.codespace.task12;

public class MyTestMethod {
    public static <T extends Number> int calcNum(T[] array, T maxValue) {
        int count = 0;
        for (T element : array) {
            if (element.doubleValue() > maxValue.doubleValue()) {
                count++;
            }
        }
        return count;
    }

    public static <T extends Number> double calcSum(T[] array, T maxValue) {
        double sum = 0;
        for (T element : array) {
            if (element.doubleValue() > maxValue.doubleValue()) {
                sum += element.doubleValue();
            }
        }
        return sum;
    }
}
