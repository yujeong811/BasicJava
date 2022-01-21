package food_game;

import e_oop.ScanUtil;

public class MyGame {

	String[] grill = { "레어", "미디엄", "웰던" };
	String[] source = { "BBQ", "머쉬룸" };
	String[] gar = { "매쉬포테이토", "아스파라거스" };
	String[] drink = { "와인", "물" };

	public static void main(String[] args) {
		new MyGame().start();
	}

	void start() {
		while (true) {
			System.out.println("1.게임 시작    0.종료>");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				// 요리 시작 메서드 넣기
				break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
	}

	void cook() {

	}
}
