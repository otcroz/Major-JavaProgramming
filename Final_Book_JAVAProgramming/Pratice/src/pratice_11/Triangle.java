package pratice_11;

public class Triangle extends Polygon {

	public Triangle(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.type = "Triangle";
		
	}

	@Override
	public double getArea() {
		double area = (width*height)/2;
		return area;
	}
	
	public boolean equals(Polygon p) {
		boolean result = false;
		if (p!=null && p instanceof Triangle) {
			Triangle pointer = (Triangle)p;
			if(width == pointer.width && height == pointer.height) 
				result =  true;
			else 
				result = false;
		}
		return result;
	}

}
