package jComboBoxTest1;

public class PhoneInfo {
	private String name;
	private String birthday;
	private String phoneNum;

	public PhoneInfo(String name, String birthday, String phoneNum) {
		this.name = name;
		this.birthday = birthday;
		this.phoneNum = phoneNum;
	}

	public PhoneInfo(String name, String phoneNum) {
		this(name, null, phoneNum);
	}

	public void show() {
		System.out.println(name);
		if (birthday != null)
			System.out.println("(" + birthday + ")");
		else
			System.out.println("\t");
		System.out.println("\t" + phoneNum);
	}

	public String toString() {
		return name;
	}
}
