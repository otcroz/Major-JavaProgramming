package q12;

import java.util.Scanner;

public class ConcertReserveSystem {
	Scanner s = new Scanner(System.in);
	String[] S_seat = { "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" };
	String[] A_seat = { "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" };
	String[] B_seat = { "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" };
	String[][] seat = { S_seat, A_seat, B_seat };
	String[] class_name = { "S", "A", "B" };

	ConcertReserveSystem() { // 생성자
		System.out.println("명품콘서트홀 예약 시스템입니다.");

		while (true) {
			int select = inputNum(); // 입력받기

			// select에 따른 함수 실행
			if (select == 1)
				reserve();
			else if (select == 2)
				inquire();
			else if (select == 3)
				cancel();
			else
				break;

			System.out.println();
		}
	}

	private int inputNum() { // 숫자 선택
		System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
		int select = s.nextInt();

		return select;
	}

	private void reserve() { // 예약
		int seat_sel = class_seat(); // 특정 좌석 선택 및 출력 함수

		System.out.print("이름 >> ");
		String name = s.next();
		System.out.print("번호 >> ");
		int seat_num = s.nextInt();

		// 예약하기
		seat[seat_sel -1][seat_num - 1] = name;

		System.out.println("예약이 완료되었습니다.");
	}

	private void inquire() { // 조회
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("조회를 완료하였습니다.");
	}

	private void cancel() { // 취소
		int seat_sel = class_seat(); // 특정 좌석 선택 및 출력 함수
		System.out.print("이름 >> ");
		String name = s.next();

		// 취소하기
		for (int i = 0; i < seat[seat_sel -1].length; i++) {
			if (name.equals(seat[seat_sel -1][i])) {
				seat[seat_sel -1][i] = "---";
				System.out.println("예약 취소가 완료되었습니다.");
				return;
			}
		}

		System.out.println(name + "으로 예약된 좌석이 없습니다.");

	}

	private int class_seat() {
		// 좌석 등급 선택
		System.out.print("좌석구분 S(1), A(2), B(3) >> ");
		int seat_sel = s.nextInt();

		// 특정 좌석 출력
		System.out.print(class_name[seat_sel - 1] + ">> ");
		for (int i = 0; i < seat[seat_sel -1].length; i++) {
			System.out.print(seat[seat_sel -1][i] + " ");
		}
		System.out.println();

		return seat_sel;
	}
}
