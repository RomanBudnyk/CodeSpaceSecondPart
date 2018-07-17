package com.codespace.task3;

import java.io.*;

public class User implements Externalizable {
    private String firsName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "firsName: " + firsName + ", lastName: " + lastName + ", age: " + age;
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(firsName);
        out.writeObject(lastName);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firsName = (String) in.readObject();
        lastName = (String) in.readObject();
        age = in.readInt();
    }
}
