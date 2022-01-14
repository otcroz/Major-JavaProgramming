package q4;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void show() {
		System.out.println("(" + x + ", " + y + ")" + "에서 크기가" + width + "x" + height + "인 사각형");
	}

	public int sqaure() {
		return width * height;
	}
	
	public boolean container(Rectangle r) {
		//위치, 너비에 대한 조건
		if(
		
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.sqaure());
		if (t.container(r))
			System.out.println("t는 r을 포함합니다.");
		if (t.container(s))
			System.out.println("t는 s를 포함합니다.");
	}
}
