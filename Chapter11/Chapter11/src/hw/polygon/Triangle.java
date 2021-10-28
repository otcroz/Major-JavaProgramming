package hw.polygon;

public class Triangle extends Polygon {

	public Triangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.type = "Triangle";
	}
	
	public double getArea() {
			return (w*h)/2;
	}
	
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof Polygon) {
			Polygon p = (Polygon) obj;
			if (x == p.x && y == p.y && w == p.w && h == p.h && type.equals(p.type))
				result = true;
		}
		return result;
	}
}

