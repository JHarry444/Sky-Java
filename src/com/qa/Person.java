package com.qa;

public class Person {

    // instance variables
    private int height;

    private int age;

    private String name;

    public Person() {
        super();
    }

    public Person(String name, int age, int height) {
        super();
        this.name = name;
        this.setAge(age);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 130 || age < 0) {
            System.out.println("Invalid age: " + age);
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
