package com.work.view;

import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;

public class ObjectTest {
	
	public static void main(String[] args) {
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", 
				"2020-12-15", "G", 50000);
		Member dto2 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", 
				"2020-12-15", "G", 50000);
		Member dto3 = new GeneralMember("user02", "password01", "홍길동", "01012341000", "user01@work.com", 
				"2020-12-15", "G", 50000);
		
		System.out.println(dto1.hashCode());
		System.out.println(dto2.hashCode());
		System.out.println(dto3.hashCode());
		System.out.println();
		System.out.println(dto1 == dto2);
		System.out.println(dto1 == dto3);
		System.out.println();
		System.out.println(dto1.equals(dto2));
		System.out.println(dto1.equals(dto3));
		
	}
	
	public static void main2(String[] args) {
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", 
				"2020-12-15", "G", 50000);
		Member dto2 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", 
				"2020-12-15", "G", 50000);
		Member dto3 = new GeneralMember("user02", "password01", "홍길동", "01012341000", "user01@work.com", 
				"2020-12-15", "G", 50000);
		
		System.out.println(dto1.hashCode());
		System.out.println(dto2.hashCode());
		System.out.println(dto3.hashCode());
		System.out.println();
		System.out.println(dto1.equals(dto2));
		System.out.println(dto1.equals(dto3));
	}

	public static void main1(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println();
		System.out.println(obj1 == obj2);
		System.out.println(obj1 == obj3);
		System.out.println();
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		
	}//

}//
