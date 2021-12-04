package pratice_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	Account[] a;
	int size;

	public Bank(int size) {
		this.size = size;
		a = new Account[size];
	}

	public void bankOperation() {
		Scanner s = new Scanner(System.in);
		int select = 0; //초기화

		for (int i = 0; i < size; i++) {
			newAccount(i); // 계좌 생성

			while (true) {
				display();
				System.out.print("항목을 선택해주세요>>");
				try {
					select = getInteger();
				}
				catch(MalformedData e) {
					System.out.println(e.getMessage());
				}
				
				if (select == 1) {
					try {
						System.out.println("<< 입금 >>");
						System.out.print("얼마의 돈을 넣을 건가요??>>");
						
						int inputM = getInteger();
						a[i].deposit(inputM);
						
						System.out.println("입금이 완료되었습니다.");
					}
					catch(MalformedData e){
						System.out.println(e.getMessage());
					}
				}
				else if (select == 2) {
					try{
						System.out.println("<< 출금 >>");
						System.out.print("얼마의 돈을 뺄 건가요??>>");
						
						int inputM = getInteger();
						a[i].withdraw(inputM);
						
						System.out.println("출금이 완료되었습니다.");
					}
					catch(MalformedData e) {
						System.out.println(e.getMessage());
					}
					catch(BalanceOutOfBoundsException e) {
						System.out.println(e.getMessage());
					}
					
				}
				else if(select == 3) {
					System.out.println("<< 잔액 확인 >>");
					a[i].check();
				}
				else if(select == 4) {
					System.out.println("시스템을 종료합니다.");
					break;
				}
				else {
					System.out.println("1~4번 중에 다시 입력하세요.");
				}
			}

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

	void newAccount(int i) { // 예외처리 추가하기
		while(true) {
			try{
				Scanner s = new Scanner(System.in);
				System.out.println("1) 이름을 입력하세요.");
				String name = s.next();
				
				System.out.println("2) 계좌에 넣을 금액을 입력하세요.");
				int money = getInteger();
				
				a[i] = new Account(name, money);
				break;
			}
			catch(MalformedData e) {
				System.out.println(e.getMessage());
			}
			catch(InputMismatchException e) {
				System.out.println("맞는 타입으로 다시 입력하세요.");
			}
		}
	
	}

	int getInteger() throws MalformedData {
		Scanner s = new Scanner(System.in);
		int sel;
		while(true) {
			try {
				sel =s.nextInt();
				if(sel < 0) 
					throw new MalformedData("0 이상의 값을 입력하세요.");
				else
					break;
				
			}catch(InputMismatchException e) {
				System.out.println("숫자 타입으로 다시 입력해주세요.>>");
			}
		}	
		return sel;	
	}
}
