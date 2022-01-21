package food_game;

import e_oop.ScanUtil;

public class Source {

	boolean putSource = false;
	String bbq = "BBQ";
	String mush = "머쉬룸";
//	int kind = 0;
	
	void putSource() {
		putSource = !putSource;
		System.out.println(putSource ? "소스 뿌림" : "소스 안 뿌림");
	}
	
//	void kind() {
//		if(putSource) {
//			kind = !kind;
//			System.out.println(kind ? "BBQ" : "머쉬룸");
//		}
//	}
	
	void kind() {
		while (putSource) {
			System.out.println("1.BBQ   2.머쉬룸");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				System.out.println(bbq + "소스 선택");
				break;
			case 2:
				System.out.println(mush + "소스 선택");
				break;
			}
		}
	}
}
