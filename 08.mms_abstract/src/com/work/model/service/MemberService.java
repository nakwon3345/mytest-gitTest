/**
 * 
 */
package com.work.model.service;

import com.work.model.dto.Member;

/**
 * @author pc11
 *
 */
public class MemberService extends MemberSeriviceAbstract {

	private Member[] members = new Member[10];
	
	/** 등록인원 수 및 등록될 배열요소 위치정보 */
	private int count;
	
	/**
	 * 현재 등록 인원수 조회
	 * @return 현재 등록 인원수
	 */
	public int getCount() {
		return count;
	}

	/**
	 * 회원등록 구현 절차
	 * 1. 현재 등록된 회원수와 (count) 현재배열의 크기와 같은지 비교해서
	 * 
	 * => 별도의 메서드로 분리 설계 : 구현클래스에서 메서드 선언
	 * 2. 같으면 새로이 확쟁배열(기존배열의 크기 +)을 생성해서
	 * 3. 새로이 확장한 배열요소에 기존에 배열요소에 저장된 객체들을 이동저장
	 * 4. 기존에 참조하고 있는 배열대신에 새로이 확장한 배열요소 변경 참조설정
	 * 5. count 배열요소에 아규먼트로 전달받은 회원객체 등록하고 
	 * 6. count를 1증가 시킴
	 */
	@Override
	public void addMember(Member dto) {
		
		if (count == members.length) {
			extendMembers(10);		
		}
		
		if(exist(dto.getMemberId()) == -1) {
			members[count++] = dto;
		}else {
			System.out.println("[오류] 이 아이디는 사용할 수 없습니다.");
		}
		// 동일아이디를 갖는 회원객체 존재하는 경우에는 오류메세지 출력
		// 오류메세지 : [오류] 000 아이디는 사용할 수 없습니다.	
	}
	
	/*
	 * CRUD 메서드에서 사용하기 위한 회원 존재유무 및 저장 위치 조회 메서드
	 * 1. 현재 등록된 회원 수만큼 반복하면서
	 * 2. 배열에 저장된 순서대로 저장된 객체의 아이디와(dto.getMemberId()) 아규먼트로 전달받은 아이디가 같은지 비교해서 (String#equals(문자열))
	 * 3. 아이디가 같으면 현재 저장된 배열요소의 인덱스번호를 반환
	 * 4. 반복을 다했는데도 return 되지 않았다면 아이디정보를 갖는 회원객체가 존재하지 않으므로 return -1
	 */
	
	/**
	 * 
	 * @see java
	 */
	public void extendMembers(int length) {
		
		Member[] membersTemp = new Member[members.length + members.length];
		System.arraycopy(members, 0, membersTemp, 0, members.length);
		
		members = membersTemp;
			
	}
	
		@Override
		public Member getMember(String memberId) {
			int idx = exist(memberId);
			if(idx >= 0) {
				return members[idx];
			}
			System.out.println("[오류]" + memberId + "는 존재하지 않는 아이디입니다.");
			return null;
		}
	
	@Override
	public int exist(String memberId) {
		for(int index = 0; index < count; index++) {
			if(members[index].getMemberId().equals(memberId)) {
				return index;
			}
		}
		
		return -1;
	}
 
	
	// 기존 배열요소를 기본배열크기 + 배열크기를 확장처리 메서드
	// System.arraycopy() 메서드 활용
	public void extendMembers() {
		
	}
}
				

