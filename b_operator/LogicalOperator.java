package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * - &&(AND), ||(OR), !(NOT) //&& - 둘다 true여야 true, || - 하나만 true여도 true
		 * - 피연산자로 boolean만 허용한다.
		 */
		
		int x = 10;
		int y = 20;
		
		boolean b = 0 < x && x < 10 || x < y; // 산술연산 > 비교연산 > 논리연산, 논리연산 (&& > ||) 
		System.out.println(b);
		
		b = !(x < y); //조건식의 결과를 반대로 저장한다.
		System.out.println(b);
		
		//효율적 연산
		b = true && true; //true
		b = true && false; //false
		b = false && true; //false
		b = false && false; //false
		
		b = true || true; //true
		b = true || false; //true
		b = false || true; //true
		b = false || false; //false
		
		int a = 10;
		b = a < 5 && 0 < a++; // false && true라서 왼쪽만 연산후 오른쪽은 연산하지 않음
		System.out.println(a); // a값 원래 11인데 10이 나옴
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고 x가 10보다 작다.
		boolean bbb;
		bbb = x > y && x < 10;
		
		//2. x가 짝수이고 y보다 작거나 같다.
		bbb = x % 2 == 0 && x <= y;
		
		//3. x가 3의 배수이거나 5의 배수이다.
		bbb = x % 3 == 0 || x % 5 == 0;
		
	}

}