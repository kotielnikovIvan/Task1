package info.sjd.circle;

import info.sjd.shape.*;

public class Circle extends AbstractShape{

	private int radius;
	
	public Circle (int radius) {
		this.radius = radius; 
	}
	 
	public void setRadius(int radius) {
		this.radius = radius;
	} 
	public double getRadius() {
		return radius;
	}
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
} 
