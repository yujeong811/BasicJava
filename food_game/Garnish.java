package food_game;

import e_oop.ScanUtil;

public class Garnish {

	boolean putGar = false;
	String potato = "매쉬포테이토";
	String aspar = "아스파라거스";
//	boolean kind = false;

	void putGar() {
		putGar = !putGar;
		System.out.println(putGar ? "가니쉬 추가" : "가니쉬 추가 안함");
	}

//	void kind() {
//		if(putGar) {
//			kind = !kind;
//			System.out.println(kind ? "매쉬포테이토" : "아스파라거스");
//		}
//	}
	
	void kind() {
		while (putGar) {
			System.out.println("1.매쉬포테이토   2.아스파라거스");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				System.out.println(potato + "선택");
				break;
			case 2:
				System.out.println(aspar + "선택");
				break;
			}
		}

	}
}
