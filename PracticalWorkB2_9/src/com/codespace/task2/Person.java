package com.codespace.task2;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public void setAge(int age) throws InvalidAgeException {
        if (age > 120 || age < 1) {
            throw new InvalidAgeException("Age should be in a range from 1 to 120!");
        }
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person: " + "\n" +
                "First Name: " + firstName +
                ", Last Name: " + lastName +
                ", Age: " + age;
    }
}
