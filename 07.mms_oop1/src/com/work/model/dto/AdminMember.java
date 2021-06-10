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
	 * 
	 */
	public AdminMember() {
		super();
		// TODO Auto-generated constructor stub
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
			String grade) {
		super(memberId, memberPw, name, mobile, email, entryDate, grade);
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return super.toString() + ", " + position;
	}

}
