package q15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			int n = s.nextInt();
			int m = s.nextInt();
			
			System.out.println(n + "x" + m + "=" + n*m);
			
		}catch(InputMismatchException e) {
			System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
		}
	}
}
