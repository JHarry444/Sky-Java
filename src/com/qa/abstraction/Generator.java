package com.qa.abstraction;

public class Generator implements Refuelable {

    private int fuel;

    @Override
    public void refuel() {
        this.fuel = maxFuel;
    }

    @Override
    public void refuel(int fuel) {
        this.fuel += fuel;
        if (this.fuel > maxFuel) this.fuel = maxFuel;
    }

    @Override
    public String toString() {
        return "Generator{" +
                "fuel=" + fuel +
                '}';
    }
}
