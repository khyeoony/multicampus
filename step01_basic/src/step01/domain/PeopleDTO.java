/*Data Transfer Object = Value Object = Java Bean
 * 1. 명명규칙
 * 		-도메인DTO.java/도메인VO.java/도메인Bean.java/도메인.java
 * 2. 구조
 * 		-멤버 변수 : private  
 * 		-멤버 메소드 : 변수 즉 데이터값 반환, 데이터 수정 로직으로만 구성 
 * 							데이터 수정 메소드에는 값의 유효성 검증 구현 
 * 		-생성자 : 기본생성자, 멤버 변수들 초기화 생성자 
 * 
 * 		-toString() : 멤버 변수들값 결합해서 반환하는 메소드 
 * 
 */

package step01.domain;

public class PeopleDTO {
	private String name;
	private int age;//32bit(-10)//private은 중괄호 안에서만 사용 가능 
	





		public PeopleDTO() {} //생성자 만들때 public 명시 해야 하나?
		public PeopleDTO(String newName, int newAge) {//로컬 변수 newName 와 newAge
			name = newName;
			age = newAge;		
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;//member라고 지정 
			//this.~ : 멤버 변수
			//name : 지역 변수 -> 사용자가 s.setName("김혜연");
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "PeopleDTO [name=" + name + ", age=" + age + "]";
		}
		
			
		
}
