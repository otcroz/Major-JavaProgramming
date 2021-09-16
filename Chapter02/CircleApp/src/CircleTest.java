
public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 1;
		
		Circle c2 = new Circle();
		c2.radius = 10;
		
		System.out.println("반지름 "+ c1.radius +"인 ");
		System.out.println("원의 넓이는 "+ c1.getArea());
		
		System.out.println("반지름 "+ c2.radius +"인 ");
		System.out.println("원의 넓이는 "+ c2.getArea());
	}

}
