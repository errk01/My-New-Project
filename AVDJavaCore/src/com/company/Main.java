package com.company;

public class Main {

    public static void main(String[] args) {
        // default constructor that makes a random key
	Key key = new Key();

    // the second constructor that takes the original key
    Key spareKey = new Key(key);
        System.out.println("Spare Key "+spareKey);

        // clone
    Key otherSpare = (Key)key.clone();
        System.out.println("Other Spare " + otherSpare);

        System.out.println(key);
//        key.key = 50;
    }
}
