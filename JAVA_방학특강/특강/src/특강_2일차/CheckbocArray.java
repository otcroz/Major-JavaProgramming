package 특강_2일차;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CheckbocArray {
	private JCheckBox[] checkbox = new JCheckBox[5];
	private JTextArea textarea;
	
	private JFrame frame;
	
	public CheckbocArray() {
		frame = new JFrame("JCheckBox 예제");
		frame.setSize(350, 200);
		
		buildGUI();
		registerEventListener();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	private void buildGUI() {
		textarea = new JTextArea();
		frame.add(createCheckBox(), BorderLayout.NORTH);
		frame.add(textarea);
		
	}
	
	private void registerEventListener(){
		for(JCheckBox cb : checkbox)
			cb.addItemListener(handler);
	}
	
	ItemListener handler = new ItemListener() {

		@Override
		public void itemStateChanged(ItemEvent e) {
			JCheckBox check = (JCheckBox)e.getItem();
			
			String s = check.getText();
			
			if(e.getStateChange() == ItemEvent.SELECTED)
				s += " 선택";
			else
				s += " 해제";
			
			textarea.append(s + "\n");
			
		}
		
	};
	
	private JPanel createCheckBox() {
		JPanel panel = new JPanel();
		
		for(int i=0;i<5;i++) {
			checkbox[i] = new JCheckBox("항목" + (i+1));
			panel.add(checkbox[i]);
		}
		
		return panel;
	}
	
	public static void main(String[] args) {
		new CheckbocArray();
	}
}
