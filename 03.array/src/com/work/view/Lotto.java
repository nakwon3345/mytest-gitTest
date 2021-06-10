package com.work.view;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		System.out.println(Math.random()*40);
		System.out.println("실습 1 : 로또 1게임 : 1차원 배열 사용");
		int lotto[] = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
		
		//중복체크
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		Arrays.sort(lotto);
//		System.out.println();
//		System.out.println("실습3 : 정렬알고리즘을 활용하여서 중복되지 않게 출력된 6개의 로또 번호를 올림차순정렬하여 출력하도록 해보세요.");
//		int Lotto[] = new int[6];
//		
//		for(int i = 0; i < Lotto.length; i++) {
//			Lotto[i] = (int)(Math.random()*45 + 1);
//			
//			//중복체크
//			for(int j = 0; j < i; j++) {
//				if(Lotto[i] == Lotto[j]) {
//					i--;
//					break;
//				}
//			}	
//		}
//		Arrays.sort(Lotto);
//		for(int i = 0; i < Lotto.length; i++) {
//			System.out.print(Lotto[i] + " ");
//		}
//		
//	}
//			
//		public static int getLottoNo() {
//			/* 임의의 정수형 숫자를 추출하기 위한 제공 코드입니다. */
//			Random extractNo = new Random((long)(Math.random() * System.nanoTime()));
//			int no = extractNo.nextInt(45) + 1; // 0 ~ 44 사이의 임의의 숫자 추출 => +1 => 1 ~ 45 사이 임의숫자 추출
//			return no;
	}//

}//
