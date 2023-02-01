package com.qa.inheritance.derived;

import com.qa.inheritance.base.Vehicle;

public class Plane extends Vehicle {

    private boolean propeller;

    public Plane(String colour, boolean propeller) {
        super(colour);
        this.propeller = propeller;
    }

    @Override
    public void honkHorn() {
        System.out.println("nyooooooooooom");
    }


    @Override
    public float calcBill() {
        return isPropeller() ? 500 : 1_000;
    }

    public boolean isPropeller() {
        return propeller;
    }

    public void setPropeller(boolean propeller) {
        this.propeller = propeller;
    }
}
