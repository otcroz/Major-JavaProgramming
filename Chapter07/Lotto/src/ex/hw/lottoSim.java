package ex.hw;

import ex.lotto.LottoCard;

public class lottoSim {

	public static void main(String[] args) {
		LottoCard card = new LottoCard();
		
		System.out.println("<< Lotto 자동 번호 생성 >>");
		card.setAuto(5); //로또 번호 자동 설정
		
		System.out.println();
		
		System.out.println("<< Lotto 수동 번호 생성 >>");
		card.setManual(3);
		
		System.out.println("로또 번호 입력이 종료되었습니다.");
	}
}
