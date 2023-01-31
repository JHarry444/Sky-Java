package com.qa.arrays;

import com.qa.oop.Person;

public class Runner {


    public static void main(String[] args) {
        int[] nums = new int[10];
        System.out.println(nums);

        for(int i = 0; i < nums.length; i++) {
            nums[i] = i * 2;
        }
        // for each num in nums
        for(int num : nums) {
            System.out.println(num);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + nums[i]);
        }

//        System.out.println(nums[999]); // there is no index 999 ao it breaks

        String[] names = { "Jordan", "Baz", "Steve", "Steve"};

        for (int i = 0; i < names.length; i++) System.out.println(i + ": " + names[i]);

        for (String name : names) System.out.println(name);

        Person[] people = {new Person("Jordan H", 28, 180), new Person("Nick", 26, 200)};

        for (int i = 0; i < people.length; i++) System.out.println(i + ": " + people[i]);

        for (Person p : people) {
            p.setAge(p.getAge() + 1);
            System.out.println(p);
        }

    }
}
