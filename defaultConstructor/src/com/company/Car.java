package com.company;

public class Car {
    private String make;
    private String model;
    private String engine;

    public Car(String make, String model, String engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        System.out.println("All arg constructor");
    }


    public Car() {
        System.out.println("Default");
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

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }








}
