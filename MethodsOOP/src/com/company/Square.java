package com.company;

public class Square extends Rectangle{

    public Square(){
        super();
    }

    public Square(double widthAndHeight){
        super(widthAndHeight, widthAndHeight);
    }

    public void setWidth(double newWidth){
            super.setWidth(newWidth);
            super.setHeight(newWidth);
    }
    public void setHeight(double newHeight){
        super.setHeight(newHeight);
        super.setWidth(newHeight);
    }
}



