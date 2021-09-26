import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();

		int m50000 = money / 50000;
		money %= 50000;
		System.out.println("오만원권 " + m50000 +"매");

		int m10000 = money / 10000;
		money %= 10000;
		System.out.println("만원권 " + m10000 +"매");
		
		int m1000 = money / 1000;
		money %= 1000;
		System.out.println("천원권 " + m1000 +"매");
		
		int c100 = money / 100;
		money %= 100;
		System.out.println("백원 " + c100 +"매");
		
		int c50 = money / 50;
		money %= 50;
		System.out.println("오십원 " + c50 +"매");
		
		int c10 = money / 10;
		money %= 10;
		System.out.println("십원 " + c10 +"매");
		System.out.println("일원 " + money +"매");
		
	}

}
