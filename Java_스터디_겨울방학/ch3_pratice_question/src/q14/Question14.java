package q14;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		String[] course = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("���� �̸�>>");
			String name = s.next();
			int n;
			
			if(name.equals("�׸�"))
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
				System.out.println("���� �����Դϴ�.");
				continue;
			}
			System.out.println(name + "�� ������ " + n);
		}

	}
}
