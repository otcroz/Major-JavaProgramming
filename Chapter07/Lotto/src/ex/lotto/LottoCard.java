package ex.lotto;

import java.util.Scanner;

public class LottoCard {
	Lotto[] lotto;
	int n;
	
	public void setManual(int count){
		n = count;
		lotto = new Lotto[5];
		Scanner s= new Scanner(System.in);
		
		//로또번호 입력받기
		int i=0;
		int [] nums = new int[6];
		while(i<n) {
			System.out.println("** " + (i+1) + "/"+ n +"번째 로또");
			System.out.println("** 6개의 로또 번호를 입력하세요.");
			
			for(int j=0;j<nums.length;j++) {
				System.out.print(">>");
				nums[j] = s.nextInt();
			}
			
			//lotto[n] = new Lotto(nums[0], nums[1],nums[2],nums[3],nums[4],nums[5]); 번호 하나하나 넘기기
			lotto[i] = new Lotto(nums);
			lotto[i].show();
			i++;
		}
	}
	
	public void setAuto(int count) {
		n = count;
		lotto = new Lotto[5];
		int i=0;
		while(i<n) {
			lotto[i] = new Lotto();
			lotto[i].generate();
			lotto[i].show();
			i++;
		}
		
	}
}
