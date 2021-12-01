package ex11_11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListChangeEx extends JFrame {
	
	private JTextField text;
	private Vector<String> vs = new Vector<String>();
	private JList<String> nameList;
	
	public ListChangeEx() {
		super("리스트 변경 예제");
		this.setSize(300,300);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.add(createPanel());
	}
	
	private JPanel createPanel() {
		JPanel p = new JPanel();
		addVectorElements();
		
		//text
		text = new JTextField(10);
		text.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				vs.add(t.getText());
				t.setText("");
				nameList.updateUI();
				//nameList.setListData();
			}
			
		});
		
		//nameList
		nameList = new JList<String>(vs);
		nameList.setVisibleRowCount(10); // 리스트가 보여주는 행의 수
		nameList.setFixedCellWidth(100); // 리스트의 폭
		nameList.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				text.setText(nameList.getSelectedValue());
			}
			
		});
		
		p.add(new JLabel("이름 입력 후 <Enter> 키"));
		p.add(text);
		p.add(new JScrollPane(nameList));
		
		return p;
	}
	
	private void addVectorElements() {
		vs.add("황기태");
		vs.add("이재문");
	}
	
}
