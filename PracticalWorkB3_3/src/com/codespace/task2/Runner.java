package com.codespace.task2;

import java.util.Arrays;
import java.util.Random;

public class Runner {
    public void run() {
        int[] myArray = createArray();
        System.out.println(Arrays.toString(myArray));
        MySumCount_1 mySumCount_1 = new MySumCount_1();
        mySumCount_1.setMyArray(myArray);
        mySumCount_1.setStartIndex(4);
        mySumCount_1.setStopIndex(10);
        mySumCount_1.start();
        try {
            mySumCount_1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum = " + mySumCount_1.getResultSum());


        System.out.println("===========================");
        MySumCount_2 mySumCount_2 = new MySumCount_2();
        mySumCount_2.setMyArray(myArray);
        mySumCount_2.setStartIndex(4);
        mySumCount_2.setStopIndex(10);
        Thread thread = new Thread(mySumCount_2);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum = " + mySumCount_2.getResultSum());

    }

    public int[] createArray() {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }
}
