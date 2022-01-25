package food_game;

import e_oop.ScanUtil;

public class Money {
	
	int moneySum;
	int money; 
	int cashSum;
	int customM;
	int money2;

	private void stop() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	void cash(Store t) {
		stop();
		System.out.println("♬서빙 완료♬");
		System.out.println();
		System.out.print("손님 먹는 중 ");
		for (int i = 0; i < 7; i++) {
			System.out.print("♥ ");
			stop();
		}
		System.out.println();
		System.out.println();
		System.out.print("계산하기 : 1 >");
		int input = ScanUtil.nextInt();
		money = (int) (Math.random() * 9000) + 100; 
		customM = moneySum + (Math.round(money / 100) * 100);

		if (input == 1) {
			System.out.println("---------------------- 가 격 표 ----------------------");
			System.out.println(" MEAT             10,000 \n" + " SOURCE   BBQ      5,000   머쉬룸/홀그레인       4,000 \n"
					+ " GARNISH  매쉬포테이토 3,000   아스파라/레몬/브로콜리  2,000 \n"
					+ " DRINK    와인      6,000   물/콜라/사이다        1,500 ");
			System.out.println("----------------------------------------------------");
			System.out.println("손님이 낸 돈 : " + customM + "원");
			System.out.println("음식 총 금액 : " + moneySum + "원");
			System.out.println();

			do {
				System.out.println("=============== 거스름돈 ===============");
				System.out.println("손님에게 알맞은 거스름돈을 주세요!");

				System.out.print("1000원 : ");
				int cash1 = ScanUtil.nextInt();

				System.out.print("500원 : ");
				int cash2 = ScanUtil.nextInt();

				System.out.print("100원 : ");
				int cash3 = ScanUtil.nextInt();

				money2 = customM - moneySum;

				cashSum = (1000 * cash1) + (500 * cash2) + (100 * cash3);

				if (money2 != cashSum) {
					System.out.println();
					System.out.println("돈을 잘못 계산했습니다! 다시 시도해주세요!");
					System.out.println();
				}

			} while (money2 != cashSum);
			
			System.out.println();
			System.out.println("돈을 알맞게 계산했습니다! 성공!");
			System.out.println();
		}
		t.money_sum += moneySum; 
	}
}