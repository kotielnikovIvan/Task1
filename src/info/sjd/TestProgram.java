package info.sjd;

import info.sjd.circle.Circle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;

public class TestProgram {

	public static void main(String[] args) {
		
		Circle circle = new Circle(10);
		Square square = new Square(5);
		Triangle triangle = new Triangle(3, 6);
		
		circle.getArea();
		square.getArea(); 
		triangle.getArea();
		
		System.out.println("S(circle) = " + circle.getS());
		System.out.println("S(square) = " +square.getS());
		System.out.println("S(triangle) = " + triangle.getS());
		
	}

}
