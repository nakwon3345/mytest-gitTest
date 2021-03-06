package com.work.view;

import java.util.ArrayList;


import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;
import com.work.model.service.MemberService;

public class Test {
	
	public static void main(String[] args) {
		
MemberService service = new MemberService();
		
		//Member dto = new GeneralMember("아이디", "비밀번호", "이름", "휴대폰", "이메일");
		service.addMember("nakwon", "1234", "푸호꼬", "010-4732-7784", "nakwon@naver.com");
		service.addMember("nakwon1234", "5678", "꼬부기", "010-1348-7784", "nakwon@daum.com");
		service.addMember("nakwon", "1234", "푸호꼬", "010-4732-7784", "nakwon@naver.com"); //중복아이디 : 오류
		service.addMember("user01", "password01", "홍길동", "01012341000", "user01@work.com");
		service.addMember("user02", "password02", "강감찬", "01012342000", "user02@work.com");
		service.addMember("user03", "password03", "이순신", "01012343000", "user03@work.com");
		service.addMember("user04", "password04", "김유신", "01012344000", "user04@work.com");
		
		System.out.println("현재 등록 회원수 : " + service.getCount());
		
		System.out.println("전체회원조회");
		ArrayList list = service.getMember();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		System.out.println("회원상세조회");
//		Member dto = service.getMember("nakwon1234");
//		if (dto != null) {
//			System.out.println(dto);
//		}
//		
////		Member dto1 = service.findId("꼬부기");
////		if (dto1 != null) {
////			System.out.println(dto1);
////		}
//		
//		System.out.println("user01 정보 변경");
//		dto = service.getMember("user01");
//		dto.setName("kim");
//		dto.setMemberPw("happy");
//		dto.setMobile("null");
//		
//		service.setMember(dto);
//		service.getMember("user01");
//		System.out.println(dto);
//		
//		System.out.println("회원탈퇴");
//		dto = service.removeMember("user01", "happy");
//		if(dto != null) {
//			System.out.println("[성공] " + dto.getMemberId());
//		}else {
//			System.out.println("[오류]");
//		}
//				
	}
	
}
