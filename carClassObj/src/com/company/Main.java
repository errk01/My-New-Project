package com.company;

public class Main {

    public static void main(String[] args) {

//        Vehicle<V> ford = new Vehicle<V>();


//        ford.setMake("Ford");
//        ford.setModel("Mustang");
//        ford.setColor("Blue");
//        ford.setDoors(2);
//        ford.setEngine("v8");
//        ford.setWheels(4);
//        ford.setYear(1967);
//        System.out.println(ford);
//        System.out.println(ford.isRunning());


        Car notFord = new Car();
        notFord.gasMileage();
        notFord.setMake("Chevy");
        notFord.setModel("Camaro");
        notFord.setType("z71");
        notFord.setColor("Red");
        notFord.setEngine("v8");
//        notFord.isRunning();
//        System.out.println(notFord.isRunning());
//        System.out.println(notFord.getType());
//        System.out.println(notFord);
        getDays(Days.add);
    }
    enum Days {
        add(), sub(), div();
    }
        public static <Days> int add(int a, int b) {
            return a+b;
        }

    public static void getDays(Days day){
        System.out.println("Days" + day);
    }


}
