package q5;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		int[] num = new int[10];

		Scanner s = new Scanner(System.in);
		
		
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>> ");
		for (int i = 0; i < 10; i++) {
			num[i] = s.nextInt();

		}
		System.out.print("3�� ����� ");
		for(int i=0;i<10;i++) {

			if (num[i] % 3 == 0)
				System.out.print(num[i] + " ");
		}

	}
}
