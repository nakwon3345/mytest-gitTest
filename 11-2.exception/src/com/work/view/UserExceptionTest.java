package com.work.view;

import com.work.exception.UserException;

public class UserExceptionTest {

	public static void main(String[] args) {
		UserExceptionTest a = new UserExceptionTest();
		try {
			a.doA("T");
		} catch (UserException e) {
			System.out.println("[오류] " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("정상 종료");
	}//
	/**
	 * grade "G", "S", "A"가 아니면 사용자예외(User Exception) 발생
	 * @param grade
	 * @throws UserException 
	 */
	public void doA(String grade) throws UserException {
		switch(grade) {
		case "G":
		case "S":
		case "A":
			break;
		default:
			//System.out.println("[오류] 등급은 G, S, A만 가능합니다.");
			//throw new UserException();
			throw new UserException("등급은 G, S, A만 가능합니다.");
		}
		
		
	}

}//
