package MathTest;

public class Student {
	private int correct;
	private int wrong;
	
	public void CorrectAnswer(int n) {
		this.correct += 1;
	}
	
	public void WrongAnswer(int n) {
		this.wrong += 1;
	}
	
	public void showResult() {
		System.out.println("<< 최종결과 :" + correct + " / 10 >>");
		System.out.println("10문제 중에 " + correct + "문제를 맞추었고");
		System.out.println( wrong + "문제를 틀렸습니다.");
	}
}
