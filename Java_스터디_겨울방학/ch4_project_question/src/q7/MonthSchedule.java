package q7;

import java.util.Scanner;

public class MonthSchedule {
	Day[] month_schedule;
	Scanner s = new Scanner(System.in);

	public MonthSchedule(int days) {
		month_schedule = new Day[days];
	}

	public void input() {
		Day d = new Day();

		System.out.print("날짜(1~30)?");
		int num = s.nextInt();

		System.out.print("할일(빈칸없이입력)?");
		String todo = s.next(); // 오류

		String work = num + "일의 할 일은" + todo;
		d.set(work);

		month_schedule[num - 1] = d; // 배열에 특정 day 넣기

		System.out.println("할일을 입력했습니다.");
	}

	public void view() {
		System.out.print("날짜(1~30)?");
		int num = s.nextInt();

		month_schedule[num - 1].show();
	}

	public void finish() {
		System.out.println("시스템을 종료합니다.");
	}

	public void run() { //동작

		System.out.println("이번달 스케쥴 관리 프로그램.");

		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int select = s.nextInt();

			if (select == 1)
				input();
			else if (select == 2)
				view();
			else if (select == 3) {
				finish(); break;
			}
			
		}
	}

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}
