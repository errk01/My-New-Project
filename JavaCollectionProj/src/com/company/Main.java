package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Scanner ui = new Scanner(System.in);
//        Wrapper<Integer> firstWrapper = new Wrapper<>(25);
//        Wrapper<Double> wrapperDouble = new Wrapper<>(52.0);
//        Wrapper<Scanner> scannerWrapper = new Wrapper<>(new Scanner(System.in));

//        Wrapper<Wrapper<Long>> longWrapper = new Wrapper<>(new Wrapper<>(200L));

//        System.out.println(longWrapper);

//        Map<Integer,Double> newMap = new Map<>();

//        Wrapper<int> myInt = new Wrapper<>();

    DynamicArray <String> newArray = new DynamicArray<>(100);

//	String[] myStrList = new String[5];
//    myStrList[0]= "Hello";
//
//
//        ArrayList<String> myNewList = new ArrayList<>();
//        myNewList.add("Hi");




        ArrayList<Integer> myArrList = new ArrayList<>(100);
        for(int i = 0; i <100; i++){
            myArrList.add(i);
        }
//        System.out.println(myArrList.size());
//        System.out.println(myArrList.indexOf(50));
//        System.out.println(myArrList.contains(80));
//        boolean r = myArrList.remove((Integer)80);
//        System.out.println(r);
//        System.out.println(myArrList);

//        System.out.println(myArrList.sort(x,y) -> x.compareTo(y));

        List<Double> myDoubleList = Arrays.asList(1.0,2.9,4.6,9.3,3.2);
        System.out.println(myDoubleList.getClass().getName());

        LinkedList<Integer> myOtherList = new LinkedList<>();
        myOtherList.add(11);
        System.out.println(myOtherList);
        myOtherList.set(0,142);
        System.out.println(myOtherList);

//        1(key): value
//        2(key): value
//        3(key): value
//        4(key): value
//        5(key): value

    }
}
