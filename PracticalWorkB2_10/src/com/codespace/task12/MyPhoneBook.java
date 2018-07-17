package com.codespace.task12;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
    private PhoneRecord[] phoneNumbers = new PhoneRecord[10];

    public void addPhoneNumber(String name, String phone){
        PhoneRecord record = new PhoneRecord(name, phone);
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

    public static class PhoneRecord {
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
                String name1 = ((PhoneRecord) o1).getName();
                String name2 = ((PhoneRecord) o2).getName();
                return name1.compareTo(name2);
            }
        });
    }
}
