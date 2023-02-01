package com.qa.inheritance.base;

public class Vehicle {

    private String make;
    private String model;
    private String colour = "black";

    private int speed;
    private int numDoors;
    public Vehicle(String colour) {
        super();
        this.colour = colour;
    }

    public Vehicle(String make, String model, String colour, int speed, int numDoors) {
        super();
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.speed = speed;
        this.numDoors = numDoors;
    }

    public void honkHorn() {
        System.out.println("honk");
    }

    public void refuel() {

    }

    public void accelerate(int speed) {
        this.speed += speed;
    }

    public void brake() {
        this.speed = 0;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float calcBill() {
        return 45; // intentionally daft
    }

    @Override // @ -> annotation
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", speed=" + speed +
                ", numDoors=" + numDoors +
                '}';
    }
}
