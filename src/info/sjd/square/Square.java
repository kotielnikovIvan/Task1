package info.sjd.square;

import info.sjd.shape.*;

public class Square extends AbstractShape{

	private int side;
	
	public Square(int side){ 
		this.side = side;
	}
	
	public void setSide(int side) {
		this.side = side;
	}
	public int getSide() {
		return side;
	}
	@Override
	public double getArea() {
		return side * side;
	}
}
