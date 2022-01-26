package i_api;

import java.util.Scanner;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		// 숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마를 붙여 출력해주세요.
		// 1,234,567
		
		System.out.print("숫자를 입력해주세요.> ");
		String num = ScanUtil.nextLine();
		String res = "";
		
		int count = 0;
		for(int i = num.length() - 1; i >= 0; i--) {
			res = num.charAt(i) + res; // 기존의 값 앞에다가 저장하는 방법
			count++;
			if(count % 3 == 0 && count != num.length()) { 
				res = "," + res;
			}
		}
		System.out.println(res);
	}
}
