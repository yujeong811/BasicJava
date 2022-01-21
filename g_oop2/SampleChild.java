package g_oop2;

public class SampleChild extends SampleParent{ // class 자식클래스명 extends 부모클래스명 { }
	
	void childMethod() {
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var); // 상속받은 변수
		System.out.println(method(7, 13)); // 상속받은 메서드
	}
	
	//오버라이딩 : 상속받은 메서드의 내용을 바꾸는 것
	//super, super() : 부모클래스의 멤버랑 자식클래스의 멤버 이름이 똑같을 때 구분하기 위해 super를 씀 / 자식클래스의 생성자에서 부모클래스의 생성자를 호출할 때 super()를 씀
	//다형성 : 다양한 형태를 가질 수 있는 성질, 부모타입의 변수로 자식타입의 객체를 사용
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것 --> 상속받은 메서드의 내용중에서 선언부분만 똑같이 쓰고 내용은 바꿈
	@Override //어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는 것 (오버라이딩 실수 방지 위해)
	int method(int a, int b) { //리턴타입 메서드명 파라미터 모두 같아야 한다.
		return a * b;
	}
	
	//super, super()
	int var;
	
	void test(double var) {
		System.out.println(var); //지역변수
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모 클래스의 인스턴스 변수
		//super : 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될때 둘을 구분하기 위해 사용한다.
	}
	
	SampleChild () { //this, super() 둘다 반드시 메서드 안에서 첫번째 줄에 있어야 한다, 그래서 둘다 동시에 사용할 수 없다.
//		this();//같은 클래스 내에 있는 다른 생성자 호출
		super(); //부모클래스의 생성자 호출
		//this()가 없는 생성자에서만 super()를 호출한다.
	}

	//다형성 : 부모타입의 변수로 자식타입의 객체를 사용하는 것
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		
		SampleParent sp = new SampleChild(); //다형성 : 
		//변수(부모)의 타입에 있는 멤버만 사용할 수 있다.
		System.out.println(sp.var);
		sp.method(10, 20);
		
		//객체(자식)의 타입에 있는 멤버는 사용할 수 없다.
//		sp.childMethod(); //사용불가
//		sp.test(); //사용불가
	}
}
























