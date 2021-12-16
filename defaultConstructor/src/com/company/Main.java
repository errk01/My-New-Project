package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("Dodge");
//        car1.setModel("Challenger");
        car1.setEngine("V8");
        System.out.println(car1.getMake());
        car1.getMake();
        car1.getEngine();

//        Car fast = new  SportCar();

//        System.out.println(fast);

        for(int i = 0; i < 10; i++)
            if(i < 5)
                System.out.println("less then 5");


    }
}
