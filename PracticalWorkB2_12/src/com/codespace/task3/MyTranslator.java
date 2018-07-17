package com.codespace.task3;

import java.util.HashMap;

public class MyTranslator {
    private HashMap<String, String> voc = new HashMap<>();

    @Override
    public String toString() {
        return "voc: " + voc;
    }

    MyTranslator() {
    }

    void addWords(String a, String b) {
        voc.put(a, b);
    }

    String translate(String toTranslate) {
        String[]res = toTranslate.split("[ ,/*+]+");
        StringBuilder finals = new StringBuilder();
        for (String result : res) {
            finals.append(voc.getOrDefault(result, result)).append(" ");
        }
        return finals.toString();
    }

//    void translate(String toTranslate) {
//        String[]res = toTranslate.split("[ ,]+");
//        for (int i = 0; i < res.length ; i++) {
//            if (voc.containsKey(res[i])) {
//                System.out.print(voc.get(res[i]) + " ");
//            } else {
//                System.out.print(res[i] + " ");
//            }
//        }
//    }
}
