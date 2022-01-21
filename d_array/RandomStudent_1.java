package d_array;

import java.util.Scanner;

public class RandomStudent_1 {

	public static void main(String[] args) {
		/*
		 * 1. 이름 섞은 다음 뽑아서 출력 --> 이 방법으로 코딩
		 * 2. 이미 뽑힌 사람과 다음에 뽑은 사람을 비교하여 출력
		 */

		String[] students = { "이유정", "강정인", "노혜지", "오혜지", "강동주",
				              "강현수", "곽성상", "김기웅", "김민지", "김형돈",
				              "박태정", "서난희", "예현의", "오지현", "유정민",
				              "이병진", "이수민", "이슬기", "이의찬", "이정규",
				              "이종민", "장문석", "정다영", "최민규", "최혁진" };
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수를 입력하세요> ");
		int stu = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < students.length; i++) {
			int ran = (int)(Math.random() * students.length);			
			String temp = students[0];
			students[0] = students[ran];
			students[ran] = temp;
		}
		
		for(int i = 0; i < stu; i++) {
			System.out.println(students[i]);
		}

	}
}