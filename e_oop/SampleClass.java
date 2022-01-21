package e_oop;

public class SampleClass {

	/*
	 * - 메서드 : 변수를 가지고 할 일 (명령문의 집합)
	 * - 선언 방법 : 리턴타입 메서드명(파라미터) { }
	 * - 파라미터(매개변수) : 실행에 필요한 정보
	 * - 리턴타입(반환타입) : 실행 후 돌려줘야하는 결과물, 메서드를 종료시킴
	 */
	
	String method(int parameter, String str) { // String 타입의 값을 반환
		return parameter + " 를 받아 명령을 수행하고 결과물을 리턴하는 메서드";
	}
	
	void method2() { //파라미터, 리턴타입 사용하지 않는 메소드, return 사용 가능 -> 메소드를 종료시키는 역할
		System.out.println("파라미터도 리턴타입도 없는 메서드");
	}
	
	void flowTest1() {
		System.out.println("flowTest1 시작 : 1");
		flowTest3();
		System.out.println("flowTest1 종료 : 6");
	}
	
	void flowTest2() {
		System.out.println("flowTest2 시작 : 3");
		System.out.println("flowTest2 종료 : 4");
	}
	
	void flowTest3() {
		System.out.println("flowTest3 시작 : 2");
		flowTest2();
		System.out.println("flowTest3 종료 : 5");
	}

}
