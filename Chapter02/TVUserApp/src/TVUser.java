
public class TVUser {

	public static void main(String[] args) {
		TV tv = new TV(1,5);
		
		System.out.println(tv.pushPower());
		System.out.println("채널 번호: " + tv.channel + "  볼륨 크기: " + tv.volume);
		
		tv.channelDown();
		tv.volumeUp();
		tv.volumeUp();
		System.out.println("채널 번호: " + tv.channel + "  볼륨 크기: " + tv.volume);
		
		System.out.println(tv.pushPower());
	}
}
