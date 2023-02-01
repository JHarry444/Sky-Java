package com.qa.inheritance.derived;

import com.qa.inheritance.base.Vehicle;

public class Van extends Vehicle {

    private String styling;

    public Van(String make, String model, String colour, int speed, int numDoors, String styling) {
        super(make, model, colour, speed, numDoors);
        this.styling = styling;
    }


    @Override
    public float calcBill() {
        return styling.equals("sky") ? 100 : 50;
    }
}
