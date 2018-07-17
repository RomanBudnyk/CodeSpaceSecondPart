package com.codespace.task2;

import java.util.*;

class MyNumGenerator {
    private int numOfElm, maxNumb;

    MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        count(list);
        return list;
    }

    Set<Integer> generateSet() {
        Set<Integer> set = new HashSet<>();
        //сделано с преподавателем. Бросить исключение, что нельзя создать коллекцию

        if (numOfElm > maxNumb) {
            throw new RuntimeException("");
        }
        count(set);
        return set;
    }

    private void count(Collection<Integer> collection) {
        for (int i = 0; i < numOfElm; i++) {
            int x = (int) (Math.random() * maxNumb);
            if (x <= maxNumb) {
                collection.add(x);
            } else {
                i--;
            }
        }
    }
}
