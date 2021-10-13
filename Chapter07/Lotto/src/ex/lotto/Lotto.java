package ex.lotto;

import java.util.Random;

public class Lotto {
	private int[] lottoNumber;
	private boolean isValid = true;

	public Lotto() {}
	
	public Lotto(int n1, int n2, int n3, int n4, int n5, int n6) {
		lottoNumber = new int[6];
		//로또번호 입력 시 유효한 번호인지 확인
		lottoNumber[0] = n1; lottoNumber[1] = n2; 
		lottoNumber[2] = n3; lottoNumber[3] = n4; 
		lottoNumber[4] = n5; lottoNumber[5] = n6; 
		
		isValid = verify(lottoNumber);
	}

	public Lotto(int[] nums) {
		lottoNumber = new int[6];

		for (int i = 0; i < 6; i++) {
			lottoNumber[i] = nums[i];
		}
		isValid = verify(lottoNumber);
	}

	boolean verify(int[] n) {
		boolean res = true; //초기값 설정
		for (int i=0; i<n.length-1;i++) {
			if (n[i] >= 1 && n[i] <= 45) { //범위 유효
				for(int k=i+1; k < n.length; k++) {
					if (n[i] == n[k])  //중복 여부
						res = false;
				}
			}else
				res = false;
		}
		return res;
	}

	public void show() {
		if (isValid) {
			System.out.println("로또 번호");
			for (int n : lottoNumber) {
				System.out.print(n + " ");
			}
			System.out.println();
		} else 
			System.out.println("Error!! 입력하신 로또 번호는 유효한 번호가 아닙니다.");
	}

	public void generate() {
		lottoNumber = new int[6];
		int i;
		for (i=0; i<lottoNumber.length;i++) {
			Random r = new Random();
			lottoNumber[i] = r.nextInt(45)+1;
			
			for(int k=0; k<i; k++) { //값 중복 방지
				if (lottoNumber[k] == lottoNumber[i]) {
					i--;
					break;
				}
			}
		}
	}

	public int[] getNumbers() {
		if (isValid) {
			return lottoNumber;
		} else
			return null;
	}
}
