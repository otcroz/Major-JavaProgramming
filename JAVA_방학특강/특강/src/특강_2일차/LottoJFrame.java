package 특강_2일차;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class LottoJFrame {

	JFrame frame;
	Lotto lotto;

	String[] radio_str = { "자동생성", "유효성 검사" };
	JRadioButton[] radio = new JRadioButton[2];

	String[] btn_str = { "생성", "검사", "초기화", "종료" };
	JButton[] btn = new JButton[4];

	JTextField[] inputNums = new JTextField[6];
	JCheckBox[] checks = new JCheckBox[6];
	JPanel[] panel_inputBox = new JPanel[6];

	public LottoJFrame() {
		frame = new JFrame("로또 번호 생성/검사기");
		frame.setSize(400, 150);

		buildGUI();
		registerEventListener();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	private void buildGUI() {
		frame.add(createRadioPanel(), BorderLayout.NORTH);
		frame.add(createInputField_total());
		frame.add(createButtonPanel(), BorderLayout.SOUTH);
		radio[0].setSelected(true);
		setEnableComponent();
	}

	private void registerEventListener() {

	}

	ActionListener btn_handler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton check = (JButton) e.getSource();
			if (check == btn[0]) { // 생성
				lotto = new Lotto();
				lotto.generate();
				int[] random_num = lotto.getNumbers();

				for (int i = 0; i < 6; i++) {
					inputNums[i].setText(Integer.toString(random_num[i])); 
				}
				
				btn[2].setEnabled(true);

			} else if (check == btn[1]) { // 검사
				lotto = new Lotto();
				boolean res;
				for(int i=0;i<6;i++) {
					String num = inputNums[i].getText();
					res = lotto.setNumber(Integer.parseInt(num));
					if(!res) {
						System.out.println("유효하지 않습니다!");
						return;
					}
					else
						System.out.println("검사를 완료했습니");

				}
				

			} else if (check == btn[2]) { //초기화
				for (JTextField text : inputNums)
					text.setText("");
				radio[0].setSelected(true);
				btn[2].setEnabled(false);
			} else if (check == btn[3]) // 종료
				System.exit(0);

		}

	};

	ActionListener radio_handler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton select_radio = (JRadioButton) e.getSource();
			if (select_radio == radio[0])
				setEnableComponent();
			else
				setEnableComponent2();
		}
	};

	ItemListener handler = new ItemListener() { // 체크박스 이벤트

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getItem() == checks[0])
					inputNums[0].setEditable(true);
				else if (e.getItem() == checks[1])
					inputNums[1].setEditable(true);
				else if (e.getItem() == checks[2])
					inputNums[2].setEditable(true);
				else if (e.getItem() == checks[3])
					inputNums[3].setEditable(true);
				else if (e.getItem() == checks[4])
					inputNums[4].setEditable(true);
				else if (e.getItem() == checks[5])
					inputNums[5].setEditable(true);
			} else {
				if (e.getItem() == checks[0])
					inputNums[0].setEditable(false);
				else if (e.getItem() == checks[1])
					inputNums[1].setEditable(false);
				else if (e.getItem() == checks[2])
					inputNums[2].setEditable(false);
				else if (e.getItem() == checks[3])
					inputNums[3].setEditable(false);
				else if (e.getItem() == checks[4])
					inputNums[4].setEditable(false);
				else if (e.getItem() == checks[5])
					inputNums[5].setEditable(false);
			}

		}

	};

	private void setEnableComponent() { // 자동 생성
		for (int i = 0; i < 6; i++) {
			inputNums[i].setEditable(false);
			checks[i].setVisible(true);
		}
		btn[0].setEnabled(true);
		btn[1].setEnabled(false);
		btn[2].setEnabled(false);
	}

	private void setEnableComponent2() { // 유효성 검사
		for (int i = 0; i < 6; i++) {
			inputNums[i].setEditable(true);
			checks[i].setVisible(false);
		}
		btn[0].setEnabled(false);
		btn[1].setEnabled(true);
		btn[2].setEnabled(false);
	}

	private JPanel createButtonPanel() { // 버튼
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 4));
		for (int i = 0; i < 4; i++) {
			btn[i] = new JButton(btn_str[i]);
			btn[i].addActionListener(btn_handler);
			panel.add(btn[i]);
		}

		return panel;
	}

	private JPanel createRadioPanel() { // 라디오
		JPanel panel = new JPanel();
		ButtonGroup group = new ButtonGroup();
		for (int i = 0; i < 2; i++) {
			radio[i] = new JRadioButton(radio_str[i]);
			radio[i].addActionListener(radio_handler);
			group.add(radio[i]);
			panel.add(radio[i]);
		}

		return panel;
	}

	private JPanel createInputField_total() {
		createInputField(); // input 6개 생성
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 6));
		for (int i = 0; i < 6; i++) {
			panel.add(panel_inputBox[i]);
		}

		return panel;
	}

	private JPanel[] createInputField() { // 체크박스, 텍스트필드
		for (int i = 0; i < 6; i++) {
			panel_inputBox[i] = new JPanel();
			panel_inputBox[i].setLayout(new GridLayout(2, 0));
			inputNums[i] = new JTextField(10);
			checks[i] = new JCheckBox();
			checks[i].addItemListener(handler);

			panel_inputBox[i].add(inputNums[i]);
			panel_inputBox[i].add(checks[i]);
		}
		return panel_inputBox;
	}

}
