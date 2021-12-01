package ex11_4;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckBoxEx {
	
	private JFrame frame;
	
	private JCheckBox[] cb = new JCheckBox[3];
	private String[] string = {"사과", "배", "체리"};
	
	public CheckBoxEx() {
		frame = new JFrame("체크박스 만들기 예제");
		frame.setSize(250,150);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		frame.add(createPanel());
	}
	
	private JPanel createPanel() {
		JPanel p = new JPanel();
		for(int i=0;i<string.length;i++) {
			cb[i] = new JCheckBox(string[i]);
			cb[i].addItemListener(new MyItemListener());
			p.add(cb[i]);
			
		}
		
		return p;
	}
	
	private class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == cb[0])
					System.out.println("사과 선택");
				else if (e.getItem() == cb[1])
					System.out.println("배 선택");
				else
					System.out.println("체리 선택");
			}
			else {
				if(e.getItem() == cb[0])
					System.out.println("사과 해제");
				else if (e.getItem() == cb[1])
					System.out.println("배 해제");
				else
					System.out.println("체리 해제");
			}
			
		}
		
	}
}
