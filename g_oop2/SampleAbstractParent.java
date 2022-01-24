package g_oop2;

public abstract class SampleAbstractParent { // 추상클래스 : 부모로써 사용, 다른 클래스가 상속받기 위해서 이 클래스를 사용 --> 상속시켜주는 용도

	void method() {
		
	}
	
	abstract void abstractMethod(); // 추상메서드 : 블럭자체가 없고 세미콜론으로 끝남. 내용이 없음, 추상메서드라는 걸 표시하기 위해 제어자 abstract 붙임
	// 호출 안됨 -> 클래스 객체 생성 했는데 메서드 하나가 호출 안되면 X 그래서 클래스 자체도 객체 생성을 못하는 추상 클래스로 만듦
	// 상속을 받는 클래스들이 메서드들은 똑같이 있는데 내용은 다 다를때 추상메서드를 사용한다.ㄴ
} 

class SampleAbstractChild extends SampleAbstractParent { // 추상메서드를 상속받았으면 반드시 내용을 만들어 줘야 함 --> 오버라이딩해줘야 함
// 추상클래스는 자식클래스에서 내용 만드는 것을 강제시킴
	
	@Override
	void abstractMethod() { 
		// TODO Auto-generated method stub
		
		
	} 
	
}