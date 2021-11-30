package jComboBoxTest1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxTest1 extends JFrame {
	
	private Vector<PhoneInfo> mData = new Vector<PhoneInfo>(); //가변적 길이의 배열 생성
	
	public JComboBoxTest1() {
		super("JComboBoxTest1");
		this.setBounds(100,100,300,100);
		
		realData(); // 데이터 삽입
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private void buildGUI() {
		JComboBox<PhoneInfo> cbox = new JComboBox<PhoneInfo>(mData); //배열을 콤보박스에 적용
		cbox.setMaximumRowCount(3); // 콤보박스에서 한번에 보이는 목록의 수
		
		cbox.addActionListener(selectEventListener);
		cbox.addItemListener(ChoiceEventListener);
		
		this.add(cbox);
	}
	
	private void realData() {
		mData.add(new PhoneInfo("홍길동", "1990/01/01", "010-111-2222"));
		mData.add(new PhoneInfo("일지매", "010-123-4567"));
		mData.add(new PhoneInfo("이지매", "1990/12/31", "010-999-9999"));
		mData.add(new PhoneInfo("고주몽", "010-777-6666"));
	}
	
	
	private ActionListener selectEventListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JComboBox<PhoneInfo> select = (JComboBox<PhoneInfo>)e.getSource();
			System.out.println("선택...    ");
			
			((PhoneInfo)(select.getSelectedItem())).show();
			
		}
		
	};
	
	private ItemListener ChoiceEventListener = new ItemListener() {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED)
				System.out.println("Selected...    ");
			else
				System.out.println("Deselected...    ");
			
			((PhoneInfo)e.getItem()).show();
			System.out.println();
			
		}
		
	};

}
