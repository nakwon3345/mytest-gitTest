package com.work.model.dto;

public class SpecialMember extends Member {
	private String Administration;
	
	public SpecialMember(String memberId, String memberPw, String name, String mobile, String email) {
		
		setMemberId(memberId);
		setMemberPw(memberPw);
		setName(name);
		setMobile(mobile);
		setEmail(email);
		
		setGrade("S");
		setEntryDate("2021-05-26");
	}

	/**
	 * @return the administration
	 */
	public String getAdministration() {
		return Administration;
	}

	/**
	 * @param administration the administration to set
	 */
	public void setAdministration(String administration) {
		Administration = administration;
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
	public SpecialMember(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade, String Administration) {
		super(memberId, memberPw, name, mobile, email, entryDate, grade);
		this.Administration = Administration;
		
	}
}
