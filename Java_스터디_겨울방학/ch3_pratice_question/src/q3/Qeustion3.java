package q3;

import java.util.Scanner;

public class Qeustion3 {
	public static void main(String[] args) {
		java.util.Scanner s = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>");
		int input = s.nextInt();
		int i=0;
		for(int j=0;j<input;j++) {
			for(i=input-j;i>=1;i--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
