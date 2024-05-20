package com.kosta.lec;

import java.util.ArrayList;

//
/*  */
/** */  
// Access Modifier(접근자)
// public (default) protect private

public class Lec01변수  {
	//객체(Object) =~ 인스턴스(instance):메모리에상주
	//변수(variable):값
	//메서드(method):기능
	//함수(function):생성자함수

	// 논리 boolean[1]                            true false
	// 글자           char[2]                     'A'
	// 정수형  byte[1] short[2] int[4]   long[8]
	// 실수형                   float[4] double[8]
	
	static String cv;
	
	public static void main(String[] args) {
		//타입 변수명;      int age;      변수선언
		//타입 변수명 = 값;  int age = 20; 변수선언,초기화(값최초할당)
		//                int age = 30; 초기화 후 다른값(할당)
		
		/**
		 * 지역변수 : 반드시 초기화 후 사용할 것
		 */
//		String name;
//		System.out.println(name);  // 에러에러
		
		String name = "abc";
		System.out.println(name);  // 정상정상
		
		/** 
		 * 전역변수 : 초기화하지 않으면 컴파일 시 기본값으로 자동 초기화
		 */
		System.out.println(cv);   // 정상정상
		
		
		
		int age = 20;
		System.out.println("hello" + age);
		
		long lv = 1000;   				//8byte <-- 4byte
		long lv2 = 1000l; 				//l : 이터럴
		System.out.println(lv+","+lv2);
		
		double dv  = 3.14;
		double dv2 = 3.14d;				//d : 이터럴 표기 불필요
		System.out.println(dv+","+dv2); //★★★★ 실수형의 기본타입은 double
		
		boolean bv  = true;
		boolean bv2 = false;
		// 1 --> 4
		System.out.println(bv);
		
		//where ename = 'smith'
		char cv = 'A';			//한글자
		String sv = "smith";	//두글자이상	
		//String sv = 'smith';
		
		System.out.println("abc\n def\t");
		
		
//		boolean db;					//변수를 선언만하고 초기화하지 않은 상태
//		System.out.println(db);		//해당 변수를 사용하려고 할때
		
		boolean db= true;
		System.out.println(db);		//★★★★ 반드시 초기화 후 사용!!!!!!
		
		//char cv3 = '';   			//에러
		char cv3 = ' ';    			//blank
		
		String str1 = null;		        //ref.타입의 기본값은 null
		String str2 = new String("");	//-------------
		String str3 = "";	            //-------------
		
		//*** any type + "문자열" === 문자열
		boolean bv3 = false;
		System.out.println(bv3);	//bool false
		System.out.println(bv3+""); //문자열 false
		System.out.println(7+7+""); //문자열 14
		
//		byte b = 128;               //-2^7 ~ 2^7  (127)  
//		System.out.println(b);
		byte b = 127;
		System.out.println(b);     //127
		System.out.println(b+1);   //128
		
		int res = b + 1;
		System.out.println(res);     //
		
		//큰타입을 작은 타입으로 강제 캐스팅
		byte res2 = (byte)(b + 1);  // 1 <-- 4 : 
		System.out.println(res2);   //
		
		//★★★★ 큰 타입을 작은 타입으로 변환하는 경우 강제 캐스팅
		//float(4)   <-- double(8)
//		float fv = 3.14;
		float fv = (float) 3.14;
		
		//작은 타입을 큰 타입으로 변환하는 경우 암묵적 캐스팅
		//double(8)   <-- float(4) 
		//double d = 1.4e3f;
		double d = (double) 1.4e3f;
		
		
		//---------------퀴즈 : 출력 결과?
		//1 : ASCII(49)  A:ASCII(65)
		//★★★★ any type + 문자열 = 결과는 항상 문자열 !!!
		System.out.println("1"+"2");  //문자열 12
		System.out.println('J'+"ava");//문자열 Java 
		System.out.println(true+"");  //문자열 true
		
		//★★★★ int보다 작은 타입(byte,char,short)의 덧셈은 내부적으로 int 변환 후 수행
		System.out.println('A'+'B');  //131 = 65+66	
		System.out.println('1'+'2');  //99 = 49+50
		System.out.println('1'+2);    //51 = (49+2)		 
//		System.out.println(true+null); //오류
		
		// 논리 boolean[1]                            true false
		// 글자           char[2]                     'A'
		// 정수형  byte[1] short[2] int[4]   long[8]
		// 실수형                   float[4] double[8]
		//---------------퀴즈 : 형변환 생략 가능한 경우?
		byte bb   = 10;
		char chch = 'A';
		int ii    = 100;
		long ll   = 1000L;
		
		bb       = (byte)ii;    //생략X  1 <-- 4
		chch     = (char)bb;    //생략X  type mismatch  2 <-- 1
		short ss = (short)chch; //생략X  type mismatch  2 <-- 2
		
		float ff = (float)ll;   //생략O  실수형4 <-- 정수형8
		ii       = (int)chch;   //생략O  4 <-- 1
		
	}

}
