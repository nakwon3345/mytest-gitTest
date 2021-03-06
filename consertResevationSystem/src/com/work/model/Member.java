package com.work.model;
/**
 * <pre>
 * 회원 도메인 클래스
 * -- encapsulation 설계 반영
 * ## 회원 검증조건
 * 		1. 아이디 : 6~30자리
 * 		2. 비밀번호 : 6~15자리
 * 		-- 문자열 비교 메서드
 * 		-- String
 * 		-- equals(Object anObject) : boolean
 * 
 * 		1. 아이디
 * 		2. 비밀번호
 * 		3. 이름
 * 		4. 휴대폰
 * <pre>
 * 
 * @author 최낙원
 * @version ver.1.0
 * @since jdk1.8
 *
 */
public class Member {
	/** 아이디, 로그인 및 회원가입시 필요 */
	private String memberId;
	
	/** 비밀번호, 로그인 및 회원가입시 필요 */
	private String memberPw;
	
	/** 이름, 회원가입시 필요 */
	private String name;
	
	/** 휴대폰, 회원가입 예약 취소시 필요 */
	private String mobile;
	
	/** 마일리지, 미리 적립해 공연 예약 시 사용 */
	private int mileage;
	
	/**
	 * 회원가입 필수 데이터 초기화 생성자
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 */
	public Member(String memberId, String memberPw, String name, String mobile) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.name = name;
		this.mobile = mobile;		
	}
	
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the memberPw
	 */
	public String getMemberPw() {
		return memberPw;
	}

	/**
	 * @param memberPw the memberPw to set
	 */
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

		
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(memberId);
		builder.append(", ");
		builder.append(memberPw);
		builder.append(", ");
		builder.append(name);
		builder.append(", ");
		builder.append(mobile);
		return builder.toString();
	}
	
}
	
	
