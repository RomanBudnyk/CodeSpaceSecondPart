package com.codespace.task123;

import java.util.Arrays;
import java.util.function.Predicate;

public class Runner {
    public void run() {
        Integer arr[] = createArrInt(20);
        Arrays.sort(arr, (x, y) -> y - x);
        System.out.println(Arrays.toString(arr));

        System.out.println("====================");

        String[] arrSt = createArrStr();
        Arrays.sort(arrSt, (String x, String y) -> y.compareTo(x));
        System.out.println(Arrays.toString(arrSt));

        System.out.println("====================");

        Predicate<Integer> predicate = (x) -> x % 2 == 0;
        int sum = sumEven(arr, predicate);
        System.out.println("Sum of even elements in the array = " + sum);

        System.out.println("====================");

        Predicate<String> stringPredicate = (x) -> x.charAt(0) == 'A';
        printStr(arrSt, stringPredicate);

        System.out.println("====================");
        MyConverter myConverter = x -> x.toUpperCase();
        updateList(arrSt, myConverter);
    }

    Integer[] createArrInt(int size) {
        Integer[] arr = new Integer[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (size + 1) - size / 2);
        }
        return arr;
    }

    private String[] createArrStr() {
        return new String[]{"Aaron", "Abigail", "Artur", "Benlamin", "Clementine", "Derek", "Ethan", "Fergie", "Gabriel", "Hercules", "Ion", "Jacob"};
    }

    private int sumEven(Integer[] arr, Predicate<Integer> predicate) {
        int sum = 0;
        for (Integer array : arr) {
            if (predicate.test(array)) {
                sum += array;
            }
        }
        return sum;
    }

    private void printStr(String[] strings, Predicate<String> predicate) {
        for (String s : strings) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }

    @FunctionalInterface
    public interface MyConverter {
        String convertStr(String str);

        static void isNull(String str) {
        }
    }

    private void updateList(String[] strings, MyConverter myConverter) {
        String[] strings1 = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            strings1[i] = myConverter.convertStr(strings[i]);
        }
        System.out.println(Arrays.toString(strings1));
    }
}
