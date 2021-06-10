package com.work.view;

import java.util.ArrayList;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;
import com.work.model.service.MemberServiceArray;
import com.work.model.service.MemberService;

public class Test {
	/**
	 * 회원관리 시스템 테스트 메서드
	 * -- 회원등록(아이디, 비밀번호, 이름, 휴대폰, 이메일) : 사용자 입력
	 * -- service(model) : 사용자입력정보 + 시스템(가입일 현재날짜, 등급 일반회원, + 마일리지정책 가입시 1000)
	 * @param args
	 */
	public static void main(String[] args) {
		MemberService service = new MemberService();
		
		print("초기화 회원 등록 : " + service.initMember());
		print("회원등록");
		//Member dto = new GeneralMember("아이디", "비밀번호", "이름", "휴대폰", "이메일");
		service.addMember("nakwon", "1234", "푸호꼬", "010-4732-7784", "nakwon@naver.com");
		service.addMember("nakwon1234", "5678", "꼬부기", "010-1348-7784", "nakwon@daum.com");
		service.addMember("nakwon", "1234", "푸호꼬", "010-4732-7784", "nakwon@naver.com"); //중복아이디 : 오류
		
		print("현재 등록회원수 : " + service.getCount());
		
		print("전체회원 조회");
		ArrayList list = service.getMember();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		print("회원 상세조회 : user01");
		Member dto = service.getMember("user01");
		if (dto != null) {
			System.out.println(dto);
		}
		
		print("회원 상세조회 : 신규등록 회원 test01");
		dto = service.getMember("test01");
		if (dto != null) {
			System.out.println(dto);
		}
		
		print("user01 전체정보 변경");
		dto = service.getMember("user01");
		print("변경전 : " + dto);
		//dto = new GeneralMember("user01")
		dto = service.getMember("user01");
		dto.setName("김은경");
		dto.setMemberPw("happy");
		dto.setMobile("01088563362");
		
		service.setMember(dto);
		service.getMember("user01");
		print("변경후 : " + dto);
		
		// 변경객체 : invalid : 없는 아이디 회원 변경
		dto = new GeneralMember("xxxx", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000);
		
		boolean result = service.setMember(dto);
		if(result) {
			System.out.println(service.getMember("xxxx"));
		}else {
			System.out.println("xxxx 아이디 회원정보가 없습니다.");
		}
		
		// 비밀번호 변경 : vaild, invaild(아이디 미존재 혹은 비밀번호 오류)
		print("비밀번호 변경전 조회 :");
		dto = service.getMember("user02");
		System.out.println(dto);
		
		// 비밀번호 변경
		service.setMemberPw("user02", "xxxx", "goodluck");
		if(result) {
			System.out.println("비밀번호 변경 정상처리");
		}else {
			System.out.println("[오류] 회원의 정보를 다시 확인하시기를 바랍니다.");
		}
		dto = service.getMember("user02");
		System.out.println(dto);
		
		// 회원 탈퇴
		print("user01");
		System.out.println(service.getMember("user01"));
		dto = service.removeMember("user01", "happy");
		if (dto != null) {
			System.out.println("[탈퇴성공] " + dto.getMemberId());
		}else {
			System.out.println("[탈퇴실패] 회원의 정보를 다시 확인하시기 바랍니다.");
		}
	}
	
		
	
	public static void main1(String[] args) {
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000);
		Member dto2 = new GeneralMember("user02", "password02", "강감찬", "01012342000", "user02@work.com", "2021-01-05", "G", 950000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("administrator", "admin1004", "유관순", "01012345000", "administrator@work.com", "2020-04-01", "A", "선임");
	
		// MemberServiceAbstract service = new MemberServiceAbstract();
		// error : Cannot instantiate the type MemberServiceAbstract
		// 이유 : 추상클래스는 직접 객체생성불가 
		
		// 회원관리 서비스를 이용하기위한 구현객체 생성
		//System.out.println("\n### 회원관리 서비스 이용위한 객체생성");
		print("회원관리 서비스 이용위한 객체 생성");
		MemberService service = new MemberService();

		print("회원등록");
		service.addMember(dto1);
		service.addMember(dto2);
		service.addMember(dto3);
		service.addMember(dto4);
		service.addMember(dto5);
		
		service.addMember(dto2); // 문제?? => 해결 => 등록되지않음
		service.addMember(dto2); // 문제?? => 해결 => 등록되지않음
		
		print("등록인원수 : " + service.getCount());
		
		print("user01 상세조회");
		Member dto = service.getMember("user01");
		if (dto != null) {
			System.out.println(dto); // virtual method invocation : 실제 자식객체의 재정의한 toString() 수행결과 출력
		}
		
		print("user99 상세조회");
		dto = service.getMember("user99");
		if (dto != null) {
			System.out.println(dto); // virtual method invocation : 실제 자식객체의 재정의한 toString() 수행결과 출력
		}
		
		print("전체조회");
		
		print("회원정보 전체변경");

		print("암호변경");

		print("회원탈퇴");
		
		print("회원전체탈퇴(배열요소 초기화)");
		
		print("회원 초기화 등록");
		
	}
	
	/** 
	 * 테스트시에 출력위한 메서드
	 * @param message 메세지
	 */
	public static void print(String message) {
		System.out.println("\n### " + message);
	}
	
}
