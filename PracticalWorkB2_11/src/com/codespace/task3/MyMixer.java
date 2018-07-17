package com.codespace.task3;

import java.util.Arrays;
import java.util.Random;

public class MyMixer<T> {
    T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "MyMixer" +
                " array = " + (array == null ? null : Arrays.asList(array));
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomPosition = random.nextInt(array.length);
            T temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;

//            for (int j = array.length-1; j >= 0 ; j--) {
//                T temp =  array[i];
//                array[j] = array[i];
//                array[j] = temp;
//            }

        }
        for (T t : array) {
            System.out.print(t + " ");
        }



    }
}
