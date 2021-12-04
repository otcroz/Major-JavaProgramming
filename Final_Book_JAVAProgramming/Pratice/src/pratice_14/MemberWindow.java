package pratice_14;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemberWindow extends JFrame {

	JTextField InputName, InputNum1, InputNum2, inputA, inputD;
	JTextArea area;

	JRadioButton[] radio = new JRadioButton[2];
	String[] s = { "남", "여" };

	JCheckBox[] check = new JCheckBox[4];
	String[] h = { "영화", "음악감상", "사진", "운동" };

	public MemberWindow() {
		super("사원 등록");
		this.setSize(350, 420);

		buildGUI();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	private void buildGUI() {
		this.add(setGridLayout(), BorderLayout.NORTH);
		this.add(setIntroduce(), BorderLayout.CENTER);
	}

	private JPanel createInput1() { // 이름, 성별
		JPanel p = new JPanel();
		ButtonGroup g = new ButtonGroup();
		p.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel name = new JLabel("이름");
		JLabel sex = new JLabel("성별");
		InputName = new JTextField(8);

		p.add(name);
		p.add(InputName);
		p.add(sex);

		for (int i = 0; i < 2; i++) {
			radio[i] = new JRadioButton(s[i]);
			g.add(radio[i]);
			p.add(radio[i]);
		}

		return p;
	}

	private JPanel createInput2() { // 주민등록번호
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel num = new JLabel("주민등록번호");
		JLabel h = new JLabel("-");
		InputNum1 = new JTextField(6);
		InputNum2 = new JTextField(7);

		p.add(num);
		p.add(InputNum1);
		p.add(h);
		p.add(InputNum2);

		return p;
	}

	private JPanel createInput3() { // 주소
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel address = new JLabel("주소");
		inputA = new JTextField(22);

		p.add(address);
		p.add(inputA);

		return p;
	}

	private JPanel createInput4() { // 부서명
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel department = new JLabel("부서명");
		inputD = new JTextField(8);

		p.add(department);
		p.add(inputD);

		return p;
	}

	private JPanel createInput5() { // 취미
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel hobby = new JLabel("취미");
		p.add(hobby);

		for (int i = 0; i < h.length; i++) {
			check[i] = new JCheckBox(h[i]);
			p.add(check[i]);
		}

		return p;
	}

	private JPanel createInput6() { // 자기소개
		JPanel p = new JPanel(new BorderLayout());

		JLabel hobby = new JLabel("자기소개");
		area = new JTextArea(9, 22);

		p.add(hobby, BorderLayout.NORTH);
		p.add(area, BorderLayout.CENTER);

		return p;

	}

	private JPanel createButton() {
		JPanel p = new JPanel();

		JButton save = new JButton("저장");
		JButton exit = new JButton("종료");

		save.addActionListener(saveActionEvent);
		exit.addActionListener(exitActionEvent);

		p.add(save);
		p.add(exit);

		return p;
	}

	private JPanel setGridLayout() {
		JPanel p = new JPanel(new GridLayout(5, 0));

		p.add(createInput1());
		p.add(createInput2());
		p.add(createInput3());
		p.add(createInput4());
		p.add(createInput5());

		return p;
	}

	private JPanel setIntroduce() {
		JPanel p = new JPanel(new BorderLayout());
		p.add(createInput6(), BorderLayout.CENTER);
		p.add(createButton(), BorderLayout.SOUTH);

		return p;
	}

	// 이벤트 처리 함수
	ActionListener exitActionEvent = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
		
	};
	
	ActionListener saveActionEvent = new ActionListener() {

		String name, num1, num2, a, b, sex, hob;

		@Override
		public void actionPerformed(ActionEvent e) {
			area.setText("");
			hob = "";

			// 라디오 선택
			if (radio[0].isSelected())
				sex = s[0];
			else if (radio[1].isSelected())
				sex = s[1];
			else
				sex = "";

			// 취미 선택
			if (check[0].isSelected())
				hob += h[0] + " ";
			if (check[1].isSelected())
				hob += h[1] + " ";
			if (check[2].isSelected())
				hob += h[2] + " ";
			if (check[3].isSelected())
				hob += h[3] + " ";

			inputText();
			setText();
		}

		void inputText() {
			area.append("이름: " + InputName.getText() + "\n");
			area.append("성별: " + sex + "\n");
			area.append("주민등록번호: " + InputNum1.getText() + InputNum2.getText() + "\n");
			area.append("주소: " + inputA.getText() + "\n");
			area.append("부서명: " + inputD.getText() + "\n");
			area.append("취미: " + hob + "\n");

		}

		void setText() {
			InputName.setText("");
			InputNum1.setText("");
			InputNum2.setText("");
			inputA.setText("");
			inputD.setText("");
		}

	};
}
