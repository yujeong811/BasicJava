package food_game;

import e_oop.ScanUtil;

public class Source {
	Money n = new Money();
	
	String[] source = { "BBQ", "머쉬룸", "홀그레인" };
	int index2 = (int) (Math.random() * source.length);

	String bbq = "BBQ";
	String mush = "머쉬룸";
	String grain = "홀그레인";

	void sourceKind() {
		System.out.println("============== 소스 선택 ==============");
		System.out.println("1.BBQ   2.머쉬룸   3.홀그레인");
		int source = ScanUtil.nextInt();
        
		switch (source) {
		case 1:
			System.out.println(bbq + "소스 선택");
			break;
		case 2:
			System.out.println(mush + "소스 선택");
			break;
		case 3:
			System.out.println(grain + "소스 선택");
			break;
		}
		if (source != index2 + 1) {
			System.out.println("잘못 선택했습니다. 돈이 1000원 깎였습니다.");
			System.out.println();
		} else {
			System.out.println();
		}
	}
}
