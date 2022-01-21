package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문 - if문 - switch문
		 * 
		 * if문 - if(조건식){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다. - else if(조건식){} : 다수의 조건이
		 * 필요할때 if 뒤에 추가한다. - else{} : 조건식 이외의 경우를 위해 추가한다.
		 */

		int a = 2;

		if (a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}

		if (a == 1) {
			System.out.println("a == 1");
		} else if (a == 2) {
			System.out.println("a == 2");
		} else if (a == 3) {
			System.out.println("a == 3");
		} else {
			System.out.println("else");
		} // 여러개의 조건문 중 반드시 하나만 실행됨

		// 점수가 60점 이상이면 합격 그렇지 않으면 불합격

		int score = 80;

		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// 점수에 등급을 부여

		score = 90;
		String grade = null; // 참조형 타입의 기본값 = null
		// boolean : false가 기본값

		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println(score + "점 : " + grade);

		// 점수에 자세히 등급 부여

		score = 98;
		grade = null;
		// 정렬 : ctrl + shift + f
		if (score >= 90 && score <= 100) {
			grade = "A";
			if (score >= 97) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 87) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 77) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}
		} else if (score >= 60) {
			grade = "D";
			if (score >= 67) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}
		} else {
			grade = "F";
		}

		System.out.println(score + "점 : " + grade);

		/*
		 * switch문 - switch(int/String) { case 1: break; } - 조건식의 결과는 정수와 문자열만(JDK1.7부터
		 * 문자열 허용) 허용한다. - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */

		a = 10;

		switch (a) {
		case 10:
			System.out.println("a == 10");
			break; // case마다 break 꼭!
		case 20:
			System.out.println("a == 20");
			break;
		default:
			System.out.println("default");
		}
		
		//월에 해당하는 계절을 출력
		
		int month = 1;
		String season = null;
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		default:
			season = null;
		}
		
		System.out.println(month + "월 : " + season);
		
		
		score = 95;
		grade = null;

		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		} // 속도 : if문 < switch문
		
		System.out.println(score + "점 : " + grade);

		
		// 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int number = Integer.parseInt(sc.nextLine());
		
		if (number % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
		switch (number % 2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		default:
		}
		
		
		//1부터 100 사이의 랜덤한 값을 3개 발생시키고 합계, 평균, 등급을 출력해주세요.
		
		int num1 = (int) (Math.random() * 100) + 1; // 0.0 ~ 1.0
		int num2 = (int) (Math.random() * 100) + 1;
		int num3 = (int) (Math.random() * 100) + 1;

		int total = num1 + num2 + num3;

		int avg = total / 3;
//		double avg = Math.round(sum / 3.0 * 10) / 10.0;  반올림

		if (avg >= 90 && avg <= 100) {
			System.out.println("A");
		} else if (avg >= 80) {
			System.out.println("B");
		} else if (avg >= 70) {
			System.out.println("C");
		} else if (avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		switch (avg / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
		
		//1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
		
		int ran1 = (int) (Math.random() * 100) + 1; 
		int ran2 = (int) (Math.random() * 100) + 1; 
		int ran3 = (int) (Math.random() * 100) + 1; 
		
		if (ran1 < ran2 && ran1 < ran3) {
			if(ran2 < ran3) {
				System.out.println("오름차순 : " + ran1 + "," + ran2 + "," + ran3);
			} else {
				System.out.println("오름차순 : " + ran1 + "," + ran3 + "," + ran2);
			}
		} else if (ran2 < ran1 && ran2 < ran3) {
			if(ran1 < ran3) {
				System.out.println("오름차순 : " + ran2 + "," + ran1 + "," + ran3);
			} else {
				System.out.println("오름차순 : " + ran2 + "," +  ran3 + "," + ran1);
			}
		} else if (ran3 < ran1 && ran3 < ran2) {
			if(ran1 < ran2) {
				System.out.println("오름차순 : " + ran3 + "," + ran1 + "," + ran2);
			} else {
				System.out.println("오름차순 : " + ran3 + "," + ran2 + "," + ran1);
			}
		} 
		
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		if (ran1 < ran2 && ran1 < ran3) {
			x = ran1;
		} else if (ran2 < ran1 && ran2 < ran3) {
			x = ran2;
		} else if (ran3 < ran1 && ran3 < ran2) {
			x = ran3;
		}
		
		if ((ran1 > ran2 && ran1 < ran3) || (ran1 > ran3 && ran1 < ran2)) {
			y = ran1;
		} else if ((ran2 > ran1 && ran2 < ran3) || (ran2 > ran3 && ran2 < ran1)) {
			y = ran2;
		} else if ((ran3 > ran1 && ran3 < ran2) || (ran3 > ran2 && ran3 < ran1)) {
			y = ran3;
		}
		
		if (ran1 > ran2 && ran1 > ran3) {
			z = ran1;
		} else if (ran2 > ran1 && ran2 > ran3) {
			z = ran2;
		} else if (ran3 > ran1 && ran3 > ran2) {
			z = ran3;
		}
		
		System.out.println("오름차순 : " + x + "," + y + "," + z);
		
		
		int xx = (int)(Math.random() * 100) + 1;
		int yy = (int)(Math.random() * 100) + 1;
		int zz = (int)(Math.random() * 100) + 1;
		
		if(x > y) {
			int temp = x;
			x = y;
			y = temp;
		} // x = 작은값, y = 큰값
		
		if(x > z) {
			int temp = x;
			x = z;
			z = temp;
		} // x = 작은값, z = 큰값
		
		if(y > z) {
			int temp = x;
			y = z;
			z = temp;
		} // y = 작은값, z = 큰값
		
		System.out.println("오름차순 : " + x + "," + y + "," + z);
		
	}

}
