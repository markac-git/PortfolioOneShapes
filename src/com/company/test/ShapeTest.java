package com.company.test;

import com.company.shapes.Rectangle;
import com.company.shapes.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Rectangle rec = new Rectangle(0,0,10,10);
    Triangle tri = new Triangle(0,0,10,15,15,0);

    @Test
    void calculateDistance() {
    }

    @Test
    void returnCenter() {
        //RectangleTest
        assertArrayEquals(new double[]{5.0, 5.0}, rec.returnCenter());
        //TriangleTest
        //System.out.println(Arrays.toString(tri.returnCenter()));
        assertArrayEquals(new double[] {8.33,5}, tri.returnCenter(),0.05);
    }

    @Test
    void calculateArea() {
        //RectangleTest
        assertEquals(100,rec.calculateArea());
        //TriangleTest
        //System.out.println(tri.calculateArea());
        assertEquals(112.5,tri.calculateArea());
    }

    @Test
    void pointInsideShape() {
        //RectangleTest
        assertEquals(true, rec.pointInsideShape(5,5));
        //TriangleTest
        assertEquals(true,tri.pointInsideShape(5,5));
    }

    @Test
    void calculateCircumference() {
        //RectangleTest
        assertEquals(40,rec.calculateCircumference());
        //TriangleTest
        //System.out.println(tri.calculateCircumference());
        assertEquals(48.83,tri.calculateCircumference(),0.05);
    }
}