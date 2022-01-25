package e_oop;

import java.util.Scanner;

public class ScanUtil {

	private static Scanner s = new Scanner(System.in); // 객체 생성을 넣는 변수에 static 설정
	
	public static String nextLine() {
		return s.nextLine();
	}
	
	public static int nextInt() {
		int input = 0;
		
		try {
			input = Integer.parseInt(s.nextLine());
		} catch (Exception e) {
			System.out.print("잘못입력하셨습니다. 다시 입력해주세요.>");
			input = nextInt(); //재귀호출 : 메서드 안에서 자기 자신 메서드를 호출하는 것
		}
		
		return input;
	}
	
}
