package ex11_13;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboActionEx extends JFrame {
	
	private String[] fruits = {"사과", "바나나" ,"키위", "망고"};
	private JComboBox<String> combo;
	private JLabel label;
	
	public ComboActionEx() {
		super("콤보박스 이벤트 활용 예제");
		this.setSize(300,250);
		
		buildGUI();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		this.add(createPanel());
	}
	
	private JPanel createPanel() {
		JPanel p = new JPanel(new GridLayout(2,0));
		label = new JLabel("과일의 이름이 출력됩니다.");
		combo = new JComboBox<String>(fruits);
		combo.addActionListener(new MyActionListener());
		
		p.add(label);
		p.add(combo);
		
		return p;
	}
	
	private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JComboBox<String> select = (JComboBox<String>)e.getSource();
			int index = select.getSelectedIndex();
			label.setText(fruits[index]);
			
		}
		
	}
}
