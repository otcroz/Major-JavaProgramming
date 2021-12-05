package ch21;

import java.io.Serializable;

class Point implements Serializable {
	int x,y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Circle implements Serializable{
	Point p;
	double r;
	
	public Circle(int x, int y, double r) {
		this.p = new Point(x,y);
		this.r = r;
	}
	
	void showInfo() {
		System.out.println("(" + p.x +", "+ p.y + ")");
		System.out.println("r = " + r);
	}
}

