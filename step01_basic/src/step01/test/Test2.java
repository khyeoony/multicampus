/* �н�����
 * 1. ������ Ÿ��
 *   	Ÿ�� ������;
 * 
 * 2. �޼ҵ��� Ÿ��
 *		��ȯ Ÿ��, argument�� ����� ���� Ÿ��  
 *		��ȯŸ�� �޼ҵ�� ([Ÿ�� ������,...]){}
 * 3. Ÿ������ ��� ������ Ÿ���� ����?
 * 			1. int�� ���� �⺻ Ÿ�� - 8���� 
 * 			2. String ó�� JDK ���ο� class�� �������ִ� Ÿ��
 * 			3. ����ڰ� ���� �����ϴ� Ŭ����  
 */



package step01.test;

import step01.domain.FriendVO;

public class Test2 {
	//String�� argument�� �޴� �޼ҵ� ���� 
	void m1(String v) {}
//	int m1(int a, int b) {
		//return a+b;
//	}
	//String�� ��ȯ�ϴ� �޼ҵ� ����
	String m2() {
		return "ee";
	}
	//FrinedVO
	void m3(FriendVO v) {}//import �ϴ� �� ��Ʈ�� shit O
	public static void main(String[] args) {
		Test2 t = new Test2();
		
		t.m3(new FriendVO());
		
		FriendVO v = new FriendVO();
		t.m3(v);
		
		System.out.println(t.m2());
			t.m1("��");
		
		//Test2 t = new Test2();
		
		//int a = t.m1(1,2);//return���� ������ �� ���ؼ� ó�� ���� 
		//int b = a+100;
	}

}

