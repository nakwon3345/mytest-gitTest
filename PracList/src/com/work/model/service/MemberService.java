/**
 * 
 */
package com.work.model.service;

import java.util.ArrayList;

import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;

/**
 * MemberServiceAbstract 추상클래스를 구현한 서비스 클래스
 */
public class MemberService {
	
	/** 회원들을 저장 및 관리하기 위한 자료구조 */
	private ArrayList list = new ArrayList();
	
	public MemberService() {
		int count = initMember();
		System.out.println("초기화회원 등록작업 " + count);
	}
	
	/**
	 * 회원 존재 유무 조회
	 * @param memberId 아이디
	 * @return 존재시 저장위치, 미존재시 -1
	 */
	public int exist(String memberId) {
		for(int index = 0; index < list.size(); index++) {
			Object obj = list.get(index);
			if(obj instanceof Member) {
				Member dto = (Member)obj;
				if(dto.getMemberId().equals(memberId)) {
					return index; 
				}
			
			}
		}	
		return -1;
	}
	
	/** 등록인원수 및 등록될 배열요소 위치정보 */
	private int count;
	
	
	/**
	 * 현재 등록 인원수 조회
	 * @return 현재 등록 인원수
	 */
	
	/** 현재 등록한 전체 회원 조회 */
	public ArrayList getMember() {
		return list;
	}
	
	/**
	 * 현재 등록 수 조회
	 * @return 현재 리스트 크기
	 */
	public int getCount() {
		return list.size();
	}
	
	/**
	 * 회원 등록
	 * @param dto
	 */
	public void addMember(Member dto) {
		if(exist(dto.getMemberId()) == -1) {
			list.add(dto);
		}else {
			System.out.println("[오류] 동일 아이디 존재");
		}
	}
	
	/**
	 * 회원 등록
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 */
	public void addMember(String memberId, String memberPw, String name, String mobile, String email) {
		GeneralMember dto = new GeneralMember(memberId, memberPw, name, mobile, email);
		dto.setGrade("G");
		dto.setMileage(1000);
		
		addMember(dto);
	}
	
	/**
	 * 회원정보 전체 변경
	 * @param dto
	 * @return 성공시 true, 실패시 false
	 */
	public boolean setMember(Member dto) {
		int i = exist(dto.getMemberId());
		if(i >= 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * 비밀번호 변경
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param modifyMemberPw 변경 비밀번호
	 * @return
	 */
	public boolean setMemberPw(String memberId, String memberPw, String modifyMemberPw) {
		int index = exist(memberId);
		if (index >= 0) {
			Object obj = list.get(index);
			if(obj instanceof Member) {
				Member dto = (Member)obj;
				if(dto.getMemberPw().equals(memberPw)) {
					dto.setMemberPw(modifyMemberPw);
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * 회원탈퇴
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @return 성공시 탈퇴회원의 기존정보, 실패시 null
	 */
	public Member removeMember(String memberId, String memberPw) {
		int i = exist(memberId);
		if(i >= 0) {
			Object obj = list.get(i);
			if(obj instanceof Member) {
				Member dto = (Member)obj;
				if(dto.getMemberPw().equals(memberPw)) {
					return (Member)list.remove(i);
				}
			}
		}
		return null;
	}
	public int initMember() {
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000);
		Member dto2 = new GeneralMember("user02", "password02", "강감찬", "01012342000", "user02@work.com", "2021-01-05", "G", 950000);
		return list.size();
	}
	
	/**
	 * 아이디 조회
	 * @param memberId
	 * @return
	 */
	public Member getMember(String memberId) {
		int index = exist(memberId);
		if (index >= 0) {
			return (Member)list.get(index);
		}
		return null;
	}
	
	/**
	 * 이름을 추출해서 이름에 맞는 아이디 출력
	 * @param name
	 * @return
	 */
	public Member findId(String name) {
		int index = exist(name);
		if(index >= 0) {
			return (Member)list.get(index);
		}
	
		return null;
	}
	
}











