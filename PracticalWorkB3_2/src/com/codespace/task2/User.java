package com.codespace.task2;

import java.io.Serializable;

public class User implements Serializable {
    private String firsName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "User: " + "firsName: " + firsName + ", lastName: " + lastName + ", age: " + age;
    }

    public User() {
    }

    public User(String firsName, String lastName, int age) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
