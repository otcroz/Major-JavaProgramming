package ex14_6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DialogEx extends JFrame {
	
	private JButton button;
	private MyDialog dialog;
	private boolean screen = false;
	
	public DialogEx() {
		super("dialogEx 예제 프레임");
		this.setSize(250,200);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private void buildGUI() {
		dialog = new MyDialog(this, "Test Dialog");
		button = new JButton("Show Dialog");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!screen) {
					screen = true;
					dialog.setVisible(screen);
				}
				else {
					screen = false;
					dialog.setVisible(screen);
				}
				
			}
			
		});
		
		this.add(button);
	}
}

class MyDialog extends JDialog{
	
	private JTextField text;
	private JButton btn;
	
	public MyDialog(JFrame frame, String s) {
		super(frame, s);
		this.setSize(200, 100);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}
	
	private void buildGUI() {
		this.setLayout(new FlowLayout());
		text = new JTextField(10);
		btn = new JButton("OK");
		
		this.add(text);
		this.add(btn);
	}
}