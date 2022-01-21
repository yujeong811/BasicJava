package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// 두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		// +, -, /, *, %

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자 : ");
		double num1 = Double.parseDouble(sc.nextLine());

		System.out.print("연산자 : ");
		String str = sc.nextLine();

		System.out.print("두번째 숫자 : ");
		double num2 = Double.parseDouble(sc.nextLine());

		System.out.println("결과 : " + (str.equals("+") ? num1 + num2
				: (str.equals("-") ? num1 - num2
						: (str.equals("/") ? num1 / num2
								: (str.equals("*") ? num1 * num2 : (str.equals("%") ? num1 % num2 : 0))))));
	}
}