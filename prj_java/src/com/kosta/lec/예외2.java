package com.kosta.lec;

public class 예외2 {
	public static void main(String[] args) {
		System.out.println("----start----");
		
		int res = 0;
		try {
			//코드라인
			System.out.println("1.try(/zero)");
			int num = 100;
			res = num / 0;	         //--->문제 코드
		} catch(ArithmeticException e) {	
			//예외가 발생했을 경우
			System.out.println("2.catch");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			//개발자 예외처리부 코드라인
		} catch(Exception e) {
			//예외가 발생했을 경우
			System.out.println("3.catch");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			//개발자 예외처리부 코드라인
		}	
		
		try {
			System.out.println("4.try(배열코드)");
			//int[] arr = new int[3];
			//int[] arr = new int[] {1,2,3};
			int[] arr   = {1,2,3};
			System.out.println(arr[3]);  //--->문제 코드
			//for (int i=0; i<arr.length; i++) {
			//	System.out.print(arr[i]);
			//}

		} catch(ArrayIndexOutOfBoundsException e)	{
			//예외가 발생했을 경우
			System.out.println("5.catch");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			//개발자 예외처리부 코드라인
		} catch(Exception e) {
			//예외가 발생했을 경우
			System.out.println("6.catch");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			//개발자 예외처리부 코드라인
		}
		System.out.println();
		System.out.println(res);
		System.out.println("----done----");
	}

}
