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

package workB21P2;

import java.util.Scanner;

public class TaskB21P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double number = scanner.nextDouble();
        String string = encodingRealNumbers(number);
        System.out.println("Result is: " + string);
    }

    public static String encodingRealNumbers(double number) {
        String symbols = "abcdefghij";
        int sum = (int) number;
        String temp = "" + number;
        temp = temp.substring(temp.indexOf('.') + 1);
        sum += Integer.parseInt(temp);
        temp = sum + "";
        StringBuilder result = new StringBuilder();
        for (int pos = 0; pos < temp.length(); pos++) {
            char ch = temp.charAt(pos);
            int digit = ch - '0';
            ch = symbols.charAt(digit);
            result.append(ch);
        }
        return result.toString();
    }
}