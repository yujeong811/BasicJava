package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {

		System.out.println("탄수화물 중독 자가진단 테스트 [맞으면 1 틀리면 2]");

		Scanner sc = new Scanner(System.in);
		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다>");

		int ans = Integer.parseInt(sc.nextLine());
		int num = 0;

		if (ans == 1) {
			num += 1;
		}
		//if (ans.equals("Y")) {   -> 답을 문자로 했을 경우
		// sum++;                  -> 중괄호에 들어갈 문장이 한문장일 경우 생략가능
		// }

		System.out.print("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다>");

		ans = Integer.parseInt(sc.nextLine());

		if (ans == 1) {
			num += 1;
		}

		System.out.print("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다>");

		ans = Integer.parseInt(sc.nextLine());

		if (ans == 1) {
			num += 1;
		}

		System.out.print("정말 배고프지 않더라도 먹을 때가 있다>");

		ans = Integer.parseInt(sc.nextLine());

		if (ans == 1) {
			num += 1;
		}

		System.out.print("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다>");

		ans = Integer.parseInt(sc.nextLine());

		if (ans == 1) {
			num += 1;
		}

		System.out.print("스트레스를 받으면 자꾸 먹고 싶어진다>");

		ans = Integer.parseInt(sc.nextLine());

		if (ans == 1) {
			num += 1;
		}

		System.out.print("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다>");

		ans = Integer.parseInt(sc.nextLine());

		if (ans == 1) {
			num += 1;
		}

		System.out.print("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다>");

		ans = Integer.parseInt(sc.nextLine());

		if (ans == 1) {
			num += 1;
		}

		System.out.print("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다>");

		ans = Integer.parseInt(sc.nextLine());

		if (ans == 1) {
			num += 1;
		}

		System.out.print("다이어트를 위해 식이조절을 하는데 3일도 못 간다>");

		ans = Integer.parseInt(sc.nextLine());

		if (ans == 1) {
			num += 1;
		}

		if (num >= 7 && num <= 10) {
			System.out.println("중독!" + "\n" + "전문의 상담이 필요함");
		} else if (num <= 6 && num >= 4) {
			System.out.println("위험!" + "\n" + "탄수화물 섭취 줄이기 위한 식습관 개선이 필요함");
		} else if (num >= 3) {
			System.out.println("주의!" + "\n" + "위험한 수준은 아니지만 관리 필요");
		} else {
			System.out.println("정상!");
		}

	}

}
