package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * - for문
		 * - while문
		 * - do-while문
		 * 
		 * for문
		 * - for(초기화; 조건식; 증감식) {}
		 * - 포함하고 있는 문장들을 정해진 횟수만큼 반복시키는 문장
		 */
		
		for(int i = 1; i <= 10; i++) {
			//초기화 : 조건식과 증감식에 사용할 변수를 초기화한다.
			//조건식 : 연산결과가 true이면 블럭안의 내용을 수행한다.
			//증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
			System.out.println(i + "번째 반복");
		}
		
		
		int sum = 0; //1부터 10까지 합계를 저장
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1; i <= 10; i++) { //1부터 10까지 합계
			sum += i;
		}
		System.out.println(sum);
		
		
		sum = 0;
		for(int i = 10; i >= 1; i--) { //10부터 1까지 합계
			sum += i;
		}
		System.out.println(sum);
		
		
		//1부터 100까지 짝수의 합을 출력해주세요.
		
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 2; i <= 100; i+=2) {
			sum += i;
		}
		System.out.println(sum);
		
		//1부터 100까지 홀수의 합을 출력해주세요.
		
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		
		//구구단 출력
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * ....
		 */
		
		for (int i = 1; i <= 9; i++) { // 구구단 2단
			System.out.println(2 + "*" + i + "=" + i * 2);
		}

		for (int i = 1; i <= 9; i++) { // 구구단 6단
			System.out.println(6 + "*" + i + "=" + i * 6);
		}
		
		
		//구구단 전체
		
		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(j + "*" + i + "=" + i * j);
			}
		}
		
		/*
		 * 2 * 1 = 2    3 * 1 = 3    4 * 1 = 4   //  A * B = result  A->안쪽 for문, B->바깥쪽 for문
 		 */
				
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
		
		
		/*
		 * while문
		 * - while(조건식) {}
		 * - 포함하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
		 * - 반복횟수가 정확하지 않은 경우에 주로 사용한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
//		int input = 0;
//		while(input != 3) {
//			System.out.println("1.선택1 2.선택2 3.종료>");
//			input = Integer.parseInt(sc.nextLine());
//		}
		
		/*
		 * do-while
		 * - do {} while(조건식);
		 * - 최소한 한번의 수행을 보장한다.
		 */
		
		//숫자 맞추기 게임
//		int answer = (int)(Math.random() * 100) + 1;
//		int input = 0;
//		
//		do {
//			System.out.println("1~100사이의 수를 맞춰주세요>");
//			input = Integer.parseInt(sc.nextLine());
//
//			if(answer < input) {
//				System.out.println(input + " 보다 작습니다.");
//			} else if(answer > input) {
//				System.out.println(input + " 보다 큽니다.");
//			} else {
//				System.out.println("정답입니다!");
//			}
//		} while(answer != input);
		
		
		//이름붙은 반복문
		outer : for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j == 5) {
					break; //가장 가까운 반복문 하나를 빠져나간다.
//					break outer; //outer라는 이름의 반복문을 빠져나간다.
//					continue; //가장 가까운 반복문의 현재 반복회차를 빠져나간다.
//					continue outer; //outer라는 이름의 현재 반복회차를 빠져나간다.
				}
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		
		//별찍기
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println();
		
		for(int j = 1; j <= 3; j++) {
			 for(int i = 1; i <= 5; i++) { 
			    	System.out.print("*");
			    } System.out.println();
		}
	   
		//별찍기2
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		System.out.println();
		
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			} System.out.println();
		}
		
		//별찍기3
		System.out.println("*****");
		System.out.println("****");
		System.out.println("***");
		System.out.println("**");
		System.out.println("*");
		System.out.println();
		
		for (int j = 1; j <= 5; j++) {
			for (int i = 5; i >= j; i--) {
				System.out.print("*");
			} System.out.println();
		}
		
		//별찍기
		System.out.println("    *    ");  // 2n-1
		System.out.println("   ***   ");  // 
		System.out.println("  *****  ");
		System.out.println(" ******* ");
		System.out.println("*********");
		System.out.println();
		
		
		
		
		
		
		
		
	}

}
