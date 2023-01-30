package com.qa;

public class Runner {


    public static void main(String[] args) {
        int i;
//        System.out.println(i);

        String s = null;
//        s = s.toLowerCase();
        System.out.println(s);
        Person p1 = new Person();
        p1.setAge(42);
        p1.setAge(Integer.MIN_VALUE);
        System.out.println("AGE:" + p1.getAge());
        p1.setAge(Integer.MAX_VALUE);
        System.out.println("AGE:" + p1.getAge());
        Person p = new Person("Jordan", 28, 180);


    }
}
