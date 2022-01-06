package q8;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("정수 몇개?");
		int n = s.nextInt();

		int[] ranNum = new int[n];

		//int count = 0;
		for (int i = 0; i < ranNum.length; i++) {
			int ran = (int) (Math.random() * 100 + 1);

			for (int j = 0; j < i; j++) {
				if(ranNum[j] == ran) { //동일 여부 조사
					i--;
					//count--;
					break;
				}
				else if (j == (i-1)){
					ranNum[i] = ran;
				}
			}
			//count++;
		}

		for (int i = 0; i < ranNum.length; i++) {
			System.out.print(ranNum[i] + " ");

			if ((i+1) % 10 == 0) {
				System.out.println();
			}
		}

	}
}
