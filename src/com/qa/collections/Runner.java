package com.qa.collections;

import com.qa.oop.Person;

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

        List<Integer> randNums = new ArrayList<>(List.of(13, 34, 6, 45, 7, 34, 56));
        System.out.println(randNums);
        randNums.add(99);

        Collections.sort(randNums);
        System.out.println(randNums);

        List<Person> people = new ArrayList<>(List.of(
                new Person("JH", 28, 180),
                new Person("CP", 29, 140),
                new Person("AS", 24, 150))
        );

        System.out.println(people);


        Collections.sort(people);

        System.out.println(people);

        Map<String, Person> peopleMap = new HashMap<>();

        peopleMap.put("JH", new Person("JH", 28, 180));
        peopleMap.put("PB", new Person("PB", 22, 190));

        System.out.println(peopleMap.get("PB"));
    }

}

