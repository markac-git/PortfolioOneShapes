package shapes;

public class Rectangle extends base.Shape {

    private double x0,y0;
    private double height, width;

    public Rectangle(double x0, double y0, double height, double width) {
        this.x0 = x0;
        this.y0 = y0;
        this.height = height;
        this.width = width;
    }

    public double getX0() {
        return x0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public double getY0() {
        return y0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String returnCenter() {
        return "center (x,y): "+(getX0()+(getWidth()/2))+", "+(getY0()+(getHeight()/2));
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
}
