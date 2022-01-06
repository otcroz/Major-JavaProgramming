package q6;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner s = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>");
		int inputM = s.nextInt();
		
		int money = inputM;
		for(int i=0;i<unit.length;i++) {
			int mCount = money / unit[i];
			if(mCount !=0) {
				System.out.println(unit[i] +"원짜리: " +mCount + "개");
			}
			money %= unit[i];
		}
	}
}
