
public class BeadingTest {

	public static void main(String[] args) {
		Child c1 = new Child(15);
		Child c2 = new Child(9);
		
		c1.Beading(c2, 2);
		c2.Beading(c1, 7);
		
		System.out.println("아이 1의 구슬 개수: "+ c1.getBead());
		System.out.println("아이 2의 구슬 개수: "+ c2.getBead());
	}
}
