package JComboBoxTest2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JComboBoxTest2 extends JFrame {
	private JTextField text;
	private JComboBox<String> mCombo;
	private JButton add, del;
	
	public JComboBoxTest2() {
		super("JComboBox Test2");
		this.setSize(500,300);
		
		buildGUI();
		registerListener(); 
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI(){
		this.add(createLayout());
	}
	
	private JPanel createLayout() {
		JPanel p = new JPanel();
		text = new JTextField(10);
		add = new JButton("추가");
		del = new JButton("삭제");
		del.setEnabled(false);
		
		String[] fruits = {"apple", "banana", "kiwi", "mango"};
		mCombo = new JComboBox<String>(fruits);
		
		p.add(text);
		p.add(add);
		p.add(del);
		p.add(mCombo);
		
		return p;
	}
	
	private void registerListener(){ // 이벤트 발생 함수를 모아둠
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = text.getText();
				if (!str.equals("")) //입력창이 공백이 아닐 때 추가
					mCombo.addItem(str);
				
				text.setText("");	
			}
			
		});
		
		del.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = text.getText();
				mCombo.removeItem(str);		
				text.setText("");
				del.setEnabled(false);
			}
			
		});
		
		mCombo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText((String)mCombo.getSelectedItem());
				del.setEnabled(true);
			}
			
		});
	}
}
