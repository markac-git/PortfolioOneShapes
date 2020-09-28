package base;
import java.awt.*;
public abstract class Shape {



    /*
    return the center of the shape
• compute the areal of the shape
• compute the circumference of the shape
• indicate whether a point is inside the shape or not (e.g. select the shape by mouse click)
• compute the Euclidean distance to another shape (center to center)

    * */

    public abstract String returnCenter();
    public abstract double calculateArea();
    public abstract boolean pointInsideShape(double xP, double yP);
}
