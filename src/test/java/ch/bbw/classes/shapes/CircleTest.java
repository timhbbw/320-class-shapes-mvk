package ch.bbw.classes.shapes;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class CircleTest implements WithAssertions {
	@Test
	void circleCanBeInstantiated() {
		var circle = new Circle(17);
		assertThat(circle).isNotNull();
	}

	/**
	 * Lektüre: https://web.archive.org/web/20240420215917/https://java-tutorial.org/klassen-in-java.html
	 * Lektüre: https://web.archive.org/web/20220925053728/https://www.java-tutorial.org/definition_und_deklaration.html
	 * <p>
	 * Erweitere die {@link Circle} Klasse (unter src/main/java/...) durch ein privates {@code radius} Attribut.
	 * Ergänze den Konstruktor der Circle Klasse, sodass das Attribut genutzt wird.
	 * Erstelle eine Getter-Methode, um den Radius wieder abzufragen.
	 */
	@Test
	void radius() {
		double radius = 13.37;
		var circle = new Circle(radius);
		assertThat(circle.getRadius()).isEqualTo(radius);
	}

	/**
	 * Erweitere die {@link Circle} Klasse um eine weitere Methode, welche den Durchmesser des Kreises berechnet.
	 */
	@Test
	void diameter() {
		double radius = 13.37;
		var circle = new Circle(radius);
		assertThat(circle.getDiameter()).isEqualTo(radius / 2);
	}

	/**
	 * Erweitere die {@link Circle} Klasse um eine weitere Methode "getCircumference()",
	 * welche den Kreisumfang berechnet. (Tipp: {@link java.lang.Math#PI})
	 * <p>
	 * Entferne die Kommentare des Tests und lasse ihn erfolgreich laufen.
	 */
	@Test
	void circumference() {
		assertThat(new Circle(42).getCircumference()).isEqualTo(263.89378290154264);
	}

	/**
	 * Erweitere die {@link Circle} Klasse um eine weitere Methode, welche die Kreisfläche berechnet.
	 */
	@Test
	void area() {
		double radius = 13.37;
		var circle = new Circle(radius);
		assertThat(circle.getArea()).isEqualTo(561.5813638184852);
	}

	/**
	 * Schreibe eine "isBiggerThan(...)" Methode, welche einen anderen Kreis als Argument nimmt
	 * und true zurückgibt, wenn ({@code this}) Circle grösser ist.
	 */
	@Test
	void comparingCircle() {
		assertThat(new Circle(33).hasLargerAreaThan(new Circle(22))).isTrue();
		assertThat(new Circle(67).hasLargerAreaThan(new Circle(67))).isFalse();
		assertThat(new Circle(11).hasLargerAreaThan(new Circle(22))).isFalse();
	}

	/**
	 * Lektüre: https://web.archive.org/web/20220925060830/https://www.java-tutorial.org/ueberladen_von_methoden.html
	 * <p>
	 * Schreibe eine weitere "isBiggerThan(double ...)" Methode welche eine {@code area} als Double nimmt.
	 * Solche mehrere Methoden mit demselben Namen nennt man "überladen".
	 * Sie sind nur erlaubt, wenn sie unterschiedliche Typen von Argumenten nehmen.
	 */
	@Test
	void comparingArea() {
		assertThat(new Circle(33).hasLargerAreaThan(33d)).isTrue();
		assertThat(new Circle(1).hasLargerAreaThan(Math.PI)).isFalse();
		assertThat(new Circle(1).hasLargerAreaThan(Math.nextDown(Math.PI))).isTrue();
		assertThat(new Circle(0.5).hasLargerAreaThan(Math.PI)).isFalse();
	}

	/**
	 * Schreibe eine "newWithDoubleArea()" Methode, welche einen neuen Kreis mit doppelt so grosser Fläche zurückgibt.
	 * Beachte, dass die Methode keine Argumente nimmt: Es bezieht sich alles auf {@code this}.
	 */
	@Test
	void newWithDoubleArea() {
		var aCircle = new Circle(33);
		var doubleTheSize = aCircle.newWithDoubleArea();
		assertThat(doubleTheSize.getArea()).isEqualTo(aCircle.getArea() * 2);
	}

	/**
	 * Lektüre: https://web.archive.org/web/20250207000303/https://www.javatpoint.com/understanding-toString()-method
	 * <p>
	 * Schreibe eine "toString()" Methode, welche einen String zurückgibt, sodass dieser Test grün wird.
	 */
	@Test
	void niceToString() {
		assertThat("my circle: " + new Circle(17)).isEqualTo("my circle: Circle{radius=17.0}");
	}
}
