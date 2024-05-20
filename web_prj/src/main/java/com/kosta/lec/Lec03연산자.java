package com.kosta.lec;

public class Lec03연산자 {
	//변수
	//메서드
	int point = 100;
	
	
	//main 메서드 : 진입점
	public static void main(String[] args) {
		boolean status = true;
		System.out.println(!status); //부정

		int num = 3;
		System.out.println(++num);  //증감연산
		
		num = 5; 
		System.out.println(num/2);  //몫
		System.out.println(num%2);  // 나머지
		
		//대입연산자
		int a = 10;
		int res = a + 5;
		System.out.println(res);
		
		int b = 10;
		//b = b + 5;
		b += 5;
		System.out.println(b);
		
		
		
		// 비교연산    대입 =    같다 ==    다르다 !=
		int num1 = 10;
		int num2 = 20;
		if (num1 != num2) {
			System.out.println("다르다");
		} else {
			System.out.println("같다");
		}
		
//		//에러 에러  ---- {} 사용 습관화
//		if (num1 != num2)
//			System.out.println("다르다");
//			System.out.println("끝");
//		else 
//			System.out.println("같다");
		
		
		//++a
		//a + b
		//삼항연산
		// ____타입  변수 = (조건식) ? ___ : ___ ;
		String ans = (num1 != num2) ? "다르다" : "같다";
		System.out.println(ans);
		
		
//		char grade = 'B';
//		int score = (grade == 'A') ? 90 : 80 ;	
//		System.out.println(score);
		
		char grade = 'B';
		int score = (grade == 'A') ? 90 :    (grade == 'B') ? 80 : 0 ;	
		System.out.println(score);
		
		
		// 상수는 대문자 변수명 사용
		// 초기화 값을 넣으면 이후   재할당(다른값넣기) 불가
		// final 예약어는 이후 값 변경 불가를 의미
		final int MAX = 100;
		//MAX = 200;  //재할당 시도 --- 에러  
		
		int rssss = MAX + 20;
		System.out.println(rssss);
		
		
		//증감(전위)
		int i = 5;
		int j = 0;
		j = ++i;   //i값을 ++한다       이후  j에 넣는다
		System.out.println(i + "," + j);   // 6 6
		
		//증감(후위)
		int k = 5;
		int m = 0;
		m = k++;    //k값을 m에에 넣는다  이후 k를 ++ 
		System.out.println(m + "," + k);   //5 6
		
		byte b1 = 10;
		byte b2 = 20;
		//byte char short 가감산 연산 시 내부적으로  int 변환 후 연산 --> 결과는 int
		//byte res2 = b1 + b2;  	//에러
		byte res2 = (byte)(b1 + b2);
		int  res3 = (byte)b1 + b2;  //에러  byte + int = int
		
		// 비트연산 : 1 0 비교
		// &(and)  | (or)  ^(xor)
		
		// 논리연산 : true false 비교
		// &&(and)  || (or)
		//sal>2000 || ename='smith'
	

		// -------------------------- 퀴즈 삼항연산 양수 음수 0 출력
		num = 10;
		String ans2 = (num>0)? "양수" : (num==0)? "0" : "음수";
		System.out.println(ans2);
		
		
		// -------------------------- 퀴즈
		// 백의 자리만 남기고 출력  
		// 예) 456 --> 400     123 --> 100
		int quizNum2 = 456;
		int quizNum2X = quizNum2 - (quizNum2 % 100);
		System.out.println("3-4 : " + quizNum2X);
		
		int num3 = 456;
        num3 -= 56;   //(quizNum2 % 100)
        System.out.println(num3);
        
        num = 456;
		int rem = num % 100;
		num -= rem;
		System.out.println(num);
		
		
		int tn = 456;     				 	//456.0 --> 4.56f
		int t = (int) ((float)tn * 0.01f);  //4
		System.out.println(t * 100);  		//400
		
		
		num3 = 456;
		int ans3 = (num3 / 100) * 100;
		System.out.println(ans3);
	
	}
}
