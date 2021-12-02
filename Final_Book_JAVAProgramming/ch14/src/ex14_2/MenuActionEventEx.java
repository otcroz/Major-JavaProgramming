package ex14_2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuActionEventEx extends JFrame {

	private String[] string = {"Load", "Hide", "ReShow", "Exit"};
	private JMenuItem[] item = new JMenuItem[string.length];
	private JLabel label = new JLabel();
	
	public MenuActionEventEx() {
		super("Menu에 Action 리스너 만들기 예제");
		this.setSize(250,220);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		this.setJMenuBar(createMenu());
		this.add(label,BorderLayout.CENTER);
	}
	
	private JMenuBar createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		
		for(int i=0;i<string.length;i++) {
			item[i] = new JMenuItem(string[i]);
			item[i].addActionListener(new MyActionListener());
			screenMenu.add(item[i]);
		}
		
		JMenu screenMenu2 = new JMenu("Check");
		JCheckBoxMenuItem item2 = new JCheckBoxMenuItem("안녕");
		
		screenMenu2.add(item2);
		
		menuBar.add(screenMenu);
		menuBar.add(screenMenu2);
		
		return menuBar;
	
	}
	
	private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand(); //사용자가 선택한 메뉴아이템의 문자열
			
			switch(cmd) {
			case "Load":
				if(label.getText()!="")
					return;
				label.setText("안녕! 제가 보이시나요?"); break;
			case "Hide":
				label.setVisible(false); break;
			case "ReShow":
				label.setVisible(true); break;
			case "Exit":
				System.exit(0);
				break;
			}
			
		}
		
	}
}
