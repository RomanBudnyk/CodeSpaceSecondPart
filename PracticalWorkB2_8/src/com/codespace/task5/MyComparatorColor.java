package com.codespace.task5;

import java.util.Comparator;

public class MyComparatorColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Shape && o2 instanceof Shape)){
            System.err.println("Objects are not similar");
            System.exit(-1);
        }

        Shape shape1 = (Shape)o1;
        Shape shape2 = (Shape)o2;

        return shape1.getColor().compareTo(shape2.getColor());
    }
}
