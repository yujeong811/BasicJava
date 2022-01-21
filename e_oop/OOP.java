package e_oop;

import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍(Object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 */
		
		SampleClass sc = new SampleClass();
		
		String returnValue = sc.method(5, "ABC");
		System.out.println(returnValue);
		
		sc.method2();
		
		sc.flowTest1();
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		Calculator cal = new Calculator();

		long result = cal.plus(123456, 654321);
		System.out.println("1. 123456 + 654321 = " + result);

		result = cal.multi(result, 123456);
		System.out.println("2. 1번의 결과값 * 123456 = " + result);

		result = cal.div(result, 123456);
		System.out.println("3. 2번의 결과값 / 123456 = " + result);

		result = cal.minus(result, 654321);
		System.out.println("4. 3번의 결과값 - 654321 = " + result);

		result = cal.nam(result, 123456);
		System.out.println("5. 4번의 결과값 % 123456 = " + result);

	}

}
