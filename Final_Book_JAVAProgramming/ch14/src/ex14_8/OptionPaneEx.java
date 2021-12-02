package ex14_8;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OptionPaneEx extends JFrame {
	
	private JButton input;
	private JButton confirm;
	private JButton message;
	private JTextField text;
	
	public OptionPaneEx() {
		super("옵션 팬 예제");
		this.setSize(500, 200);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private void buildGUI() {
		this.add(createButton(), BorderLayout.NORTH);	
	}
	
	private JPanel createButton() {
		JPanel p = new JPanel();
		input = new JButton("Input Name");
		confirm = new JButton("Confirm");
		message = new JButton("Message");
		text = new JTextField(10);
		
		//이벤트
		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("이름을 입력하세요.");
				if(name != null)
					text.setText(name);
				
			}
			
		});
		
		confirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "계속할 것입니까?", "Comfirm", JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.CLOSED_OPTION)
					text.setText("Just Closed without Selection");
				else if (result == JOptionPane.YES_OPTION)
					text.setText("Yes");
				else
					text.setText("No");
				
			}
			
		});
		
		message.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "조심하세요","Message",JOptionPane.ERROR_MESSAGE);
				
			}
			
		});
		
		//추가
		p.add(input);
		p.add(confirm);
		p.add(message);
		p.add(text);
		
		return p;
	}
}
