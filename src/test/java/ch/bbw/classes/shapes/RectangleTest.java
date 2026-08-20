package ch.bbw.classes.shapes;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class RectangleTest implements WithAssertions {

	double a = Math.random();

	double b = Math.random();

	/**
	 * Erstelle eine neue {@code Rectangle} Klasse neben der {@link Circle} Klasse.
	 * Entferne danach die Kommentare dieses Tests, implementiere entsprechende Methoden und lass die Tests laufen.
	 */
	// TODO: Entferne die folgenden Kommentare der Tests und lasse sie erfolgreich laufen.

	/*
	@Test
	void diameter() {
		assertThat(new Rectangle(1, 1).getDiameter()).isEqualTo(Math.sqrt(2));
		assertThat(new Rectangle(a, b).getDiameter()).isEqualTo(Math.sqrt(a * a + b * b));
	}

	@Test
	void area() {
		assertThat(new Rectangle(1, 1).getArea()).isEqualTo(1);
		assertThat(new Rectangle(a, b).getArea()).isEqualTo(a * b);
	}

	@Test
	void circumference() {
		assertThat(new Rectangle(1, 1).getCircumference()).isEqualTo(4);
		assertThat(new Rectangle(a, b).getCircumference()).isCloseTo(a + a + b + b,
			org.assertj.core.data.Offset.offset(0.001));
	}

	@Test
	void comparingRectangle() {
		assertThat(new Rectangle(1, 1).hasLargerAreaThan(new Rectangle(1, 0.5))).isTrue();
		assertThat(new Rectangle(1, 1).hasLargerAreaThan(new Rectangle(2, 2))).isFalse();
	}

	@Test
	void comparingArea() {
		assertThat(new Rectangle(1, 1).hasLargerAreaThan(0.9)).isTrue();
		assertThat(new Rectangle(1, 1).hasLargerAreaThan(1)).isFalse();
	}
	*/

	@Test
	void niceToString() {
		// assertThat("my rectangle: " + new Rectangle(1, 2)).isEqualTo("my rectangle: Rectangle [a=1, b=2}");
	}

}
