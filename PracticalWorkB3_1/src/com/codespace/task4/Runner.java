package com.codespace.task4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Runner {
    public void run() throws IOException {
        AccountingUser accountingUser = new AccountingUser();
        System.out.print("Write student's name: ");
        Scanner scanner = new Scanner(System.in);
        accountingUser.addUsers(scanner.nextLine());
        accountingUser.printFile();
        accountingUser.finalaze();
    }

    class AccountingUser {
        private RandomAccessFile file = new RandomAccessFile("C:\\temp\\users.txt", "rw");

        AccountingUser() throws FileNotFoundException {
        }


        void addUsers(String nameUser) {
            String[] names = nameUser.split("[, ]+");
            try {
                for (String nameUser1 : names) {
                    file.seek(0);
                    long positionOfCoursour = 0;
                    toStopThis:
                    for (int i = 0; i < file.length(); i++) {
                        String s = file.readLine();
                        if (s != null && !s.equals("")) {
                            String[] strings = s.split(":");
                            positionOfCoursour += s.length() + 2;
                            int numberOfDigits = strings[1].length();
                            switch (numberOfDigits) {
                                case 1:
                                    if (strings[0].equals(nameUser1)) {
                                        file.seek(positionOfCoursour - 3);
                                        int incr = Integer.parseInt(strings[1]) + 1;
                                        file.writeBytes(incr + "");
                                        break toStopThis;
                                    } else if (positionOfCoursour > file.length()) {
                                        file.seek(file.length());
                                        int initial = 1;
                                        file.writeBytes(System.lineSeparator() + nameUser1 + ":" + initial);
                                    }
                                    break;
                                case 2:
                                    if (strings[0].equals(nameUser1)) {
                                        file.seek(positionOfCoursour - 4);
                                        int incr = Integer.parseInt(strings[1]) + 1;
                                        file.writeBytes(incr + "");
                                        break toStopThis;
                                    } else if (positionOfCoursour > file.length()) {
                                        file.seek(file.length());
                                        int initial = 1;
                                        file.writeBytes(System.lineSeparator() + nameUser1 + ":" + initial);
                                    }
                                    break;
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        void printFile() {
            try {
                file.seek(0);
                System.out.println("===================");
                System.out.println("Result in the file:");
                for (int i = 0; i < file.length(); i++) {

                    String s = file.readLine();
                    if (s != null && !s.equals("")) {
                        System.out.println(s);
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        void finalaze() throws IOException {
            file.close();
        }
    }
}