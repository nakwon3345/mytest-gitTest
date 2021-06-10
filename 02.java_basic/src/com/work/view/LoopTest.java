package com.work.view;

public class LoopTest {
	
	public static void main(String[] args) {
		//for문
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			sum += i;
			
		}
		System.out.println("sum = " + sum);
		
		//while문
		int i = 1;
		int total = 0;
		while(i <= 5) {
			System.out.println(i);
			total += i;
			i++;
		}System.out.println("total : " + total);
			
		
		total = 0;
		i = 1;
		System.out.println("do~while 구문");
		do {
			System.out.println(i);
			total += i;
			i++;
		} while(i<=5);
		System.out.println("total : " + total);
		
//		for (char i = 'A'; i <= 'Z'; i++) {
//			
//			System.out.println(i + " : " + (int)i);
//		}
	}

	public static void main1(String[] args) {
		
		int total = 0;
		for(int i = 1; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				total += i;
			}	
		}System.out.println("total " + total);
		
	}//

}//
