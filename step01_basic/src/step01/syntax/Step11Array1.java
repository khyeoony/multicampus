/*학습내용 - 배열
 * 1. 다수의 데이터를 하나의 변수로 관리
 * 2. 각각의 데이터는 고유한 index로 구분 
 * 			-첫번째 순번의 데이터 시작은 0
 * 3. 모든 배열은 무조건 객체 
 * 		- 배열이 실제 사용 가능하게 생성될 경우 어떤 메모리에 생성
 * 		:Heap에 저장 
 * 4. 한번 생성시킨 배열의 크기는 변경 불가
 * 		- 가변적인 데이터 표현을 위해서는 배열이 아닌 list 구조를 권장
 * 		- java.util package 학습 예정
 * 5. 생성시킨 배열에는 배열 메모리 크기값을 보유한 length라는 변수가 자동 생성
 * 		
 */
package step01.syntax;

import step01.domain.PeopleDTO;

public class Step11Array1 {
	
	//int 배열
	public static int[] intArray(){
		int [] i = {1, 2, 3};//0번째, 1번째, 2번째 
		return i; 
	}
	//String 배열
	public static String[] stringArray() {
		String[] s = {"이상록", "정상만", "이형준"};
		return s;
	}
	//PeopleDTO배열 
	//32열의 PeopleDTO[]는 int 같은 것이다 
	public static PeopleDTO[] peopleArray() { //peopleArray객체배열의 주소를 return 하는 것
		PeopleDTO [] all = {new PeopleDTO("신동엽", 30),
									new PeopleDTO("이영자",31)};
		return all;
	}
	public static void main(String[] args) {
		int [] i = intArray();
		System.out.println(i[0]);
		//int [] i2= intArray()[2];//i2는 왜?********************
		System.out.println(stringArray()[1]);//index 1의 값만 출력//
		//? index 1번째 친구의 이름값만 출력해 보기 
		PeopleDTO[]all = peopleArray(); //PeopleDTO의 배열의 이름인 all인 PeopleArray임
		PeopleDTO p = all[1];
		String name = p.getName();
		
		//42,43라인 줄이기 
		//	PeopleDTO p1 = peopleArray()[]
		//더 줄이기
		String p1 = peopleArray()[1].getName();
	   
		/*peopleArray(): PeopleDTO 배열 반환
		 * peopleArray()[1] : 배열 내에 있는 index 1번째 객체인 PeopleDTO객체 변환//이름이랑 데이터 다 같이 가져옴 ex. name, age 다 가져옴 
		 * peopleArray()[1].getName() : 객체의 getName()호출
		 * 
		 */
		System.out.println(name);
	}

}
