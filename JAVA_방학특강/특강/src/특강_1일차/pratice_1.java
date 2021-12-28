package 특강_1일차;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class pratice_1 {
	private JFrame frame;
	private CardLayout card = new CardLayout();
	JPanel p_card;
	
	public pratice_1() {
		frame = new JFrame("Layout Test");
		
		buildGUI();
		
		frame.setSize(200, 300);
		frame.setLocation(100, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		autoChange();
	}
	
	private void buildGUI() {
		frame.add(createCardPanel());
		
		JButton btn = new JButton("마지막");
		frame.add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//card.last(btn);
				card.show(p_card, "page3");
			}
			
		});
		
	}
	
	private JPanel createCardPanel() {
		p_card = new JPanel();
		p_card.setLayout(card);
		
		for(int i=0;i<5;i++) 
		{
			String s = "" + (i + 1);
			p_card.add("page" + s, new JButton(s) ); //("page1", new JButton("1"));
			
		}
		
		return p_card;
	}
	
	private void autoChange() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			card.next(frame.getContentPane());
		}
	}
	
	public static void main(String[] args) {
		new pratice_1();
	}
}
