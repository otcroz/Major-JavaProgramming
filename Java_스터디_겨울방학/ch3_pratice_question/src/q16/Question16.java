package q16;

import java.util.Scanner;

public class Question16 {
	public static void main(String[] args) {
		String[] str = {"����", "����", "��"};
		Scanner s = new Scanner(System.in);
		
		System.out.println("��ǻ�Ϳ� ���������� ������ �մϴ�.");
		while(true) {
			System.out.print("���� ���� ��!>>");
			String user = s.next();
			if(user.equals("�׸�")){
				System.out.println("������ �����մϴ�........");
				break;
			}
				
			
			int com = (int)(Math.random()*3);
			
			String res = null;
			if(str[com].equals("����")) {
				if(user.equals("����"))
					res = "�����ϴ�.";
				else if(user.equals("����"))
					res = "����ڰ� �̰���ϴ�.";
				else
					res = "����ڰ� �����ϴ�.";
				
			}
			else if(str[com].equals("����")) {
				if(user.equals("����"))
					res = "�����ϴ�.";
				else if(user.equals("��"))
					res = "����ڰ� �̰���ϴ�.";
				else
					res = "����ڰ� �����ϴ�.";
			}
			else if(str[com].equals("��")) {
				if(user.equals("��"))
					res = "�����ϴ�.";
				else if(user.equals("����"))
					res = "����ڰ� �̰���ϴ�.";
				else
					res = "����ڰ� �����ϴ�.";
			}
			
			System.out.println("����� = " + user +", " + "��ǻ�� = " + str[com] +", "+ res);
		}
	}
}
