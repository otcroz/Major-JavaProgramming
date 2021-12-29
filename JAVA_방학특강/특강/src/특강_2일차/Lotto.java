package 특강_2일차;

import java.util.Random;

public class Lotto {
	private static Random rand = new Random(); // 여러 개의 로또 클래스에서 사용할 일이 있을 때 하나에서 공유하여 사용

	private int[] lottoNumber = new int[6];
	private int nValid = 0;
	// HashSet으로 만들면 번호가 일정 범위 내에 있는지에 대해서만 확인할 수 있음

	boolean verify() {
		boolean valid_num = false;
		for (int i = 0; i < nValid-1; i++) { // 예외 처리
			if (lottoNumber[i] >= 1 && lottoNumber[i] <= 45) { // 범위 검사
				for (int j = i + 1; j < nValid; j++) { // 유효성 검사
					if (lottoNumber[i] == lottoNumber[j]) {
						System.out.println("똑같은 숫자가 있습니다: " + lottoNumber[i]);
						return false;
					}
				}
				valid_num = true;
			} else {
				System.out.println("1-45의 범위를 넘는 숫자가 있습니다." + (i + 1) + "번째 숫자");
			}
		}

	return valid_num;

	}

	void generate() {
		// 나머지 숫자 자동 생성
		int rand_num;
		for (int i = nValid; i < 6; i++) {
			rand_num = rand.nextInt(45) + 1;
			lottoNumber[i] = rand_num;

			for (int j = 0; j < nValid; j++) {
				if (lottoNumber[i] == lottoNumber[j])
					nValid--;
			}
		}
	}

	int[] getNumbers() {
		return lottoNumber;
		// HashSet을 반환X, 지역적 배열을 선언 후, iterator를 통해 HashSet에 들어있는 값을 배열에 넣은 후 반환하기
	}

	boolean setNumber(int n) {
		lottoNumber[nValid++] = n;
		boolean valid = verify();

		if (!valid)
			nValid--;
		return valid; // true, false에 따라 콘솔창 출력 또는 팝업창이 뜨도록 구현하기
	}

	void reset() { // 배열 초기화
		nValid = 0;
	}
}
