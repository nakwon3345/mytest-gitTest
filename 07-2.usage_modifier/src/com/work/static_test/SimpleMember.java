package com.work.static_test;

/**
 * 회원도메인 클래스
 * 1. 아이디 MemberId
 * 2. 이름 name
 * 3. 휴대폰 mobile
 * 
 * #설계규칙
 * 1. encapsulation
 * 2. 생성자 중복정의 : 기본, 전체
 * 3. toString() 재정의
 * 4. equals(), hasCode() 재정의
 */
public class SimpleMember {
	// Class 변수 : 객체 생성 없이 사용가능, 모든 객체가 공유변수
	public static int classCount;
	
	public int instaceCount;
	
	// static block 초기화
	static {
		classCount = 1234567;
		System.out.println(classCount + "클래스가 로드될 때 딱 한 번만 수행합니다.");
	}
	
	// instance block 초기화
	{
		System.out.println("객체 생성할 때 마다 수행합니다.");
	}
	
	/** 아이디 */
	private String MemberId;
	
	/** 이름 */
	private String name;
	
	/** 휴대폰 */
	private String mobile;
	
	public SimpleMember() {
		System.out.println("생성자 : 객체생성시 수행됩니다.");
		
	}

	/**생성자 중복정의
	 * @param memberId 아이디
	 * @param name 이름
	 * @param mobile 휴대폰
	 */
	public SimpleMember(String memberId, String name, String mobile) {
		MemberId = memberId;
		this.name = name;
		this.mobile = mobile;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return MemberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		MemberId = memberId;
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
		return MemberId + ", " + name + ", " + mobile;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((MemberId == null) ? 0 : MemberId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleMember other = (SimpleMember) obj;
		if (MemberId == null) {
			if (other.MemberId != null)
				return false;
		} else if (!MemberId.equals(other.MemberId))
			return false;
		return true;
	}
}

