package ex10_2;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener {
	private JFrame frame;
	
	public InnerClassListener() {
		frame = new JFrame("타이틀");
		frame.setBounds(100,100,350,100);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI()
	{
		Panel panel = new Panel();
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		panel.add(btn);
		frame.add(panel);
	}
	
	private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			//InnerClassListener.this.frame.setTitle(b.getText());
			frame.setTitle(b.getText());
		}
		
	}
}
