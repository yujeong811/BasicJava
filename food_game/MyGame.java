package food_game;

import e_oop.ScanUtil;

public class MyGame {

	public static void main(String[] args) {
		
		Source s = new Source();
		Garnish g = new Garnish();
		Drink d = new Drink();
		
		String[] grill = { "레어", "미디엄", "웰던" };
		String[] source = { "BBQ", "머쉬룸", "홀그레인" };
		String[] gar = { "매쉬포테이토", "아스파라거스", "레몬", "브로콜리", "안함" };
		String[] drink = { "와인", "물", "콜라", "사이다", "안함" };
		
		int index = (int)(Math.random() * grill.length); //grill 랜덤
		int index2 = (int)(Math.random() * source.length); //source 랜덤
		int index3 = (int)(Math.random() * gar.length); //gar 랜덤
		int index4 = (int)(Math.random() * drink.length); //drink 랜덤
		
		System.out.println("====================== 스테이크 하우스 ======================");
		System.out.println("1.게임 시작    0.종료>");
		
		while (true) {
			int input = ScanUtil.nextInt();		
			System.out.println();
			System.out.println("--------------------- 주 문 서 ---------------------");
			
			switch (input) {
			case 1:
				if (index3 == 4) {
					System.out.println(grill[index] + "굽기의 스테이크에 " + source[index2] + "소스로 주세요. "+ "\n음료는 " + drink[index4] + "로 주세요.");
				} else if (index4 == 4) {
					System.out.println(grill[index] + "굽기의 스테이크에 " + source[index2] + "소스로 주시고 " + gar[index3] + " 넣어 주세요.");
				} else if (index3 == 4 && index4 == 4) {
					System.out.println(grill[index] + "굽기의 스테이크에 " + source[index2] + "소스로 주세요.");
				} else {
					System.out.println(grill[index] + "굽기의 스테이크에 " + source[index2] + "소스로 주시고 " + gar[index3] + " 넣어 주세요. " + "\n음료는 " + drink[index4] + "로 주세요.");
				}
				System.out.println("--------------------------------------------------");
				System.out.println();
				s.sourceKind();
				g.putGar();
				d.drinking();
				break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
		
	}

}
