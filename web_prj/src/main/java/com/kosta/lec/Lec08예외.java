package com.kosta.lec;

/**
 * 컴파일 에러
 * 런타임
 *    - Exception : 예외(개발자가 어찌해볼 수 있는)
 *    - Error     : 에러
 *
 * 예외처리 하는 이유?
 *   의도치 않은 문제가 발행했을 때 프로그램을 정상적으로 끝까지 돌려보려는 목적
 *   
 * try {
 *    //[정상]TODO
 * } catch(___Exception e) {
 *    //[예외]처리부
 * } catch(_Exception e) {
 * 
 * } catch(Exception e) {
 * 
 * } finally {
 *    [정상][예외] 무조건 실행
 * }
 */
public class Lec08예외 {

	public static void main(String[] args) {
		int res = 0;
		try {
			//코드라인
			System.out.println("1.try");
			int num = 100;
			res = num / 0;	         //--->문제 코드
			
			//int[] arr = new int[3];
			//int[] arr = new int[] {1,2,3};
			int[] arr   = {1,2,3};
			System.out.println(arr[3]);  //--->문제 코드
			//for (int i=0; i<arr.length; i++) {
			//	System.out.print(arr[i]);
			//}

		} catch(ArrayIndexOutOfBoundsException e)	{
			//예외가 발생했을 경우
			System.out.println("2.catch");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			//개발자 예외처리부 코드라인
		} catch(ArithmeticException e) {	
			//예외가 발생했을 경우
			System.out.println("3.catch");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			//개발자 예외처리부 코드라인
		} catch(Exception e) {
			//예외가 발생했을 경우
			System.out.println("2.catch");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			//개발자 예외처리부 코드라인
		}
		System.out.println();
		System.out.println(res);
		System.out.println("----done----");
	}

}
