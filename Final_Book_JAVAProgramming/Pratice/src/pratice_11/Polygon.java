package pratice_11;

public abstract class Polygon { //추상 클래스 선언
	protected int x, y;
	protected int width, height;
	String type;

	public Polygon(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.type = "Polygon";
	}

	public void show() {
		System.out.println("도형의 종류: " + type);
		System.out.println("도형의 크기: " + getArea());
	}
	
	abstract public double getArea();
}
