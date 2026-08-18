package ch.bbw.classes.shapes;

public interface Shape {

	double getDiameter();

	double getCircumference();

	double getArea();

	int numberOfEdges();

	default boolean hasLargerCircumferenceThan(Shape other) {
		return getCircumference() > other.getCircumference();
	}
}
