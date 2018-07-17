package com.codespace.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Runner {
    public void run() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            arrayList.add("number_" + i);
        }
        System.out.println(arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            int x = (int) (Math.random() * 10);
            if (x <= i)
                linkedList.add(x, "num_" + i);
            else
                linkedList.add(i, "num_" + i);
        }

        System.out.println();
        System.out.println(linkedList);
        System.out.println();

        ListIterator<String> listIterator = arrayList.listIterator(arrayList.size() - 1);
        listIterator.next();

        for (int i = 0; i < linkedList.size() - 1; i += 2) {
            linkedList.add(i + 1, listIterator.previous());
        }
        System.out.println(linkedList);
    }
}
