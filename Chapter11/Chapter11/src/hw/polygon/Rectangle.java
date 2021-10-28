package hw.polygon;

public class Rectangle extends Polygon {

	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.type = "Rectangle";
	}

	public double getArea() {
		return w * h;
	}

	public boolean isSquare() {
		if (w == h)
			return true;
		else
			return false;
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
