package info.sjd.square;

import info.sjd.shape.*;

public class Square extends AbstractShape implements Shape{

	private int a;
	private int S;
	
	public Square(int a){ 
		this.a = a;
	}
	
	public int getS() {
		return S; 
	}
	public void setA(int a) {
		this.a = a;
	}
	@Override
	public void getArea() {
		S = a * a;
	}
}
