package 특강_2일차;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JComboBoxEx {

	private JFrame frame;
	
	private String[] fruits = {"apple", "banana", "kiwi", "mango"};
	private JComboBox<String> comboBox_list;
	private JTextField textfield;
	private JButton[] buttons = new JButton[2];
	private String[] btn_str = {"추가", "삭제"};
	
	public JComboBoxEx() {
		frame = new JFrame("JComboBox Test1");
		frame.setSize(400,200);
		
		buildGUI();
		registerListener();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		frame.add(createPanel1());
		buttons[1].setEnabled(false);
		
	}
	
	private void registerListener() {
		for(JButton btn: buttons)
			btn.addActionListener(handler);
		
		comboBox_list.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> select = (JComboBox<String>)e.getSource();
				textfield.setText((String)select.getSelectedItem());
			}
			
		});
		
		comboBox_list.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					textfield.setText(e.getItem().toString());
					buttons[1].setEnabled(true);
				}
			}
			
		});
	}
	
	ActionListener handler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String addFruits = textfield.getText();
			
			if(e.getActionCommand()=="추가") {
				
				comboBox_list.addItem(addFruits);
				textfield.setText("");
				
				buttons[1].setEnabled(true);
			}
			else {
				comboBox_list.removeItem(addFruits);
				textfield.setText("");
				
				buttons[1].setEnabled(false);
			}
				
				
				
			
		}
		
	};
	
	private JPanel createPanel1() {
		JPanel panel = new JPanel();
		comboBox_list = new JComboBox<String>(fruits);
		
		textfield = new JTextField(10);
		panel.add(textfield);
		
		for(int i=0;i<2;i++) {
			buttons[i] = new JButton(btn_str[i]);
			panel.add(buttons[i]);
		}
		
		panel.add(comboBox_list);
		
		return panel;
	}
	
	public static void main(String[] args) {
		new JComboBoxEx();
	}
}
