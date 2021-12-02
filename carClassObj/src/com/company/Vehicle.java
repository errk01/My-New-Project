package com.company;

public class Vehicle<V> {
    // fields
    private String make;
    private String model;
    private String color;
    private int year;
    private String engine;
    private int doors;
    private int wheels;

    public Vehicle(String make, String model, String color, int year, String engine, int doors, int wheels) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.doors = doors;
        this.wheels = wheels;
    }

    public Vehicle() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", engine='" + engine + '\'' +
                ", doors=" + doors +
                ", wheels=" + wheels +
                '}';
    }

//    @Override
//    public boolean isRunning() {
//        return false;
//    }

//    @Override
//    public String[] carNames() {
//        return new String[0];
//    }

//    @Override
//    public void hasTrunk() {
//        System.out.println("No");
//    }
}
