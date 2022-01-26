package food_game;

import e_oop.ScanUtil;

public class Garnish {
	String[] gar = { "매쉬포테이토", "아스파라거스", "레몬", "브로콜리", "안함" };
	int index3 = (int) (Math.random() * gar.length); // 랜덤인덱스
	
	String potato = "매쉬포테이토";
	String aspar = "아스파라거스";
	String lemon = "레몬";
	String bro = "브로콜리";

	void putGar(Money n, Store t) { // 가니쉬 넣음/안넣음 선택
		System.out.println("============== 가니쉬 선택 =============");
		System.out.println("1.넣음   2.안 넣음");
		int yesno = ScanUtil.nextInt();
		switch (yesno) {
		case 1:
			if (index3 == 4) {
				System.out.println("잘못 선택했습니다. 돈이 1000원 깎였습니다.");
				n.moneySum -= 1000;
				System.out.println();
			} else {
				garKind(n, t);
			}
			break;
		case 2:
			System.out.println("가니쉬 안 넣음");
			if (index3 != 4) {
				System.out.println("잘못 선택했습니다. 돈이 1000원 깎였습니다.");
				n.moneySum -= 1000;
				System.out.println();
			} else {
				System.out.println();
			}
			break;
		}
	}

	void garKind(Money n, Store t) { // 가니쉬 종류 선택
		System.out.println("1.매쉬포테이토   2.아스파라거스   3.레몬   4.브로콜리");
		int garnish = ScanUtil.nextInt();

		switch (garnish) {
		case 1:
			System.out.println(potato + " 선택");
			n.moneySum += 3000;
			t.po_num--;
			break;
		case 2:
			System.out.println(aspar + " 선택");
			n.moneySum += 2000;
			t.as_num--;
			break;
		case 3:
			System.out.println(lemon + " 선택");
			n.moneySum += 2000;
			t.le_num--;
			break;
		case 4:
			System.out.println(bro + " 선택");
			n.moneySum += 2000;
			t.bro_num--;
			break;
		}
		if (garnish != index3 + 1) {
			System.out.println("잘못 선택했습니다. 돈이 1000원 깎였습니다.");
			n.moneySum -= 1000;
			System.out.println();
		} else {
			System.out.println();
		}
	}

}
