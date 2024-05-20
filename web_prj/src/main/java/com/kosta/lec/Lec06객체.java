package com.kosta.lec;
/** 
 * 	인스턴스			: 변수/메서드 --> new
 *  클래스(static)	: 변수/메서드 --> static
 *  메모리에 올라간다==인스턴스화==주소가있다==참조가능(쓸수있다) : new, static
 */



public class Lec06객체 {

	//전역변수
	       int iv = 0;  //인스턴스(화 new) 변수
	static int cv = 0;  //클래스(static)  변수
	
	/**
	 * 오버로딩(over loading) : (하나의 클래스)에서 메서드 복붙해서 
	 * 1: 메서드 이름		을 같게 	해라
	 * 2: 괄호를 다르게 해라(파라미터의 타입or개수), 
	 * "메서드의 괄호안에 들어간 변수"==매개변수==아규먼트==파라미터==인자
	 */
	//인스턴스(화 new) 메서드
	public         void main(String[] args, int a) {
		// iv는 인스턴스변수 , main은 인스턴스 메서드는 --> new --> 클래스의 객체를 만들어서 참조변수.iv 호출 
		// cv는 클래스(static)변수 --> static(실행시점에 메모리에 상주) --> 클래스.cv 호출   
		//                      --> new                         --> 참조변수.cv 호출
		System.out.println(iv);
		System.out.println(cv);
		System.out.println("인스턴스 main 메서드");
	}
	
	//클래스(static) 메서드
	public static void main(String[] args) {
		//System.out.println(iv);
		System.out.println(cv);
		
		//지역변수
		int num = 0;
		System.out.println(num);
		
		/**
		// ---------------------------------------------------------
		// 에러 : int iv = 0,   static void main...()
		// ---------------------------------------------------------
		// iv:인스턴스변수는  클래스(static)메서드에서는 호출 불가
		// System.out.println(iv); //에러
		//
		// ---------------------------------------------------------
		// 해결 : iv:인스턴스변수를 호출하려면 클래스의 객체를 만들어서 참조변수.iv 호출 
		// ---------------------------------------------------------
		// Lec06객체 rv = new Lec06객체();
		// System.out.println(rv.iv);  //참조변수
		*/
		Lec06객체 rv = new Lec06객체();
		System.out.println(rv.iv);        //인스턴스변수:참조변수.iv
		System.out.println(Lec06객체.cv);  //클래스변수  :클래스명.cv
		System.out.println(cv);			  //클래스변수  :(클래스명)cv
	}

}
