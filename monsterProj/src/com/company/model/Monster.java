package com.company.model;

import com.company.utils.AttackImpl;

public class Monster implements AttackImpl {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    public Monster() {
    }

    @Override
    public String attack() {
        return "!^_&amp;^$@+%$* I don&#39;t know how to attack!";
    }
}
