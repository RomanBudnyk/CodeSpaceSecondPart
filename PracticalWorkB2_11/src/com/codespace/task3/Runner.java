package com.codespace.task3;

public class Runner {
    public void run() {
        Integer[] integers = {12, 22, 32, 42, 52, 62};
        String[] strings = {"one", "two", "three", "four", "five", "six"};

        MyMixer myMixerIntegers = new MyMixer<Integer>(integers);
        myMixerIntegers.shuffle();

        System.out.println();

        MyMixer myMixerSrings = new MyMixer<String>(strings);
        myMixerSrings.shuffle();

        System.out.println("\n");
        System.out.println(myMixerIntegers);
        System.out.println(myMixerSrings);
    }
}
