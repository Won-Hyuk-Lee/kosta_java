package com.kosta.lec;

import java.math.BigInteger;

public class Hello {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		System.out.println(Calculator.nplusnminus1(num1));
		System.out.println(Calculator.factorial(num2)); 
		System.out.println(Calculator.minus(num1,num2)); 
		System.out.println(Calculator.sum(num1,num2)); 
		

//		byte a = 10;
//		byte b = 20;
//		int c = a+b;
//		System.out.println(c);
		// 삼항연산자
		int x = -10;
		int absX = x > 0 ? 1 : 0;
		String strX = x > 0 ? "양수" : "음수";
		boolean boolX = x > 0 ? true : false;
		
		//if문 삼항연산자
		String ifX = num1 != num2 ? "다르다" : "같다";
		//삼항연산 무한증식법
		char grade = 'D';
		int gradeX = grade == 'A' ? 90 : (gradeX = grade == 'B' ? 80 : (gradeX = grade == 'C' ? 70 : 60));
		
		//3-3
		int quizNum = -1;
		String quizNumX = quizNum > 0 ? "양수" : (quizNum == 0 ? "0" : "음수");
		System.out.println("정답 : " + quizNumX);
		
		//3-4
		int quizNum2 = 456;
		int quizNum2X = quizNum2 - (quizNum2 % 100);
		System.out.println("3-4 : " + quizNum2X);
		
		//상수는 대문자 변수명 사용
		//초기화 값을 넣으면 이후 재할당 불가능
		// final 예약어는 이후 값 변경 불가를 의미 C#의 Const
		final int MAX = 100;
		// MAX = 200; <- 재할당 시도해도 에러
		
		System.out.println(absX);
		System.out.println(strX);
		System.out.println(boolX);
		System.out.println(ifX);
		System.out.println("grade = " + gradeX);

	}

	public class Calculator {

		// 1부터 n까지의 합을 재귀 함수로 계산
		public static int nplusnminus1(int n) {
			if (n == 1) {
				return 1; // n이 1일 때 탈출
			}
			return n + nplusnminus1(n - 1); // 재귀 호출
		}

		public static int factorial(int n) {
			// 13보다 클 경우 int 범위를 넘으므로 사용불가능 만약 사용하고싶으면 더 높은 숫자 단위를 다루는 BigInteger 사용
			if (n > 12) {
				System.out.println("StackOverFlow");
				return 0;
			} else// 12이하일경우 int형으로 팩토리얼 계산 가능
			{
				if (n == 1) {
					return 1;
				}
				return n * factorial(n - 1);
			}
		}
		
		public static int sum(int n1, int n2) {
			return n1 + n2;
		}
		
		public static int minus(int n1, int n2) {
			return n1-n2;
		}

	}

}
