package food_game;

import e_oop.ScanUtil;

public class Source {

	String bbq = "BBQ";
	String mush = "머쉬룸";
	String grain = "홀그레인";

	void sourceKind() {
			System.out.println("============== 소스 선택 ==============");
			System.out.println("1.BBQ   2.머쉬룸   3.홀그레인");
			int input = ScanUtil.nextInt();

			switch (input) {
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
			System.out.println();
		}
	}
