package code.student;

public class UniverseStudent extends Student {
	private String major;
	
	public void WhoAreYou(String m) {
		major = m;
	}
	
	public void printMajor() {
		 System.out.println(major);
	}
}
