package com.work.api_string;

import static java.lang.Integer.parseInt;

import java.util.StringTokenizer;

public class StringTest {
	
	// Wrapper API
	public static void main1(String[] args) {
		String data = "100 + 200 + 3";
		StringTokenizer tokenizer = new StringTokenizer(data, "+-*/ ");
		int sum = 0;
		
		while(tokenizer.hasMoreElements()) {
			String token = tokenizer.nextToken();
			System.out.println(token);			
			//sum += Integer.parseInt(token);
			
//			Integer integer = new Integer(token);
//			sum += integer.intValue();
			
			sum += new Integer(token).intValue();
		}
		System.out.println(sum);
		
		
	}//
	
	public static void main3(String[] args) {
		String data1 = "user01, password01, 홍길동, 01012341000, hong@work.com";
		String data2 = "100 + 200 * 3";
		
		// String#split()
		String[] tokens = data1.split(",");
		for(String token : tokens) {
			System.out.println(token);
		}
		
		// StringTokenizer
		StringTokenizer tokenizer = new StringTokenizer(data1, ",");
		System.out.println(tokenizer.countTokens());
		while(tokenizer.hasMoreElements()) {
			String data = tokenizer.nextToken();
			System.out.println(data);
		}
	}//
	
	public static void mai5(String[] args) {
		// StringBuffer, StringBuilder : 가변 문자열
		// 반드시 new StringBuffer(), new StringBuilder() : new 키워드 이용해서 객체생성
		// StringBuffer : jdk1.0 version
		// StringBuilder : jdk1.5 version
		
		StringBuilder buffer = new StringBuilder("여러분 ");
		buffer.append("안녕").append("하세요");
		System.out.println(buffer);
	}//

	public static void main(String[] args) {
		//String : 불변 문자열
		String msg1 = "Hello";
		String msg2 = "Hello";
		String msg3 = new String("Hello");
		String msg4 = new String("Hello");
		
		System.out.println(msg1 + msg2);
		
		print("== 연산자 문자열 비교");
		System.out.println(msg1 == msg2);
		System.out.println(msg1 == msg3);
		
		print("equals() 문자열 비교");
		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equals(msg3));
		System.out.println(msg1.equals(msg4));
		
		print("문제점");
		for(int i = 0; i < 100; i++) {
			msg1 += i;
		}
		
	}//
	
	public static void print(String msg) {
		System.out.println("\n### " + msg);
	}

}//
