package ex5_5;

public class praticeMain {
	static void paint(Shape p) {
		p.draw(); //오버라이딩된 draw 호출
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
	}
}
