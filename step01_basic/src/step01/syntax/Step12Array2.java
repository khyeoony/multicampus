/*�н�����
 * 1. �迭 Ÿ���� �̿��� ����� ���
 * 2. String �����Ͱ� ���ϱ�
 * 		-public boolean equals(String v){���ڿ� ��}
 * 3. ����� ������
 * 		==
 * 		1. �⺻ Ÿ�� : ���� ����
 * 		2. ��ü Ÿ�� : �ּҰ�(��ġ) ��
 */

package step01.syntax;

import step01.domain.PeopleDTO;

public class Step12Array2 {
	//���ڿ� �� 
	public static void equalsTest(String v) {//�� v�� �޴°� main���� �޴� ��
		String id = "tester";
		System.out.println(id.equals(v));//ȣ���� �� . ���� 
	}
	//==���� �� �����ڷ� �� 
	public static void operator(int i) {//i�� data�� �ٸ� ���̴�
		int data = 10;
		System.out.println(data == i);
	}
	//��ü Ÿ�� �� : �ּҰ� ��
	public static void operator(PeopleDTO dto) {
		PeopleDTO p= new PeopleDTO("name", 10);
		System.out.println(p == dto);
		System.out.println(p.getName().equals(dto.getName()));
	
	
	// System.out.println(p.getName().equals(dto.getName()));�� ������ �ڵ� 
	String name = p.getName();
	String name2 = dto.getName();
	name.equals(name2);
}
	
	/*p.getName().eqauls ( dto.getName())�������
	 *p:PeopleDTO
	 * p.getName() : PeopleDTO�� name String�� ��ȯ�� ����
	 * p.getName().equals() : String�� equals() ȣ�⸸
	 * dto.getName() : dto�� getName() �� name ������ ȹ��
	 *  dto.getName()�� ������� Ȯ���� ��ȯ�Ǹ� equals() ����
	 */
	
	//�迭�� length ���� ��� ����
	public static void lenghtTest() {
		int[]i = {1, 4, 65, 7, 8};
		for (int index=0; index < i.length; index++) {//length�� 5���� index�� 0,1,2,3 �� 4�̴�. 
			System.out.print(i[index]+"\t");
		}
	}
	
	
	//String[] �������� ID���� ���� �� �ϳ��� id���� �ָ鼭 ���� ���� ��ȯ 
	

	
	

	public static void main(String[] args) {
		equalsTest("tester");
		equalsTest("e");
		operator(10);
		operator(3);
		operator(new PeopleDTO("name",10)); //false ���� �ƹ��� �Ȱ��Ƶ� ���ο� ��ü�� ���� false ���� �ʴ�. 
		lenghtTest();
	}

}