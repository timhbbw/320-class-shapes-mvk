package ch.bbw.classes.shapes;

public class Rectangle implements Shape {
    public double lengthA = 0;
    public double lengthB = 0;
    public Rectangle(double a, double b){
        lengthA = a;
        lengthB = b;
    }

    public double getDiameter(){
        return Math.sqrt(lengthA*lengthA + lengthB*lengthB);
    }

    public double getArea(){
        return lengthA*lengthB;
    }

    @Override
    public int numberOfEdges() {
        return 4;
    }

    public double getCircumference(){
        return lengthA+lengthB+lengthB+lengthA;
    }

    public boolean hasLargerAreaThan(Rectangle rectangle) {
        if (getArea() > rectangle.lengthA*rectangle.lengthB){
            return true;
        }
        return false;
    }

    public boolean hasLargerAreaThan(double v) {
        return getArea() > v;
    }

    public String toString() {
        return "Rectangle [a=" + ((int) lengthA) + ", b=" + ((int) lengthB)+ "}";
    }
}
