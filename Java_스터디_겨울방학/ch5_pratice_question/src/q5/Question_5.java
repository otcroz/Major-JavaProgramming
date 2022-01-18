package q5;

class Point {
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

class ColorPoint extends Point {

	String color;

	public ColorPoint() {
		super(0, 0);
		this.color = "BLACK";
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		super.move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		String s = color + "색의 " + "(" + getX() + ", " + getY() + ")";
		return s;
	}

}

public class Question_5 {
	public static void main(String[] args) {
		//question5
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
		
		//question6
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp2 = new ColorPoint(5, 5);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
		
	}
}
