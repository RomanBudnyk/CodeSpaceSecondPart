package com.codespace.task12;

public class Runner {
    public void run() {
        MyPhoneBook phoneBook = new MyPhoneBook();

        phoneBook.addPhoneNumber("Igor","677564");
        phoneBook.addPhoneNumber("Roman", "633231");
        phoneBook.addPhoneNumber("Ilona","986565");
        phoneBook.addPhoneNumber("Evgeniya","986565");
        phoneBook.addPhoneNumber("Bogdan","677564");
        phoneBook.addPhoneNumber("Victor", "633231");
        phoneBook.addPhoneNumber("Lena","986565");
        phoneBook.addPhoneNumber("Nastia","986565");
        phoneBook.addPhoneNumber("Sveta","986565");
        phoneBook.addPhoneNumber("Sergiy","986565");

        phoneBook.sortByName();
        phoneBook.printPhoneBook();

    }
}
