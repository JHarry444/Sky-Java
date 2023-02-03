package com.qa.io;

import java.io.*;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) throws Exception {
        String[] names = {"JH", "Piers", "Morgan", "Nick"};
        File file = new File("./names.txt");

//        if (!file.exists()) {
//            FileOutputStream fos = new FileOutputStream(file);
//            for (String name : names) {
//                byte[] bytes = name.getBytes();
//                System.out.println(Arrays.toString(bytes));
//                fos.write(bytes);
//            }
//        }

        if (!file.exists()) {
            PrintStream ps = new PrintStream(file);
            for (String name : names) {
                ps.println(name);
            }
            ps.close();
        }

        BufferedReader bf = new BufferedReader(new FileReader(file));

        bf.lines().forEach(line  -> System.out.println(line));

        bf.close();
    }
}
