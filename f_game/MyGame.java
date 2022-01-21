package f_game;

import e_oop.ScanUtil; // 과제 : 27일까지 게임 만들기

public class MyGame { // RPG게임

	Character c;
	Item[] items;
	// 몬스터는 계속 있는것이 아니라 사냥을 할때만 그때그때 만들어서 사용

	MyGame() {
		c = new Character("가렌", 100, 50, 20, 10);

		items = new Item[10];
		items[0] = new Item("무한의대검", 0, 0, 10, 0);
		items[1] = new Item("가시갑옷", 0, 0, 0, 10); // 10개까지 만들 수 있음
	}

	public static void main(String[] args) { // main메서드에서 직접 코딩하면 불편한 점이 객체 생성을 하고 변수를 사용해야 하기 때문
		new MyGame().start();
	}

	void start() {
		while (true) {
			System.out.println("1.내정보  2.사냥  0.종료>");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				c.status();
				break;
			case 2:
				hunt();
				break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
	}

	void hunt() {
		Monster m = new Monster("고블린", 20, 10, 15, 10, 1, 150, new Item[] { items[0], items[1] });
		System.out.println(m.name + "를 만났습니다. 전투를 시작합니다.");

		int input = 0;
		battle: while (true) {
			System.out.println("1.공격  2.도망>");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				c.attack(m);
				if (m.hp <= 0) {
					System.out.println(m.name + "을 처치하였습니다.");
					c.getExp(m.exp);
					c.getItem(m.itemDrop());
					break battle;
				}
				m.attack(c);
				break;
			case 2:
				System.out.println(m.name + "으로부터 도망쳤습니다.");
				break battle;
			}
		}
	}
}
