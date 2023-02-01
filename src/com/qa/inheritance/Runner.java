package com.qa.inheritance;

import com.qa.inheritance.base.Vehicle;
import com.qa.inheritance.derived.Car;
import com.qa.inheritance.derived.Lorry;
import com.qa.inheritance.derived.Plane;
import com.qa.inheritance.derived.Van;


public class Runner {

    public Runner() {
        super();
    }
    public static void main(String[] args) {
//        Vehicle v = new Vehicle(); can't be done as class is abstract

        Vehicle c = new Car("Red", false); // car UPCASTED to vehicle

        Vehicle l = new Lorry("volvo", "fh90", "red and blue", 0, 2, true);

        Vehicle[] vehicles = {c, l, new Plane("White", true), new Van("Ford", "Connect", "White", 0, 4, "sky")};

        float totalBill = 0;
        for (Vehicle vehicle : vehicles) { // honks the horn and (if it's a car) opens the boot
            System.out.println(vehicle);
            vehicle.honkHorn();

            totalBill += vehicle.calcBill();
        }


        System.out.println("Total bill: " + totalBill);
    }


//    public Vehicle recommendVehicle(int load) {
//      if (load > 1_000) {
//            return new Van();
//        } else if (load > 10_000){
//            return new Lorry();
//        }
//        return new Car();
//    }
}
