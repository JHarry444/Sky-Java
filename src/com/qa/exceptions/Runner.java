package com.qa.exceptions;

import com.qa.abstraction.Generator;
import com.qa.inheritance.derived.Car;

public class Runner {


    public static void main(String[] args)  {
        Generator g = new Generator();
        try {
            g.refuel( - 12);
        } catch (FuelAmountException e) {
            System.out.println("Invalid fuel amount");
        }
    }
}
