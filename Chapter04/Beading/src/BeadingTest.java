import exam.bead.Child;

public class BeadingTest {

	Child c1, c2; //참조값을 갖는 변수
	
	void show() {
		System.out.print("어린이1 ");
		c1.show();
		System.out.print("어린이2 ");
		c2.show();
	}
	
	public static void main(String[] args) {
		
		BeadingTest test = new BeadingTest(); //static인 main 함수에서 c1, c2를 사용하기 위해 선언
		
		test.c1 = new Child(15);
		test.c2 = new Child(9);
		
		System.out.println(">> 게임 전 보유 개수");
		test.show();
		
		System.out.println("\n>> 1차 게임");
		test.c1.obtainBead(test.c2, 2);
		test.show();
		
		System.out.println("\n>> 2차 게임");
		test.c2.obtainBead(test.c1, 7);
		test.show();
	}
}
