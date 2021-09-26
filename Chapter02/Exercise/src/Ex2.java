import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("2자리수 정수 입력(10~99)>>>");
			int num = scanner.nextInt();
	
			if (10 > num|| 100 < num ) continue; //num이 10~99 사이가 아닌 경우 되돌아가는 기능 추가
			else if (num / 10 == num % 10) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
				break;
			} else {
				System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
				break;
			}
		}
	}

}
