package com.work.model.service;

import com.work.model.dto.Member;

public class MemberSerivice extends MemberServiceAbstract {
	
	private Member[] members = new Member[10];
	
	private int count;

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void addMember(Member dto) {
		if(count == members.length) {
			extendMembers();
		}
		
		if(exist(dto.getMemberId()) == -1) {
			members[count++] = dto;
		}else {
			System.out.println("[오류]" + dto.getMemberId() + "는 사용할 수 없습니다.");
		}
	}

	@Override
	public int exist(String memberId) {
		for(int index = 0; index < count; index++) {
			if(members[index].getMemberId().equals(memberId))
				return index;
		}
		return -1;
	}
	
	public void extendMembers() {
		Member[] membersTemp = new Member[members.length + members.length];
		System.arraycopy(members, 0, membersTemp, 0, members.length);
	}

	@Override
	public Member getMember(String memberId) {
		int idx = exist(memberId);
		if(idx >= 0) {
			return members[idx];
		}
		System.out.println("[오류]" + memberId + "는 존재하지 않는 아이디입니다");
		return null;
	}

	
	@Override
	public Member[] getMember() {
		
		return null;
	}

	@Override
	public Member setMember(String memberId) {
		
		return null;
	}

	@Override
	public Member setMember(String memberId, String memberPw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member removeMember(String memberId, String memberPw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member removeMember() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
