package com.company;

import person.PersonModel;

import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
//	StringBuffer str = new StringBuffer("JavaStuffAndThings");
//
//    int len = str.length();
//    int cap = str.capacity();
//        System.out.println("Len "+len);
//        System.out.println("cap " + cap);
//
//        str.append("StringsJavaStuffAndThings");
////        System.out.println(str);
//        str.append(1);
//        str.insert(5, "yes");
//        str.insert(5, 5);
//        System.out.println(str);
//        char[] c = {'a','b'};
//        str.insert(0,c);
//
//        int len2 = str.length();
//        int cap2 = str.capacity();
//        System.out.println(str);
//        System.out.println("Len "+len2);
//        System.out.println("cap " + cap2);
//        System.out.println("og string " + len);

//        String newStr = new String();

//        StringJoiner joinNames = new StringJoiner(",","[","]");
//        // adding names
//        joinNames.add("Erik");
//        joinNames.add("Ahlam");
//
//        StringJoiner joinNames2 = new StringJoiner(":","[","]");
//        joinNames2.add("Kylee");
//        joinNames2.add("Rupa");
//
//        System.out.println(joinNames);
//        System.out.println(joinNames2);

        // Merging
//        StringJoiner merge = joinNames.merge(joinNames2);
//        System.out.println(merge);

//        ExampleInterface<Integer> ex1 = new ExampleInterface<>() {
//            @Override
//            public Integer compare(Integer one, Integer two) {
//                if(one< two){
//                    return two;
//                }else{
//                    return one;
//                }
//            }
//
//            @Override
//            public void print() {
//                System.out.println("functional interface");
//            }
//        };
//        ex1.print();
//        ex1.show();
//        System.out.println(ex1.compare(12,8));
//

        PersonModel p1 = new PersonModel();
        p1.setName("Erik");
        p1.setAge(225);
        p1.setJob("Ok developer");
        p1.setWorking(false);
        p1.setGrade('F');
        System.out.println(p1);


    }

}
