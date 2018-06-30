/* 학습 내용
 * 1. 기본 syntax 복습
 * 2. 변수 생성(선언), 변수 초기화(값 대입)
 *  	메소드 생성(구현), 메소드 호출
 *  		반환타입 메소드명([]){[...]}
 *  	생성자 구현, 생성자 호출 
 *  3. 각 구성 요소의 용도
 *  		1. 변수 - 데이트 표현
 *  		2. 메소드 - 다양한 처리 기능을 구현
 *  		3.	생성자 - 객체 생성시 호출되는 필수 구성 요소 
 * 
 */
package step01.syntax;

public class Step02Type {
	//황인범, 27
	String name; //변수 선언하는 것, 호출 한 것은 아니다 
	int age;
	public Step02Type() {}//기본 생성자 *
	
	//Step02Type객체 반환 메소드
	Step02Type getObject() {
		Step02Type s = new Step02Type(); //객체 생성 문법 
		return s; //""<이렇게 문자열로 반환 안됨 그렇게 하고 싶으면 Step02Type getObject()이거를 String으로. 
	}
	
	Step02Type getObject2() { //Step02Type대신에 String 으로 쓴 다고 생각해보자
		//Step02Type s = new Step02Type(); //객체 생성 문법 
		return new Step02Type();
	}
	
	public static void main(String[] args) {
		//step02 - 메소드 호출해서 객체 받아오기
		//클래스 내에 존재하는 변수, 메소들을 실제 실행하기 위해서는 
		//반드시 변수, 메소드를 보유한 객체 생성이 우선 
		//?getObject()호출해보기
		Step02Type s = new Step02Type(); //s는 Ox라 가정
		Step02Type v = s.getObject();//v는 Ox 주소값(위치값)? Ox가 아닐까?  답:아니다 new가 들어가면 새로 만들어 지기 때문           메소드명 getObject에 의미 부여x
		//Step02Type s2 = new Step02Type();
		//Step02Type v = s2.getObject();
		
		
		//반장님 정보를 각 변수에 저장, 화면 콘솔창에 출력 
		/*1. 객체 생성 new 생성자()
		 * 2.생선한 객체를 참조하는 변수로 호출해서 각각의 name, age 변수에 값을 대입
		 * 3. 각 변수값 호출해서 출력  
		 * 
		 * 
		 */
		/*Step02Type s = new Step02Type();
		//name 변수 호출하려면 s.name
		s.name = "황인범";
		s.age = 27;
		System.out.println(s.name); //print와 println은 차이가 있다 
		System.out.println(s.age);*/
	}

}
