
public class BeadingTest {

	public static void main(String[] args) {
		Child c1 = new Child(15);
		Child c2 = new Child(9);
		
		c1.Beading(c2, 2);
		c2.Beading(c1, 7);
		
		System.out.println("���1�� ���� ����: "+ c1.getBead());
		System.out.println("���2�� ���� ����: "+ c2.getBead());
	}
}
