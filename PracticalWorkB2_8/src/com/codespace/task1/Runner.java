package com.codespace.task1;


import java.util.Scanner;

public class Runner {
    public void run() {
        DaysOfWeek[] days = DaysOfWeek.values();
        for (DaysOfWeek week : DaysOfWeek.values()) {
            System.out.println(week);
        }
        System.out.println("----------------------------");
        System.out.println("Java courses are going on such days:");
        for (DaysOfWeek day : days) {
            switch (day) {
                case TUESDAY:
                case THURSDAY:
                case SATURDAY:
                    System.out.println(day + ", ");
                    break;
                default:
                    System.out.println(day + " - NO");
            }
        }


        System.out.println("----------------------------");
        Scanner scanner = new Scanner(System.in);
        String  day = scanner.next();
        DaysOfWeek ofWeek = DaysOfWeek.valueOf(day.toUpperCase());
        System.out.println("The next day of  the week: " + ofWeek.nextDay());

    }


}
