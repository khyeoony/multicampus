/*�н����� - �迭
 * 1. �ټ��� �����͸� �ϳ��� ������ ����
 * 2. ������ �����ʹ� ������ index�� ���� 
 * 			-ù��° ������ ������ ������ 0
 * 3. ��� �迭�� ������ ��ü 
 * 		- �迭�� ���� ��� �����ϰ� ������ ��� � �޸𸮿� ����
 * 		:Heap�� ���� 
 * 4. �ѹ� ������Ų �迭�� ũ��� ���� �Ұ�
 * 		- �������� ������ ǥ���� ���ؼ��� �迭�� �ƴ� list ������ ����
 * 		- java.util package �н� ����
 * 5. ������Ų �迭���� �迭 �޸� ũ�Ⱚ�� ������ length��� ������ �ڵ� ����
 * 		
 */
package step01.syntax;

import step01.domain.PeopleDTO;

public class Step11Array1 {
	
	//int �迭
	public static int[] intArray(){
		int [] i = {1, 2, 3};//0��°, 1��°, 2��° 
		return i; 
	}
	//String �迭
	public static String[] stringArray() {
		String[] s = {"�̻��", "����", "������"};
		return s;
	}
	//PeopleDTO�迭 
	//32���� PeopleDTO[]�� int ���� ���̴� 
	public static PeopleDTO[] peopleArray() { //peopleArray��ü�迭�� �ּҸ� return �ϴ� ��
		PeopleDTO [] all = {new PeopleDTO("�ŵ���", 30),
									new PeopleDTO("�̿���",31)};
		return all;
	}
	public static void main(String[] args) {
		int [] i = intArray();
		System.out.println(i[0]);
		//int [] i2= intArray()[2];//i2�� ��?********************
		System.out.println(stringArray()[1]);//index 1�� ���� ���//
		//? index 1��° ģ���� �̸����� ����� ���� 
		PeopleDTO[]all = peopleArray(); //PeopleDTO�� �迭�� �̸��� all�� PeopleArray��
		PeopleDTO p = all[1];
		String name = p.getName();
		
		//42,43���� ���̱� 
		//	PeopleDTO p1 = peopleArray()[]
		//�� ���̱�
		String p1 = peopleArray()[1].getName();
	   
		/*peopleArray(): PeopleDTO �迭 ��ȯ
		 * peopleArray()[1] : �迭 ���� �ִ� index 1��° ��ü�� PeopleDTO��ü ��ȯ//�̸��̶� ������ �� ���� ������ ex. name, age �� ������ 
		 * peopleArray()[1].getName() : ��ü�� getName()ȣ��
		 * 
		 */
		System.out.println(name);
	}

}