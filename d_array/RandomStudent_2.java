package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudent_2 {

	public static void main(String[] args) {
		/*
		 * 1. 이름 섞은 다음 뽑아서 출력
		 * 2. 이미 뽑힌 사람과 다음에 뽑은 사람을 비교하여 출력 --> 이 방법으로 코딩
		 */

		String[] students = {"이유정", "강정인", "노혜지", "오혜지", "강동주", "강현수", "곽성상", "김기웅", "김민지", "김형돈",
		         			 "박태정", "서난희", "예현의", "오지현", "유정민", "이병진", "이수민", "이슬기", "이의찬", "이정규",
		         			 "이종민", "장문석", "정다영", "최민규", "최혁진"};
		
		Scanner s = new Scanner(System.in);
		System.out.print("몇명?");
		int count = Integer.parseInt(s.nextLine());

		String[] pick = new String[count]; // 뽑은 사람을 넣을 배열 생성
		int pickCount = 0; // 뽑힌 사람의 수를 세기 위한 변수

		do {
			int random = (int) (Math.random() * students.length); // 인덱스 0~24

			boolean flag = true;
			for (int i = 0; i < pick.length; i++) {
				if (students[random].equals(pick[i])) {
					flag = false; // 값이 바뀌면 중복된 것
				}
			}

			if (flag) {
				pick[pickCount++] = students[random]; // 중복 되지 않았을 때의 실행문
			}

		} while (pickCount < count);

		System.out.println(Arrays.toString(pick));
	}

}
