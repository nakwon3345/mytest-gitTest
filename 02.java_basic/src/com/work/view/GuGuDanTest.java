package com.work.view;

public class GuGuDanTest {

	public static void main(String[] args) {
		
		System.out.println("\n1. for 구문을 활용한 구구단");
		//제목행 출력
		for(int dan = 2; dan <= 9; dan++) {
			System.out.print(dan + "단	");
		}System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}System.out.println("");
		} 
		
		System.out.println();
		System.out.println("2. while 구문을 활용한 구구단");
		
		int step = 1;
		int dan = 2;		
		while(step <= 9) {
			dan = 2;
			while(dan <= 9) {				
				System.out.print(dan + "*" + step + "=" + (dan*step) + "\t");
				dan++;
			}
				System.out.println("");
				step++;
		}
		
		System.out.println();
		System.out.println("3. do~while 구문을 활용한 구구단");
		step = 1;
		dan = 2;
		do {
			dan = 2;
			do {
				System.out.print(dan + "*" + step + "=" + (dan*step) + "\t");
				dan++;				
			}while(dan <= 9);
			System.out.println();
			step++;
		}while(step <= 9);
		
		
		System.out.println();
	System.out.println("4. 반복문을 활용하여 짝수 구구단만 출력");
	
		for(step = 1; step <= 9; step++) {						
			for(dan = 2; dan <= 9; dan++) {
				if(dan % 2 == 1)
					continue;
					System.out.print(dan + "*" + step + "=" + (dan*step) + "\t");
			}			
			System.out.println(" ");
		}  	
		
		System.out.println();
		System.out.println("5. 반복문을 활용하여 홀수시스텝의 구구단만 출력");
		
		for(step = 1; step <= 9; step++) {
			if(step % 2 == 0)
				continue;
				for(dan = 1; dan <= 9; dan++) {
				
				System.out.print(dan + "*" + step + "=" + (dan*step) + "\t");
				
			}System.out.println();
		}
	}//

}//
