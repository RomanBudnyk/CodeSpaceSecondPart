//        1. Создайте проект PracticalWorkB2-1 с пакетом workB21P1, в котором
//        создайте класс TaskB21P1.
//        2. Добавьте в класс TaskB21P1 метод public static int
//        convertHexToDecimal(String number), который получает целое
//        положительное число number в шестнадцатеричной системе счисления в
//        виде строки символов, преобразует его в десятичное число, которое и
//        возвращает.
//        3. Добавьте в класс TaskВ21Р1 метод public static void main(String[] args),
//        который вводит строку символов, представляющую число в
//        шестнадцатеричной системе счисления и выводит результат его обработки
//        методом convertHexToDecimal().
//        4. Запустите приложение на исполнение.

package workB21P1;

import java.util.Scanner;

public class TaskB21P1 {
    static String digits = "0123456789abcdef";
    static final int BASE = 16;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        String number = scanner.next().toLowerCase();
        if (validateNumber(number)) {
            int convertedNumber = convertHexToDecimal(number);
            System.out.println("Result: " + convertedNumber);
        } else {
            System.out.println("Invalid string!");
        }
    }

    public static int convertHexToDecimal(String number) {
        int result = 0;
        for (int position = number.length() - 1; position >= 0; position--) {
            int degree = number.length() - 1 - position;
            char ch = number.charAt(position);
            int value = digits.indexOf(ch);
            result += (int) (value * Math.pow(BASE, degree));
        }
        return result;
    }

    public static boolean validateNumber(String number) {
        for (int pos = 0; pos < number.length(); pos++) {
            if (digits.indexOf(number.charAt(pos)) == -1)
                return false;
        }
        return true;
    }
}
