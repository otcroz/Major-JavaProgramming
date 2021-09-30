

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
	public void obtainBead(Child c, int nObtainBead) {
		beadNum += c.loseBead(nObtainBead);
	}

	public int loseBead(int nLoseBead) {
		if (beadNum < nLoseBead) {
			int rBead = beadNum;
			beadNum = 0;
			return rBead;
		}
		beadNum -= nLoseBead;
		return nLoseBead;
	}

	public int getBead() {
		return beadNum;
	}

	public void show() {
		System.out.println("보유 개수:" + beadNum);
	}
}
