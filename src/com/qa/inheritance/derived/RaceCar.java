package com.qa.inheritance.derived;

public class RaceCar extends Car{

    private boolean turbo;


    public RaceCar(String colour, boolean bootOpen, boolean turbo) {
        super(colour, bootOpen);
        this.turbo = turbo;
    }
}
