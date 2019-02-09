package info.sjd;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import info.sjd.circle.Circle;
import info.sjd.shape.AbstractShape;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;

public class ApplicationRunner {
	private static Logger logger = Logger.getLogger(Logger.class.getName());
	
	public static void main(String[] args) { 

		List <AbstractShape> shapeList = new ArrayList<>(3);
		shapeList.add(new Circle(3));
		shapeList.add(new Square(5));
		shapeList.add(new Triangle(4, 5));
		
		double minSquare = shapeList.get(0).getArea();
		double maxSquare = shapeList.get(0).getArea();
		int maxFinder = 0;
		int minFinder = 0;
		
        for (int i = 0; i < shapeList.size(); i++) {
        	if(shapeList.get(i).getArea() < minSquare) {
        		minSquare = shapeList.get(i).getArea();
        		minFinder = i;
        	} 
        	if(shapeList.get(i).getArea() > maxSquare) {
        		maxSquare = shapeList.get(i).getArea();
        		maxFinder = i;
        	}
        }
        logger.info("Max Square is in " + shapeList.get(maxFinder).getClass() + " type = " + shapeList.get(maxFinder).getArea());
        logger.info("Min Square is in " + shapeList.get(minFinder).getClass() + " type = " + shapeList.get(minFinder).getArea());
	}  
   
} 
