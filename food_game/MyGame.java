package food_game;

import e_oop.ScanUtil;
import g_oop2.Time;

public class MyGame {

	public static void main(String[] args) {
		MyGame m = new MyGame();
		Source s = new Source();
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
