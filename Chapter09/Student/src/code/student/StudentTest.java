package code.student;

public class StudentTest {

	public static void main(String[] args) {
		UniverseStudent student = new UniverseStudent();
		student.setName("유수연");
		student.setAge(22);
		student.WhoAreYou("컴퓨터공학전공");
		
		student.WhatYourName();
		student.HowOlderYou();
		student.printMajor();
	}

}
