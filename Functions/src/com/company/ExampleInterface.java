package com.company;

//@FunctionalInterface
public interface ExampleInterface<T>{
    T compare(T one, T two);
    public void print();
    default void show(){
        System.out.println("default");
    }
}
