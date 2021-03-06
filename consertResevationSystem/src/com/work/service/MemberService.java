package com.work.service;


import java.util.ArrayList;



import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.work.model.Member;
public class MemberService {
	
	Scanner sc = new Scanner(System.in);
	List<Member> members = new ArrayList<Member>();
	String memberId, memberPw, name, mobile;
	
	/**
	 *  공연1. 뮤지컬 더 리퍼
	 */
	public void getPlay1() {
		System.out.println("공연 코드 : play_001");
		System.out.println("공연 이름 : 뮤지컬 더 리퍼");
		System.out.println("공연 일자 및 공연 시간 : 6/12, 19:30~22:00");
		System.out.println("주연 배우 : 문채원, 송중기");
	}
	
	/**
	 * 공연2. 옥탑방 고양이
	 */
	public void getPlay2() {
		System.out.println("공연 코드 : play_002");
		System.out.println("공연 이름 : 옥탑방 고양이");
		System.out.println("공연 일자 및 공연 시간 : 6/19, 20:00~22:00");
		System.out.println("주연 배우 : 남정은, 이경민");
	}
	
	/**
	 * 공연3. 피카츄의 대모험
	 */
	public void getPlay3() {
		System.out.println("공연 코드 : play_003");
		System.out.println("공연 이름 : 피카츄의 대모험");
		System.out.println("공연 일자 및 공연 시간 : 6/26, 19:30~21:30");
		System.out.println("주연 배우 : 소니아, 금랑");
	}
	
	/**
	 * 공연4. 낫아웃
	 */
	public void getPlay4() {
		System.out.println("공연 코드 : play_004");
		System.out.println("공연 이름 : 낫아웃");
		System.out.println("공연 일자 및 공연 시간 : 6/19, 20:00~22:30");
		System.out.println("주연 배우 : 송이재, 정재광");
	}
	
	/**
	 * 공연5. 행복
	 */
	public void getPlay5() {
		System.out.println("공연 코드 : play_005");
		System.out.println("공연 이름 : 행복");
		System.out.println("공연 일자 및 공연 시간 : 7/10, 19:30~21:30");
		System.out.println("주연 배우 : 김단율, 정영성");
	}
	
	/**
	 * 회원 추가
	 */
	public MemberService() {		
		members.add(new Member("Administrator", "password03", "이상해씨", "01089562356"));					
	}
		
	/**
	 * 회원 전체 조회
	 */
		public void SelectMember() {
			Iterator<Member> ite = members.iterator();
			
			 while(ite.hasNext()) {
		            System.out.println(ite.next() + " ");
		        }		        
		    }
		
		/**
		 * 회원가입	
		 */
		public void MemberJoin() {
			sc.nextLine();
			String memberId = getStrInput("ID : ");
			String memberPw = getStrInput("PassWord : ");
			String memberPw2 = getStrInput("Passwor Confirm");
			String name = getStrInput("이름 : ");
			String mobile = getStrInput("휴대폰 : ");
			
			if(idCheck(memberId)) {
				System.out.println("중복된 ID입니다.");
			}else if(memberPw.equals(memberPw2)){
			members.add(new Member(memberId, memberPw, name, mobile));
			System.out.println(memberId + "님 가입을 축하합니다.");
				}else {
			System.out.println("비밀번호 확인해주세요");
			
		}
	}
		
		/**
		 * 아이디 중복체크
		 * @param memberId 아이디
		 * @continue 아이디 중복이면 true 반환
		 */
		public boolean idCheck(String memberId) {
			boolean check = true;
			Member member = FindById(memberId);
			if(member == null)
				check = false;
			return check;		
		}
		
		/**
		 * 로그인
		 */
		public void Login() {
			sc.nextLine();
		String memberId = getStrInput("ID : ");
		String memberPw = getStrInput("비밀번호 : ");
				
		Member member = FindById(memberId);
        if(member == null){
            System.out.println("등록되지 않은 ID입니다.");
            manage();
        }else if(memberId.equals("Administrator")){ 
        	if(memberPw.equals("password03")) {
        		System.out.println("관리자님이 로그인하였습니다.");
        		adminmange();
        	}else{
        		System.out.println("비밀번호가 틀렸습니다.");
        		manage();
        	}
        	
        }else if(member.getMemberPw().equals(memberPw)) {
            System.out.println("[" + member.getMemberId() + "]님께서 로그인 하셨습니다.");
            play();
        }else {
            System.out.println("비밀번호가 틀렸습니다.");
            manage();
        }
    }
		
		/**
		 * 아이디 중복체크
		 * @param memberId 아이디
		 * @continue
		 */
		public Member FindById(String memberId) {
			for(Member member : members) {
				if(member.getMemberId().equals(memberId)) {
					return member;
				}
			}
			return null;
		}
		
		public String getStrInput(String msg) {
			System.out.println(msg);
			return sc.nextLine();
		}
		
