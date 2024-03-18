package Exam01;


public class MemberService {

	//객체선언 
	void login() {}
	boolean login (String id, String password) {
			if (id == "ezen" && password == "12345") {
				return true;
			}
			else {
				return false;
			}
		}
	 
 	 void logout() {
 		System.out.println
 		("- 로그아웃되었습니다.");
 	 }
 	 
}


