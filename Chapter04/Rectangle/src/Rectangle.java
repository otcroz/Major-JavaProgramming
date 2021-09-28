
public class Rectangle {
	Point lt; //참조 변수를 만들어 둠
	Point rb;
	
	//생성자
	public Rectangle(int x1, int y1, int x2, int y2){
		/* lt = new Point(x1, y1); //필요한 순간에 객체 생성
		   rb = new Point(x2, y2);*/
		this(new Point(x1,y1), new Point(x2,y2)); //생성자 호출하여 코드 단순화
	}
	
	public Rectangle(Point dot1, Point dot2){
		lt = new Point(dot1.getX(),dot1.getY()); //필요한 순간에 객체 생성
		rb = new Point(dot2.getX(),dot2.getY());
	}
	
	//메서드
	public int getWidth(){
		int width = rb.getX() - lt.getX();
		return width;
	}
	
	public int getHeight(){
		int height = rb.getY() - lt.getY();
		return height;
	}
	
	public int getCircumference() {
		int circum = 2*(getWidth() + getHeight());
		return circum;
	}
	
	public int getArea() {
		int area = getWidth() * getHeight();
		return area;
	}
	
	public void show() {
		System.out.print("[직사각형 " + getWidth() + "x" + getHeight() + ": ");
		System.out.print("(" + lt.getX() + ", "+ lt.getY() + "), ");
		System.out.print("(" + rb.getX() + ", "+ rb.getY() + ")] ");
		System.out.println();
	}
}
