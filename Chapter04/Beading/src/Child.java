
public class Child {
	private int beadNum;

	// ������
	public Child() {}

	public Child(int beadNum) {
		this.beadNum = beadNum;
	}

	// �޼ҵ�
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
