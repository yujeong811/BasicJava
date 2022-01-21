package food_game;

import e_oop.ScanUtil;

public class Drink {

	boolean drinking = false;
	String wine = "와인";
	String water = "물";
//	boolean kind = false;
	
	void drinking() {
		drinking = !drinking;
		System.out.println(drinking ? "음료 마심" : "음료 안 마심");
	}
	
//	void kind() {
//		if(drinking) {
//			kind = !kind;
//			System.out.println(kind ? "와인" : "물");
//		}
//	}
	
	void kind() {
		while (drinking) {
			System.out.println("1.와인   2.물");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				System.out.println(wine + "선택");
				break;
			case 2:
				System.out.println(water + "선택");
				break;
			}
		}
	}
}
