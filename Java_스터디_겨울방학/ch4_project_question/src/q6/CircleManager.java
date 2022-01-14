package q6;

import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.print("(" + x + ", " + y + ")" + getRadius());
	}

	public int getRadius() {
		return radius;
	}
}

public class CircleManager {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Circle[] c = new Circle[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = s.nextDouble();
			double y = s.nextDouble();
			int r = s.nextInt();

			c[i] = new Circle(x, y, r);
		}
		
		int big_area = 0;
		for (int i = 1; i < c.length; i++) {
			if(c[i].getRadius() > c[big_area].getRadius()) big_area = i; 
		}
		
		System.out.print("가장 면적이 큰 원은 ");
		c[big_area].show();
		System.out.println("입니다.");

	}
}