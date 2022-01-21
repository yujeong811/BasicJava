package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * - 사칙연산 : +, -, *, /, %(나머지)
		 * - 복합연산 : +=, -=, *=, /=, %=
		 * - 증감연산 : ++, --
		 */
		
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		
		result = 10 / 3;
		System.out.println(result);
		result = 10 % 3;
		System.out.println(result);
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 결과를 출력해주세요.
		int plus = 5 + 10;
		int minus = 5 - 10;
		int multi = 5 * 10;
		float div = 10 / 3;
		int remain = 15 % 6;
		
		System.out.println(plus + "\n" + minus + "\n" + multi + "\n" + div + "\n" + remain);
		
		
		//복합연산
		result = result + 3;
		
		result += 3; // 변수값 3 증가 후 대입
		
		result -= 5; // 변수값 5 감소 후 대입
		
		result *= 2; // 변수값 2 곱셈 후 대입
		
		result /= 3; // 변수값 3 나눗셈 후 대입
		
		result /= 3 + 2; // 3+2 연산 끝난 후 대입 (오른쪽 연산 끝난 후 왼쪽 변수에 대입)
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
		result += 10;
		
		//result = result % 5;
		result %= 5;
		
		//result = result - 2 * 3; --> result = result - 6;
		result -= 2 * 3;
		
		
		//증감연산
	    //증가연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 감소시킨다.
		
		int i = 0;
		
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다.
		--i; 
		i--; 
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++); // 증가되기 전 읽은 값 출력
		System.out.println(i); // 1 증가
		
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double; // _int가 더 작기때문에 형변환 생략, 원래는 형변환해야함
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short; // 연산을 위해서는 4byte 이상이어야 함 -> int보다 작은 타입은 int로 형변환된 후 연산됨
		
		char _char = 'a'; // 유니코드 a = 97
		char _char2 = 'b'; // b = 98
		_int = _char + _char2; // int보다 작은 타입은 int로 형변환된 후 연산됨
		System.out.println(_int);
		
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127; // byte : -128 ~ +127 
		b++; // 값이 가장 큰 표현범위를 벗어나면 가장 작은 값으로 출력 -> 오버플로우
		System.out.println(b);
		b--; // 값이 가장 작은 표현범위를 벗어나면 가장 큰 값으로 출력 -> 언더플로우
		System.out.println(b);
	
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		double aa = 123456 + 654321; // 1 -> double aa = 123456 + 654321;
		
		double bb = aa * 123456; // 2 -> aa *= 123456;
		
		double cc = bb / 123456; // 3 -> aa /= 123456;
		
		double dd = cc - 654321; // 4 -> aa -= 654321;
		
		double ee = dd % 123456; // 5 -> aa %= 123456;
		
		System.out.println(ee);
		
		
		//3개의 int타입 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		
		int one = 100;
		int two = 61;
		int three = 242;
		
		int total = one + two + three;
		double avg = (one + two + three) / 3.0;
		
		System.out.println(total + "\n" + avg);
		
		
		//반올림
//		avg = Math.round(avg); // 소수점 첫째자리에서 반올림해준다.
//		System.out.println(avg);
		
		avg = Math.round(avg * 10) / 10.0; // 소수점 둘째자리에서 반올림 -> 소수점을 뒤로 한칸 이동후 반올림 해주고 다시 소수점 앞으로 한칸 이동
		System.out.println(avg);
		
		
		//랜덤: Math.random() -> 0.00 ~ 0.99
		int random = (int)(Math.random() * 100) + 1; // 1 ~ 100
		System.out.println(random);
		
	}
}