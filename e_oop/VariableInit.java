package e_oop;

public class VariableInit {
	
	// 명시적 초기화
	int var = 10;
	static int classVar = 20;
	
	// 초기화 블럭
	{
		var = 20;
	}
	
	static {
		classVar = 40;
	}
	
	// 생성자
	/*
	 * new Scanner();
	 * - 클래스와 같은 이름의 메서드
	 * - 인스턴스 변수를 초기화하기 위해 사용한다.
	 * - 클래스에 생성자는 반드시 하나 이상 존재해야 한다.
	 * - 직접 선언해주지 않으면 컴파일러가 기본 생성자를 만들어준다.
	 * - 생성자는 리턴타입이 없다.
	 */
	
	VariableInit() {
		var = 50;
		//생성자를 사용하는 이유는 파라미터를 사용할 수 있기 때문이다.
	}
	
	public static void main(String[] args) {
		Init i1 = new Init(); 
		i1.a = 10;
		i1.b = 20;
		i1.c = 30;
		
		Init i2 = new Init();
		i2.a = 40;
		i2.b = 50;
		i2.c = 60;
		
		Init i3 = new Init(70, 80, 90); //변수를 초기화하고 싶은데 값을 외부에서 결정해야 하는 경우
		                                //생성자에 파라미터를 받아서 초기화를 진행하면 값을 적어 간편하게 사용 가능
		
		System.out.println();
	}
	
}

class Init {
	int a;
	int b;
	int c;
	
	Init(int a, int b, int c) {
		this.a = a; // 객체를 통해 변수를 호출 (this.인스턴스변수)
		this.b = b;
		this.c = c;
		//this(객체의 주소가 들어있는 변수) : 인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해 사용한다.
	}
	
	//오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것, 파라미터로 구분
	//조건 : 파라미터의 개수나 타입이 달라야 한다.
	Init() { // 메서드는 이름 중복가능
		this(10, 20, 30);
		//this() : 생성자에서 다른 생성자를 호출할 때 사용한다.
	}
}














