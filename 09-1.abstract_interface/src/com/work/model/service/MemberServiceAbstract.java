package com.work.model.service;

import com.work.model.dto.Member;

public abstract class MemberServiceAbstract {
	
	public abstract void addMember(Member dto);
	
	public abstract int exist(String memberId);
	
	/** 상세조회*/	 
	public abstract Member getMember(String memberId);
	
	// 전체조회
	public abstract Member[] getMember(); 
	
	// 전체변경
	public abstract Member setMember(String memberId);
	
	// 비밀번호 변경
	public abstract Member setMember(String memberId, String memberPw);
	
	//회원탈퇴
	public abstract Member removeMember(String memberId, String memberPw);
	
	// 회원전체탈퇴
	public abstract Member removeMember();
	

}
