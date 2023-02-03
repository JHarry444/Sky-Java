package com.qa.io;

import java.io.*;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
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
            PrintStream ps = null;
            try {
                ps = new PrintStream(file);
                for (String name : names) {
                    ps.println(name);
                }
            } catch (FileNotFoundException fnfe) {
                System.out.println("File does not exist");
            } finally { // runs after the try/catch to close any opened resources
                ps.close();
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader(file))) { // auto closes the resource after the try/catch
            bf.lines().forEach(line -> System.out.println(line));
        } catch (FileNotFoundException fnfe) { // most specific to least specific
            System.out.println("File does not exist");
        } catch (IOException ioe) {
            System.out.println("oops");
        } catch (Exception e) {
            System.out.println("uh-oh");
        }
    }
}
