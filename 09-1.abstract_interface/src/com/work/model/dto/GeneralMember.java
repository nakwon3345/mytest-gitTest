package com.work.model.dto;

public class GeneralMember extends Member {
	
	private int mileage;
	
	public GeneralMember() {
		
	}

	/**일반 회원 필수 데이터 초기화 생성자 + 등급, 가입일
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 */
	public GeneralMember(String memberId, String memberPw, String name, String mobile, String email) {
		setMemberId(memberId); 
		setMemberPw(memberPw);
		setName(name);
		setMobile(mobile);
		setEmail(email);
		
		setGrade("G");
		setEntryDate("2021-05-26");	
	}//

	/**일반회원 모든데이터 초기화 생성자
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름 
	 * @param mobile 휴대폰
	 * @param email 이메일
	 * @param entryDate 가입일
	 * @param grade 등급
	 * @param mileage 마일리지
	 */
	public GeneralMember(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade, int mileage) {
		super(memberId, memberPw, name, mobile, email, entryDate, grade);
		this.mileage = mileage; 
	}

	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + mileage;
	}
	
	
	
	

}//
