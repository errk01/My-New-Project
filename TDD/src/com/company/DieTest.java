package com.company;

import org.junit.Assert;
import org.junit.Test;

public class DieTest {

    @Test
    public void testConstructor(){
        // given
        Integer expectedFaceValue = null;
        Integer expectedNumberOfFaces = null;

        //when
        Die die = new Die(expectedNumberOfFaces);
        Integer actualFaceValue = die.getCurrentValue();
        Integer actualNumberOfFaces = die.getNumberOfFaces();

        // then
        Assert.assertEquals(expectedFaceValue, actualFaceValue);
        Assert.assertEquals(expectedNumberOfFaces,actualNumberOfFaces);

    }

    @Test
    public void roll(){
        //Given
        Integer numberOfFaces = 2;
        Integer unexpected = null;
        Die die = new Die(numberOfFaces);

        //when
        die.roll();
        Integer actual = die.getCurrentValue();

        //then
        Assert.assertNotEquals(unexpected, actual);
    }

}
