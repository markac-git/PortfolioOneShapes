package com.company.shapes;

import com.company.base.Shape;

public class Rectangle extends Shape {

    private double x0,y0;
    private double height, width;

    public Rectangle(double x0, double y0, double height, double width) {
        this.x0 = x0;
        this.y0 = y0;
        this.height = height;
        this.width = width;
    }

    //getters
    public double getX0() {
        return x0;
    }
    public double getY0() {
        return y0;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }


    @Override
    public double[] returnCenter() {
        double x = (getX0()+(getWidth()/2));
        double y = (getY0()+(getHeight()/2));
        return new double[] {x,y};
    }

    @Override
    public double calculateArea() {
        return getWidth()*getHeight();
    }

    @Override
    public boolean pointInsideShape(double xP, double yP) {
        if (xP>=x0 && xP<=(x0+getWidth()) && yP>=y0 && yP<=(y0+getHeight())){
            return true;
        }
        return false;
    }

    @Override
    public double calculateCircumference() {
        return 2*(getWidth()+getHeight());
    }

}
