package q1;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	};

	protected int getSize() {
		return size;
	};
}

class ColorTV extends TV{
	int color;
	
	public ColorTV(int inch, int color) {
		super(inch);
		this.color = color;
	}
	
	public void printProperty() {
		System.out.println(getSize() +"인치 "+ color + "컬러");
	}
	
}

class IPTV extends ColorTV{
	String ipNum;
	
	public IPTV(String ipNum, int inch, int color){
		super(inch, color);
		this.ipNum = ipNum;
	}
	
	public void printProperty() {
		System.out.print("나의 IPTV는 " + ipNum +" 주소의 ");
		super.printProperty();
	}
}

public class Question_1 {
	public static void main(String[] args) {
		//question 1
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
		
		//question2
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
