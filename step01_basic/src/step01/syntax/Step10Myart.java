/*��ǰ����
 * 1. ���� ��� ���뿡 ���ؼ� 3���� �޼ҵ带 ����
 * 2. �ݺ�, ���ǵ ���� ������ �� �� �ִ� �ϳ��� lab����
 * 3. ���� : �� ¦���� �����ϴ� ����... 
 */



package step01.syntax;

public class Step10Myart {
	public static String getAtdscore(int value) {	//����// �̰� ���� ���� �ôµ� �д� �� ��
		String retval = "����";
		
		if(value >=400) {
			retval = "����";
		}else if(value >= 350) {
			retval = "����";
		}else if(value >= 300) {
			retval = "�������";
		}else {
			retval = "����ʿ�";
		}
		return retval;	
}

	//while
	public static void whileGreeting() {
		int no = 1; 
		
		while(no<=6) {
			System.out.println("�ȳ糪����ǿ�����");
			no++;
		}
	}
	public static void main(String[] args) {
		System.out.println(getAtdscore(370));
		whileGreeting();
	}

}