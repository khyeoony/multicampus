/* �н� ����
 * 1. �⺻ syntax ����
 * 2. ���� ����(����), ���� �ʱ�ȭ(�� ����)
 *  	�޼ҵ� ����(����), �޼ҵ� ȣ��
 *  		��ȯŸ�� �޼ҵ��([]){[...]}
 *  	������ ����, ������ ȣ�� 
 *  3. �� ���� ����� �뵵
 *  		1. ���� - ����Ʈ ǥ��
 *  		2. �޼ҵ� - �پ��� ó�� ����� ����
 *  		3.	������ - ��ü ������ ȣ��Ǵ� �ʼ� ���� ��� 
 * 
 */
package step01.syntax;

public class Step02Type {
	//Ȳ�ι�, 27
	String name; //���� �����ϴ� ��, ȣ�� �� ���� �ƴϴ� 
	int age;
	public Step02Type() {}//�⺻ ������ *
	
	//Step02Type��ü ��ȯ �޼ҵ�
	Step02Type getObject() {
		Step02Type s = new Step02Type(); //��ü ���� ���� 
		return s; //""<�̷��� ���ڿ��� ��ȯ �ȵ� �׷��� �ϰ� ������ Step02Type getObject()�̰Ÿ� String����. 
	}
	
	Step02Type getObject2() { //Step02Type��ſ� String ���� �� �ٰ� �����غ���
		//Step02Type s = new Step02Type(); //��ü ���� ���� 
		return new Step02Type();
	}
	
	public static void main(String[] args) {
		//step02 - �޼ҵ� ȣ���ؼ� ��ü �޾ƿ���
		//Ŭ���� ���� �����ϴ� ����, �޼ҵ��� ���� �����ϱ� ���ؼ��� 
		//�ݵ�� ����, �޼ҵ带 ������ ��ü ������ �켱 
		//?getObject()ȣ���غ���
		Step02Type s = new Step02Type(); //s�� Ox�� ����
		Step02Type v = s.getObject();//v�� Ox �ּҰ�(��ġ��)? Ox�� �ƴұ�?  ��:�ƴϴ� new�� ���� ���� ����� ���� ����           �޼ҵ�� getObject�� �ǹ� �ο�x
		//Step02Type s2 = new Step02Type();
		//Step02Type v = s2.getObject();
		
		
		//����� ������ �� ������ ����, ȭ�� �ܼ�â�� ��� 
		/*1. ��ü ���� new ������()
		 * 2.������ ��ü�� �����ϴ� ������ ȣ���ؼ� ������ name, age ������ ���� ����
		 * 3. �� ������ ȣ���ؼ� ���  
		 * 
		 * 
		 */
		/*Step02Type s = new Step02Type();
		//name ���� ȣ���Ϸ��� s.name
		s.name = "Ȳ�ι�";
		s.age = 27;
		System.out.println(s.name); //print�� println�� ���̰� �ִ� 
		System.out.println(s.age);*/
	}

}
