/*Data Transfer Object = Value Object = Java Bean
 * 1. ����Ģ
 * 		-������DTO.java/������VO.java/������Bean.java/������.java
 * 2. ����
 * 		-��� ���� : private  
 * 		-��� �޼ҵ� : ���� �� �����Ͱ� ��ȯ, ������ ���� �������θ� ���� 
 * 							������ ���� �޼ҵ忡�� ���� ��ȿ�� ���� ���� 
 * 		-������ : �⺻������, ��� ������ �ʱ�ȭ ������ 
 * 
 * 		-toString() : ��� �����鰪 �����ؼ� ��ȯ�ϴ� �޼ҵ� 
 * 
 */

package step01.domain;

public class PeopleDTO {
	private String name;
	private int age;//32bit(-10)//private�� �߰�ȣ �ȿ����� ��� ���� 
	





		public PeopleDTO() {} //������ ���鶧 public ��� �ؾ� �ϳ�?
		public PeopleDTO(String newName, int newAge) {//���� ���� newName �� newAge
			name = newName;
			age = newAge;		
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;//member��� ���� 
			//this.~ : ��� ����
			//name : ���� ���� -> ����ڰ� s.setName("������");
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
