package com.company;

import java.util.ArrayList;

public class Car extends Vehicle<V> {
    private String type;

    ArrayList<Vehicle<V>> myList = new ArrayList<>();

    public Car(String make, String model, String color, int year, String engine, int doors, int wheels, String type) {
        super(make, model, color, year, engine, doors, wheels);
        this.type = type;
    }

    public Car(String type) {
        this.type = type;
    }

    public Car() {

    }

    public void gasMileage(){
        System.out.println("Gets bad gas mileage");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String[] carNames() {
        return new String[0];
    }

//    @Override
//    public void hasTrunk() {
//        boolean truck = true;
//                if(truck){
//                    System.out.println("Has no trunk");
//                }else{
//                    System.out.println("Has trunk");
//                }
//
//    }

    public String  myNewCar( int num, int ...a){
        for( int numOne : a){
            System.out.println(numOne);
        }
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "type='" + type + '\'' +
//                '}';
//    }
}
