package com.work.list;

import java.util.ArrayList;
import java.util.Date;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

public class ListTest {
	
	public static void main(String[] args) {
		
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000);
		Member dto2 = new GeneralMember("user02", "password02", "강감찬", "01012342000", "user02@work.com", "2021-01-05", "G", 950000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("administrator", "admin1004", "유관순", "01012345000", "administrator@work.com", "2020-04-01", "A", "선임");
		
		// 회원들을 저장하기 위한 자료저장구조 : List
		ArrayList list = new ArrayList();
		// 등록 : add(Object) : boolean
		System.out.println(list.add("hello")); // [0]
		System.out.println(list.add("hello")); // [1]
		System.out.println(list.add("hello"));
		System.out.println(list.add("hello"));
		System.out.println(list.add("hello"));
		System.out.println(list.add(1004));
		System.out.println(list.add(new Integer(1004)));
		System.out.println(list.add(dto1));
		System.out.println(list.add(dto2));
		System.out.println(list.add(dto3));
		System.out.println(list.add(dto4));
		System.out.println(list.add(dto5));
		System.out.println(list.add(new Date()));
		
		// 저장크기 : size() : int
		System.out.println("size : " + list.size());
		
		// 조회 : 7번째요소 저장
		Object obj = list.get(7);
		System.out.println(obj);
		
		// 변경 :
		// 1번째 요소 객체 : 임의 정보로 변경
		obj = list.set(1, dto5);
		System.out.println("변경전 : " + obj);
		System.out.println("변경후 : " + list.get(1));
	
		// 삭제 : 5, 6.7 번째 요소
		list.remove(5);
		list.remove(6);
		list.remove(7);
		
		// 전체 조회
		System.out.println("size : " + list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println("[" + i + "]" + list.get(i));
		}
	}//

}//
