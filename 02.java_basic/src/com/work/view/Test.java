package com.work.view;

public class Test {
	public static void main3(String[] args) {
		byte a= 5;
		byte b= 10;
		byte result = (byte)(a + b); //byte = int+int 연산의 수행결과 오류발생, 자동 형변환 발생하지 않음
		
	}
	
	public static void main(String[] args) {
		char c1 = '0';
		int c2 = c1;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println((char)70);
	}
	
	public static void main2(String[] args) {
		int nol = 5;
		long no2 = 5;
		//int no3 = 5.2 //int = double 큰 타입도 아니고, 다른 타입 컴파일 오류발생
		int no4 = (int)5.2;
	}
	// 시작메서드 선언
	public static void main1(String[] args) {
		String name = "nakwon";
		name = "choi";
		int age = 26;
		
		System.out.println(name);
		System.out.println(age);
	}
}
