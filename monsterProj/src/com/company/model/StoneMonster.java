package com.company.model;

public class StoneMonster extends Monster{
    public StoneMonster(String name) {
        super(name);
    }

    public StoneMonster() {
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }
}
