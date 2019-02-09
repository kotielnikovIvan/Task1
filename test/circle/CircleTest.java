package circle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import info.sjd.circle.Circle;

class CircleTest {

	@Test 
	void testGetArea() {
		Circle circle = new Circle(1);
		assertEquals(3.1415926, circle.getArea(), 1.0);
	}
	@Test
	void testGetArea2() { 
		Circle circle = new Circle(10);
		assertEquals(314.15926, circle.getArea(), 1.0);
	}
 
}
