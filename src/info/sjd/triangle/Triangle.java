package info.sjd.triangle;

import info.sjd.shape.*;

public class Triangle extends AbstractShape implements Shape  {
	private int h;
	private int a;
	private double S;
	
	public Triangle(int h, int a) {
		this.h = h;
		this.a = a;
	}
	
	public void setH(int h) {
		this.h = h;
	}
	
	public void setA(int a){
		this.a = a;
	}

	public double getS() {
		return S;  
	}
	
	public void getArea() {
		S =  (h * a) / 2;	
	}
	
	
	
}
