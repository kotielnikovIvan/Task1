package info.sjd.triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import info.sjd.triangle.Triangle;

class TriangleTest { 

	@Test
	void testGetArea() { 
		Triangle triangle = new Triangle(2, 4);
		assertEquals(4.0, triangle.getArea(), 1.0);
	} 
 
}
