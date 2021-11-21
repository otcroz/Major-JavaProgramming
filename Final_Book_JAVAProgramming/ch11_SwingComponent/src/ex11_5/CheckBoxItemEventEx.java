package ex11_5;

import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx {
	private JFrame frame;

	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = { "사과", "배", "체리" };

	private JLabel sumLabel;

	public CheckBoxItemEventEx() {
		frame = new JFrame("체크박스와 ItemEvent 예제");
		frame.setSize(250, 200);

		buildGUI();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void buildGUI() {
		Panel panel = new Panel();
		JLabel label = new JLabel("사과 100원, 배 500원, 체리 20000원");
		panel.add(label);
		
		//체크박스
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			fruits[i].addItemListener(listener);
			panel.add(fruits[i]);
		}
		sumLabel = new JLabel("현재 0원 입니다.");
		panel.add(sumLabel);
		frame.add(panel);
	}
	
	private ItemListener listener = new ItemListener() {
		int sum = 0;

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0])
					sum+=100;
				else if(e.getItem() == fruits[1])
					sum+=500;
				else
					sum+=20000;
				
			}
			else {
				if(e.getItem() == fruits[0])
					sum-=100;
				else if(e.getItem() == fruits[1])
					sum-=500;
				else
					sum-=20000;
			}
			sumLabel.setText("현재 " + sum + "원 입니다."); //합 출력
		}
	};
	
}
