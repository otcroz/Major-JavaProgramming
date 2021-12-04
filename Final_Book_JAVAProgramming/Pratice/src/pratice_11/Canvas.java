package pratice_11;

public class Canvas {
	int size;
	Polygon[] p;
	int count = 0;
	
	Canvas(int size){
		this.size = size;
		this.p = new Polygon[size];
	}

	public void draw(Polygon p) {
		if (size <= count)
			System.out.println("더이상 배열에 도형을 넣을 수 없어요!");
		else {
			this.p[count] = p;
			count++;	
		}
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			p[i].show();
			
			if(p[i] instanceof Rectangle) {
				/*Rectangle r = (Rectangle)p[i];
				boolean res = r.isSquare();*/
				
				boolean res = ((Rectangle)p[i]).isSquare();
				
				if(res)
					System.out.println("정사각형입니다.");
				else
					System.out.println("정사각형이 아닙니다.");
			}
			System.out.println("\n");
		}
	}
}
