package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		/*
		 * 숫자야구
		 * 
		 * 123
		 * 
		 * 135 : 1 strike (첫번째 숫자 동일), 1 ball (숫자 순서 다름), 1 out (숫자 아예 다름)
		 * 
		 * 
		 * 379 : 3o
		 * 124 : 1s sb 1o
		 * 248 : 1s 2b 0o
		 * 842 : 0s 3b 0o
		 * 428 : 3s
		 */
		
		int a = 0;
		int b = 0;
		int c = 0;
		int strike = 0;
		int ball = 0;
		int out = 0;
		
		do { // 랜덤으로 뽑은 숫자 중복되지 않게
			a = (int)(Math.random() * 9) + 1;
			b = (int)(Math.random() * 9) + 1;
			c = (int)(Math.random() * 9) + 1;
		} while(a == b || a == c || b == c);
		
		Scanner sc = new Scanner(System.in);
		
//		int count = 0;   --> 선생님 코딩
//		while(true) {
//			System.out.println("3자리의 숫자>");
//			int input = Integer.parseInt(s.nextLine());
//			int i3 = input % 10;
//			input /= 10;
//			int i2 = input % 10;
//			input /= 10;
//			int i1 = input % 10;
//			
//			int strike = 0;
//			int ball = 0;
//			int out = 0;
//			
//			if(a1 == i1) strike++;
//			if(a2 == i2) strike++;
//			if(a3 == i3) strike++;
//			
//			if(a1 == i2 || a1 == i3) ball++;
//		    if(a2 == i1 || a2 == a3) ball++;
//		    if(a3 == i2 || a3 == i1) ball++;
//		    
//		    out = 3 - strike - ball;
//		    
//		    System.out.println(++count + "차 시도(" + i1 + i2 + i3 + ") : " + strike + "S " + ball + "B " + out + "O");
//		    System.out.println("--------------------------------------------");
//		    if(strike == 3) {
//		    	System.out.println("정답입니다!");
//		    	break;
//		    }
//		}   
		
		do { // 3s가 나올때까지 계속 반복, 3s가 나오면 끝남
			strike = 0;
	        ball = 0;
	        out = 0;
	        
            System.out.println("숫자야구------중복되는 숫자 작성 금지");
            
			System.out.print("첫번째 숫자 입력>");
			int one = Integer.parseInt(sc.nextLine());
			
			System.out.print("두번째 숫자 입력>");
			int two = Integer.parseInt(sc.nextLine());
			
			System.out.print("세번째 숫자 입력>");
			int three = Integer.parseInt(sc.nextLine());
	        
			if (a == one) {
				strike++;
			} else if (b == one || c == one) {
				ball++;
			} else {
				out++;
			}

			if (b == two) {
				strike++;
			} else if (a == two || c == two) {
				ball++;
			} else {
				out++;
			}

			if (c == three) {
				strike++;
			} else if (a == three || b == three) {
				ball++;
			} else {
				out++;
			} 
			
			System.out.println(strike + "s " + ball + "b " + out + "o");
			System.out.println();
			
		} while (strike != 3);
	}
}










