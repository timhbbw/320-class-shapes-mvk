package ch.bbw.classes.shapes;

public class Circle {

    double radius = 0;

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius / 2;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public boolean hasLargerAreaThan(Circle circle) {
        var mainCircleArea = getArea();
        var secondCircleArea = circle.getArea();

        if (mainCircleArea <= secondCircleArea) {
            return false;
        } else return mainCircleArea > secondCircleArea;
    }

    public boolean hasLargerAreaThan(double area) {
        var mainCircleArea = getArea();
        if (mainCircleArea <= area) {
            return false;
        } else return mainCircleArea > area;
    }

    public Circle newWithDoubleArea() {
        return new Circle(this.radius * Math.sqrt(2));
    }

    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
}
