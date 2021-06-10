package com.work.view;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

public class Test {
	
	public static void main(String[] args) {
		
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", 
				"2020-12-15", "G", 50000); 
		System.out.println(dto1);
		
		dto1.getMemberId();
		//dto1.getmileage(); error 부모타입의 참조변수는 자식의 멤버 접근 불가
		GeneralMember g1 = (GeneralMember)dto1;
		System.out.println(g1);
		
		// 컴파일ok
		if(dto1 instanceof AdminMember) {
			AdminMember a1 = (AdminMember)dto1;
			a1.getPosition();
		}else {
			System.out.println("[오류] 해당 클래스의 인스턴스가 아닙니다");
		}
		
		
		Member dto2 = new GeneralMember("user02", "password02", "강감찬", "01012342000", "user02@work.com",
				"2021-01-05", "G", 950000);
		System.out.println(dto2);
		
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", 
				"2020-12-15", "S", "강동원");
		System.out.println(dto3);
		
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com",
				"2021-01-05", "S", "김하린");
		System.out.println(dto4);
		
		Member dto5 = new AdminMember("administrator", "admin1004", "유관순", "01012345000", "user05@work.com", 
				"2020-04-01", "A", "선임");
		System.out.println(dto5);
	}
	
	public static void main2(String[] args) {
		Member dto1 = new Member("user01", "password01", "홍길동", "01012341234", "user01@work.com"); 
		System.out.println(dto1);
		
		Member dto2 = new GeneralMember("user02", "password02", "강감찬", "01012357334", "user02@work.com");
		System.out.println(dto2);
	}

	public static void main1(String[] args) {
		
		Member dto1 = new Member(); 
		System.out.println(dto1);
		
		Member dto2 = new GeneralMember();
		
		Member dto3 = new SpecialMember();
		
		Member dto4 = new AdminMember();
	}
		
	

}//
