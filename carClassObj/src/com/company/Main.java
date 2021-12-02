package com.company;

public class Main {

    public static void main(String[] args) {

        Vehicle ford = new Vehicle();


        ford.setMake("Ford");
        ford.setModel("Mustang");
        ford.setColor("Blue");
//        ford.setDoors(2);
//        ford.setEngine("v8");
//        ford.setWheels(4);
        ford.setYear(1967);
//        System.out.println(ford);
//        System.out.println(ford.isRunning());


        Car notFord = new Car();
        notFord.gasMileage();
        notFord.setMake("Chevy");
        notFord.setModel("Camaro");
        notFord.setType("z71");
        notFord.setColor("Red");
        notFord.setEngine("v8");
        notFord.isRunning();
        System.out.println(notFord.isRunning());
//        System.out.println(notFord.getType());
//        System.out.println(notFord);

    }


}
