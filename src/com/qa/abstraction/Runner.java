package com.qa.abstraction;

import com.qa.inheritance.base.Vehicle;
import com.qa.inheritance.derived.Car;

import java.sql.Ref;

public class Runner {

    public static void main(String[] args) {
        Refuelable r1 = new Generator();
        Refuelable r2 = new Car("blue", true);

        Refuelable[] inventory = {r1, r2};

        for (Refuelable r : inventory) {
            r.refuel();
            if (r instanceof Vehicle) ((Vehicle) r).calcBill();
        }
    }
}
