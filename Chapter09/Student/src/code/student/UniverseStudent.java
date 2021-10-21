package code.student;

public class UniverseStudent extends Student {
	private String major;
	
	public UniverseStudent() {
		super("없음", 0);
		major = "전공 없음";
	}
	
	public UniverseStudent(String s , int a, String m) {
		super(s,a);
		major = m;
	}
	
	public void introduce() {
		 super.introduce();
		 System.out.println("전공: " + major);
	}
}
