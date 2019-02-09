package square;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import info.sjd.square.Square;

class SquareTest {

	@Test
	void testGetArea() {
		Square square = new Square (4);
		assertEquals(16.0, square.getArea(), 1.0);
	} 

}
