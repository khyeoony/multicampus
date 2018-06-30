package step01.syntax;

import step01.domain.FriendVO;

public class Step03Type {

	
	//FriendVO 반환 메소드
	FriendVO getInstance() {
		return new FriendVO();
	}
	//FriendVO를 메소드 parameter로 반영하는 메소드 
	void m(FriendVO v) {//a.m(FriendVO객체); 0x
		System.out.println(2+""+v.name);//황인범
		v.name = "손영정";
		
		
		
		//호출 void m(){} // a.m()
		//void m(int i) a.m(2)
		//void m(String i){} // a.m(String "wew") 값만 호출하기 
		
	
	}
	  	 
	
	
	public static void main(String[] args) {
		Step03Type s = new Step03Type();
		FriendVO v2 = s.getInstance();
	
		
		System.out.println(1+""+v2.name);
		s.m(v2);
		System.out.println(3+""+v2.name);
		
		}

		}

