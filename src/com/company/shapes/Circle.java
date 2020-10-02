package com.company.shapes;


import com.company.base.Shape;

public class Circle extends Shape {
    private double r;
    private int xCenter, yCenter;

    //creating constructor. A circle expects following parameters when created
    public Circle(double r, int xCenter, int yCenter) {
        this.r = r;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    //creating getters
    public double getR() {
        return r;
    }
    public int getxCenter() {
        return xCenter;
    }
    public int getyCenter() {
        return yCenter;
    }


    //overriding abstract methods
    @Override
    public double[] returnCenter() {
        double x = getxCenter();
        double y = getyCenter();
        return new double[] {x,y}; //returning x and y values in array
    }

    @Override
    public double calculateArea() {
        return Math.PI*(getR()*getR());
    }

    @Override
    public boolean pointInsideShape(double xP, double yP) {
        return false;
    }

    @Override
    public double calculateCircumference() {
        return (2*Math.PI)*getR();
    }


}
