
public class Point {
	private int x;
	private int y;

	//생성자
	public Point(){
		this(0,0); // 생성자를 호출하여 초기화
		//this.x = 0;
		//this.y = 0;
	}; 
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//메소드
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void show() {
		System.out.println("( "+ x + ", " + y +"+)");
	}
}
