package com.codespace.task3;

import java.util.Scanner;

public class Runner {
    public void run() {
        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addWords("cat","кот");
        myTranslator.addWords("dog","собака");
        myTranslator.addWords("cow","корова");
        myTranslator.addWords("says","говорит");
        myTranslator.addWords("meow","мяу");
        myTranslator.addWords("bow","гав");
        myTranslator.addWords("muu","муу");
        myTranslator.addWords("has","имеет");
        myTranslator.addWords("four","четыре");
        myTranslator.addWords("legs","ноги");
        myTranslator.addWords("two","два");
        myTranslator.addWords("eys","глаза");
        myTranslator.addWords("ears","уха");
        myTranslator.addWords("tail","хвост");
        myTranslator.addWords("one","один");

        System.out.println(myTranslator);
        System.out.print("Enter phrase in English: ");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();

        String translatedString = myTranslator.translate(phrase);
        System.out.print("Your translation into Russian: " + translatedString);
    }
}
