package ex14_7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyModalDialog extends JFrame {
	
	private MyDialog dialog;
	private JButton btn;
	
	public MyModalDialog() {
		super("dialogEx2 예제 프레임");
		this.setSize(250,200);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private void buildGUI() {
		dialog = new MyDialog(this, "Test Modal Dialog");
		btn = new JButton("Show Modal Dialog");
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				
				String txt = dialog.getInput();
				
				if (txt == null)return;
				JButton btn = (JButton)e.getSource();
				btn.setText(txt);
			}
			
		});
		
		this.add(btn);
	}
	
}

class MyDialog extends JDialog{
	
	private JTextField text;
	private JButton btn;
	
	public MyDialog(JFrame f, String s) {
		super(f,s,true);
		this.setSize(200, 100);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
	}
	
	public String getInput() {
		if (text.getText() == null)
			return null;
		else
			return text.getText();
	}
	
	private void buildGUI() {
		this.setLayout(new FlowLayout());
		
		text = new JTextField(10);
		btn = new JButton("OK");

		this.add(text);
		this.add(btn);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false); // 닫는 역할 수행
				
			}
			
		});
	}
	
}