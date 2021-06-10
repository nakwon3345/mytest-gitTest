package com.work.model.service;

import com.work.model.dto.StudentScore;

/**
 * <pre>
 * 학생 성적관련 서비스 제공 클래스
 * 1. 등록 기능 : + addStudentScore(학번, 이름, 성적) : void
 * 2. 조회 기능 : 전체학생성적조회 기능, 학번의 해당학생 상세조회 기능
 * 3. 총점 계산 기능
 * 4. 평균 계산 기능
 * <\pre>
 * 
 * @author 최낙원
 * @version ver.1.0
 * @since jdk 1.8
 * @see com.work.model.dto.StudentScore
 * @see com.work.mode.dtoStudentScore#printInfo()
 */

public class StudentService {
	/** 학생들의 성적정보 객체를 그룹으로 관리하기 위한 자료 저장구조 : 필요시 확장하도록 처리 */
	//public StudentScore[] students = new StudentScore[3];
	
	// 멤버변수 선언 : 배열객체 생성은 생성자 위임처리
	
	private StudentScore[] students;
	
	/** 등록된 학생의 숫자 정보 및 등록해야하는 배열요소의 인덱스번호 정보
	 * -- 변경 불가
	 * -- 등록 학생 수 
	 * */
	private int count;
	
	/* 배열의 크기를 10개 초기화 */
	public StudentService() {
		//students = new StudentScore[10];
		this(10);
	}
	
	public StudentService(int length) {
		students = new StudentScore[length];
		
	}
	
	/** 현재  등록한 학생성적의 숫자 조회 메서드*/
	public int getCount() {
		return count;
	}
	//1. 등록 기능 : + addStudentScore(학번, 이름, 성적) : void
	/**
	 * 학생성적 등록 메서드
	 * -- 등록결과 메시지 출력
	 * -- 성공 : 등록 성공
	 * -- 실패 : 등록 실패
	 * 
	 * // 생성된 객체를 배열의 count 요소위치에 등록
	 * // count 등록인원을 1 증가
	 * <\pre>
	 * @param studentNo 학번
	 * @param name 이름
	 * @param score 성적
	 */
	public void addStudentScore(String studentNo, String name, int score) {
		if (count == students.length) {
			extendStudents(10);
			System.out.println("학생들 자료구조 추가 확장");
		}
		StudentScore dto = new StudentScore();
		dto.studentNo = studentNo;
		dto.name = name;
		dto.score = score;
		
		students[count++] = dto;
	
		
		
		addStudentScore(dto);
	}
	
	public void addStudentScore(StudentScore dto) {
		if (count == students.length) {
			extendStudents(10);
			System.out.println("자료구조 추가 확장");
		}
	}
		public void extendStudents(int length){
			StudentScore[] studentsTemp = new StudentScore[students.length + length];
			
			for (int index = 0; index < students.length; index++) {
				studentsTemp[index] = students[index];
			}
			students = studentsTemp;
		}
		
		//전체학생 성적 조회 메서드
		public void printStudentScore(){
			for (int index = 0; index < count; index++) {
				students[index].printInfo();
			}
		}
	}


