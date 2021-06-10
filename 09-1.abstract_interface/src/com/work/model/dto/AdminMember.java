package com.work.model.dto;

public class AdminMember extends Member {
	private String position;
	
	public AdminMember() {
		
	}

	/**관리자회원 필수 데이터 초기화 생성자
	* @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 */
	public AdminMember(String memberId, String memberPw, String name, String mobile, String email) {
		setMemberId(memberId);
		setMemberPw(memberPw);
		setName(name);
		setMobile(mobile);
		setEmail(email);
	
		setGrade("A");
		setEntryDate("2021-05-26");
		
	}

	/**관리자 회원 모든데이터 초기화 생성자
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 * @param entryDate 가입일
	 * @param grade 등급
	 */
	public AdminMember(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade, String position) {
		super(memberId, memberPw, name, mobile, email, entryDate, grade);
		this.position = position;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + position;
	}
	

}
