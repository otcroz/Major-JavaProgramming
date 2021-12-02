package pratice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DialogTest extends JFrame {
	
	private JTextField text = new JTextField("안녕! 내가 보이니?");
	private JButton button = new JButton("나는 버튼이라구~");
	private Dialog dialog = new Dialog(this, "나는 다이얼로그~ 로그로그지!");
	private boolean push = true;
	
	public DialogTest() {
		super("다이얼로그 테스트 실행");
		this.setSize(700,700);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		this.setLayout(new FlowLayout());
		
		this.add(text);
		this.add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(push) {
					dialog.setVisible(push);
					push = false;
				}
				else {
					dialog.setVisible(push);
					push = true;
				}
			}
			
		});
		
		
	}
}

class Dialog extends JDialog{
	
	private  JTextField text1 = new JTextField("헤이~! 나는 다이얼로그라고 해!");
	
	public Dialog(JFrame frame, String title) {
		super(frame, title);
		this.setSize(200,200);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}
	
	private void buildGUI() {
		this.add(text1);
		
	}
}
