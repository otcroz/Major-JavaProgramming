package ex9_1;

import javax.swing.JFrame;

public class MyFrame extends JFrame { //방법: 상속, 
	public MyFrame() {
		super("300x300 스윙 프레임 만들기"); //부모 클래스 명시적 생성 + 타이틀 달기
		
		//setTitle("300x300 스윙 프레임 만들기");
		//setSize(300,300); //프레임 사이즈
		this.setBounds(100,200,300,400); //위치, 사이즈
		
		
		this.setVisible(true); //프레임 출력
	}
}
