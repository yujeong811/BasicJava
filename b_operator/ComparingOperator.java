package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * - <, >, <=, >=, ==, !=
		 * - 문자열 비교 : equals()
		 */
		
		int x = 10;
		int y = 20;
		
		boolean b = x < y;
		System.out.println(b);
		
		b = x <= y - 15; // 산술연산 먼저 계산 후 비교연산, 산술연산 > 비교연산
		
		String str1 = "abc";
		String str2 = "ABC";
		
		b = str1 == str2; //문자의 내용을 비교하는 것이 아니라 주소를 비교함, 그래서 equals()를 사용해야함
		System.out.println(b);
		
		b = !str1.equals(str2); // ! -> 부정의 의미, 같지 않다.
		System.out.println(b);
		
		//다음의 문장들을 코드로 작성해주세요.
		//x는 y보다 작거나 같다.
	    boolean bb;
	    
		bb = x <= y;
		
		//x + 5와 y는 같다.
		bb = x + 5 == y;
		
		//y는 홀수이다.
		bb = y % 2 == 1;
		
		//"기본형"과 "참조형"은 다르다.
		bb = !"기본형".equals("참조형");
		
		bb = !"ABC".equals("참조형");
	}
}