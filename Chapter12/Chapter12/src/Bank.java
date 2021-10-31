import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	Account[] accounts;
	int n;

	public Bank(int n) {
		accounts = new Account[n];
		this.n = n;
	}

	public void bankOperation() {
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) { // 은행에 저장된 계좌의 수만큼 조작
			accounts[i] = new Account("계좌", "이름", (i + 1) * 1000); //계좌 생성
			while (true) {
				System.out.println("계좌 " + (i + 1) + "입니다.");
				display();
				System.out.print("숫자 입력>>>");// 입력, 출금, 잔액, 종료 중 선택
				int select = s.nextInt();

				if (select == 1) {
					try {
						int inputNum = getInteger(); // 숫자(money) 입력
						accounts[i].deposit(inputNum);
					} catch (MalformedData e) {
						System.out.println(e.getMessage());
					}
				} else if (select == 2) {
					try {
						int inputNum = getInteger(); // 숫자(money) 입력
						accounts[i].withdraw(inputNum);
					} catch (MalformedData e) {
						System.out.println(e.getMessage());
					} catch (BalanceOutBoundsException e) {
						System.out.println(e.getMessage());
					}
				} else if (select == 3) {
					accounts[i].check();
				} else if (select == 4) {
					System.out.println("계좌" + (i + 1) + "의 처리를 종료합니다.");
					break;
				}

			}
		}
	}

	int getInteger() {
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int input;
		try {
			input = s.nextInt();
			return input;
		} catch (InputMismatchException e) {
			System.out.println("정수가 아닙니다. 다시 입력하세요.");
			input = s.nextInt();
			return input;
		}
	}

	void display() {
		System.out.println("===========");
		System.out.println("1. 입금     ");
		System.out.println("2. 출금     ");
		System.out.println("3. 잔액 확인 ");
		System.out.println("4. 종료     ");
		System.out.println("===========");
	}
}
