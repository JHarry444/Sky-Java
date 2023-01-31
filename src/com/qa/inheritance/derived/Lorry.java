package com.qa.inheritance.derived;

import com.qa.inheritance.base.Vehicle;

public class Lorry extends Vehicle {

    public boolean trailerAttached;

    public Lorry(String make, String model, String colour, int speed, int numDoors, boolean trailerAttached) {
        super(make, model, colour, speed, numDoors);
        this.trailerAttached = trailerAttached;
    }

    @Override
    public void honkHorn() {
        System.out.println("HOOOOOOOOOOONK");
    }
}
