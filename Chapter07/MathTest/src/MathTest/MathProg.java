package MathTest;

import java.util.Random;

public class MathProg {
	Random n1 = new Random();
	Random n2 = new Random();
	Random op = new Random();

	int op1 = n1.nextInt(10);
	int op2 = n2.nextInt(10);
	int operRandom = op.nextInt(2);
	
	// 메서드
	public void setOperand(int n1, int n2) {
		op1 = n1;
		op2 = n2;
	}
	
	public void randomQuestion() {
		if (operRandom == 0)
			System.out.print(op1 + "+" + op2 + ">>");
		else
			System.out.print(op1 + "-" + op2 + ">>");
	}

	public int calculate(int op1, int op2) {
		int res;
		if (operRandom == 0)
			res = op1 + op2;
		else
			res = op1 - op2;
		return res;
	}

	public boolean isAnswer(int ans) {
		boolean res;
		if (ans == calculate(op1, op2))
			res = true;
		else
			res = false;
		return res;
	}

	public void isAnswerTrue(Student s1) {
		System.out.println("정답!");
		s1.CorrectAnswer();
	}

	public void isAnswerFalse() {
		System.out.println("오답!");
	}

	public void disPlayAnswer(Student s1) {
		System.out.println("정답은 " + calculate(op1, op2) + "입니다.");
		s1.WrongAnswer();
	}

}
