/*�н�����
 * 1.���� �ʱ�ȭ
 * 		1.��� - ��ü ������ �ڵ� �⺻������ �ʱ�ȭ 
 * 		2.���� - �ڵ� �ʱ�ȭ�� �Ұ�, ���� ����� �ʱ�ȭ �ʼ� 
 * 2. �⺻ Ÿ�� �������� ����ȭ
 * 		- Ÿ���� �ٸ� ������ ������ "����ȯ" �������� ��ȯ�� ���� 
 * 		- boolean�� ���� �ٸ� Ÿ������ ��ȯ �Ұ� 
 * 		- �Ǽ��� ������ ���������� �������� ū �޸𸮰� ���� **�ܿ��� 
 * 
 *     - �ƽ�Ű �ڵ�
 */

package step01.syntax;

public class Step05Variable {
		int no; //��� ������ ��ü�� ���� 
		String msg;
		
		//���� ���� �ʱ�ȭ �н� 
		void localVar() {
			int no = 0; //local�� �ݵ�� ����Ҷ� ���� ����Ѵ� 
			System.out.println(no);
		}
		
		//�⺻ Ÿ�� ����ȭ
		void typeCasting() {
			byte b = 8; //8bit
			int i = b;//32bit upcasting** (���� ����� ū �������)
			//byte b2 = i;//ū�Ŵ� �����ſ� �Ժη� ���� �� ���� >���� �����ؾ���
			byte b2 = (byte)i; //32bit -> 8bit�� ��ȯ downcasting** (ū ����� ���� ������� ����)
			char c = 'A';//16bit
			int i2 = c;
			System.out.println(c);//A
			System.out.println(i2);
			
			
		}
	public static void main(String[] args) {
		//��ü ������ heap�� ������ no�� msg�� �ڵ� �ʱ�ȭ (��� ���� �� :0��null)
		Step05Variable s = new Step05Variable();
		//System.out.println(s.no);
		//System.out.println(s.msg);
		s.typeCasting();
		
		int i =65;
		char c = (char)i;
		System.out.println(c); //�׷��� ���� A�� ���� 
		
		
		//������ ��Ģ����� ������ int�� ��ȯ (byte�� byte���� ���� ���� �� int�� ���� ������ ����)
		byte b1 = 8;
		byte b2 = 10;
		byte b3 = (byte)(b1+b2);
	}
}