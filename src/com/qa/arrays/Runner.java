package com.qa.arrays;

import com.qa.oop.Person;

public class Runner {


    public static void main(String[] args) {
        int[] nums = new int[10];
//        nums.equals();
        System.out.println(nums);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 2;
        }
        // for each num in nums
        for (int num : nums) {
            System.out.println(num);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + nums[i]);
        }

//        System.out.println(nums[999]); // there is no index 999 ao it breaks

        String[] names = {"Jordan", "Baz", "Steve", "Steve"};

        for (int i = 0; i < names.length; i++) System.out.println(i + ": " + names[i]);

        for (String name : names) System.out.println(name);

        Person[] people = {new Person("Jordan H", 28, 180), new Person("Nick", 26, 200)};

        for (int i = 0; i < people.length; i++) System.out.println(i + ": " + people[i]);

        for (Person p : people) {
            p.setAge(p.getAge() + 1);
            System.out.println(p);
        }

        String name = "Jordan";

        for (int i = 0; i < name.length(); i++) System.out.println(i + ": " + name.charAt(i));
        System.out.println(name.charAt(0));

        for (char c : name.toCharArray()) System.out.println(c);

        System.out.println("    Barry    ".trim());

        String fullName = "Jordan" + " " + "Harrison";
        System.out.println(fullName);

        StringBuilder sb = new StringBuilder();
        sb.append("Jordan");
        sb.append(" ");
        sb.append("Harrison");

        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb);

        System.out.println("STRING COMPARISON:");
        System.out.println("Jordan" == "Jordan");
        String s1 = "JORDAN";
        String s2 = "jordan".toUpperCase();
        System.out.println(s1 + " " + s2);
        System.out.println(s1.toLowerCase().toUpperCase() == s2);
        System.out.println("JORDAN".equals("JORDAN"));

        System.out.println(s1.equals(s2));

        System.out.println(new Person("Jordan", 28, 180) == new Person("Jordan", 28, 180));

        System.out.println(new Person("Jordan", 28, 180).equals(new Person("Jordan", 28, 180)));

        System.out.println(new Person("Jordan", 28, 180));

//        Double.POSITIVE_INFINITY
        Integer num = 12; // autoboxing
        int prim = 12;
        num = null;

        System.out.println(1.0 / 0);

        long l = 19234567789L;
        if (l <= Integer.MAX_VALUE) {
            int longAsInt = (int) l;
        }

        int i = (int) Long.MAX_VALUE;
        System.out.println("i: " + i);

        int parsed = Integer.parseInt("123");
        System.out.println(parsed);
    }
}
