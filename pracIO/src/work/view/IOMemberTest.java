package work.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOMemberTest {

	public static void main(String[] args) {
		while(true) {
			mainMenu();
			int menuNo = inputNumber();
			switch(menuNo) {
			case 1:
				loginMenu();
				break;
			case 2:
				addMemberMenu();
				break;
			case 0:
				System.out.println("회원관리 프로그램이 종료됩니다.");
				System.exit(0);
				break;
			default:
				System.out.println("메뉴번호 오류");
				break;
			
			}
		}
	}
	
	public static void loginMenu() {
		System.out.println("로그인 메뉴");
		System.out.println("아이디 : ");
		String memberId = inputString();
		
		System.out.println("비밀번호 : ");
		String memberPw = inputString();		
	}
		
	public static void mainMenu() {
		System.out.println("---------");
		System.out.println("회원관리시스템 메인메뉴");
		
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("0. 프로그램 종료");
		System.out.println("----------");
		System.out.println("메뉴번호 입력 : ");
		
	}
	
	public static void addMemberMenu() {
		System.out.println("회원 가입 메뉴");
		
		System.out.println("아이디 : ");
		String memberId = inputString();
		
		System.out.println("비밀번호 : ");
		String memberPw = inputString();
		
		System.out.println("이름 : ");
		String name = inputString();
		
		System.out.println("휴대폰 : ");
		String mobile = inputString();
		
		System.out.println("이메일 : ");
		String email = inputString();
	}
	
	public static String inputString() {
		String data = null;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			data = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();			
		}
		return data;
	}
	
	public static int inputNumber() {
		String data = null;
		try {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		data = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Integer.parseInt(data);
	}
}
