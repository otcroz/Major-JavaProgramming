import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>>");
		int price = scanner.nextInt();
		double res = price / 1100; 
		
		System.out.println(price + "원은 $" + res + "입니다.");
	}

}
