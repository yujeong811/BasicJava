package e_oop;

public class Aircon {
	
	//변수 : 대상의 속성, 대상이 가지고 있는 것 중에 우리가 조작가능한 것(변할 수 있는 것)  ex) 에어컨 온도, 전원 등
	//메서드 : 대상의 동작 ex) 에어컨 전원 on/off 동작, 온도 올리고 내리는 동작 --> 에어컨 버튼 하나가 메서드

	boolean power = false;
	int temperature = 24;
	int wind = 2;
	
	final int MIN_TEMPERATURE = 18;
	final int MAX_TEMPERATURE = 30;
	final int MIN_WIND = 1;
	final int MAX_WIND = 3;
	
	void power() {
		power = !power;
		System.out.println(power ? "켜짐" : "꺼짐");
	}
	
	void temperatureUp() {
		if(power) {
			if(temperature < MAX_TEMPERATURE) {  // 30
				temperature++;
			}
			System.out.println("현재온도 : " + temperature);
		}
	}
	
	void temperatureDown() {
		if(power) {
			if(MIN_TEMPERATURE < temperature) { // 18
				temperature--;
			}
			System.out.println("현재온도 : " + temperature);
		}
	}
	
	void changeWind() { 
		if(power) {
			wind++;
			if (MAX_WIND < wind) {
				wind = MIN_WIND;
			}
		
		System.out.println("현재풍량 : " + wind + "단계");
		}
	}
	
	public static void main(String[] args) {
		Aircon ac = new Aircon();
		
		while(true) {
			System.out.println("1.전원  2.온도+  3.온도-  4.풍량  0.종료>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: ac.power(); break;
			case 2: ac.temperatureUp(); break;
			case 3: ac.temperatureDown(); break;
			case 4: ac.changeWind(); break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0); // exit() : 종료됨
			}
		}
	}
}
