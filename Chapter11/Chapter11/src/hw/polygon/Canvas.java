package hw.polygon;

public class Canvas {
	Polygon[] pList;
	int n;
	int count = 0;

	public Canvas(int n) {
		this.n = n;
		pList = new Polygon[n];
	}

	public void draw(Polygon p) {
		pList[count] = p; // 확인하기
		count++;
		if (count >= n) {
			System.out.println("다각형 객체를 Canvas에 넣을 수 없어요!");
		}
	}

	public void display() {
		for (int i = 0; i < count; i++) {
			pList[i].show();
			if(pList[i].type == "Rectangle") { // 정사각형 여부 판단(?)
				if(pList[i].w == pList[i].h)
					System.out.println("정사각형입니다.");
			}
			else if(pList[i].type == "Square") 
				System.out.println("정사각형입니다.");
		}
	}
}
