package com.qa.inheritance.derived;

import com.qa.inheritance.base.Vehicle;

public class Lorry extends Vehicle {

    private boolean trailerAttached;

    public Lorry(String make, String model, String colour, int speed, int numDoors, boolean trailerAttached) {
        super(make, model, colour, speed, numDoors);
        this.trailerAttached = trailerAttached;
    }

    @Override
    public float calcBill() {
       return trailerAttached ? 10_000 * this.getNumDoors(): 1_000;
    }

    public boolean isTrailerAttached() {
        return trailerAttached;
    }

    public void setTrailerAttached(boolean trailerAttached) {
        this.trailerAttached = trailerAttached;
    }

    @Override
    public void honkHorn() {
        System.out.println("HOOOOOOOOOOONK");
    }
}
