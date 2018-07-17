package com.codespace.task4;

public class Runner {
    public void run() {
//        Integer i1 = 100;
//        Integer i2 = new Integer(100);
//        Integer i3 = new Integer("100");
//        Integer i4 = Integer.valueOf(100);
//        Integer i5 = Integer.valueOf("100");
//        Integer i6 = Integer.valueOf("100",10);

        Integer i1 = 1000;
        Integer i2 = new Integer(1000);
        Integer i3 = new Integer("1000");
        Integer i4 = Integer.valueOf(1000);
        Integer i5 = Integer.valueOf("1000");
        Integer i6 = Integer.valueOf("1000",10);

        System.out.println("i1 == i2 -> " + (i1 == i2));
        System.out.println("i1 == i3 -> " + (i1 == i3));
        System.out.println("i1 == i4 -> " + (i1 == i4));
        System.out.println("i1 == i5 -> " + (i1 == i5));
        System.out.println("i1 == i6 -> " + (i1 == i6));
        System.out.println("i2 == i3 -> " + (i2 == i3));
        System.out.println("i2 == i4 -> " + (i2 == i4));
        System.out.println("i2 == i5 -> " + (i2 == i5));
        System.out.println("i2 == i6 -> " + (i2 == i6));
        System.out.println("i3 == i4 -> " + (i3 == i4));
        System.out.println("i3 == i5 -> " + (i3 == i5));
        System.out.println("i3 == i6 -> " + (i3 == i6));
        System.out.println("i4 == i5 -> " + (i4 == i5));
        System.out.println("i4 == i6 -> " + (i4 == i6));
        System.out.println("i5 == i6 -> " + (i5 == i6));
        System.out.println("--------------------------");
        System.out.println("i1 == i2 -> " + (i1.equals(i2)));
        System.out.println("i1 == i3 -> " + (i1.equals(i3)));
        System.out.println("i1 == i4 -> " + (i1.equals(i4)));
        System.out.println("i1 == i5 -> " + (i1.equals(i5)));
        System.out.println("i1 == i6 -> " + (i1.equals(i6)));
        System.out.println("i2 == i3 -> " + (i2.equals(i3)));
        System.out.println("i2 == i4 -> " + (i2.equals(i4)));
        System.out.println("i2 == i5 -> " + (i2.equals(i5)));
        System.out.println("i2 == i6 -> " + (i2.equals(i6)));
        System.out.println("i3 == i4 -> " + (i3.equals(i4)));
        System.out.println("i3 == i5 -> " + (i3.equals(i5)));
        System.out.println("i3 == i6 -> " + (i3.equals(i6)));
        System.out.println("i4 == i5 -> " + (i4.equals(i5)));
        System.out.println("i4 == i6 -> " + (i4.equals(i6)));
        System.out.println("i5 == i6 -> " + (i5.equals(i6)));
    }
}
