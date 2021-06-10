package com.work.view;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
System.out.println("프로그램 시작");
		
		String[] names = {"홍길동", "강감찬", "이순신"};
		String data = null;
		for(int i = 0; i < 5; i++) {
			try {
				//System.out.println(names[i]);
				//System.out.println(data.length());
				//System.out.println(5 / 0);
				String message = "안녕예외";
				//StringBuilder builder = (StringBuilder)message;
				int mileage = Integer.parseInt("abc");
				
			}catch(ArrayIndexOutOfBoundsException e) {
				
				String message = e.getMessage();
				System.out.println("[오류처리]잘못된 배열요소 번호 : " + message);
				break;
			}catch(NullPointerException e) {
				System.out.println("[오류메세지]" + e.getMessage());
				break;
			}catch(Exception e) {
				System.out.println("[오류메세지] " + e.getMessage());
				System.out.println("[오류메세지] " + e.getClass().getName());
			}finally {
				System.out.println("[반드시 수행되는 로직]");
			}
			
		}
		
		System.out.println("프로그램 정상 종료");
	}

	public static void main2(String[] args) {
		System.out.println("프로그램 시작");
		
		String[] names = {"홍길동", "강감찬", "이순신"};
		for(int i = 0; i < 5; i++) {
			try {
				System.out.println(names[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				String message = e.getMessage();
				System.out.println("[오류처리]잘못된 배열요소 번호 : " + message);
				break;
				
			}finally {
				System.out.println("[반드시 수행되는 로직]");
			}
			
		}
		
		System.out.println("프로그램 정상 종료");
	}
	
	public static void main1(String[] args) {
		System.out.println("프로그램 시작");
		
		String[] names = {"홍길동", "강감찬", "이순신"};
		String data = null;
		for(int i = 0; i < 5; i++) {
			try {
				//System.out.println(names[i]);
				System.out.println(data.length());
			}catch(ArrayIndexOutOfBoundsException e) {
				
				String message = e.getMessage();
				System.out.println("[오류처리]잘못된 배열요소 번호 : " + message);
				break;
				
			}finally {
				System.out.println("[반드시 수행되는 로직]");
			}
			
		}
		
		System.out.println("프로그램 정상 종료");
	}//

}//
