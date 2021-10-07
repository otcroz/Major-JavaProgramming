package MathTest;

import java.util.Scanner;

public class MathProgTest {

	public static void main(String[] args) {
		Scanner inputAns = new Scanner(System.in);
		Student student = new Student();
		MathProg question;

		// 반복적으로 문제 출력
		int i, k;
		for (i = 0; i < 10; i++) {
			question = new MathProg();
			
			System.out.println("*** " + (i + 1) + "번째 문제 ***");
			
			k = 1;
			while (true) {
				if (k>3) { //정답 여부 확인하기
					question.disPlayAnswer(student);
					break;
				}
				else {
					question.randomQuestion(); //문제 출력
					int userAns = inputAns.nextInt(); // 답 입력받기
					
					if(question.isAnswer(userAns)) {
						question.isAnswerTrue(student);
						break;
					}
					else 
						question.isAnswerFalse();
				}
				k++; //횟수 증가(최대 3회)
			}
		}

		student.showResult(); //결과 출력
	}

}
