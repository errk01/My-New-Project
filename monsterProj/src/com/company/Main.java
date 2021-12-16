package com.company;

import com.company.model.FireMonster;
import com.company.model.Monster;
import com.company.model.StoneMonster;
import com.company.model.WaterMonster;

public class Main {

    public static void main(String[] args) {
        Monster fireMonster = new FireMonster("r2u2");
        Monster waterMonster = new WaterMonster("u2r2");
        Monster stoneMonster = new StoneMonster("r2u2");

        System.out.println(fireMonster.attack());
        System.out.println(waterMonster.attack());
        System.out.println(stoneMonster.attack());

        fireMonster = new StoneMonster("a2b2");
        System.out.println(fireMonster.attack());


        Monster m4 = new Monster("r2d2");
        System.out.println(m4.attack());
    }
}
