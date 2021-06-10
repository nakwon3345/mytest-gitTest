package com.work.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dto.Member;


public class IoMemberTest {

	public static void main(String[] args) {
		System.out.println("회원 가입 메뉴");
		System.out.println("아이디 : ");
		String memberId = inputString();
		
		System.out.println("비밀번호 : ");		
		String memberPw = inputString();
		
		System.out.println("이름 : ");
		String name = inputString();
		
		System.out.println("휴대폰 : ");
		String mobile = inputString();
		
		System.out.println("이메일 : ");
		String email = inputString();
		
		System.out.println("마일리지 : ");
		int mileage = inputNumber();
		
		Member dto = new Member(memberId, memberPw, name, mobile, email);
		dto.setMileage(mileage);
		
		
		
	}//
	
	// 객체생성 없이 사용가능한 메서드
	// 키보드로부터 읽은 데이터를 문자열로 반환하는 메서드
	public static String inputString() {
		String data = null;
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			data = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	// 객체생성 없이 사용가능한 메서드
	// 키보드로부터 읽은 데이터를 int로 반환하는 메서드
	
	public static int inputNumber() {
		String data = null;
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			data = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Integer.parseInt(data);
	}

}//
