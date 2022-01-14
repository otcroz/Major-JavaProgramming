package q11;

import java.util.Scanner;

public class CalculateApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("두 정수와 연산자를 입력하시오>>");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		String op = s.next();

		switch (op) {
		case "+":
			Add add = new Add();
			add.setValue(n1, n2);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(n1, n2);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(n1, n2);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(n1, n2);
			System.out.println(div.calculate());
			break;
			
	}
	}
}

class Add {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a + b;
	}
}

class Sub {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a - b;
	}
}

class Mul {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a * b;
	}
}

class Div {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a / b;
	}
}