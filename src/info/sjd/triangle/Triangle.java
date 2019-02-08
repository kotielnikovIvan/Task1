package info.sjd.triangle;

import info.sjd.shape.*;

public class Triangle extends AbstractShape  {
	private int height;
	private int side;
	
	public Triangle(int height, int side) {
		this.height = height;
		this.side = side;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	
	public void setSide(int side){
		this.side = side;
	}
	public int getSide() {
		return side;
	}
	@Override
	public double getArea() {
		return  (height * side) / 2;	
	}
}
