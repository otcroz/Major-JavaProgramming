import java.util.HashMap;
import java.util.Scanner;

public class ex7_5 {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		
		//값을 넣는다.
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//사용자에게 값을 입력 받는다. exit을 받으면 종료
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("찾고 싶은 단어는?");
			String eng = s.nextLine();
			if(eng.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println(eng +"에 해당하는 단어가 없습니다.");
			else
				System.out.println(kor);
		}
		
		
	}
}
