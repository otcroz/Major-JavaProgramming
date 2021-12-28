package 특강_1일차;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class PhoneBookJFrame {

	JFrame frame;
	
	String[] btnString = {"일반", "대학", "회사"};
	JToggleButton[] tgBtn = new JToggleButton[3];
	
	private CardLayout card = new CardLayout();
	JPanel card_panel;

	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	JTextField text5;
	JTextField text6;
	
	JButton btn1;
	JButton btn2;

	public PhoneBookJFrame() {
		frame = new JFrame("PhoneBook");
		frame.setSize(250, 400);

		buildGUI();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void buildGUI() {
		frame.add(createButtonPanel1(), BorderLayout.NORTH);
		frame.add(createCenterPanel());
		frame.add(createButtonPanel2(), BorderLayout.SOUTH);

	}
	
	private JPanel createCenterPanel() { // centerPanel
		JPanel panel = new JPanel();
		panel.add(createBasicTextFieldPanel());
		panel.add(createCardPanel());
		
		return panel;
	}
	
	private JPanel createBasicTextFieldPanel() { // 기본적으로 고정된 textField
		JPanel panel = new JPanel();
		panel.add(createTextField1());
		
		return panel;
	}
	
	private JPanel createCardPanel() { //cardPanel
		card_panel = new JPanel();
		card_panel.setLayout(card);
		
		card_panel.add("page1", new JPanel());
		card_panel.add("page2", createTextField_univ());
		card_panel.add("page3", crateTextField_comp());
		
		return card_panel;
	}
	
	private JPanel createTextField_univ() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,0));
		panel.add(createTextField_univ_1());
		panel.add(createTextField_univ_2());

		return panel;
	}
	
	private JPanel createTextField_univ_1() { // 전공 텍스트필드
		JPanel panel = new JPanel();
		JLabel label_major = new JLabel("전        공");
		text4 = new JTextField(10);
		
		panel.add(label_major);
		panel.add(text4);
		
		return panel;
	}
	
	private JPanel createTextField_univ_2() { // 회사 텍스트필드
		JPanel panel = new JPanel();
		JLabel label_grade = new JLabel("학        년");
		text5 = new JTextField(10);
		
		panel.add(label_grade);
		panel.add(text5);
		
		return panel;
	}
	
	private JPanel crateTextField_comp() {
		JPanel panel = new JPanel();
		JLabel label_comp = new JLabel("회        사");
		text6 = new JTextField(10);

		panel.add(label_comp);
		panel.add(text6);

		return panel;
	}
	
	
	private JPanel createTextField1() { // 원래 텍스트필드 패널에 붙이기
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,0));
		panel.add(createPanel1());
		panel.add(createPanel2());
		panel.add(createPanel3());

		return panel;
	}
	
	private JPanel createEventButton() { //버튼을 누르면 텍스트필드 추가
		JPanel panel = new JPanel();
		
		tgBtn[0].setSelected(true);
		tgBtn[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(card_panel, "page1");
				
			}
			
		});
		
		tgBtn[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(card_panel, "page2");
				
			}
			
		});
		
		tgBtn[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(card_panel, "page3");
				
			}
			
		});
		
		
		return panel;
	}

	private JPanel createButtonPanel1() {
		JPanel panel = new JPanel();
		ButtonGroup btnGroup = new ButtonGroup();
		
		for (int i = 0; i < 3; i++) {
			tgBtn[i] = new JToggleButton(btnString[i]);
			btnGroup.add(tgBtn[i]);
			panel.add(tgBtn[i]);
		}
		
		createEventButton();

		return panel;
	}

	private JPanel createButtonPanel2() {
		JPanel panel = new JPanel();

		btn1 = new JButton("입력"); // "입력" 이벤트 처리
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}

		});

		btn2 = new JButton("초기화");
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
				text2.setText("");
				text3.setText("");
				text4.setText("");
				text5.setText("");
				text6.setText("");
				
			}

		});

		panel.add(btn1);
		panel.add(btn2);

		return panel;
	}

	private JPanel createPanel1() {
		JPanel panel1 = new JPanel();
		JLabel label_name = new JLabel("이        름");
		text1 = new JTextField(10);

		panel1.add(label_name);
		panel1.add(text1);

		return panel1;
	}

	private JPanel createPanel2() {
		JPanel panel2 = new JPanel();
		JLabel label_tellnum = new JLabel("전화번호");
		text2 = new JTextField(10);

		panel2.add(label_tellnum);
		panel2.add(text2);

		return panel2;
	}

	private JPanel createPanel3() {
		JPanel panel3 = new JPanel();
		JLabel label_birth = new JLabel("생년월일");
		text3 = new JTextField(10);

		panel3.add(label_birth);
		panel3.add(text3);

		return panel3;
	}


}
