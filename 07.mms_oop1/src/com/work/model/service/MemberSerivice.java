package com.work.model.service;

import com.work.model.dto.Member;

/**
 * 회원을 관리하기 위한 서비스 클래스
 * -- 회원들을 관리하기 위한 자료저장구조 : 배열 다형성 반영(부모타입)
 * -- C(등록)
 * -- R(조회)
 * 	=> 단일조회(상세조회) => 아이디
 * 	=> 다중조회(전체조회, 그룹조회) => 전체조회(), 등급별회원전체조회(등급)
 * -- U(변경)
 * 	=> 전체변경()
 * 	=> 부분변경(비밀번호변경)
 * -- D(삭제)
 * 	=> 전체삭제
 * 	=> 특정삭제 : 아이디
 */
public class MemberSerivice {
	
	private Member[] services;

}
