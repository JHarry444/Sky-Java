package com.qa.oop;

public class Runner {


    public static void main(String[] args) {
        int i;
//        System.out.println(i);

        String s = null;
//        s = s.toLowerCase();
        System.out.println(s);
        Person p1 = new Person();
//        new Person()
        p1.setAge(42);
        p1.setAge(Integer.MIN_VALUE);
        System.out.println("AGE:" + p1.getAge());
        p1.setAge(Integer.MAX_VALUE);
        System.out.println("AGE:" + p1.getAge());

        int k = 12;
        k++;
        k = 24;

        Person p = new Person("Jordan", 28, 180);
//        Person p2 = p;
//        p2 = null;
        System.out.println("p1: " + p);
        pbv(p);
        System.out.println("age: " + p.getAge());
        System.out.println("p3: " + p);

        final Person clone =  new Person("Jordan", 28, 180);
//        clone.setName("Dave");
        final double PI = 3.142;
//        PI = 999; cannot be reassigned
        new Person();
        System.out.println(p == clone);
        System.out.println(p);
        System.out.println(clone);

//        System.out.println(p.latinName);
//
//        System.out.println(p1.latinName);
//
//        p.latinName = "Homo Superior";
//        System.out.println(p.latinName);
//
//        System.out.println(p1.latinName);
        System.out.println(Person.getLatinName());
    }

    private static Person pbv(Person person) {
        person.setAge(99);
        person = null;
        System.out.println("p2: " + person);
        return person;
    }
}
