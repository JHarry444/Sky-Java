package com.qa.inheritance;

import com.qa.inheritance.base.Vehicle;
import com.qa.inheritance.derived.Car;
import com.qa.inheritance.derived.Lorry;
import com.qa.inheritance.derived.Plane;


public class Runner {

    public Runner() {
        super();
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle("", "", "", 0, 0);
        v.setColour("blue");
        System.out.println(v);
        v.honkHorn();
        Vehicle c = new Car("Red", false); // car UPCASTED to vehicle
//        c.setColour("red");
//        c.bootOpen = true;
//        c.honkHorn();
        c.honkHorn();
        Vehicle l = new Lorry("volvo", "fh90", "red and blue", 0, 2, true);
//        l.setColour("Read and blue");
//        l.trailerAttached = true;
        l.honkHorn();

        Vehicle[] vehicles = {c, l, new Plane("White", true)};

        for (Vehicle vehicle : vehicles) { // honks the horn and (if it's a car) opens the boot
            System.out.println(vehicle);

            vehicle.honkHorn();

            if (vehicle instanceof  Car) {
                Car c1 = (Car) vehicle;
                c1.setBootOpen(true);
            }
        }
    }
}
