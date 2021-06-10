package com.work.model.service;

import java.util.ArrayList;

import com.work.exception.CommonException;
import com.work.exception.RecordNotFoundException;
import com.work.model.dto.Member;
import com.work.util.Utility;

/**
 * Collection API 활용 변경
 * -- ArrayList
 * @author 
 */

public class MemberService {
	
	 /** 회원들을 저장관리하기 위한 자료 저장구조 */
	private ArrayList<Member> list = new ArrayList<Member>();
	
	/** 기본생성자 : 초기화 회원 등록 수행 */
	public MemberService() {
		int count = initMember();
		System.out.println("초기화회원 등록작업이 완료되었습니다. : " + count);
	}
	
	/**
	 * 회원탈퇴
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @return 성공시 탈퇴회원의 기존정보, 실패시 null
	 */
	public Member removeMember(String memberId, String memberPw) {
		int index = exist(memberId);
//		if (index >= 0) {
//			Object obj = list.get(index);
//			if(obj instanceof Member) {
//				Member dto = (Member)obj;
//				if (dto.getMemberPw().equals(memberPw)) {
//					return (Member)list.remove(index);					
//				}
//				
//			}
//		}
		
		if(index >= 0 && list.get(index).getMemberPw().equals(memberPw)) {
			list.remove(index);
			return list.remove(index);
		}
		return null;
	}
	
	/**
	 * 회원탈퇴
	 * @param memberId 아이디만 확인하고 탈퇴
	 * @return
	 */
	public Member removeMember(String memberId) {
		int index = exist(memberId);
//		if (index >= 0) {		
//					return (Member)list.remove(index);					
//				}		
		if(index >= 0) {
			return list.remove(index);
		}
				return null;
	}
	
	/** 
	 * 회원정보 전체 변경 
	 * @return 성공시 true, 실패시 false
	 */
	public boolean setMember(Member dto) {
		int index = exist(dto.getMemberId());
		if (index >= 0) {
			list.set(index, dto);
			return true;
		}
		return false;
	}
	
	/**
	 * 비밀번호 변경
	 * -- 아규먼트 : 아이디, 비밀번호, 변경비밀번호
	 * -- 도메인 데이터 각각 : 아이디, 비밀번호, 변경비밀번호
	 * -- Map : key:value
	 * @return 
	 */
	public boolean setMemberPw(String memberId, String memberPw, String modifyMemberPw) {
//		int index = exist(memberId);
//		if (index >= 0) {
//			Object obj = list.get(index);
//			if(obj instanceof Member) {
//				Member dto = (Member)obj;
//				if (dto.getMemberPw().equals(memberPw)) {
//					dto.setMemberPw(modifyMemberPw);
//					return true;
//				}
//				
//			}
//		}
		int index = exist(memberId);
		if(index >= 0 && list.get(index).getMemberPw().equals(memberPw)) {
			list.get(index).setMemberPw(modifyMemberPw);			
				return true;				
			}
			return true;		
	}
	
	   /** 현재 등록한 전체 회원 조회 */
	public ArrayList getMember() {
		return list;
	}
	
	   /**
	    * 현재 등록 인원수 조회
	    * @return
	    */
	 public int getCount()  {
	      return list.size();
	   }   

	/**
	 * 회원 등록
	 * -- 사용자 입력 데이터 : 아이디, 비밀번호, 이름, 휴대폰, 이메일
	 * -- 시스템 최초 가입시 일반회원 가입처리 : 가입일, 등급, [마일리지]
	 * @param dto
	 */
	public void addMember(Member dto) {
		if(exist(dto.getMemberId()) == -1) {
			list.add(dto);
		}else {
			System.out.println("[오류] 동일한 아이디가 존재합니다. : " + dto.getMemberId());
		}	
	}
	
	/**
	 * 회원 등록
	 * -- 사용자 입력 데이터 : 아이디, 비밀번호, 이름, 휴대폰, 이메일
	 * -- 시스템 최초 가입시 일반회원 가입처리 : 가입일, 등급, [마일리지]
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 */
	public void addMember(String memberId, String memberPw, String name, String mobile, String email) {
		Member dto = new Member(memberId, memberPw, name, mobile, email);
		dto.setGrade("G");
		dto.setEntryDate(Utility.getCurrentDate());
		dto.setMileage(1000);
		
		addMember(dto);
		
	}
	
