package code.student;

public class Student {
	private String name;
	private int age;
	
	public Student(String s , int a) {
		name = s;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}
