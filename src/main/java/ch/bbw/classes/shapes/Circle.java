package ch.bbw.classes.shapes;

public class Circle {

	double radius = 0;
	public Circle(double r) {
	radius = r;
	}
	public double getRadius(){
		return radius;
	}
	public double getDiameter(){
		return radius / 2;
	}
	public double getCircumference(){
		return 2*Math.PI*radius;
	}
}
