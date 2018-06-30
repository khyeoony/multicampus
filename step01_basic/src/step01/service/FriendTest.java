package step01.service;

import step01.domain.FriendVO;
//설계한 것을 가져오는 것 

public class FriendTest {

	//java program의 start point 필수 메소드 
		public static void main(String [] a) {
			FriendVO p1 = new FriendVO();
			System.out.println(p1.name + " " + p1.cellPhone + " "+ p1.age);
					
							
			FriendVO p2 = new FriendVO();
			p2.name = "이나리";
			p2.cellPhone = "010-111-111";
			p2.age = 25;
			System.out.println(p2);
			System.out.println(p2.name + " " + p2.cellPhone + " "+ p2.age);
			
			FriendVO p3 = new FriendVO();
			p3.name = "이동규";
			p3.cellPhone = "010-222-222";
			p3.age = 26;
			System.out.println(p3);
			System.out.println(p3.name + " " + p3.cellPhone + " "+ p3.age);
			
			FriendVO p4 = new FriendVO("ddd","000-000-0000",26);
		}//end of main
}//end of class