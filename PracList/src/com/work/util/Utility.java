package com.work.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/**
 * <pre>
 * -- 공통으로 사용하는 메서드를 위한 유틸리티 클래스
 * -- 모든 메서드는 객체생성 없이 사용가능 Class Method 선언(static method)
 * </pre>
 * @author 최낙원
 *
 */
public class Utility {
	
	public static String getCurrentDate() {
		return getCurrentDate("yyyy.MM.dd");
	 }
	
	public static String getCurrentDate(String pattern) {
		return getCurrentDate(pattern, Locale.KOREA);
	}
	
	public static String getCurrentDate(String pattern, Locale locale) {
		return new SimpleDateFormat(pattern, locale).format(new Date());
	}
	
	  public static void main1(String[] args) {
		  
		  System.out.println(Utility.getCurrentDate());
	      System.out.println(Utility.getCurrentDate("MM-dd-yyyy"));
	      System.out.println(Utility.getCurrentDate("MM/dd/yyyy [a] hh:mm"));
	      System.out.println(Utility.getCurrentDate("MM/dd/yyyy [a] hh:mm", Locale.KOREA));
	      System.out.println(Utility.getCurrentDate("MM/dd/yyyy [a] hh:mm", Locale.US));
	      System.out.println(Utility.getCurrentDate("HH:mm"));
	      System.out.println(Utility.getCurrentDate("[a]hh:mm"));
	      System.out.println(Utility.getCurrentDate("[a]hh:mm", Locale.US));
		  
	      int mileage = 1234567;
	      NumberFormat numberFormat = NumberFormat.getInstance();
	      NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance();
	      NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.US);
	      
	      System.out.println(numberFormat.format(mileage));
	      System.out.println(numberFormat2.format(mileage));
	      System.out.println(numberFormat3.format(mileage));
	  }
	  
	  
	  public static void main(String[] args) {
		  /**
		   * 미션 1
		   */
		  int mileage = 1234567;
		  DecimalFormat df = new DecimalFormat("###,###");
		  String money = df.format(mileage);
		  System.out.println(money);
		  
		  /**
		   * 미션 2
		   */
		  int mileage2 = 12345678;
		  DecimalFormat d2 = new DecimalFormat("###,###");
		  String money2 = d2.format(mileage2);
		  NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		  System.out.println(numberFormat.format(mileage2));
		  
		  /**
		   * 미션 3
		   */
//		  String Id = "nakwon5555";
//		  Id = Id.replaceAll("[2:]", "*");
//		  System.out.println(Id);
//		  System.out.println(Id.length());
		  
		  StringBuffer buffer1 = new StringBuffer("01047327784");
		 // int i = Integer.parseInt("nakwon3345");
		  buffer1.replace(2, 5, "*");
		  
		  /**
		   * 미션 5
		   */
		  Random random = new Random();
		  
		  StringBuilder buffer = new StringBuilder();
		  buffer.append(random.nextInt(10)).append(random.nextInt(10))
		  .append(random.nextInt(10)).append(random.nextInt(10));
		  
		  System.out.println(buffer);
		  
		  /**
		   * 미션 6
		   */
		  String Pw = "123456";
		  System.out.println(Integer.parseInt(Pw));
		  
		  /**
		   * 미션 7
		   */
		  for(int i = 0; i < 100; i++) {
			  double value = Math.random();
			  char Alpa = (char)((value * 26) + 65);
			  char alpa = (char)((value * 26) + 97);
			  
			  System.out.print(Alpa);
			  System.out.print(alpa);
			
			 
		  }
		
	}
	  	  
}//

