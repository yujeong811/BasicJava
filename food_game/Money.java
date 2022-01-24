package food_game;

import e_oop.ScanUtil;

public class Money {
	
	int steakM;
	int sourceM;
	int garnishM;
	int drinkM;
	
	Money() {
//		this.steakM = 0;
//		this.sourceM = 0;
//		this.garnishM = 0;
//		this.drinkM = 0;
	}
//	
	Money(int steakM, int sourceM, int garnishM, int drinkM) {
		this.steakM = steakM;
		this.sourceM = sourceM;
		this.garnishM = garnishM;
		this.drinkM = drinkM;
	}
	
	int money = (int) (Math.random() * 12000) + 12000; 

	private void stop() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	void cash() {
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

		if (input == 1) {
		System.out.println("---------------------- 가 격 표 ----------------------");
		System.out.println(" MEAT             10,000 \n"           
				         + " SOURCE   BBQ      5,000   머쉬룸/홀그레인       4,000 \n"
				         + " GARNISH  매쉬포테이토 3,000   아스파라/레몬/브로콜리  2,000 \n"
				         + " DRINK    와인      6,000   물/콜라/사이다        1,500 ");
		System.out.println("----------------------------------------------------");
		System.out.println("총 금액 : ");
		System.out.println("손님이 낸 돈 : " + money + "원");
		System.out.println();
		System.out.println("거스름돈");
		System.out.println("1000원 : ");
		System.out.println("500원 : ");
		System.out.println("100원 : ");
		
		}
	}
}