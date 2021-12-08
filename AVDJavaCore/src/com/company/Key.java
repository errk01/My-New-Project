package com.company;

import java.util.Objects;
import java.util.UUID;

// obj / class / models
public class Key implements Cloneable, Comparable<Key>{
// fields
//    public int key;
    private UUID key;
    private KeyShape shape = KeyShape.unknown;

    // constructors
    // default
        public Key(){
            key = UUID.randomUUID();
        }

        public Key(KeyShape shape){
            this();
            this.shape = shape;
        }
//      copy
        public Key(Key original){
            key = original.key;
            shape = original.shape;
        }

        public  KeyShape shape(){
            return shape;
        }

        // clone
    @Override
    public Object clone(){
            return new Key(this);
    }




    // getters and setters



    // class methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key1 = (Key) o;
        return key.equals(key1.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public int compareTo(Key o){
        return key.compareTo(o.key);
    }

    @Override
    public String toString() {
        return key.toString();
    }
}
