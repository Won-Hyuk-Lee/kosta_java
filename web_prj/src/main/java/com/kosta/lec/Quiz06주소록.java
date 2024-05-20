package com.kosta.lec;

import java.lang.*;
import java.util.Scanner;

public class Quiz06주소록 {

//	public class Scanner {
//		Scanner(PrintStream) {  ----  }
//	}
	
	public static void main(String[] args) {
		//for(초기화; 조건문; 증감문) { 
        //	   //TODO
	    //}
		//----------------------------------
		//초기화;
		//while(조건문) {
		      //TODO
		      //(증감문)
	    //}
		//----------------------------------
		//초기화;
		//do {
		      //TODO
		      //증감문
	    //} while(조건문);
		
//		String str1 = "abc";
//		String str2 = "abc";
//		
//		String str3 = new String("abc");
//		String str4 = new String("abc");

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("이름:");
			String name = sc.nextLine();
			if(name.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.print("전화번호:");
			String age = sc.nextLine();
			System.out.println(name + "\t" + age);
		};
		
		System.out.println("---done---");
//		------------------------------------------------
//		//캐스팅 ::   참조타입 String --> 기본타입 int 
//		int numAge = Integer.parseInt(age);
//		System.out.println(numAge+2);
//		------------------------------------------------
//		//위 두줄과 동일한 결과
//		int num = sc.nextInt();
//		System.out.println(num+2);
//		------------------------------------------------
		

	}

}
