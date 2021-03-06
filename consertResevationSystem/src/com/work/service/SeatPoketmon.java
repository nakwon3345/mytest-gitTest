package com.work.service;

import java.util.Scanner;

public class SeatPoketmon {
	
Scanner sc = new Scanner(System.in);
	
	String[] vipSeat = new String[10];
	String[] sSeat = new String[15];
	String[] rSeat = new String[25];
	
	public SeatPoketmon() {
		int i = 0;
		while(i < 25) {
			if(i < 10) vipSeat[i] = "[]";
			if(i < 15) sSeat[i] = "[]";
				rSeat[i] = "[]";
				i++;
		}
	}
	
	public void showReserve() {
		System.out.print("피카츄의 대모험 VIP>> ");
		for(int i = 0; i < vipSeat.length; i++) {
			System.out.print(vipSeat[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("피카츄의 대모험 S>> ");
		for(int i = 0; i<sSeat.length; i++) {
			System.out.print(sSeat[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("피카츄의 대모험 R>> ");
		for(int i = 0; i<rSeat.length; i++) {
			System.out.print(rSeat[i] + " ");
		}
		
		System.out.println();
	}
		
	public boolean showOne(int inputseats) {
		switch(inputseats) {
		case 1:
			System.out.print("피카츄의 대모험 VIP>> ");
			for(int i = 0; i < vipSeat.length; i++) {
				System.out.print(vipSeat[i] + " ");
			}
			System.out.println();
			return true;
			
		case 2:
			System.out.print("피카츄의 대모험 S>> ");
			for(int i = 0; i<sSeat.length; i++) {
				System.out.print(sSeat[i] + " ");
			}			
			System.out.println();
			return true;
		
		case 3: 
			System.out.print("피카츄의 대모험 R>> ");
			for(int i = 0; i<rSeat.length; i++) {
				System.out.print(rSeat[i] + " ");
			}			
			System.out.println();
			return true;
			
		default :
			System.out.println("잘못 입력했습니다. 다시 입력해주세요");
				return false;
		}
	}
	
	public void reservation() {
		int inputseat = 0;
		String name = "";
		boolean right;
		
		while(true) {
			System.out.print("좌석구분 VIP<1>, S<2>, R<3> >>");
			inputseat = sc.nextInt();
			
			right = showOne(inputseat);
			
			if(right == false) continue;
			
			System.out.print("이름 >> ");
				name = sc.next();
			System.out.print("번호 >> ");
			int seatnum = sc.nextInt();
			
			try {
				switch(inputseat) {
				case 1:
					vipSeat[seatnum-1] = name;
					break;
				case 2:
					sSeat[seatnum-1] = name;
					break;
				case 3:
					rSeat[seatnum-1] = name;
					break;
				}
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("없는 좌석번호입니다. 다시 입력해주세요");
					continue;
			}
			System.out.println();
			return;					
		}
	}
	
	public void delReserve() {
		int delete = 0;
		boolean right;
		String delname = "";
		int count;
		
		while(true) {
			count = 0;
			System.out.print("좌석구분 VIP<1>, S<2>, R<3> >>");
			delete = sc.nextInt();
			
			right = showOne(delete);
			
			if(right = false) continue;
			
			System.out.println("이름 >> ");
				delname = sc.next();
				
			switch(delete) {
			case 1:
				for(int i = 0; i < vipSeat.length; i++) {
					if(vipSeat[i].equals(delname)) {
						vipSeat[i] = "[]";						
					}else count += 1;					
				}
				if(count == 10) {
					System.out.println("예약되지 않은 이름입니다. 다시 시도하세요.");
					continue;
				}
				break;
				
			case 2:
				for(int i = 0; i < sSeat.length; i++) {
					if(sSeat[i].equals(delname))
						sSeat[i] = "[]";
					else count += 1;
				}
				if(count == 15) {
					System.out.println("예약되지 않은 이름입니다. 다시 시도하세요.");
					continue;
				}
				break;
				
			case 3:
				for(int i = 0; i < rSeat.length; i++) {
					if(rSeat[i].equals(delname))
						rSeat[i] = "[]";
						else count += 1;
				}
				if(count == 25) {
					System.out.println("예약되지 않은 이름입니다. 다시 시도하세요.");
					continue;
				}
				break;
			}
			
			System.out.println();
			return;				
		}
	}

}
