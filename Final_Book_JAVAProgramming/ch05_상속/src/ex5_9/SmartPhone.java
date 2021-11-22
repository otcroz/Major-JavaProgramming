package ex5_9;

interface PhoneInterface { // 인터페이스
	final int TIMEOUT = 1000;

	void sendCall();

	void receiveCall();

	default void printLogo() {
		System.out.println("** Phone **");
	}

}

interface MobilePhoneInterface extends PhoneInterface { // 인터페이스 상속
	void sendSMS();

	void receiveSMS();
}

interface MP3Interface { // 인터페이스 2
	public void play();

	public void stop();
}

class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() {
		System.out.println("따르르르릉~");

	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔어요");

	}

	@Override
	public void play() {
		System.out.println("음악 연주합니다.");

	}

	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");

	}

	@Override
	public void sendSMS() {
		System.out.println("문자갑니다.");

	}

	@Override
	public void receiveSMS() {
		System.out.println("문자왔어요.");

	}

	// 메서드 추가
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}

}
