package com.company.shapes;

import com.company.base.Shape;

public class Triangle extends Shape {
    private double x1,y1,x2,y2,x3,y3,a,b,c;


    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        calculateABC();
    }

    private void calculateABC() {
        setA(Math.sqrt(Math.pow((getX1()-getX2()), 2) + Math.pow((getY1()-getY2()), 2)));
        setB(Math.sqrt(Math.pow((getX2()-getX3()), 2) + Math.pow((getY2()-getY3()), 2)));
        setC(Math.sqrt(Math.pow((getX3()-getX1()), 2) + Math.pow((getY3()-getY1()), 2)));
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public double getX3() {
        return x3;
    }

    public double getY3() {
        return y3;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double[] returnCenter() {
        double xCenter = (getX1()+getX2()+getX3())/3;
        double yCenter = (getY1()+getY2()+getY3())/3;
        return new double[]{xCenter, yCenter};
    }

    @Override
    public double calculateArea() {
        /*
        double s = 0.5*calculateCircumference();
        return Math.sqrt(s*(s-getA())*(s-getB())*(s-getC()));
         */
        return area(x1, y1, x2, y2, x3, y3);
    }

    /* A utility method to calculate area of triangle
       formed by (x1, y1) (x2, y2) and (x3, y3) */
    public double area(double x1, double y1, double x2, double y2,
                       double x3, double y3)
    {
        return Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0); //Math.abs - only positive value
    }

    @Override
    public boolean pointInsideShape(double xP, double yP) {
        double ABC = calculateArea();
        double PBC = area(xP, yP, getX2(), getY2(), getX3(), getY3());
        double PAC = area(getX1(), getY1(), xP, yP, getX3(), getY3());
        double PAB = area(getX1(), getY1(), getX2(), getY2(), xP, yP);

        //Checking whether or not the sum of ABC is equal to PBC, PAC and PAB
        return (ABC == PBC + PAC + PAB);
    }

    @Override
    public double calculateCircumference() {
        return getA()+getB()+getC();
    }
}
