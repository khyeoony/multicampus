/*�н�����
 * 1. static Ű����
 * 2. ���� ����
 * 		1. ��� ���� ����
 * 			- �����Ǵ� ��� ��ü���� �����ϴ� ���� (peopleDTO�� HEAP�� �����)
 * 			- ���� �ڿ��� �ƴ� �����鿡 ��� ���� ��? 
 * 			- static ������ �޸𸮿� ���� ��� �����ϰ� 
 *            �����Ǵ� ������ ? 
 *            :���� �ڵ��� byte code�� �޸𸮿�
 *            	�ε�(����)�ɶ� �ڵ� ���� 
 * 		2. �޼ҵ� ����
 * 			- ��ü �������� Ŭ���������� �޼ҵ� ȣ�� ���� 
 * 		3. static{}
 * 			- web server�� ���۵� �� ��� user�� �����ϴ� �ڿ��� �ִٸ�
 * 			 �ڿ��� �ִٸ� �� �ѹ� ���� ������ �� �� �ִ� ���� 
 * 			�̸��� ���� ���� �ڵ�� ȣ�� �Ұ�
 * 			-byte code�� �޸𸮿� �ε��� �� �ڵ� ���� 
 * 			
 * 
 */

package step01.syntax;

import org.omg.Messaging.SyncScopeHelper;

public class Step06static {
	//step02 - static ���� 
	static int no = 100;
	static String msg = "���ڿ�";
	//instance ���� :���� �ݵ�� ��ü ���� �� ���//�����ڸ� ������ �Ѵ�. �츮�� �������� �ߴ� �� 
    int no2 = 200; //����Ʈ �ڵ常 �ø��� static�� ���ڸ��� �������ڸ��� ���� �׸��� main�θ� 
	String msg2 = "���ڿ� 2";
			
	void m1() {
		System.out.println("�Ϲ� �޼ҵ�");//m1(); �� ȣ�� �� �� ���� �ʴ� 
	}
	//��ü �������̵� class��. m2()�Ǵ� ������ Ŭ������� m2();ȣ�� ���� 
	static void m2() {
		System.out.println("static �޼ҵ�");
	}
	//static�� �ƴϸ� >java Step06static        Step06static.main();?????????????????
	public static void main(String[] args) {
		m2();
		Step06static.m2();
		
		//Step06static s = new Step06static();
		System.out.println(no);
		System.out.println(msg);//���ڿ�
		//System.out.println(no2);(��� int�� ���� �ȵ�)
		
		System.out.println(Math.random());
		
		//java.lang.Integer�� �޼ҵ� ȣ��
		//"3" -> int�� ��ȯ�ϴ� �޼ҵ� ȣ���ؼ� ��ȯ�ϱ�
		/*�ʿ��� ������ - int�� ������ ���ڿ� ������
		 * ��� ������ - int�� ��ȯ�� ������
		 * 
		 * �� ������ � Ŭ�������� ������ ���ΰ�?
		 * 		String? Integer?
		 * 		Ȥ ���ڿ� �����͸� ������ �޼ҵ带 ������ ��ü�� �ʿ��Ѱ�?
		 * 
		 * byte(byte�� ��ȯ�ϰ� �ʹٸ�) : Byte - public static byte parseByte(String v){}
		 */
		int no3 = Integer.parseInt("3");
		System.out.println(no3);
	}
}	
	
		//step01- static{}
//	static {	
//	System.out.println(2);
//	}
//
//	public static void main(String[] args) {
//		System.out.println("main");
//
//}
//	static {
//		System.out.println(1);
//	}
//	
//}

//�� 1 2 main