package q7;

public class Point { //Point
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point{ //Point3D

	int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void moveUp() {
		z+=1;
	}
	
	public void moveDown() {
		z-=1;
	}
	
	public void move(int x, int y) {
		super.move(x,y);
	}
	
	public void move(int x, int y, int z) {
		super.move(x,y);
		this.z = z;
	}

	@Override
	public String toString() {
		String str = "(" + getX() +", " + getY() +", "+ z + ")";
		return str;
	}
}

class PositivePoint extends Point{ //PositivePoint
	public PositivePoint() {
		super(0,0);
	}
	
	public PositivePoint(int x, int y) { 
		super(x,y);
		if(x<0 || y<0) super.move(0, 0);
	}
	
	public void move(int x, int y) {
		if(x<0 || y<0) return;
		else super.move(x,y);
	}

	@Override
	public String toString() {
		String str = "(" + getX() + ", " + getY() + ")의 점";
		return str;
	}
	
	
}