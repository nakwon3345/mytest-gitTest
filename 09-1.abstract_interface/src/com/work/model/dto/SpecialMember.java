package com.work.model.dto;

public class SpecialMember extends Member {
	private String management;

	/**
	 * 
	 */
	public SpecialMember() {
	}

	/**특별회원 필수 데이터 초기화 생성자 + 등급, 가입일
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 */
	public SpecialMember(String memberId, String memberPw, String name, String mobile, String email) {
		setMemberId(memberId); 
		setMemberPw(memberPw);
		setName(name);
		setMobile(mobile);
		setEmail(email);
		
		setGrade("S");
		setEntryDate("2021-05-26");	
	}

	/**특별회원 모든 데이터 초기화 생성자
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 * @param entryDate 가입을
	 * @param grade 등급
	 */
	public SpecialMember(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade, String management) {
		super(memberId, memberPw, name, mobile, email, entryDate, grade);
		this.management = management;
	}

	/**
	 * @return the management
	 */
	public String getManagement() {
		return management;
	}

	/**
	 * @param management the management to set
	 */
	public void setManagement(String management) {
		this.management = management;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + management;
	}
	
	
	

}//
