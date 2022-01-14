package q8;

import java.util.Scanner;

public class PhoneBook {
	private static Scanner s = new Scanner(System.in);
	private int count;
	private static Phone[] list;

	public PhoneBook(int count) {
		list = new Phone[count];

		for (int i = 0; i < list.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String n = s.next();
			String t = s.next();
			list[i] = new Phone(n, t);
		}
		System.out.println("저장되었습니다....");
	}

	public static void main(String[] args) { //main
		System.out.print("인원수>>");
		int count = s.nextInt();

		PhoneBook pList = new PhoneBook(count); // PhoneBook 생성

		while (true) {
			System.out.print("검색할 이름>>");
			String name = s.next();
			
			if(name.equals("그만")) break;
			
			boolean isName = false; //이름 존재 확인
			int index = 0;
			for (int i = 0; i < count; i++) {
				if(list[i].name.equals(name)) {
					isName = true;
					index = i;
				}
			}		
			
			//이름이 존재 여부에 따른 출력
			if(isName) System.out.println(list[index].name + "의 번호는 " + list[index].tel);
			else System.out.println( name +"이/가 없습니다.");
		}
	}
}
