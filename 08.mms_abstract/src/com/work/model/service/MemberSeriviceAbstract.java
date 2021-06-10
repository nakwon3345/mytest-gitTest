package com.work.model.service;

import com.work.model.dto.Member;

/**
 * 회원을 관리하기 위한 서비스 클래스 (추상 클래스 설계 변경)
 * -- 추상클래스 구성요소
 * 	>> 클래스 구성요소 + [추상메서드]
 * -- 회원들을 관리하기 위한 자료저장구조 : 배열 다형성 반영(부모타입)
 * -- C(등록)
 * 
 * -- R(조회)
 *  상세조회 : 메서드명 getMember()
 *  매개변수 : memberId
 *  반환타입 : Member (반환타입다형성 : 부모타입)
 * 	=> 단일조회(상세조회) => 아이디
 * 	=> 다중조회(전체조회, 그룹조회) => 전체조회(), 등급별회원전체조회(등급)
 */ 
		
 
/**
 * -- U(변경)
 * 	=> 전체변경()
 * 	=> 부분변경(비밀번호변경)
 * -- D(삭제)
 * 	=> 전체삭제
 * 	=> 특정삭제 : 아이디
 */

public abstract class MemberSeriviceAbstract {
	
	
	
	/**
	 * 회원등록
	 * --메서드명
	 * --매개변수 : 다형성반영 모든 회원을 등록하기위한 메서드
	 * --반환타입
	 */
	public abstract void addMember(Member dto);
	
	/**
	 * CRUD 메서드에서 사용하기 위한 회원 존재유무 및 저장 위치 조회 메서드
	 * @param memberId 아이디
	 * @return 존재시에 저장위치번호, 미존재시-1
	 */
	public abstract int exist(String memberId);
	
	public abstract Member getMember(String memberId);
	
	/**
	 * 전체조회
	 * -- 매서드명 : getMember()
	 * -- 매개변수 : no argument
	 * -- 반환타입 : 현재 등록된 모든 회원들의 정보만을 저장한 배열, 다형성 Member[]
	 */
	
	/**
	 * 회원정보 전체변경
	 * -- 매서드명 : setMember()
	 * -- 매개변수 : Member
	 * -- 반환타입 : void / 오류발생 시 메세지 처리
	 */

	/**
	 * 회원 비밀번호 변경
	 * -- 매서드명 : setMemberPw()
	 * -- 매개변수 : 아이디, 비밀번호, 변경비밀번호
	 * -- 반환타입 : boolean 암호변경성공 true, 실패하면 false
	 */
	
	/**
	 * 회원탈퇴
	 * -- 매서드명 : removeMember()
	 * -- 매개변수 : 아이디, 비밀번호
	 * -- 반환타입 : void
	 */
	
	/**
	 * 회원전체탈퇴
	 * -- 메서드명 : removeMember()
	 * -- 매개변수 : no argument
	 * -- 반환타입 : void
	 */
}