	  /**
	    * 회원 존재 유무 조회 : 저장된 회원의 크기만큼 반복, 저장객체 조회(Object), instanceOf, type casting, equals()
	    * @param memberId 아이디
	    * @return 존재시 저장위치 인덱스번호, 미존재시 -1
	    */
	   public int exist(String memberId) {
		   for(int index = 0; index < list.size(); index++) {
			   if(list.get(index).getMemberId().equals(memberId)) {
					  return index;
						  
			   }
		   }
	      // jdk 1.4
//	      for(int index = 0; index < list.size(); index++) { // index 돌리기 사이즈보다작게
//	         Object obj = list.get(index); // obj 객체생성 index들어간 getter 반환타입이 object
//	         if(obj instanceof Member) { // obj랑 Member 객체 비교
//	            Member dto = (Member)obj; // obj Member객체로 형변환 하면서 dto 대입
//	            if(dto.getMemberId().equals(memberId)) { // 멤버아이디 불러내서 equals로 문자열 비교
//	               return index; // 인덱스 반환
//	            }
//	            
//	         }
//	      }	 
		   return -1; //아닐경우 -1값 반환
	   }
	   
	   /**
	    * 우수회원 등업 메서드
	    */
	   
	   
	   /**
	    * 테스트를 위한 회원 초기화 등록 메서드
	    * @return 초기화 회원등록 인원수
	    */
	   public int initMember() {
		   	Member dto1 = new Member("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000, null);
		   	Member dto2 = new Member("user02", "password02", "강감찬", "01012342000", "user02@work.com", "2021-01-05", "G", 950000, null);
			Member dto3 = new Member("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", 0, "강동원");
			Member dto4 = new Member("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", 0, "김하린");
			Member dto5 = new Member("administrator", "admin1004", "유관순", "01012345000", "administrator@work.com", "2020-04-01", "A");
			
			addMember(dto1);
			addMember(dto2);
			addMember(dto3);
			addMember(dto4);
			addMember(dto5);
			
		   return list.size();
	   }
	   
	   /**
	    * 회원 상세조회
	    * @param memberId 아이디
	    * @return 존재하면 회원객체, 미존재시 null
	    * @see exist(String)
	    */
	public Member getMember(String memberId) {
		int index = exist(memberId);
		if (index >= 0) {
			return (Member)list.get(index);
		}
		return null;
	}
	
	public boolean login (String memberId, String memberPw) {
		if(memberId.equals(memberId) && memberPw.equals(memberPw)) {
			return true;
		}else {
			return false;
		}	
	}
	public void logout (String memberId) {
		System.out.println("로그아웃 되었습니다.");
	}
	/*
	 * 로그인
	 * --매서드명
	 * --매개변수
	 * --반환타입
	 * 1. 회원전용서비스 : boolean
	 * 2. 회원등급별 차등 서비스 : 로그인 성공 - 해당회원의 등급(String), 로그인 실패 - null (아이디 미존재, 비밀번호 불일치)
	 * 3. 
	 * 	3.1 : 로그인 성공
	 * 	3.2 : 등급이 일반 회원
	 * 	3.3 : 일반회원이면 마일리지 변경(로그인 마일리지 추가)
	 * 	3.4 : 일반회원이면 말리리자가 현재 100,000이상이냐
	 * 	3.5 : 일반회원의 현재 마일리지가 100,000이상이면 => 우수회원 등업처리를 위한 메서드 dispatch(위임)
	 * 
	 */
	
	public boolean login1(String memberId, String memberPw) throws   , CommonException {
		try {
			Member dto = getMember(memberId);
			if (dto.getMemberPw().equals(memberPw)) {
				if(dto.getGrade().equals("G")) {
					addMileage(memberId, 500);
				}
				return true;
			} 
			throw new CommonException("회원의 정보가 올바르지 않습니다.");
		} catch (RecordNotFoundException e) {
			throw e;
		}
	}

	private void addMileage(String memberId, int i) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * 우수회원 등업처리
	 * -- 처리절차
	 * 1. 일반회원이 본인의 마일리지 정보 조회하고 => 관리자에게(시스템) 등업요청
	 * 2. 자동등업 : 100,000점 넘으면 자동으로 등업
	 */
	
	/*
	 * 아이디찾기
	 * --매서드명
	 * --매개변수
	 * --반환타입
	 */
	
	/*
	 * 비밀번호 찾기
	 * 1. 
	 * --매서드명
	 * --매개변수
	 * --반환타입
	 */
	}
