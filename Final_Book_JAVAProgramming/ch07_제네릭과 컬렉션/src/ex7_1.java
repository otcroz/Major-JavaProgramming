import java.util.Vector;

public class ex7_1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		
		for(int i=0;i<v.size();i++) {
			int n = v.get(i);
			System.out.print(n + " ");
		}
		System.out.println();
		
		v.add(0,100); // 인덱스 2번째 요소에 100 삽입
		
		System.out.println("백터 내의 요소 객체 수: " + v.size());
		System.out.println("백터의 현재 용량: " + v.capacity());
		
		for(int i=0;i<v.size();i++) {
			int n = v.get(i);
			System.out.print(n + " ");
		}
		System.out.println();
		
		//벡터 요소의 합 구하기
		int sum = 0;
		for(int i=0;i<v.size();i++) {
			int n = v.elementAt(i);
			sum+=n;
		}
		System.out.println("벡터에 있는 정수 합: " + sum);
	}
}
