package com.qa.abstraction;

import com.qa.exceptions.FuelAmountException;

public interface Refuelable {

    // implicitly public final
   int maxFuel = 40;
    void refuel(); // no access modifier or body

    void refuel(int fuel) throws FuelAmountException;
}
