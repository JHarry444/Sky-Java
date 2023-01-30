package com.qa;

public class Person {

    private static final String latinName = "Homo Sapien";

    public static String getLatinName() {
//        System.out.println(name);
        return latinName;
    }

    // instance variables
    private int height;

    private int age;

    private final String name; // needs to be set here or in the constructor

    public Person() {
        this("John Smith", 45, 160); // constructor chaining
//        this.name = "John Smith";
//        this.age = 45;
//        this.height = 160;
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

//    public void setName(String name) { can't set cos it's final
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
