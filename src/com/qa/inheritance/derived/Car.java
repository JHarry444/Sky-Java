package com.qa.inheritance.derived;

import com.qa.inheritance.base.Vehicle;

public class Car  extends Vehicle {

    private boolean bootOpen;


    public Car(String colour, boolean bootOpen) {
        super(colour);
        this.bootOpen = bootOpen;
    }

    public Car(String make, String model, String colour, boolean bootOpen) {
//        this.setColour("Pink");
        super(make, model, colour, 0, 4);
        this.bootOpen = bootOpen;
    }

    @Override
    public void honkHorn() {
        System.out.println("Beep beep");
    }

    public boolean isBootOpen() {
        return bootOpen;
    }

    public void setBootOpen(boolean bootOpen) {
        this.bootOpen = bootOpen;
    }

    @Override
    public float calcBill() {
        float cost  = 0;
        cost += super.calcBill();
        cost += isBootOpen() ? 100 : 50;
        return cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + super.getMake() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", colour='" + super.getColour() + '\'' +
                ", speed=" + super.getSpeed() +
                ", numDoors=" + getNumDoors() +
                ", bootOpen=" + bootOpen +
                '}';
    }
}
