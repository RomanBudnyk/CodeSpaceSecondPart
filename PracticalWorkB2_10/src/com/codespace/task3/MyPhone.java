package com.codespace.task3;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {
    MyPhoneBook phoneBook = new MyPhoneBook();

    public MyPhone() {
    }

    public class MyPhoneBook {
        private com.codespace.task12.MyPhoneBook.PhoneRecord[] phoneNumbers = new com.codespace.task12.MyPhoneBook.PhoneRecord[10];

        public void addPhoneNumber(String name, String phone){
            com.codespace.task12.MyPhoneBook.PhoneRecord record = new com.codespace.task12.MyPhoneBook.PhoneRecord(name, phone);
            for (int i = 0; i < phoneNumbers.length; i++) {
                if (phoneNumbers[i] == null) {
                    phoneNumbers[i] = record;
                    break;
                }
            }
        }

        public void printPhoneBook() {
            for (int i = 0; i < phoneNumbers.length ; i++) {
                if (phoneNumbers[i] == null) {
                    break;
                }
                System.out.println(phoneNumbers[i]);
            }
        }

        class PhoneRecord {
            String name, phone;
            public PhoneRecord(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "name: " + name +
                        ", phone: " + phone;
            }
            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public String getPhone() {
                return phone;
            }
            public void setPhone(String phone) {
                this.phone = phone;
            }
        }

        public void sortByName(){
            Arrays.sort(phoneNumbers, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    String name1 = ((com.codespace.task12.MyPhoneBook.PhoneRecord) o1).getName();
                    String name2 = ((com.codespace.task12.MyPhoneBook.PhoneRecord) o2).getName();
                    return name1.compareTo(name2);
                }
            });
        }

        void swichOn() {
            System.out.println("Loading PhoneBook records…");
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
            System.out.println("Loading is complete.");
        }
    }
}
