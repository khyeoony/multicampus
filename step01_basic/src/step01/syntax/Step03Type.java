package step01.syntax;

import step01.domain.FriendVO;

public class Step03Type {

	
	//FriendVO ��ȯ �޼ҵ�
	FriendVO getInstance() {
		return new FriendVO();
	}
	//FriendVO�� �޼ҵ� parameter�� �ݿ��ϴ� �޼ҵ� 
	void m(FriendVO v) {//a.m(FriendVO��ü); 0x
		System.out.println(2+""+v.name);//Ȳ�ι�
		v.name = "�տ���";
		
		
		
		//ȣ�� void m(){} // a.m()
		//void m(int i) a.m(2)
		//void m(String i){} // a.m(String "wew") ���� ȣ���ϱ� 
		
	
	}
	  	 
	
	
	public static void main(String[] args) {
		Step03Type s = new Step03Type();
		FriendVO v2 = s.getInstance();
	
		
		System.out.println(1+""+v2.name);
		s.m(v2);
		System.out.println(3+""+v2.name);
		
		}

		}

