package com.company.dietestpackage;

import com.company.Die;
import org.junit.Assert;
import org.junit.Test;

public class RollTest {
    public void test(Integer numberOfFaces){
        //Given
//        Integer numberOfFaces = 2;
        Integer unexpected = null;
        Die die = new Die(numberOfFaces);

        //when
        die.roll();
        Integer actual = die.getCurrentValue();

        //then
        Assert.assertNotEquals(unexpected, actual);
    }

    @Test
    public void test0(){
        test(2);
    }
    @Test
    public void test1(){
        test(3);
    }
    @Test(expected = NullPointerException.class)
    public void test2(){
        test(null);
    }
}
