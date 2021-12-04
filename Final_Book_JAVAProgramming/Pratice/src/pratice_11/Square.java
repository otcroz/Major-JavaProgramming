package pratice_11;

public class Square extends Rectangle{

	public Square(int x, int y, int width) {
		super(x, y, width, width);
		this.type = "Square";
		
	}
	
	@Override
	public double getArea() {
		double area = width*width;
		return area;
	}
	
	public boolean equals(Polygon p) {
		boolean result = false;
		
		if(p!=null && p instanceof Square) {
			Square pointer = (Square)p;
			if(width == pointer.width && x == pointer.x && y == pointer.y) 
				result =  true;
			else 
				result =  false;
		}
		return result;
		
	}

}
