package q4;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("소문자 알파벳 하나를 입력하시오>");
		char input = s.next().charAt(0);
		
		int intNum = (int)input;
		int charNum = intNum - 96; // ex)a의 charNum = 1
		
		for(int i=0;i<charNum;i++) { //소문자 a의 int 형은 97
			for(int j=charNum-i; j>=0 ;j--) {
				System.out.println((char)(intNum-charNum)); //반복문 다시 풀기
				intNum++;
			}
			
		}
	
	}
}