		/**
		 * 공연 조회 시스템
		 */
		public static void play() {
	
			int menu = 0;
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	
			while(true) {
				System.out.println();
				System.out.println("----공연 조회 시스템----");
				System.out.println();
				System.out.println("뮤지컬 더 리퍼<1>, 옥탑방 고양이<2>, 피카츄의 대모험<3>, 낫아웃<4>, 행복<5>, 이전화면<6>");
				System.out.println("-------------------------------------------------------------------------");
				System.out.print("어떤 공연을 조회하시겠습니까? ");
		
				menu = Integer.parseInt(scanner.nextLine());
		
			switch(menu) {
			case 1:
				ripper();
				break;
			case 2:
				cat();
				break;
			case 3:
				poketmon();
				break;
			case 4:
				notout();
				break;
			case 5:
				happy();
				break;				
			case 6:
				manage();
				continue;
				
				default:
					System.out.println("없는 메뉴입니다. 다시 입력해주세요.");		
					continue;
			}
		}
		
		
	}//
		/**
		 * 뮤지컬 더 리퍼 정보 및 예약
		 */
		public static void ripper() {
			int menu = 0;
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			MemberService service = new MemberService();
			SeatRipper rs = new SeatRipper();
			
			while(true) {
				System.out.println();
				System.out.println("뮤지컬 더 리퍼 공연 정보<1>, 예약<2>, 예약 조회<3>, 예약 취소<4>, 이전 화면<5>, 끝내기<6>");
				System.out.println();
				
				menu = Integer.parseInt(scanner.nextLine());
				
				switch(menu) {
				case 1:
					service.getPlay1();
					break;
				case 2:
					rs.reservation();
					break;
				case 3:
					rs.showReserve();
					break;
				case 4:
					rs.delReserve();
					break;
				case 5:
					play();
					break;					
				case 6:
					System.out.println("시스템을 종료합니다.");
					continue;
					default:
						System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
						continue;
					
				}
			}
		}
		
		/**
		 * 옥탑방 고양이 정보 및 예약
		 */
		public static void cat() {
			int menu = 0;
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			MemberService service = new MemberService();
			SeatCat rs = new SeatCat();
			
			while(true) {
				System.out.println();
				System.out.println("옥탑방 고양이 공연 정보<1>, 예약<2>, 예약 조회<3>, 예약 취소<4>, 이전 화면<5>, 끝내기<6>");
				System.out.println();
				
				menu = Integer.parseInt(scanner.nextLine());
				
				switch(menu) {
				case 1:
					service.getPlay2();
					break;
				case 2:
					rs.reservation();
					break;
				case 3:
					rs.showReserve();
					break;
				case 4:
					rs.delReserve();
					break;
				case 5:
					play();
					break;					
				case 6:
					System.out.println("시스템을 종료합니다.");
					continue;
					default:
						System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
						continue;
					
				}
			}
		}
	
		/**
		 * 피카츄의 대모험 정보 및 예약
		 */
		public static void poketmon() {
			int menu = 0;
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			MemberService service = new MemberService();
			SeatPoketmon rs = new SeatPoketmon();
			
			while(true) {
				System.out.println();
				System.out.println("피카츄의 대모험 공연 정보<1>, 예약<2>, 예약 조회<3>, 예약 취소<4>, 이전 화면<5>, 끝내기<6>");
				System.out.println();
				
				menu = Integer.parseInt(scanner.nextLine());
				
				switch(menu) {
				case 1:
					service.getPlay3();
					break;
				case 2:
					rs.reservation();
					break;
				case 3:
					rs.showReserve();
					break;
				case 4:
					rs.delReserve();
					break;
				case 5:
					play();
					break;					
				case 6:
					System.out.println("시스템을 종료합니다.");
					continue;
					default:
						System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
						continue;
					
				}
			}
		}
		
		/**
		 * 낫아웃 정보 및 예약
		 */
		public static void notout() {
			int menu = 0;
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			MemberService service = new MemberService();
			SeatNotout rs = new SeatNotout();
			
			while(true) {
				System.out.println();
				System.out.println("낫아웃 공연 정보<1>, 예약<2>, 예약 조회<3>, 예약 취소<4>, 이전 화면<5>, 끝내기<6>");
				System.out.println();
				
				menu = Integer.parseInt(scanner.nextLine());
				
				switch(menu) {
				case 1:
					service.getPlay4();
					break;
				case 2:
					rs.reservation();
					break;
				case 3:
					rs.showReserve();
					break;
				case 4:
					rs.delReserve();
					break;
				case 5:
					play();
					break;					
				case 6:
					System.out.println("시스템을 종료합니다.");
					continue;
					default:
						System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
						continue;
					
				}
			}
		}
		
		/**
		 * 행복 정보 및 예약
		 */
		public static void happy() {
			int menu = 0;
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			MemberService service = new MemberService();
			SeatHappy rs = new SeatHappy();
			
			while(true) {
				System.out.println();
				System.out.println("행복 공연 정보<1>, 예약<2>, 예약 조회<3>, 예약 취소<4>, 이전 화면<5>, 끝내기<6>");
				System.out.println();
				
				menu = Integer.parseInt(scanner.nextLine());
				
				switch(menu) {
				case 1:
					service.getPlay5();
					break;
				case 2:
					rs.reservation();
					break;
				case 3:
					rs.showReserve();
					break;
				case 4:
					rs.delReserve();
					break;
				case 5:
					play();
					break;					
				case 6:
					System.out.println("시스템을 종료합니다.");
					continue;
					default:
						System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
						continue;
					
				}
			}
		}
		
