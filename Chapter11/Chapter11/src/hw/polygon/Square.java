package hw.polygon;

public class Square extends Polygon {

	public Square(int x, int y, int w) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.type = "Square";
	}
	
	public double getArea() {
		return w*w;
	}
	
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof Polygon) {
			Polygon p = (Polygon) obj;
			if (x == p.x && y == p.y && w == p.w && type.equals(p.type))
				result = true;
		}
		return result;
	}
}
