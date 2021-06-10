package com.work.view;

import com.work.model.dto.Member;

public class Test {

	/** encapsulation 테스트 */
	public static void main(String[] args) {
		Member dto = new Member("nakwon", "1234", "최낙원","01047327784", "nakwon3345@naver.com");
		System.out.println("변경전" + dto);
		//아이디 변경
		// dto.memberId = "aaa"; 오류 private 선언, 외부에서 직접접근 불가
		
		// 아이디 변경 : setter()
//		dto.setMemberId("happy101");
//		System.out.println("변경후" + dto);
//		
		dto.setMemberId("ac");
		System.out.println("변경후" + dto);
		
		
	}
	public static void main1(String[] args) {
		// 회원의 가입시 입력데이터 초기화생성자 이용해서 객체생성
		Member dto = new Member("nakwon", "1234", "최낙원","01047327784", "nakwon3345@naver.com");
		
		// 생성한 회원객체의 정보 출력, toString() 메서드 생략 가능
		// System.out.println(dto.toString());
		System.out.println(dto);
		
	}//

}//
