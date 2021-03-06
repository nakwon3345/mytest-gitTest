package com.work.view;

import com.work.model.dto.StudentScore;
import com.work.model.service.StudentService;

/**
 * <pre>
 * 학생 성적 관리 프로그램 시작 클래스
 * <\pre>
 * 
 * @author 최낙원
 * @version ver.1.0
 * @since jdk 1.8
 * @see com.work.model.dto.StudentScore
 * @see com.work.mode.service.StudentScore
 */
public class Test {
	
	public static void main3(String[] args) {
		//this 테스트
		StudentScore dto3 = new StudentScore("3번", "이감찬", 88);
		dto3.printInfo();
	}
	
	/**
	 * 학생 성적 관리 프로그램 시작 메서드
	 * @param args 시작시 전달받은 문자열타입 배열정보
	 */
	//생성자 테스트
	public static void main2(String[] args) {
		// 기본생성자 이용한 객체 생성
		StudentScore dto1 = new StudentScore();
		dto1.studentNo = "1번";
		dto1.setName("홍길동");
		dto1.setScore(92);
		
		// 필수초기화생성자 이용한 객체 생성
		StudentScore dto2 = new StudentScore("2번", "강감찬");
		dto2.setScore(92);
		
		StudentScore dto3 = new StudentScore("3번", "이감찬", 88);
		
		dto1.printInfo();
		dto2.printInfo();
		dto3.printInfo();
		
	}

	public static void main(String[] args) {
		StudentService service = new StudentService();
		
		// 회원들의 자료저장구조 배열을 접근해서 변경 가능
		// service.students = null;
		
		System.out.println("\n### 등록");
		service.addStudentScore("1번", "홍길동", 92);
		service.addStudentScore("2번", "강감찬", 85);
		service.addStudentScore("3번", "이순신", 77);
		service.addStudentScore("4번", "김유신", 98);
		service.addStudentScore("5번", "유관순", 65);
		
		// service.students = null; // 기존 학생들의 성적보기가 저장된 배열객체가 메모리에서 사라짐 => 학생성적정보 유실
		
		//System.out.println("\n### 성적 등록 학생수 : " + service.count);
		
		//service.getcount = 500;
		service.addStudentScore("1번", "홍길동", 92);
		
		
	}//

}//
