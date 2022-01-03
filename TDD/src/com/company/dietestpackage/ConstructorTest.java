package com.company.dietestpackage;

import com.company.Die;
import org.junit.Assert;
import org.junit.Test;

public class ConstructorTest {


    public void test(Integer expectedNumberOfFaces){
        // given
        Integer expectedFaceValue = null;
//        Integer expectedNumberOfFaces = null;

        //when
        Die die = new Die(expectedNumberOfFaces);
        Integer actualFaceValue = die.getCurrentValue();
        Integer actualNumberOfFaces = die.getNumberOfFaces();

        // then
        Assert.assertEquals(expectedFaceValue, actualFaceValue);
        Assert.assertEquals(expectedNumberOfFaces,actualNumberOfFaces);
    }

    @Test
    public void test0(){
        test(3);
    }

    @Test
    public void test1(){
        test(4);
    }

    @Test
    public void test2(){
        test(6);
    }

}
