package step01.test;

import step01.domain.FriendVO;
/*
 * ȣ���ϴ� ����
 *      Test t
 *      new Test ("������ �� ���׿�", 46)
 *      public Test(String m, int a){
 *      message = m;
 *      age = a;
 *      }
 *      Test t = new Test ("������ �� ���׿�", 46)
 *      ;
 */
public class Test {
	String message;//����
	int age;//����
	
	public Test() {}//������, �ϳ��� Ŭ������ ������ ������ ����
	public Test(String m, int a) {
		message = m;
		age = a;
	}
	//?��ü �������� message, age ��� ������ ����� �ֳ���? ����. �׷��� ��ü ���� �ʼ� 
	public static void main(String[] args) {
		Test a = new Test ("������ �� ���׿�", 46);
		System.out.println(a.message+" "+a.age); //.�� �ſ� �߿� ""�� �߿� , a�� �����ϰ� �ִ� ������
	}

}

/*
 * 1.������ ���� �ڵ� �߰��Ǵ� �ڵ��?
 * 		public Test() {}
 * 2. "������ �� ���׿�"....��� �����͸� �����Ѽ� �ִ� ������ ����
 * 3. 46�̶�� ���� ���� ������ ���� ���� 
 * 4. ��ü ���� ������ �������� �����ͷ� ������ ����
 * �� �� �ִ� parameter(argument, �Ű�����)�� �ִ� ������ ����� 
 * 5. "������ �� ���׿�", 46�̶�� �����ͷ� ��ü���� �� ������ �� ���
 * ��Ʈ : ��ü ���� ������ ������ �ϳ�
 *      Ŭ������ ������ = new ������ ȣ��(..)
 *      
*/