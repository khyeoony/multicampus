/*학습내용
 * 1.변수 초기화
 * 		1.멤버 - 객체 생성시 자동 기본값으로 초기화 
 * 		2.로컬 - 자동 초기화가 불가, 따라서 사용전 초기화 필수 
 * 2. 기본 타입 변수간의 형변화
 * 		- 타입이 다른 변수들 간에도 "형변환" 문법으로 변환이 가능 
 * 		- boolean은 절대 다른 타입으로 변환 불가 
 * 		- 실수는 무조건 내부적으로 정수보다 큰 메모리가 관리 **외워라 
 * 
 *     - 아스키 코드
 */

package step01.syntax;

public class Step05Variable {
		int no; //멤버 변수는 객체를 생성 
		String msg;
		
		//로컬 변수 초기화 학습 
		void localVar() {
			int no = 0; //local은 반드시 사용할때 값을 줘야한다 
			System.out.println(no);
		}
		
		//기본 타입 형변화
		void typeCasting() {
			byte b = 8; //8bit
			int i = b;//32bit upcasting** (작은 사이즈를 큰 사이즈로)
			//byte b2 = i;//큰거는 작은거에 함부로 넣을 수 없다 >따라서 압축해야함
			byte b2 = (byte)i; //32bit -> 8bit로 변환 downcasting** (큰 사이즈를 작은 사이즈로 압축)
			char c = 'A';//16bit
			int i2 = c;
			System.out.println(c);//A
			System.out.println(i2);
			
			
		}
	public static void main(String[] args) {
		//객체 생성시 heap에 생성된 no와 msg는 자동 초기화 (출력 했을 때 :0과null)
		Step05Variable s = new Step05Variable();
		//System.out.println(s.no);
		//System.out.println(s.msg);
		s.typeCasting();
		
		int i =65;
		char c = (char)i;
		System.out.println(c); //그러면 답은 A로 나옴 
		
		
		//정수의 사칙연산시 무조건 int로 변환 (byte랑 byte끼리 결합 했을 때 int로 답이 나오기 때문)
		byte b1 = 8;
		byte b2 = 10;
		byte b3 = (byte)(b1+b2);
	}
}
