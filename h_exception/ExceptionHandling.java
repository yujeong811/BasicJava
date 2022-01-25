package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import e_oop.ScanUtil;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * 에러
		 * - 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄)
		 * - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 * - 런타임 에러 : 실행 시에 발생되는 에러(콘솔창 빨간글씨)
		 * 
		 * 런타임 에러
		 * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류
		 * - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
		 * 
		 * 예외
		 * - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 * - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.
		 * - [RuntimeException 클래스와 그 자식들을 제외한] 
		 *   Exception 클래스의 자식들은 예외처리가 강제된다.
		 * 
		 * 예외처리(try-catch)
		 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 * - try {} catch(Exception e) {}
		 * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 * - catch의 파라미터로 처리할 예외를 저정해줄 수 있다.
		 * - 발생한 예외와 일치하는 catch블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
		 * - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
		 */

		try {
			int result = 10 / 0;
			System.out.println(result); // 런타임 에러 (콘솔창 빨간글씨)
		} catch (ArithmeticException | IndexOutOfBoundsException e) { // 예외가 여러개일 경우
			e.printStackTrace(); // 예외메시지 출력
		} catch (NullPointerException e) {

		} catch (Exception e) { // 모든 예외를 한번에 처리 --> 다형성

		}
		
//		System.out.print("숫자입력>");
//		int input = ScanUtil.nextInt();
//		System.out.println(input);
		
		test1();
		
	}

	private static void test1() {
		test2();
		
	}

	private static void test2() {
//		System.out.println(10 / 0); 
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}



