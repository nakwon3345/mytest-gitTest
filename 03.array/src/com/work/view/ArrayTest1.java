package com.work.view;

public class ArrayTest1 {
	
	public static void main(String[] args) {
		System.out.println(args.length);
		//main1();
		//main2();
		main3();
		
	}//
	// 실습 : 선언 + 생성 + 명시적 초기화
	//-- 5명 성적 : 92, 85, 77, 98, 65
	//-- 5명 이름 : 홍길동, 강감찬, 이순신, 김유신, 유관순
	// 출력형식
	// 1. 홍길동 92
	// 총점 : 000
	// 평균 : 00
	public static void main3() {
		int total = 0;
		int avg = 0;
		int[] scores = {92, 85, 77, 98, 65};
		String[] names = {"홍길동", "강감찬", "이순신", "김유신", "유관순"};
		for(int i = 0; i <scores.length; i++) {
			System.out.println((i+1) + "번 " + names[i]+ " " + scores[i]);
			total += scores[i];
		}
		
		avg = total / names.length;
		System.out.println("총점 : " + total);
		//System.out.println("평균 : " + avg);
		System.out.println("평균 : " + total / 5.0);
	}
	public static void main2() {
		// 5명의 학생의 이름을 관리하는 프로그램 개발
		// 5명 학생 이름 : 홍길동, 강감찬, 이순신, 김유신, 유관순
		String[] names = {"홍길동", "강감찬", "이순신", "김유신", "유관순"};
		System.out.println(names.length);
		for(int i = 0; i <names.length; i++) {
			System.out.println(names[i]);
		}
	}

	public static void main1(String[] args) {
		// 5명 학생의 성적관리하는 프로그램
		// 5명 성적 : 92, 85, 77, 98, 65
		// 배열을 자료 저장구조 사용
		
		// 출력형식 요구사항변경
		// 1번 : 92
		// 2번 : 85
		// 총점 : 000
		// 평균 : 00 (소수이하 버림처리)
		
		// 1. 배열 선언
		int[] scores;
		
		// 2. 배열 생성
		scores = new int[5];
		
		// 3. 배열요소 사용
		scores[0] = 92;
		scores[1] = 85;
		scores[2] = 77;
		scores[3] = 98;
		scores[4] = 65;
		
		// 배열요소에 담긴 값을 전체 출력
		int total = 0;
		int avg = 0;
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "번 : " + scores[i]);
			total += scores[i];
		}
		
		avg = total / scores.length;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		
	}//

}//
