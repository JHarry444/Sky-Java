package com.qa.abstraction;

public interface Refuelable {

    // implicitly public final
   int maxFuel = 40;
    void refuel(); // no access modifier or body

    void refuel(int fuel);
}
