package q3;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);

	abstract protected String getSrcString();

	abstract protected String getDestString();

	protected double ratio;

	public void run() {
		Scanner s = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = s.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다.");
	}
}

class Won2Dollor extends Converter {

	private int src;

	public Won2Dollor(int src) {
		this.src = src;
	}

	@Override
	protected double convert(double val) {
		return val / src;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

}

class Km2Mile extends Converter {
	
	private double src;
	
	public Km2Mile(double src) {
		this.src=  src;
	}
	
	@Override
	protected double convert(double val) {
		return val / src;
	}

	@Override
	protected String getSrcString() {
		return "km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}

}

public class Question_3 {
	public static void main(String[] args) {
		//question3
		Won2Dollor toDollor = new Won2Dollor(1200);
		toDollor.run();
		
		//question4
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
