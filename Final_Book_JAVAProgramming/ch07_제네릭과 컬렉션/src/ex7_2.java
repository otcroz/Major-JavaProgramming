import java.util.Vector;

class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")"; 
	}
}

public class ex7_2 {
	static void printVector(Vector<Point> v) {
		for(int i=0;i<v.size();i++) {
			Point n = v.get(i);
			System.out.println(n); //toString 메서드 자동 호출되어 출력
		}
	}
	
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		//3개의 Point 객체 삽입
		v.add(new Point(2,3));
		v.add(new Point(-5, 20));
		v.add(new Point(30,-8));
		
		v.remove(1);
		
		printVector(v); // 벡터의 내용 출력
	}
}

