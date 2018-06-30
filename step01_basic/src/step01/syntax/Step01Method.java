/* 학습내용
 * 1. 메소드 구현(개발, 만들기)
 * 		-사친연산 로직으로 test
 * 2. 메소드 호출(사용)
 * 3. 구현 위치
 * 		-class 영역 내에서만 개발 가능
 * 		-메소드 내부에 메소드 구현 불가 
 * 		-메소드 내부에서 다른 메소드 호출 가능
 * 4. 기본 문법(*암기)
 *  -반환타입 메소드명( [arguments] ){ [로직] }
 *  -반환값 타입에 맞게 반환타입 설정
 *  -반환값 없는 메소드인 경우 반환타입에 void로 선언 
 *  5. 참고
 *  	-생성자와 문법 비교
 *  		생성자 문법 : 클래스명( [arguments] ){ [로직] }
 * 
 */



package step01.syntax;

public class Step01Method {
	public Step01Method() {} //컴파일 하면 이게 자동으로 구현
	//+연산 기능의 메소드 구현
	/* 개발 경우의 수
	 * 경우의 수 1 - 정적 데이터로 더해서 반환
	 * 경우의 수 2 - 동적 데이터로 더해서 반환 
	 * 
	 */
	public int sum(){
		return 3+5; 
	}
	

	public int sum(int no1, int no2){//sum2(10, 20) //art shit r 하면 박스
		return no1 + no2; //return 반드시 써야함
	}
	public void sum(int no1, int no2, int no3){//반환 안 하나는 것 
		System.out.println(no1 + no2 + no3); // 
	}	
	public static void main(String[] args) {
		// 1단계 - 메소드 호출하기 위한 객체 생성 
		// 객체 생성 문법 : 타입 변수명 = new 생성자();
		Step01Method s = new Step01Method(); //1단계 답 객체 생성
		System.out.println();
		int v1 = s.sum(); //****반환값을 v1의 저장이고, v1은 변수  .과 ()가 중요 
		System.out.println(v1); // 밑에sum() 괄호가 중요
		//System.out.println(s. sum()); //method 앞에 int나 String 같은 데이터 타입 있으면 반환해주자
		System.out.println(s.sum(100, 200));  //100퍼센트 똑같아야 함 ;;;입력!
		s.sum(3, 5, 6); //syso 없어도 실행 가능? 

	}

}
