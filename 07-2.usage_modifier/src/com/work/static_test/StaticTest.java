package com.work.static_test;

public class StaticTest {
	
	public static String classTitle = "빅데이터과정";
	
	public String instanceTitle = "자바프로그래밍";
	
	public static void main(String[] args) {
		System.out.println(classTitle); // static 멤버는 그냥 사용 가능
		
		// System.out.println(instanceTitle); 오류
		StaticTest test = new StaticTest();
		System.out.println(test.instanceTitle);
		
		System.out.println(Math.random());
		System.out.println(Math.random() * 10);
		System.out.println((int)(Math.random() * 10));
		System.out.println(Math.PI);
	}
	
	public void instanceMethod() {
		System.out.println(instanceTitle);
	}

	public static void main1(String[] args) {
		
		System.out.println(SimpleMember.classCount);
		
		SimpleMember.classCount = 100;
		
		SimpleMember dto1 = new SimpleMember();
		
		System.out.println();
		SimpleMember dto2 = new SimpleMember();
		
		dto1.classCount = 1000;
		dto1.instaceCount = 100;
		
		dto2.classCount = 2000;
		dto2.instaceCount = 200;
		
		SimpleMember.classCount = 5000;
		
		System.out.println(dto1.classCount);
		System.out.println(dto1.instaceCount);
		System.out.println(dto2.classCount);
		System.out.println(dto2.instaceCount);
		
		System.out.println(SimpleMember.classCount);
		
	}//

}//
