package e_oop;

import java.util.Scanner;

public class ScanUtil {

	private static Scanner s = new Scanner(System.in); // 객체 생성을 넣는 변수에 static 설정
	
	public static String nextLine() {
		return s.nextLine();
	}
	
	public static int nextInt() {
		return Integer.parseInt(s.nextLine());
	}
	
}
