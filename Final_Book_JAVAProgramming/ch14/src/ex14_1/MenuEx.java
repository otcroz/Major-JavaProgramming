package ex14_1;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {
	public MenuEx() {
		super("Menu 만들기 예제");
		this.setSize(250,200);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		this.setJMenuBar(createMenu());
	}
	
	private JMenuBar createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		//Screen의 메뉴의 부분 추가
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));
		
		JMenu screenMenu2 = new JMenu("Edit");
		JMenu screenMenu3 = new JMenu("Source");
		JMenu screenMenu4 = new JMenu("Project");
		JMenu screenMenu5 = new JMenu("Run");
		
		mb.add(screenMenu);
		mb.add(screenMenu2);
		mb.add(screenMenu3);
		mb.add(screenMenu4);
		mb.add(screenMenu5);
		
		return mb;
	}
}
