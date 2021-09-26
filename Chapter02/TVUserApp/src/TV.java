
public class TV {
	boolean status = false;
	int channel;
	int volume;
	final int CHANNEL_LIMIT = 5;
	final int VOLUME_LIMIT = 10;

	// 생성자
	TV() {
	}

	TV(int channel, int volume) {
		this.channel = channel;
		this.volume = volume;
	}

	// 메서드
	String pushPower() {
		if (status == false) {
			status = true;
			return "TV를 켰습니다.";
		} else {
			status = false;
			return "TV를 껐습니다.";
		}
	}

	void channelUp() {
		if (status == false) {
			return;

		} else {
			channel += 1;
			if (channel > CHANNEL_LIMIT)
				channel = 1;
		}
	}

	void channelDown() {
		if (status == false) {
			return;
		} else {
			channel -= 1;
			if (channel < 1)
				channel = CHANNEL_LIMIT;
		}
	}

	void volumeUp() {
		if (status == false) {
			return;
		} else {
			volume += 1;
			if (volume > VOLUME_LIMIT)
				volume = VOLUME_LIMIT;
		}
	}

	void volumeDown() {
		if (status == false) {
			return;
		} else {
			volume -= 1;
			if (volume < 1)
				volume = VOLUME_LIMIT;
		}
	}
}
