package q4;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>");
		char input = s.next().charAt(0);
		
		int intNum = (int)input;
		int charNum = intNum - 96; // ex)a�� charNum = 1
		
		for(int i=0;i<charNum;i++) { //�ҹ��� a�� int ���� 97
			for(int j=charNum-i; j>=0 ;j--) {
				System.out.println((char)(intNum-charNum)); //�ݺ��� �ٽ� Ǯ��
				intNum++;
			}
			
		}
	
	}
}
