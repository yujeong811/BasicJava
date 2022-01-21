package e_oop;

public class Hairdry { //클래스만 대문자로 시작, 변수나 메서드는 소문자로 시작
	//변수 : 대상의 속성, 대상이 가지고 있는 것 중에 우리가 조작가능한 것(변할 수 있는 것)  ex) 드라이기 온도, 전원 등
	//메서드 : 대상의 동작 ex) 드라이기 전원 on/off 동작, 바람 세기, 바람 온도 --> 드라이기 버튼 하나가 메서드
	
	boolean power = false;
	boolean temperature = false;
	int wind = 2;
	
	final int MIN_WIND = 1;
	final int MAX_WIND = 3;
	
	void power() {
		power = !power;
		System.out.println(power ? "전원 켜짐" : "전원 꺼짐");
	}
	
	void changeTemperature() {
		if(power) {
			temperature = !temperature;
			System.out.println(temperature ? "뜨거운 바람" : "찬 바람");		
		}
	}
	
	void changeWind() { 
		if(power) {
			wind++;
			if (MAX_WIND < wind) {
				wind = MIN_WIND;
			}
		
		System.out.println("현재바람세기 : " + wind + "단계");
		}
	}
	
	public static void main(String[] args) {
		Hairdry hd = new Hairdry();
		
		while(true) {
			System.out.println("1.전원  2.바람온도  3.바람세기  0.종료>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: hd.power(); break;
			case 2: hd.changeTemperature(); break;
			case 3: hd.changeWind(); break;
			case 0:
				System.out.println("전원이 꺼졌습니다.");
				System.exit(0); // exit() : 종료됨
			}
		}
	}
}
