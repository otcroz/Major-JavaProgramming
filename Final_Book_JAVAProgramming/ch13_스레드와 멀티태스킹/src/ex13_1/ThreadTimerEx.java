package ex13_1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

 class TimerThread extends Thread {
	private JLabel timeLabel;
	
	public TimerThread(JLabel timeLabel) {
		this.timeLabel = timeLabel;
	}

	@Override
	public void run() {
		int n=0;
		while(true) {
			timeLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx() {
		super("Thread를 상속받은 타이머 스레드 예제");
		this.setLayout(new FlowLayout());
		
		//타이머를 출력할 레이블
		JLabel timerLabel = new JLabel();
		this.add(timerLabel);
		this.setSize(300,170);
		
		//타이머 스레드 생성
		TimerThread th = new TimerThread(timerLabel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		th.start();
	}
	
	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}
