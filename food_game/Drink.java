package food_game;

import e_oop.ScanUtil;

public class Drink {

	String wine = "와인";
	String water = "물";
	String coke = "콜라";
	String sprite = "사이다";
	
	void drinking() {
		System.out.println("============== 음료 선택 ==============");
		System.out.println("1.마심   2.안 마심");
		int yesno = ScanUtil.nextInt();
		switch (yesno) {
		case 1:
			kind();
			break;
		case 2:
			System.out.println("음료 안 마심");
			System.out.println();
			break;
		} 
	}
	
	
	void kind() {
			System.out.println("1.와인   2.물   3.콜라   4.사이다");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				System.out.println(wine + " 선택");
				break;
			case 2:
				System.out.println(water + " 선택");
				break;
			case 3:
				System.out.println(coke + " 선택");
				break;
			case 4:
				System.out.println(sprite + " 선택");
				break;
			}
			System.out.println();
	}
}
