import javax.swing.JFrame;

public class JFramePratice {
	private JFrame frame;
	
	public JFramePratice() {
		frame = new JFrame("사원 등록");
		
		bulidGUI(); // 프레임 구성
		
		frame.setSize(350, 420);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		
	}
	//레이블과 입력칸 배치(왼쪽정렬)(flow)
	
	//묶어준 레이블과 입력칸 배치(grid)
	
	//자기소개 수직적 배치(border)
	
	//저장, 종료 버튼 배치(flow)(center)
	
	//자기소개 칸과 버튼 칸 배치(border)
	
	//전체 묶어주기(border)
}
