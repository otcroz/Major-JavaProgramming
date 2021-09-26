import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99사이의 정수를 입력하시오>>");
		int num = scanner.nextInt();
		
		if (num % 10 ==3 || num % 10 == 6 || num % 10 == 9) {
			if (num % 3 ==0) 
				System.out.println("박수짝짝");
			else 
				System.out.println("박수짝");
		}
		else 
			System.out.println("박수노노~");
	}

}
