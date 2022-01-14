package q2;

import java.util.Scanner;

public class Grade {
	
	private int math;
	private int science;
	private int english;
	
	public Grade(int m, int s, int e) {
		math = m;
		science = s;
		english = e;
	}
	
	public int average() {
		int sum = math + science + english;	
		return sum/3;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력");
		int math = s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		
	}
}
