package Exam01;

import java.util.Scanner;

public class MemberServiceRunner extends MemberService {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// MemberService login 메소드 호
		MemberService login = new MemberService();
		
		String userId =in.next();
		int userPass = in.nextInt();
		
		// userid & userpass 확인 
			if (userId.equals("ezen") && userPass == 12345){
			System.out.println
			( "- 로그인되었습니다.");
			
		}else {
			System.out.println
			("- id 또는 password가 올바르지 않습니다. ");
			in.close();
		}
	
	}
	 }
		

	
	
	

