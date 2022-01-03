package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private Integer numberOfFaces;
    private Integer currentValue;

//    public Die() {
//    }

//    public Die(Integer numberOfFaces, Integer currentValue) {
//        this.numberOfFaces = numberOfFaces;
//        this.currentValue = currentValue;
//    }

    public Die(Integer numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    public int getNumberOfFaces() {
        return numberOfFaces;
    }

//    public void setNumberOfFaces(Integer numberOfFaces) {
//        this.numberOfFaces = numberOfFaces;
//    }

    public int getCurrentValue() {
        return currentValue;
    }

//    public void setCurrentValue(Integer currentValue) {
//        this.currentValue = currentValue;
//    }

    public void roll(){
        ThreadLocalRandom randomNumberGenerator = ThreadLocalRandom.current();
        Integer randomFaceValue = randomNumberGenerator.nextInt(1,numberOfFaces);
        this.currentValue = randomFaceValue;
    }
}
