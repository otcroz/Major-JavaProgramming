import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 3개 입력>>");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();

		int max, min, med;
		if (n1 > n2) {
			max = n1;
			min = n2;
			if (max > n3) {
				if (n3 > min)
					med = n3;
				else
					med = min;
			} else {
				med = max;
			}
		} else {
			max = n2;
			min = n1;
			if (max > n3) {
				if (n3 > min)
					med = n3;
				else
					med = min;
			} else {
				med = max;
			}
		}

		System.out.print("중간값은 " + med);

	}

}