	/**
	 * 회원 관리 시스템(관리자 전용)
	 */
	public static void manage() {
		int menu = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		MemberService memberService = new MemberService();
		
		
		while(true) {
			System.out.println();
			System.out.println("----회원 관리 시스템----");
			System.out.println();
			System.out.println("로그인<1>, 회원가입<2>, 종료<3>");
			System.out.println("-------------------------------------------");
			System.out.print("어떤 메뉴를 이용하시겠습니까? ");
			
			menu = Integer.parseInt(scanner.nextLine());
			
			switch(menu) {
			case 1:
				memberService.Login();
				break;
			case 2:
				memberService.MemberJoin();
				break;
			case 3:
				System.out.println("시스템을 종료합니다.");
				continue;
				default:
					System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
					continue;
		}
	}
	
}
	
		/**
		 * 관리자 전용 시스템
		 */
		public void adminmange() {
			int menu = 0;
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			MemberService memberService = new MemberService();
			
			while(true) {
				System.out.println();
				System.out.println("관리자 전용 시스템");
				System.out.println();
				System.out.println("전체회원 조회<1>, 예약 현황 조회<2>, 예약 취소<3>, 이전 화면<4>, 종료<5>");
				
				menu = Integer.parseInt(scanner.nextLine());
				
				switch(menu) {
				case 1:
					memberService.SelectMember();
					break;
				case 2:
					situationReserve();
					break;
				case 3:
					cancelReserve();
					break;
				case 4:
					manage();
					continue;
				case 5:
					System.out.println("시스템을 종료합니다.");
					continue;
								
					default:
						System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
						continue;
			}
		}
			
		}
		
		/**
		 * 예약 현황 조회 - 관리자 전용
		 */
		public void situationReserve() {
			int menu = 0;
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			SeatRipper rs1 = new SeatRipper();
			SeatCat rs2 = new SeatCat();
			SeatPoketmon rs3 = new SeatPoketmon();
			SeatNotout rs4 = new SeatNotout();
			SeatHappy rs5 = new SeatHappy();
			
			while(true) {
				System.out.println();
				System.out.println("관리자 전용 시스템 - 예약 현황 조회");
				System.out.println();
				System.out.println("뮤지컬 더 리퍼<1>, 옥탑방 고양이<2>, 피카츄의 대모험<3>, 낫아웃<4>, 행복<5>, 이전화면<6>");
				
				menu = Integer.parseInt(scanner.nextLine());
				
				switch(menu) {
				case 1:
					System.out.println("뮤지컬 더 리퍼 예약 현황");
					rs1.showReserve();
					break;
				case 2:
					System.out.println("옥탑방 고양이 예약 현황");
					rs2.showReserve();
					break;
				case 3:
					System.out.println("피카츄의 대모험 예약 현황");
					rs3.showReserve();
					break;
				case 4:
					System.out.println("낫아웃 예약 현황");
					rs4.showReserve();
					break;
				case 5:
					System.out.println("행복 예약 현황");
					rs5.showReserve();
					break;
				case 6:
					adminmange();
					continue;
				default:
					System.out.println("없는 메뉴입니다. 다시 입력해주세요.");	
					continue;
		}
	}
}
		
		/**
		 * 공연 예약 취소(관리자 전용)
		 */
		public void cancelReserve() {			
			int menu = 0;
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			SeatRipper rs1 = new SeatRipper();
			SeatCat rs2 = new SeatCat();
			SeatPoketmon rs3 = new SeatPoketmon();
			SeatNotout rs4 = new SeatNotout();
			SeatHappy rs5 = new SeatHappy();
			
			while(true) {
				System.out.println();
				System.out.println("관리자 전용 시스템 - 예약 취소");
				System.out.println();
				System.out.println("뮤지컬 더 리퍼<1>, 옥탑방 고양이<2>, 피카츄의 대모험<3>, 낫아웃<4>, 행복<5>, 이전화면<6>");
				
				menu = Integer.parseInt(scanner.nextLine());
				
				switch(menu) {
				case 1:
					System.out.println("뮤지컬 더 리퍼 예약 취소");
					rs1.delReserve();
					break;
				case 2:
					System.out.println("옥탑방 고양이 예약 취소");
					rs2.delReserve();
					break;
				case 3:
					System.out.println("피카츄의 대모험 예약 취소");
					rs3.delReserve();
					break;
				case 4:
					System.out.println("낫아웃 예약 취소");
					rs4.delReserve();
					break;
				case 5:
					System.out.println("행복 예약 취소");
					rs5.delReserve();
					break;
				case 6:
					adminmange();
					continue;
				default:
					System.out.println("없는 메뉴입니다. 다시 입력해주세요.");	
					
			
		}
	}		
}		
		
}	
	
	

