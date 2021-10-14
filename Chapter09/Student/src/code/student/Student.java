package code.student;

public class Student {
	private String name;
	private int age;
	
	public void WhatYourName() {
		System.out.println("이름: " + name);
	}
	
	public void HowOlderYou() {
		System.out.println("나이: " + age);
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
}
