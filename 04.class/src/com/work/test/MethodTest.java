package com.work.test;

public class MethodTest {

	public static void main(String[] args) {
		MethodType test = new MethodType();
		
		//test.doA();
		
		for(int index = 0; index < 3; index++) {
			test.doA();
		}
		
		// 문자열 배열에 인사말정보를 저장
		String[] hello = {"안녕하세요","hello", "곰방와"};
		
		// 배열객체, Collection API 사용가능
		// 형식 : for (타입 변수명 : 배열명 또는 Collection객체참조변수명) {}
		for (String message : hello) {
			test.doB(message);
		}
		
		System.out.println();
		test.doC();
		int result = test.doC();
		System.out.println(result);
		System.out.println(test.doC());
		
		System.out.println();
		result = test.add(100, 1234);
		System.out.println(result);
		
		test.add(100, 200);
		test.add(100L, 200);
		test.add(100, 200L);
		test.add(100L, 200L);
		
		test.add(100, 200F); // int float => double double
	}//

}//
