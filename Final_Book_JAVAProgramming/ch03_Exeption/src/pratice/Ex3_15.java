package pratice;

import java.util.Scanner;

public class Ex3_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("나뉨수 입력: ");
			int divided = scanner.nextInt();
			System.out.print("나눗수 입력: ");
			int dividsor = scanner.nextInt();
			
			try {
				System.out.println(divided + "를 " + dividsor + "로 나누면 몫은 " + divided/dividsor + "입니다.");
				break; // 예외가 발생하지 않으면 반복문 탈출
			}
			catch(ArithmeticException e){
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
		}
	}
}
