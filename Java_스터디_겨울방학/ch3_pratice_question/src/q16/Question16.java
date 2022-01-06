package q16;

import java.util.Scanner;

public class Question16 {
	public static void main(String[] args) {
		String[] str = {"가위", "바위", "보"};
		Scanner s = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user = s.next();
			if(user.equals("그만")){
				System.out.println("게임을 종료합니다........");
				break;
			}
				
			
			int com = (int)(Math.random()*3);
			
			String res = null;
			if(str[com].equals("가위")) {
				if(user.equals("가위"))
					res = "비겼습니다.";
				else if(user.equals("바위"))
					res = "사용자가 이겼습니다.";
				else
					res = "사용자가 졌습니다.";
				
			}
			else if(str[com].equals("바위")) {
				if(user.equals("바위"))
					res = "비겼습니다.";
				else if(user.equals("보"))
					res = "사용자가 이겼습니다.";
				else
					res = "사용자가 졌습니다.";
			}
			else if(str[com].equals("보")) {
				if(user.equals("보"))
					res = "비겼습니다.";
				else if(user.equals("가위"))
					res = "사용자가 이겼습니다.";
				else
					res = "사용자가 졌습니다.";
			}
			
			System.out.println("사용자 = " + user +", " + "컴퓨터 = " + str[com] +", "+ res);
		}
	}
}
