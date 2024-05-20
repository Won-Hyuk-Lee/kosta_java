package com.kosta.lec;

class Lec07부모 {
	protected void userCheck(String uid) {
		System.out.println("부모 userCheck()..." + uid);
	}
}

public class Lec07자식 extends Lec07부모 {
	
	/** 오버 라이딩(over riding)
	 * 상속(extends 키워드 유무화인)
	 * 1. 헤더(선언부) : 동일
	 *    바디(내용부) : 동일 or 변형
	 * 2. 접근제어자   : 부모 < 자식
	 * 3. 예외       : 부모(4) > 자식(3)
	 */
	
	protected void userCheck(String uid) 
	{
		System.out.println("자식 userCheck()..." + uid + "**");
	}
	
	
	int    num = 100;
	public float add(float a, float b) {
		return a+b;
	}
	public void myPrint(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		Lec07자식 t = new Lec07자식();
		System.out.println(t.num);

	}

}
