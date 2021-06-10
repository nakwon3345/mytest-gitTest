package com.work.model.dto;

public class AdminMember extends Member {
	private String position;
	
	public AdminMember(String memberId, String memberPw, String name, String mobile, String email) {
		
		setMemberId(memberId);
		setMemberPw(memberPw);
		setName(name);
		setMobile(mobile);
		setEmail(email);
		
		setGrade("A");
		setEntryDate("2021-05-26");
		
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

	/**
	 * @param memberId
	 * @param memberPw
	 * @param name
	 * @param mobile
	 * @param email
	 * @param entryDate
	 * @param grade
	 */
	public AdminMember(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade, String position) {
		super(memberId, memberPw, name, mobile, email, entryDate, grade);
		this.position = position;
	}

}
