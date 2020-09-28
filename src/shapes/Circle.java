package shapes;


import java.awt.*;

public class Circle extends base.Shape {

    private double r;
    private int xCenter, yCenter;

    public Circle(double r, int xCenter, int yCenter) {
        this.r = r;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public int getxCenter() {
        return xCenter;
    }

    public void setxCenter(int xCenter) {
        this.xCenter = xCenter;
    }

    public int getyCenter() {
        return yCenter;
    }

    public void setyCenter(int yCenter) {
        this.yCenter = yCenter;
    }

    @Override
    public String returnCenter() {
        return "Center of the circle (x,y): "+getxCenter()+", "+getyCenter();
    }

    @Override
    public double calculateArea() {
        return Math.PI*(getR()*getR());
    }

    @Override
    public boolean pointInsideShape(double xP, double yP) {
        return false;
    }




}
