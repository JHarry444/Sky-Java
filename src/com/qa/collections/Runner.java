package com.qa.collections;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        // list of integers
        List<Integer> nums  = new LinkedList<>();
        for (int i = 0; i < 10; i++ ) nums.add(i * 2);

        System.out.println(nums);

        System.out.println("2: " + nums.get(2));

        nums.remove(2);

        System.out.println(nums);

        System.out.println("index: " + nums.indexOf(10));

        Set<Character> chars = new HashSet<>();

        chars.add('a');
        chars.add('a');
        chars.add('a');
        chars.add('a');
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        System.out.println(chars);
        chars.remove('c');
        System.out.println(chars);


    }

}

