package com.work.view;

public class GuGuDanTest {

	public static void main(String[] args) {
		/*
		 * 	-- 1. for 구문을 활용한 구구단
			-- 2. while 구문을 활용한 구구단
			-- 3. do~while 구문을 활용한 구구단
			-- 4. 반복문(본인이 편한 반복문사용)을 활용하여 짝수 구구단만 출력
			-- 5. 반복문(본인이 편한 반복문사용)을 활용하여 홀수스텝의 구구단만 출력
		 
		 	-- 출력형식 : 
		 	2단		3단	......	9단
		 	
			2*1=2	3*1=3		9*1=9
			2*2=4
			...
			2*9=18
		 */

		System.out.println("\n1. for 구문을 활용한 구구단");
		// 2 ~ 9 : 제목행 출력
		for(int dan = 2; dan <= 9; dan++) {
			System.out.print(dan + "단\t");
		}
		System.out.println();
		
		// 1 ~ 9 : 구구단 반복 출력
		for(int step = 1; step <= 9; step++) {
			// 2 ~ 9
			for(int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + step + "=" + (dan * step) + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("2. while 구문을 활용한 구구단");
		int step = 1;
		int dan = 2;
		while(step <= 9) {
			dan = 2;
			while(dan <= 9) {
				System.out.print(dan + "*" + step + "=" + (dan * step) + "\t");
				dan++;
			}
			System.out.println();
			step++;
		}
		
		System.out.println();
		System.out.println("3. do~while 구문을 활용한 구구단");
		step = 1;
		dan = 2;
		do {
			dan = 2;
			do {
				System.out.print(dan + "*" + step + "=" + (dan * step) + "\t");
				dan++;
			} while(dan <= 9);
			System.out.println();
			step++;
		} while(step <= 9);
		
		System.out.println();
		System.out.println("4. 반복문(본인이 편한 반복문사용)을 활용하여 짝수 구구단만 출력");
		for(step = 1; step <= 9; step++) {
			for(dan = 2; dan <= 9; dan++) {
				if (dan % 2 == 0) {
					System.out.print(dan + "*" + step + "=" + (dan * step) + "\t");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("5. 반복문(본인이 편한 반복문사용)을 활용하여 홀수스텝의 구구단만 출력");
		for(step = 1; step <= 9; step++) {
			if (step % 2 == 1) {
				for(dan = 2; dan <= 9; dan++) {
					System.out.print(dan + "*" + step + "=" + (dan * step) + "\t");
				}
				System.out.println();
			}
//			System.out.println();
		}
	}
	
}
