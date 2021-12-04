package pratice_11;

public class Rectangle extends Polygon {

	public Rectangle(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.type = "Rectangle";
		
	}
	
	public boolean isSquare() {
		if(width == height)
			return true;
		else
			return false;
		
	}

	@Override
	public double getArea() {
		double area = width*height;
		return area;
	}
	
	public boolean equals(Polygon p) {
		boolean result = false;
		
		if(p!=null && p instanceof Rectangle) {
			Rectangle pointer = (Rectangle)p;
			if(width == pointer.width && height == pointer.height && x == pointer.x && y == pointer.y) 
				result =  true;
			else 
				result =  false;
		}
		return result;

	}

}
