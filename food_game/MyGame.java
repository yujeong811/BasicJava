package food_game;

import e_oop.ScanUtil;

public class MyGame {
	
//	스테이크 요리 게임
//
//	1. 손님의 요구사항(주문서)을 확인 --> 랜덤
//	ex) 레어굽기의 스테이크에 BBQ소스로 주시고 가니쉬는 아스파라거스 넣어 주세요. 
//	     음료는 콜라로 주세요.                             
//
//	2. 스테이크 굽기 정도 선택
//	   레어 -> 3초
//	   미디엄 -> 5초
//	   웰던 -> 7초
//	 !! 해당되지 않는 굽기를 선택할 경우 돈이 차감됨 -1000원
//
//	3. 해당되는 소스 선택 
//	 !! 해당되지 않는 소스를 선택할 경우 돈이 차감됨 -1000원
//
//	4. 해당되는 가니쉬 선택 (가니쉬 선택 안하는 경우도 있음)
//	 !! 해당되지 않는 가니쉬를 선택할 경우 돈이 차감됨 -1000원 
//
//	5. 음료 여부 (음료 선택 안하는 경우도 있음)
//	 !! 해당되지 않는 음료를 선택할 경우 돈이 차감됨 -1000원 
//
//	6. 계산 하기
//	 !! 해당되지 않는 금액 입력할 경우 다시 시도 
//
//	7. 가게 정보
//	총 매출
//	총 손님수
//	남은 재료수 확인 가능
//
//	0. 게임 종료
 
	public static void main(String[] args) {
		Source s = new Source(); // 객체 생성
		Garnish g = new Garnish();
		Drink d = new Drink();
		Steak st = new Steak();
        Money n = new Money();
        Store t = new Store();
        
        int input;
		
		do {
			
			System.out.println("====================== 스테이크 하우스 ======================");
			System.out.println("1.게임 시작    2.가게 정보    0.종료>");
			input = ScanUtil.nextInt();
			System.out.println();

			switch (input) {
			case 1:
				System.out.println("--------------------- 주 문 서 ---------------------");
				  if (g.index3 == 4 && d.index4 == 4) {
			 		System.out.println(st.grill[st.index] + "굽기의 스테이크에 " + s.source[s.index2] + "소스로 주세요.");
		
				} else if (d.index4 == 4) {
					System.out.println(st.grill[st.index] + "굽기의 스테이크에 " + s.source[s.index2] +
							           "소스로 주시고 " + "가니쉬는 " + g.gar[g.index3] + " 넣어 주세요.");
				} else if (g.index3 == 4) {
					System.out.println(st.grill[st.index] + "굽기의 스테이크에 " + s.source[s.index2] + "소스로 주세요. " +
		                                "\n음료는 " + d.drink[d.index4] + "로 주세요.");
				} else {
					System.out.println(st.grill[st.index] + "굽기의 스테이크에 " + s.source[s.index2] + "소스로 주시고 " +
							           "가니쉬는 " + g.gar[g.index3] + " 넣어 주세요. " + "\n음료는 " + d.drink[d.index4] + "로 주세요.");
				}
				System.out.println("--------------------------------------------------");
				st.grillMachine(n, t);
				s.sourceKind(n, t);
				g.putGar(n, t);
				d.drinking(n, t); 
				n.cash(t);
				t.cust_num++;
				st.index = (int) (Math.random() * 3); // 랜덤 인덱스 값 초기화
				s.index2 = (int) (Math.random() * 3);
				g.index3 = (int) (Math.random() * 5);
				d.index4 = (int) (Math.random() * 5);
				break;
			case 2:
				t.status();
				break;
			case 0:
				System.out.println("게임이 종료되었습니다.");
				System.exit(0);
			}		
		} while (input != 0);
	}

}
