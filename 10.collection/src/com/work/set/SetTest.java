package com.work.set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

public class SetTest {
	public static void main(String[] args) {
			//jdk1.5 Generic : Member 저장되는 기능
		HashSet<Member> set = new HashSet<Member>();
		
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000);
		Member dto2 = new GeneralMember("user01", "password02", "강감찬", "01012342000", "user02@work.com", "2021-01-05", "G", 950000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("administrator", "admin1004", "유관순", "01012345000", "administrator@work.com", "2020-04-01", "A", "선임");
		
		
//		System.out.println(set.add("hello"));			// true
//		System.out.println(set.add("hello")); 			// false
//		System.out.println(set.add("hello"));			// false
//		System.out.println(set.add("hello"));			// false
//		System.out.println(set.add("hello"));			// false
//		System.out.println(set.add(1004));				// true
//		System.out.println(set.add(new Integer(1004)));	//false
		System.out.println(set.add(dto1));				// true
		System.out.println(set.add(dto2));				// false
		System.out.println(set.add(dto3));				// true
		System.out.println(set.add(dto4));				// true
		System.out.println(set.add(dto5));				// true
//		System.out.println(set.add(new Date()));		// true
		
		System.out.println("저장 갯수 : "  + set.size());
		
		// 조회 : 전체조회
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// 조회 : 아이디가 "user01" 객체의 정보 조회 : instanceof / type casting
		System.out.println("상세조회");
		iterator = set.iterator();
		while(iterator.hasNext()) {
			Member dto = iterator.next();
			if (dto.getMemberId().equals("user01")) {
					System.out.println(dto);
					break;
				}
				
			}
		
//		System.out.println("user04 삭제");
//		iterator = set.iterator();
//		while(iterator.hasNext()) {
//			Object obj = iterator.next();
//			if(obj instanceof Member) {
//				Member dto = (Member)obj;
//				if(dto.getMemberId().equals("user04")) {
//					set.remove(dto);
//					break;
//				}
//			}
//		}
		

		System.out.println("삭제 user04");
		iterator = set.iterator();
		while(iterator.hasNext()) {		
			if(iterator.next().getMemberId().equals("user04")) {
				iterator.remove();
				break;
			}
				
		}
						
			System.out.println("전체조회");
			iterator = set.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		
		}//
		

	public static void main1(String[] args) {
		// Collection Set
		HashSet set = new HashSet();
		
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000);
		Member dto2 = new GeneralMember("user01", "password02", "강감찬", "01012342000", "user02@work.com", "2021-01-05", "G", 950000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("administrator", "admin1004", "유관순", "01012345000", "administrator@work.com", "2020-04-01", "A", "선임");
		
		
		System.out.println(set.add("hello"));			// true
		System.out.println(set.add("hello")); 			// false
		System.out.println(set.add("hello"));			// false
		System.out.println(set.add("hello"));			// false
		System.out.println(set.add("hello"));			// false
		System.out.println(set.add(1004));				// true
		System.out.println(set.add(new Integer(1004)));	//false
		System.out.println(set.add(dto1));				// true
		System.out.println(set.add(dto2));				// false
		System.out.println(set.add(dto3));				// true
		System.out.println(set.add(dto4));				// true
		System.out.println(set.add(dto5));				// true
		System.out.println(set.add(new Date()));		// true
		
		System.out.println("저장 갯수 : "  + set.size());
		
		// 조회 : 전체조회
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// 조회 : 아이디가 "user01" 객체의 정보 조회 : instanceof / type casting
		System.out.println("상세조회");
		iterator = set.iterator();
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			if(obj instanceof Member) {
				Member dto = (Member)obj;
				if (dto.getMemberId().equals("user01")) {
					System.out.println(dto);
					break;
				}
				
			}
			
		}
	
		System.out.println("user04 삭제");
		iterator = set.iterator();
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			if(obj instanceof Member) {
				Member dto = (Member)obj;
				if(dto.getMemberId().equals("user04")) {
					set.remove(dto);
					break;
				}
			}
		}
		
		System.out.println("전체조회");
		iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}//

}//
