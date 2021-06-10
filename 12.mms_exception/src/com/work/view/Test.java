package com.work.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.work.model.dto.Member;
import com.work.model.service.MemberService;

import exception.DuplicateException;
import exception.RecordNotFoundException;

public class Test {
	/**
	 * 회원관리 시스템 테스트 메서드
	 * -- 회원등록(아이디, 비밀번호, 이름, 휴대폰, 이메일) : 사용자 입력
	 * -- service(model) : 사용자입력정보 + 시스템(가입일 현재날짜, 등급 일반회원, + 마일리지정책 가입시 1000)
	 * @param args
	 */
	
	public static void main1(String[] args) throws DuplicateException {
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("nakwon1234", "5678");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("nakwon");
		}else {
			System.out.println("아이디 또는 비밀번호가 올바르지 않습니다.");
		}
		
			
		
	}
	public static void main(String[] args) throws DuplicateException {
		MemberService service = new MemberService();
		
		
		//Member dto = new GeneralMember("아이디", "비밀번호", "이름", "휴대폰", "이메일");
		try {
			service.addMember("nakwon", "1234", "푸호꼬", "010-4732-7784", "nakwon@naver.com");			
			service.addMember("nakwon1234", "5678", "꼬부기", "010-1348-7784", "nakwon@daum.com");
			
			// 중복오류 발생
			service.addMember("nakwon", "1234", "푸호꼬", "010-4732-7784", "nakwon@naver.com");
			
			// 회원 추가 등록 : 위에 있는 코드에서 수행시에 예외가 발생하면 catch 처리로 이동하고 다시 백도하지 않음 : 수행되지 않음
			service.addMember("nakwon03", "1234", "푸호꼬", "010-4732-7784", "nakwon@naver.com");
		} catch (DuplicateException e) {

			System.out.println(e.getMessage());
		}
	
		
		
		ArrayList list = service.getMember();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Member dto = null; // 지역변수는 사용전에 반드시 명시적으로 초기화 설정
		try {
			dto = service.getMember("user01");
		} catch (RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			dto = service.getMember("test01");
		} catch (RecordNotFoundException e) {
			System.out.println(e.getMessage());
			
		}
		
		try {
			dto = service.getMember("user01");
		} catch (RecordNotFoundException e) {			
			System.out.println(e.getMessage());
			
		}
		//dto = new GeneralMember("user01")
		try {
			dto = service.getMember("user01");
		} catch (RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		dto.setName("김은경");
		dto.setMemberPw("happy");
		dto.setMobile("01088563362");
		
		service.setMember(dto);
		try {
			service.getMember("user01");
		} catch (RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		// 변경객체 : invalid : 없는 아이디 회원 변경
		dto = new Member("xxxx", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000, null);
		
		boolean result = service.setMember(dto);
		if(result) {
			try {
				System.out.println(service.getMember("xxxx"));
			} catch (RecordNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("xxxx 아이디 회원정보가 없습니다.");
		}
		
		// 비밀번호 변경 : vaild, invaild(아이디 미존재 혹은 비밀번호 오류)
		try {
			dto = service.getMember("user02");
		} catch (RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(dto);
		
		// 비밀번호 변경
		service.setMemberPw("user02", "xxxx", "goodluck");
		if(result) {
			System.out.println("비밀번호 변경 정상처리");
		}else {
			System.out.println("[오류] 회원의 정보를 다시 확인하시기를 바랍니다.");
		}
		try {
			dto = service.getMember("user02");
		} catch (RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(dto);
		
		// 회원 탈퇴
		try {
			System.out.println(service.getMember("user01"));
		} catch (RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			dto = service.removeMember("user01", "happy");
		} catch (RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}	
}
