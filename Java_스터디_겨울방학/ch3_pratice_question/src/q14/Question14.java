package q14;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		String[] course = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("과목 이름>>");
			String name = s.next();
			int n;
			
			if(name.equals("그만"))
				break;

			if (course[0].equals(name)) {
				n = score[0];
			} else if (course[1].equals(name)) {
				n = score[1];
			} else if (course[2].equals(name)) {
				n = score[2];
			} else if (course[3].equals(name)) {
				n = score[3];
			} else if (course[4].equals(name)) {
				n = score[4];
			} else {
				System.out.println("없는 과목입니다.");
				continue;
			}
			System.out.println(name + "의 점수는 " + n);
		}

	}
}
