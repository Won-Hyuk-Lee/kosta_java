package com.kosta.lec;

public class Quiz01변수연산자 {

	public static void main(String[] args) {
		
		//--------------------------------------------------
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
				
		
		//--------------------------------------------------
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 의 문자코드는
		
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		
		//--------------------------------------------------
		int score = 70;
		char grade = '\u0000';
		if (score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		System.out.println(grade); //오버로딩
		

//		emp
//		empno, ename, sal
//		-----------------------------
//		ename varchar2(10) not null,
//		insert into emp values(1, null, 100);
//		insert into emp values(1, '', 100);
//		insert into emp(empno, sal) values(1, 100);
		
		
		
	}

}
