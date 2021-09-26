import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하시오>>");
		int l1 = scanner.nextInt();
		int l2 = scanner.nextInt();
		int l3 = scanner.nextInt();
		
		//가장 큰 수 구하기
		int max, n1, n2;
		if (l1 > l2) {
			max = l1;
			if (max < l3) {
				max = l3;
				n1 = l1;
				n2 = l2;
			}
			else {
				n1 = l2;
				n2 = l3;
			}
		}else {
			max = l2;
			if (max < l3) {
				max = l3;
				n1 = l1;
				n2 = l2;
			}
			else {
				n1 = l1;
				n2 = l3;
			}
		}
		
		//삼각형 성립 확인
		if (n1 + n2 > max)
			System.out.print("삼각형이 됩니다.");
		else
			System.out.print("삼각형이 되지 않습니다.");
	}

}
