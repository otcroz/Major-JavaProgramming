package q1;

public class Question1 {

}

class WhileTest {
	public static void main(String[] args) {
		int i = 0; int sum = 0;
		
		while(i<100) {
			sum = sum + i;
			i+=2;
		}
		
		System.out.println(sum);
	}

}

class ForTest {
	public static void main(String[] args) {
		int i = 0; int sum = 0;
			
		for(i=0;i<100;i+=2) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}
}

class DoWhleTest{
	public static void main(String[] args) {
		int i = 0; int sum = 0;
		
		do{
			sum = sum + i;
			i+=2;
		}while(i<100);
		
		System.out.println(sum);
	}
}