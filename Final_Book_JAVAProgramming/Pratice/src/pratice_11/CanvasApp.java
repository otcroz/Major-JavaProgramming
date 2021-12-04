package pratice_11;

public class CanvasApp {
	public static void main(String[] args) {
		Canvas c = new Canvas(3);
		Polygon p1 = new Rectangle(0,0,2,2); 
		Polygon p2 = new Square(3,3,4);
		Polygon p3 = new Triangle(0,3,2,4);
		Polygon p4 = new Triangle(0,3,2,4);
		
		c.draw(p1);
		c.draw(p2);
		c.draw(p3);
		c.draw(p4);
		
		
		c.display();
		
		boolean res = p3.equals(p4);
		if(res == true) {
			System.out.println("두 객체는 같습니다.");
		}
		else {
			System.out.println("두 객체는 다릅니다.");
		}
	}
}
