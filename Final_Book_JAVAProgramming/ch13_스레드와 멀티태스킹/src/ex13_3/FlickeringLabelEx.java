package ex13_3;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() {
		super("FlickeringLabelEx 예제");
		this.setSize(300,150);
		this.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("깜박", 500);
		
		JLabel label = new JLabel("안깜박");
		
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박", 300);
		
		this.add(fLabel);
		this.add(label);
		this.add(fLabel2);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

}

class FlickeringLabel extends JLabel implements Runnable{
	private long delay;
	
	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay = delay;
		this.setOpaque(true);
		
		Thread th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		int n = 0;
		while(true) {
			if(n==0)
				this.setBackground(Color.yellow);
			else
				this.setBackground(Color.green);
			if(n==0) n =1;
			else n =0;
			
			try {
				Thread.sleep(delay);
			}
			catch(InterruptedException e){
				return;
			}
			
		}
		
	}
	
}
	