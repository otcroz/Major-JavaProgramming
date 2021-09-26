
public class Child {
	private int beadNum;

	// 持失切
	public Child() {}

	public Child(int beadNum) {
		this.beadNum = beadNum;
	}

	// 五社球
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
