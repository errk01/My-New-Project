package com.company.model;

public class FireMonster extends Monster{

    public FireMonster(String name) {
        super(name);
    }

    public FireMonster() {
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
