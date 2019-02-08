package info.sjd;

import java.util.logging.Logger;

import info.sjd.circle.Circle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;

public class ApplicationRunner {
	private static Logger logger = Logger.getLogger(Logger.class.getName());
	
	public static void main(String[] args) {

		Circle circle = new Circle(3);
        Square square = new Square(5);
        Triangle triangle = new Triangle(4, 5);
         
        logger.info("circle with radius " + circle.getRadius() + " is " + circle.getArea());
        logger.info("Square with side " + square.getSide() + " is " + square.getArea());
        logger.info("Triangle with side " + triangle.getSide() + " and height " + triangle.getHeight() + " is " + triangle.getArea());
	}

} 
