/* 학습내용
 * 1. 변수의 타입
 *   	타입 변수명;
 * 
 * 2. 메소드의 타입
 *		반환 타입, argument에 선언되 변수 타입  
 *		반환타입 메소등명 ([타입 변수명,...]){}
 * 3. 타입으로 사용 가능한 타입의 수는?
 * 			1. int와 같은 기본 타입 - 8가지 
 * 			2. String 처럼 JDK 내부에 class로 제공해주는 타입
 * 			3. 사용자가 직접 개발하는 클래스  
 */



package step01.test;

import step01.domain.FriendVO;

public class Test2 {
	//String을 argument로 받는 메소드 구현 
	void m1(String v) {}
//	int m1(int a, int b) {
		//return a+b;
//	}
	//String을 반환하는 메소드 구현
	String m2() {
		return "ee";
	}
	//FrinedVO
	void m3(FriendVO v) {}//import 하는 법 컨트롤 shit O
	public static void main(String[] args) {
		Test2 t = new Test2();
		
		t.m3(new FriendVO());
		
		FriendVO v = new FriendVO();
		t.m3(v);
		
		System.out.println(t.m2());
			t.m1("문");
		
		//Test2 t = new Test2();
		
		//int a = t.m1(1,2);//return값이 있으면 또 더해서 처리 가능 
		//int b = a+100;
	}

}


