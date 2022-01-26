package food_game;

public class Store {

	int money_sum; // 총 매출
	
	int cust_num; // 총 손님수
	
	// 남은 재료 수
	int meat_num; // 남은 고기 수
	int bbq_num; // 남은 bbq소스 수
	int mush_num; // 남은 머쉬룸소스 수
	int hole_num; // 남은 홀그레인소스 수
	int po_num; // 남은 포테이토 수
	int as_num; // 남은 아스파라거스 수
	int le_num; // 남은 레몬 수
	int bro_num; // 남은 브로콜리 수
	int wi_num; // 남은 와인 수
	int wa_num; // 남은 물 수
	int co_num; // 남은 콜라 수
	int sp_num; // 남은 사이다 수
	
	Store() {
		this.money_sum = 0;
		this.cust_num = 0;
		this.meat_num = 10;
		this.bbq_num = 10;
		this.mush_num = 10;
		this.hole_num = 10;
		this.po_num = 10;
		this.as_num = 10;
		this.le_num = 10;
		this.bro_num = 10;
		this.wi_num = 10;
		this.wa_num = 10;
		this.co_num = 10;
		this.sp_num = 10;
	}
	
	void status() {
		System.out.println("============== 가게 정보 ==============");
	    System.out.println("총 매출 : " + money_sum + "원");
	    System.out.println("총 손님수 : " + cust_num + "명");
	    System.out.println("-------------- 남은 재료 --------------");
	    System.out.println("고기 : " + meat_num+"/10개");
	    System.out.println();
	    System.out.println("소스 - BBQ : " + bbq_num+"/10개");
	    System.out.println("     머쉬룸 : " + mush_num+"/10개");
	    System.out.println("     홀그레인 : " + hole_num+"/10개");
	    System.out.println();
	    System.out.println("가니쉬 - 매쉬 : " + po_num+"/10개");
	    System.out.println("       아스 : " + as_num+"/10개");
	    System.out.println("       레몬 : " + le_num+"/10개");
	    System.out.println("       브로 : " + bro_num+"/10개");
	    System.out.println();
	    System.out.println("음료 - 와인 : " + wi_num+"/10개");
	    System.out.println("      물 : " + wa_num+"/10개");
	    System.out.println("      콜라 : " + co_num+"/10개");
	    System.out.println("      사이다 : " + sp_num+"/10개");
	    System.out.println("=====================================");
	    System.out.println();
	}

}
