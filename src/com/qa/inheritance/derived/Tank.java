package com.qa.inheritance.derived;

import com.qa.inheritance.base.Vehicle;

public class Tank extends Vehicle {


    public Tank(String colour) {
        super(colour);
    }

    @Override
    public void honkHorn() {
        System.out.println("braaaap");
    }

    @Override
    public float calcBill() {
        return 0;
    }
}
