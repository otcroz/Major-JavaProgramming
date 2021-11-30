import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ex7_3 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		Iterator<String> it = a.iterator();
		for(int i=0;i<4;i++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.next(); //문자열 입력받음
			a.add(s);
		}
		
		//배열에 들어있는 모든 요소 출력하기
		it = a.iterator();
		while(it.hasNext()){
			String name = it.next();
			System.out.println(name + " ");
		}
		
		int longString = 0;
		it = a.iterator();
		for(int i=0;i<a.size();i++) {
			if(a.get(longString).length() < it.next().length())
				longString = i;
		}
		System.out.println("가장 긴 이름은 " + a.get(longString) + "입니다.");
	}
}
