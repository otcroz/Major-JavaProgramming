package ex13_2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RunnableTimerEx extends JFrame {
	public RunnableTimerEx() {
		super("Runnable을 구현한 타이머 스레드 예제");
		this.setSize(250, 150);
		
		//레이아웃 구현
		JLabel timerLabel = new JLabel();
		this.add(timerLabel);
		
		//스레드 구현
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		th.start();
	}
}

class TimerRunnable implements Runnable{
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
		
	}
	
	public static void main(String[] args) {
		new RunnableTimerEx();
	}
}