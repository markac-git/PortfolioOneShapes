package com.company.environment;

import com.company.base.Shape;

import com.company.shapes.Circle;
import com.company.shapes.Rectangle;
import com.company.shapes.Triangle;

import java.util.Arrays;

public class Environment {
    public static void init() {
        Shape cir1 = new Circle(10,25,15);
        Shape rec1 = new Rectangle(20, 10, 10,10);
        Shape tri1 = new Triangle(0, 0, 10,5,20,0);

        //System.out.println(Arrays.toString(tri1.returnCenter()));

        System.out.println(tri1.calculateArea());


        //System.out.println(Shape.calculateDistance(cir1,tri1));
    }


}
