package food_game;

import e_oop.ScanUtil;

public class Steak {

	String[] grill = { "레어", "미디엄", "웰던" };

	int index = (int) (Math.random() * grill.length); // 랜덤인덱스

	String rare = "레어";
	String medium = "미디엄";
	String welldone = "웰던";

	private void stop() { 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	void grillMachine(Money n, Store t) { // 굽기 선택
		n.moneySum = 0; // 돈 초기화
		
		System.out.print("주문서 확인 완료 : 1 >");
		int input = ScanUtil.nextInt();
		System.out.println();

		if (input == 1) {
			System.out.println("============ 그릴 머신에 굽기 ===========");
			System.out.println("1.레어   2.미디엄   3.웰던");
			int steak = ScanUtil.nextInt();
			
			n.moneySum += 10000;
					
			switch (steak) {
			case 1:
				for (int i = 0; i < 3; i++) {
					System.out.print("♨");
					stop();
				}
				System.out.println();
				System.out.println(rare + " 굽기 완료");
				break;
			case 2:
				for (int i = 0; i < 5; i++) {
					System.out.print("♨");
					stop();
				}
				System.out.println();
				System.out.println(medium + " 굽기 완료");
				break;
			case 3:
				for (int i = 0; i < 7; i++) {
					System.out.print("♨");
					stop();
				}
				System.out.println();
				System.out.println(welldone + " 굽기 완료");
				break;
			}

			if (steak != index + 1) {
				System.out.println("잘못 선택했습니다. 돈이 1000원 깎였습니다.");
				n.moneySum -= 1000;
				System.out.println();
			} else {
				System.out.println();
			}
			
		}
       t.meat_num--;
	}

}
