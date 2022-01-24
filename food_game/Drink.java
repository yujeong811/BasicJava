package food_game;

import e_oop.ScanUtil;

public class Drink {
	Money n = new Money();
	
	String[] drink = { "와인", "물", "콜라", "사이다", "안함" };
	int index4 = (int) (Math.random() * drink.length);

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
			if (index4 == 4) {
				System.out.println("잘못 선택했습니다. 돈이 1000원 깎였습니다.");
				n.drinkM -= 1000;
				System.out.println();
			} else {
				kind();
			}
			break;
		case 2:
			System.out.println("음료 안 마심");
			if (index4 != 4) {
				System.out.println("잘못 선택했습니다. 돈이 1000원 깎였습니다.");
				n.drinkM -= 1000;
				System.out.println();
			} else {
				System.out.println();
			}
			break;
		}

	}

	void kind() {
		System.out.println("1.와인   2.물   3.콜라   4.사이다");
		int drink = ScanUtil.nextInt();

		switch (drink) {
		case 1:
			System.out.println(wine + " 선택");
			n.drinkM += 6000;
			break;
		case 2:
			System.out.println(water + " 선택");
			n.drinkM += 1500;
			break;
		case 3:
			System.out.println(coke + " 선택");
			n.drinkM += 1500;
			break;
		case 4:
			System.out.println(sprite + " 선택");
			n.drinkM += 1500;
			break;
		}

		if (drink != index4 + 1) {
			System.out.println("잘못 선택했습니다. 돈이 1000원 깎였습니다.");
			System.out.println();
		} else {
			System.out.println();
		}

	}
}
