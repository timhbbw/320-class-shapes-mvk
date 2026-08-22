package ch.bbw.classes.shapes;

public class Rectangle {
    public double lengthA = 0;
    public double lengthB = 0;
    public Rectangle(double a, double b){
        lengthA = a;
        lengthB = b;
    }

    public double getDiameter(){
        return Math.sqrt(lengthA*lengthA + lengthB*lengthB);
    }
}
