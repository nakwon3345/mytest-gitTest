package com.work.view;

public class IfTest {
	
	public static void main(String[] args) {
		int score = 80;
		String grade = null;
		
		if(score>=0 & score<=100) {
			switch(score/10) {
			case 10:
			case 9:
				grade = "A";
				break;			
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				break;			
			}
		}else{
			System.out.println("입력값 오류");		
		}
		System.out.println(score + " "+ grade);
}	
	public static void main3(String[] args) {
		int score = 90;
		String grade = null;
		
		if(score >= 0 & score<=100) {
			if(score >=90) {
				grade = "A";
			}else if(score >=80) {
				grade = "B";
			}else if(score >=70) {
				grade = "C";
			}else if(score >=60) {
				grade = "D";
			}else {
				grade = "F";
            }	
		}else {
			System.out.println("[오류] 성적은 0~100점 이내 입니다. :" + score);
		} System.out.println(score+"점 " + grade);
}
				
	
	
	public static void main2(String[] args) {
		int score = 90;
		String grade = null;
		
		if(score >= 0 & score<=100) {
			if(score>=90) {
				System.out.println(score + "점" + " A"+"등급");
			}else if(score>=80){
				System.out.println(score + "점" + " B"+"등급");
			}else if(score>=70){
				System.out.println(score + "점" + " C"+"등급");
			}else if(score>=60){
				System.out.println(score + "점" + " D"+"등급");
			}else {
				System.out.println(score + "점" + " F"+"등급");
			}
			
		}else {
			System.out.println("[오류] 성적은 0~100점 이내 입니다. :" + score);
		}
		
		 
	}

	public static void main1(String[] args) {
		
		int score = 65;
		
		if(score>=70) {
			System.out.println(score + "합격");
		}else {
			System.out.println(score +  " 불합격");
		}
		

	}//

}//
