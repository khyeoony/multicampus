/* �н�����
 * 1. �޼ҵ� ����(����, �����)
 * 		-��ģ���� �������� test
 * 2. �޼ҵ� ȣ��(���)
 * 3. ���� ��ġ
 * 		-class ���� �������� ���� ����
 * 		-�޼ҵ� ���ο� �޼ҵ� ���� �Ұ� 
 * 		-�޼ҵ� ���ο��� �ٸ� �޼ҵ� ȣ�� ����
 * 4. �⺻ ����(*�ϱ�)
 *  -��ȯŸ�� �޼ҵ��( [arguments] ){ [����] }
 *  -��ȯ�� Ÿ�Կ� �°� ��ȯŸ�� ����
 *  -��ȯ�� ���� �޼ҵ��� ��� ��ȯŸ�Կ� void�� ���� 
 *  5. ����
 *  	-�����ڿ� ���� ��
 *  		������ ���� : Ŭ������( [arguments] ){ [����] }
 * 
 */



package step01.syntax;

public class Step01Method {
	public Step01Method() {} //������ �ϸ� �̰� �ڵ����� ����
	//+���� ����� �޼ҵ� ����
	/* ���� ����� ��
	 * ����� �� 1 - ���� �����ͷ� ���ؼ� ��ȯ
	 * ����� �� 2 - ���� �����ͷ� ���ؼ� ��ȯ 
	 * 
	 */
	public int sum(){
		return 3+5; 
	}
	

	public int sum(int no1, int no2){//sum2(10, 20) //art shit r �ϸ� �ڽ�
		return no1 + no2; //return �ݵ�� �����
	}
	public void sum(int no1, int no2, int no3){//��ȯ �� �ϳ��� �� 
		System.out.println(no1 + no2 + no3); // 
	}	
	public static void main(String[] args) {
		// 1�ܰ� - �޼ҵ� ȣ���ϱ� ���� ��ü ���� 
		// ��ü ���� ���� : Ÿ�� ������ = new ������();
		Step01Method s = new Step01Method(); //1�ܰ� �� ��ü ����
		System.out.println();
		int v1 = s.sum(); //****��ȯ���� v1�� �����̰�, v1�� ����  .�� ()�� �߿� 
		System.out.println(v1); // �ؿ�sum() ��ȣ�� �߿�
		//System.out.println(s. sum()); //method �տ� int�� String ���� ������ Ÿ�� ������ ��ȯ������
		System.out.println(s.sum(100, 200));  //100�ۼ�Ʈ �Ȱ��ƾ� �� ;;;�Է�!
		s.sum(3, 5, 6); //syso ��� ���� ����? 

	}

}
