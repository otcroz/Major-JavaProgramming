package q5;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		int[] num = new int[10];

		Scanner s = new Scanner(System.in);
		
		
		System.out.print("임의 정수 10개를 입력하시오>> ");
		for (int i = 0; i < 10; i++) {
			num[i] = s.nextInt();

		}
		System.out.print("3의 배수는 ");
		for(int i=0;i<10;i++) {

			if (num[i] % 3 == 0)
				System.out.print(num[i] + " ");
		}

	}
}
