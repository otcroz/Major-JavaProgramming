package ex11_6;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonEx2 implements ItemListener {

	private JFrame frame;
	private JRadioButton[] btn = new JRadioButton[3];
	private String[] f = { "사과", "배", "체리" };

	public RadioButtonEx2() {
		frame = new JFrame("라디오버튼 만들기 예제");
		frame.setSize(250, 150);

		buildGUI();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void buildGUI() {
		frame.add(create());
	}

	private JPanel create() {
		JPanel p = new JPanel();
		ButtonGroup g = new ButtonGroup();
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JRadioButton(f[i]);
			btn[i].addItemListener(this);
			g.add(btn[i]);
			p.add(btn[i]);
		}
		
		return p;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getItem() == btn[0])
				System.out.println("사과");
			else if (e.getItem() == btn[1])
				System.out.println("배");
			else
				System.out.println("체리");
			
		}

		
	}
	
	
}
