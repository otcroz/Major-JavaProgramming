import hw.polygon.Canvas;
import hw.polygon.Polygon;
import hw.polygon.Rectangle;
import hw.polygon.Square;
import hw.polygon.Triangle;

public class CanvasApp {

	public static void main(String[] args) {
		Canvas cList = new Canvas(5);
		Polygon p1 = new Rectangle(0,0,1,2); 
		Polygon p2 = new Square(3,3,4);
		Polygon p3 = new Triangle(0,3,2,4);
		Polygon p4 = new Rectangle(0,0,4,4);
		Polygon p5 = new Triangle(0,3,2,4);
		
		cList.draw(p1);
		cList.draw(p2);
		cList.draw(p3);
		cList.draw(p4);
		
		cList.display();
		
		boolean res = p3.equals(p5);
		if(res == true) {
			System.out.println("두 객체는 같습니다.");
		}
	}

}
