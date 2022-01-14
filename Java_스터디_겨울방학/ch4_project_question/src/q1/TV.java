package q1;

public class TV {
	String company;
	int year;
	int size_inch;
	
	public TV(String company, int year, int size_inch) {
		this.company = company;
		this.year = year;
		this.size_inch = size_inch;
	}
	
	public void show() {
		System.out.println(company + "에서 만든 " + year + "년형 " + size_inch + "인치 TV");
		
	}
	
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}


