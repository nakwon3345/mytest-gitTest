package com.work.view;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileInputOutputTest {

	public static void main(String[] args) {
		// 키보드 입력
		
		// 키보드 입력 스트림
		BufferedReader in = null;
		PrintWriter out = null;
			
		System.out.println("자기소개 [종료 ctrl+z]");
		// 파일("test.txt") 출력 : 라인단위
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new FileWriter("test.txt", true));
			String data = null;
			
			while((data = in.readLine()) != null) {
				out.println(data);				
			}
			System.out.println("파일이 정상 저장");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			out.close();
		}
		
	}//

}//
