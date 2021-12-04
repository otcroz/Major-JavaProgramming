package pratice_14;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemberWindow2 extends JFrame {
	JTextField InputName, InputNum1, InputNum2, inputA, inputD;
	JTextArea area;

	JRadioButton[] radio = new JRadioButton[2];
	String[] s = { "남", "여" };

	JCheckBox[] check = new JCheckBox[4];
	String[] h = { "영화", "음악감상", "사진", "운동" };

	public MemberWindow2() {
		super("사원 등록");
		this.setSize(350, 420);

		buildGUI();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	private void buildGUI() {
		this.add(setGridLayout(), BorderLayout.NORTH);
		this.add(createInput6(), BorderLayout.CENTER);
	}

	private JPanel createInput1() { // 이름, 성별
		JPanel p = new JPanel();
		ButtonGroup g = new ButtonGroup();
		p.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel name = new JLabel("이름");
		JLabel sex = new JLabel("성별");
		InputName = new JTextField(8);
		
		InputName.addActionListener(new ActionListener() { //이벤트 처리

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField text = (JTextField)e.getSource();
				String input = text.getText();
				area.append("이름: " + input + "\n");
				
			}
			
		});
		
		p.add(name);
		p.add(InputName);
		p.add(sex);

		for (int i = 0; i < 2; i++) {
			radio[i] = new JRadioButton(s[i]);
			radio[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					String ss = null;
					if(e.getItem() == radio[0])
						ss = s[0];
					else if (e.getItem() == radio[1])
						ss = s[1];
					
					area.append("성별: "+ ss + "\n");
					
				}
				
			});
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
		
		InputNum2.addActionListener(new ActionListener() { //이벤트 처리

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField text = (JTextField)e.getSource();
				String input = text.getText();
				area.append("주민등록번호: " + InputNum1.getText() + input + "\n");
				
			}
			
		});

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
		
		inputA.addActionListener(new ActionListener() { //이벤트 처리

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField text = (JTextField)e.getSource();
				String input = text.getText();
				area.append("주소: " + input + "\n");
				
			}
			
		});
		
		p.add(address);
		p.add(inputA);

		return p;
	}

	private JPanel createInput4() { // 부서명
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel department = new JLabel("부서명");
		inputD = new JTextField(8);

		inputD.addActionListener(new ActionListener() { //이벤트 처리

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField text = (JTextField)e.getSource();
				String input = text.getText();
				area.append("부서명: " + input + "\n");
				
			}
			
		});
		
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
			check[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					String hh = "";
					if(e.getStateChange() == ItemEvent.SELECTED) {
						if(e.getItem() == check[0])
							hh += h[0];
						if (e.getItem() == check[1])
							hh += h[1];
						if (e.getItem() == check[2])
							hh += h[2];
						if (e.getItem() == check[3])
							hh += h[3];
					}

					area.append(hh + " ");
					
				}
				
			});
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


	private JPanel setGridLayout() {
		JPanel p = new JPanel(new GridLayout(5, 0));

		p.add(createInput1());
		p.add(createInput2());
		p.add(createInput3());
		p.add(createInput4());
		p.add(createInput5());

		return p;
	}


	// 이벤트 처리 함수	
	//ItemEvent(라디오, 체크박스)
	
	
}
