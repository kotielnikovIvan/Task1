package info.sjd.circle;

import info.sjd.shape.*;

public class Circle extends AbstractShape implements Shape{

	private int radius;
	private double S;
	
	public Circle (int radius) {
		this.radius = radius; 
	}
	
	public double getS() {
		return S;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void getArea() {
		S = Math.PI * Math.pow(radius, 2);
	}
}
