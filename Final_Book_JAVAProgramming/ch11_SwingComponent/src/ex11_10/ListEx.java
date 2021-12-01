package ex11_10;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListEx extends JFrame {
	private String[] s = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry" };
	private Vector<String> vs = new Vector<String>();

	public ListEx() {
		super("리스트 만들기 예제");
		this.setSize(300, 300);

		buildGUI();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void buildGUI() {
		this.setLayout(new FlowLayout());
		this.add(createPanel1());
		this.add(createPanel2());
	}

	private JPanel createPanel1() {
		JPanel p = new JPanel();
		JList<String> list = new JList<String>(s);
		p.add(list);

		return p;
	}

	private JPanel createPanel2() {
		JPanel p = new JPanel();
		AddVectorElements();
		JList<String> list = new JList<String>(vs);
		p.add(new JScrollPane(list));

		return p;
	}

	private void AddVectorElements() {
		for (int i = 0; i < s.length; i++) {
			vs.add(s[i]);
		}
	}
}
