package com.work.view;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

public class Test {

	public static void main(String[] args) {
		
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000);
		Member dto2 = new GeneralMember("user02", "password02", "강감찬", "01012342000", "user02@work.com", "2021-01-05", "G", 950000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("administrator", "admin1004", "유관순", "01012345000", "administrator@work.com", "2020-04-01", "A", "선임");
		
		System.out.println(dto1);
		dto1 = dto2;
		// 아예 등호를 넣어 같게 한것은 해쉬코드가 같고 equals의 결과값도 같으나 내용물이 같은 것은 해쉬코드도 다르고 equals도 다르게 나옴
		dto3 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000);
		System.out.println(dto1.equals(dto3));
		System.out.println(dto3.hashCode());
		System.out.println(dto1.equals(dto2));
		System.out.println(dto2.hashCode());
		System.out.println(dto1.hashCode()); //hashcode를 오버라이딩 한 것(360...)과 안 한것(-83603...)의 결과 값이 다름
		
	}//

}//
