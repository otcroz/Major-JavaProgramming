package ex11_12;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ex11_12 extends JFrame {
	
	private String[] fruits = {"사과", "바나나", "키위", "망고", "배", "복숭아", "베리", "딸기", "블랙베리"};
	private String[] names = {"기태", "수여니" , "유수연", "안녕"};
	
	public ex11_12() {
		super("콤보박스 만들기 예제");
		this.setSize(300,300);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private void buildGUI() {
		this.add(createJPanel());
	}
	
	private JPanel createJPanel() {
		JPanel p = new JPanel();
		JComboBox<String> fCombo = new JComboBox<String>(fruits);
		JComboBox<String> nCombo = new JComboBox<String>();
		for(int i=0;i<names.length;i++) {
			nCombo.addItem(names[i]);
		}
		
		p.add(fCombo);
		p.add(nCombo);
		
		return p;
		
	}

}
