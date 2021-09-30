
public class Child {
	private int beadNum;
	
	// 생성자
	public Child() {
		this(0);
	}

	public Child(int beadNum) {
		this.beadNum = beadNum;
	}

	// 메서드
	public void Beading(Child c, int n) {
		if (c.beadNum > n) {
			this.beadNum += n;
			c.beadNum -= n;
		} else {
			this.beadNum += c.beadNum;
			c.beadNum = 0;
		}
	}

	public int getBead() {
		return beadNum;
	}
}
