package 특강_3일차;

// 1. 배열 인수(자동 표 모델)
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class SimpleTableEx extends JFrame {

	private JTable mTable;

	public SimpleTableEx() {
		super("테이블 테스트1");

		buildGUI();

		setSize(450, 300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void buildGUI() {
		JButton button = new JButton("출력");
		button.addActionListener(mHandler);

		add(createTablePanel(), BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
	}

	private JPanel createTablePanel() {
		JPanel panel = new JPanel(new BorderLayout());

		String[] columnNames = { "이  름", "나이", "성별" };
		Object[][] data = { { "고주몽", 22, "남" }, { "소서노", 20, "여" } };

		mTable = new JTable(data, columnNames);
		panel.add(new JScrollPane(mTable));

		mTable.setRowHeight(30);

		return panel;
	}

	private ActionListener mHandler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			/*/
			int rowCount = mTable.getRowCount();
			int ColCount = mTable.getColumnCount();

			for (int i = 0; i < ColCount; i++) {
				String colName = mTable.getColumnName(i);
				System.out.print(colName + "\t");
			}
			System.out.println();

			for (int i = 0; i < rowCount; i++) {
				for (int j = 0; j < ColCount; j++) {
					Object cell = mTable.getValueAt(i, j);
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
			System.out.println();
			/*/
			
			TableModel model = mTable.getModel();
			
			int rowCount = model.getRowCount();
			int ColCount = model.getColumnCount();

			for (int i = 0; i < ColCount; i++) {
				String colName = mTable.getColumnName(i);
				System.out.print(colName + "\t");
			}
			System.out.println();

			for (int i = 0; i < rowCount; i++) {
				for (int j = 0; j < ColCount; j++) {
					Object cell = model.getValueAt(i, j);
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
			System.out.println();
			//*/
		}

	};

	public static void main(String[] args) {
		new SimpleTableEx();
	}

}
