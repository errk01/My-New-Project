package com.company.model;

public class WaterMonster extends Monster{
    public WaterMonster(String name) {
        super(name);
    }

    public WaterMonster() {
    }

    @Override
    public String attack() {
        return "Attack with water!";
    }
}
