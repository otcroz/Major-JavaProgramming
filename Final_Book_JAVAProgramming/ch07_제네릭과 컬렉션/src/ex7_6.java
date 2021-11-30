import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ex7_6 {
	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한워선", 99);
		
		System.out.println("HashMap의 요소 개수: " + scoreMap.size());
		
		Set<String> keys = scoreMap.keySet();
		Iterator<String> it = keys.iterator();
		
		for(int i=0;i< scoreMap.size();i++) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name + " " + score);
		}
	}
}
