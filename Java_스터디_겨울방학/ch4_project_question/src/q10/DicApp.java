package q10;

import java.util.Scanner;

public class DicApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("한영 단어 검색 프로그램입니다.");
		while (true) {
			System.out.print("한글 단어?");
			String k_word = s.next();
			// 그만을 입력한 경우
			if(k_word.equals("그만")) break;

			// 단어 검색
			String res = Dictionary.kor2Eng(k_word);
			if(res == null) System.out.println(k_word + "은/는 사전에 없습니다.");
			else System.out.println(k_word + "은/는 " + res);
		}
	}
}
