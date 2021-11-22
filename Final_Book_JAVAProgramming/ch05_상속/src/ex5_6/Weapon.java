package ex5_6;

public class Weapon {
	protected int fire() {
		return 1;
	}
}

class Cannon extends Weapon{

	@Override
	protected int fire() {
		return 10;
	}
}
