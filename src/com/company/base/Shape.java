package com.company.base;

import java.util.Arrays;

public abstract class Shape {


    public static double calculateDistance(Shape first, Shape second) {
        double x1 = first.returnCenter()[0];
        double y1 = first.returnCenter()[1];
        double x2 = second.returnCenter()[0];
        double y2 = second.returnCenter()[1];

        double dist = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));

        return dist;
    }

    public abstract double[] returnCenter();
    public abstract double calculateArea();
    public abstract boolean pointInsideShape(double xP, double yP);
    public abstract double calculateCircumference();
}
