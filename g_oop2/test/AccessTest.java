package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
	AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar); // 상속받아도 컴파일 에러 뜨는 이유 : 내 클래스가 아닌 다른 클래스 객체생성을 통해 접근해서 에러 뜸
//		am.protectedMethod();
		
//		System.out.println(am.defaultVar);
//		am.defaultMethod();
		
//		System.out.println(am.privateVar); // 접근 불가능 
//		am.privateMethod();

		AccessTest at = new AccessTest(); 
		
		System.out.println(at.protectedVar); // AccessTest 객체를 생성후에 접근하면 에러 뜨지 않음
		at.protectedMethod();
		
	}

}
