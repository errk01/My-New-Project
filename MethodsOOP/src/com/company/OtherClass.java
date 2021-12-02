package com.company;

public class OtherClass {

//    String name;
//    String jobType;
//    int age;
    private int nSample = 0;
    private double min = 0;
    private double max = 0;
    private double sum = 0;

    public OtherClass(double[] values){
        for (int i = 0; i < values.length; i++) {
            double val = values[i];
            if(val < min) min = val;
            if(val > max) max = val;
            sum+= val;
            nSample++;
        }
    }

    public int getnSample(){
        return nSample;
    }
     public double getMin(){
        return min;
     }

    public double getMax(){
        return max;
    }

    public double getSum(){
        return (nSample == 0) ? Double.NaN : sum/nSample;
    }
}
