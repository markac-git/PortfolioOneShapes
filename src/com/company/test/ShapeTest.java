package com.company.test;

import com.company.base.Shape;
import com.company.shapes.Circle;
import com.company.shapes.Rectangle;
import com.company.shapes.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    //Instantiating
    Rectangle rec = new Rectangle(0,0,10,10);
    Triangle tri = new Triangle(0,0,10,15,15,0);
    Circle cir = new Circle(10,5,5);
    Shape rec1 = new Rectangle(0,0,10,10);
    Shape tri1 = new Triangle(0,0,10,15,15,0);


    @Test
    void calculateDistance() {
        System.out.println(rec1.calculateDistance(rec1,tri1));
        assertEquals(3.33,rec1.calculateDistance(rec1,tri1),0.05);
    }

    @Test
    void returnCenter() {
        //RectangleTest
        assertArrayEquals(new double[]{5.0, 5.0}, rec.returnCenter());
        //TriangleTest
        //System.out.println(Arrays.toString(tri.returnCenter()));
        assertArrayEquals(new double[] {8.33,5}, tri.returnCenter(),0.05);
        //CircleTest
        assertArrayEquals(new double[] {5,5}, cir.returnCenter(),0.05);
    }

    @Test
    void calculateArea() {
        //RectangleTest
        assertEquals(100,rec.calculateArea());
        //TriangleTest
        //System.out.println(tri.calculateArea());
        assertEquals(112.5,tri.calculateArea());
        //CircleTest
        System.out.println(cir.calculateArea());
        assertEquals(314.15,cir.calculateArea(),0.05);

    }

    @Test
    void pointInsideShape() {
        //RectangleTest
        assertEquals(true, rec.pointInsideShape(5,5));
        //TriangleTest
        assertEquals(true,tri.pointInsideShape(5,5));
        //CircleTest
        assertEquals(false,cir.pointInsideShape(5,5));
    }

    @Test
    void calculateCircumference() {
        //RectangleTest
        assertEquals(40,rec.calculateCircumference());
        //TriangleTest
        //System.out.println(tri.calculateCircumference());
        assertEquals(48.83,tri.calculateCircumference(),0.05);
        //CircleTest
        System.out.println(cir.calculateCircumference());
        assertEquals(62.83,cir.calculateCircumference(),0.05);
    }
}