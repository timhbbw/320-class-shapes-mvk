package ch.bbw.classes.shapes;

import java.util.Comparator;
import java.util.List;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class ShapeTest implements WithAssertions {

	/**
	 * Überfliege: http://javaseiten.de/ch01s09.html
	 * <p>
	 * Wir stellen fest, dass {@link Circle} und {@code Rectangle} ähnliche Eigenschaften, wie z. B. eine Fläche, haben. Gemeinsamkeiten
	 * können wir in einem "Vertrag" abbilden: ein Interface. Interfaces wirken initial sehr einschränkend, sind ein tolles Mittel zur
	 * Abstraktion.
	 * <p>
	 * TODO: Implementiere das Interface {@link Shape} in {@link Circle} und {@code Rectangle}.
	 *  Beachte: Dies benötigt je eine weitere Methode.
	 */
	Shape aCircle() {
		return new Circle(1);
	}

	Shape aRectangle() {
		return new Rectangle(1,1);
	}

	@Test
	void edges() {
		assertThat(aCircle().numberOfEdges()).isEqualTo(1);
		assertThat(aRectangle().numberOfEdges()).isEqualTo(4);
	}

	@Test
	void area() {
		assertThat(aCircle().getArea()).isGreaterThan(aRectangle().getArea());
	}

	@Test
	void circumference() {
		assertThat(aCircle().getCircumference()).isGreaterThan(aRectangle().getCircumference());
		assertThat(aCircle().hasLargerCircumferenceThan(aRectangle())).isTrue();
	}

	@Test
	void sortingStuff() {
		var shapes = List.of(aCircle(), aRectangle());
		var smallest = shapes.stream().min(Comparator.comparing(Shape::getDiameter)).orElseThrow();
		assertThat(smallest.toString()).isEqualTo("Rectangle [a=1, b=1]");
	}

}
