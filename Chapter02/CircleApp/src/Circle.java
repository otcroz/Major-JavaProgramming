
public class Circle {
	final double PI = 3.14159265;
	double radius;
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	double getArea() {
		return radius*radius*PI;
	}
}
