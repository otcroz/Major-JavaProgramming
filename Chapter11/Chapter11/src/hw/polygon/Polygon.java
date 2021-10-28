package hw.polygon;

public abstract class Polygon {
	int x;
	int y;
	int w;
	int h;
	String type;

	public Polygon() {
		this(0, 0, 1, 1, null);
	}

	public Polygon(int x, int y, int w, int h, String type) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.type = type;
	}

	public abstract double getArea();
	
	
	public void show() {
		System.out.print("도형의 타입은 " + type + "이고, ");
		System.out.println("도형의 넓이는 " + getArea() + "입니다.");
	}
	
	
}
