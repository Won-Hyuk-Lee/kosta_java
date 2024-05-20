package com.kosta.lec;

public class Lec08예외2 {
//	----------------------------------------------
	public void myPrint() throws ArithmeticException, Exception {
		System.out.println("11");
		System.out.println("22");
		//예외를 만들어 던진다
		ArithmeticException myExc = new ArithmeticException();
		throw myExc;
	}
	
	public static void wait2() throws InterruptedException {
        System.out.println("wait() call");
    }
	
//	----------------------------------------------	
	public static void main(String[] args) {
		try { 
			wait2();
		} catch(InterruptedException e) {
			System.out.println("잡았음 예외처리했음");
		}
		
		System.out.println("----start----");
		Lec08예외2 t = new Lec08예외2();
		try { 
			t.myPrint();
		} catch(ArithmeticException e) {
			System.out.println("잡았음1....");
		} catch(Exception e) {
			System.out.println("잡았음2....");
		}
		
		System.out.println("myPrint() call done............");
		
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
		} finally {
			System.out.println("try-catch-무조건실행");
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
