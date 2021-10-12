package MathTest;

import java.util.Random;
import java.util.Scanner;

public class MathProg {
	Random random = new Random();
	Student s1 = new Student();
	Scanner inputAns;
	
	int operand1;
	int operand2;
	char operator;
	int chance;
	int answer;
	
	// 메서드
	public void startQuestion(){
		for (int i=0;i<10;i++) {
			setCalculate();
			System.out.println("*** " + (i + 1) + "번째 문제 ***");
			chance = 3;
			while(true) {
				if (chance <= 0) {
					disPlayAnswer(s1);
					break;
				}
				else {
					int userAns = solveAnswer();
					if(isAnswer(userAns)) {
						isAnswerTrue(s1);
						break;
					}
					else 
						isAnswerFalse();
				}
				chance--;
			}
		}
		s1.showResult();
	}
	
	public void setCalculate() {
		int op1 = random.nextInt(10);
		int op2 = random.nextInt(10);
		
		operand1 = op1;
		operand2 = op2;
		
		if (random.nextInt(2)==0) {
			operator = '+';
			answer = op1 + op2;
		}
		else {
			operator = '-';
			answer = op1 - op2;
		}
	}
	
	public void randomQuestion() {
		if (operator == '+')
			System.out.print(operand1 + "+" + operand2 + ">>");
		else
			System.out.print(operand1 + "-" + operand2 + ">>");
	}
	
	public int solveAnswer() {
		randomQuestion(); //문제 출력
		inputAns = new Scanner(System.in);
		int userAns = inputAns.nextInt();
		
		return userAns;
	}

	public boolean isAnswer(int inputAns) {
		if (inputAns == answer)
			return true;
		else
			return false;
	}

	public void isAnswerTrue(Student s1) {
		System.out.println("정답!");
		s1.CorrectAnswer();
	}

	public void isAnswerFalse() {
		System.out.println("오답!");
	}

	public void disPlayAnswer(Student s1) {
		System.out.println("정답은 " + answer + "입니다.");
		s1.WrongAnswer();
	}

}
