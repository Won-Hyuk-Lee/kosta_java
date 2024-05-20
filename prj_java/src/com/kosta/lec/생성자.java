package com.kosta.lec;

public class 생성자 {
	
	/**
	 생성자(constructor) 함수
	  - 역할
	     인스턴스 초기화 메서드(최초로 클래스의 주소를 만드는 메서드)
	                      (인스턴스(화) 변수의 초기화값 지정)
	  - 자바 문법
	    클래스이름과 동일한 메서드  Lec06();
	    클래스의 인스턴스 생성(t = new 클래스()) 
	    --> t.iv  t.insMethod()
	  - 일반 메서드와 차이점
	    메서드 : 리턴이 없으면 void 타입 
	    생성자 : 리턴이 없어도 void 타입 적지 않는다.
		public void  addNumber() {...}
	              public         Lec06(){ ... }
	 */
	
	int userPoint = 0;  //iv
	
//	생성자 함수도 오버로딩 가능하다
//	public Lec06생성자(  ) { }
//	public Lec06생성자(int userPoint) { }
	
	
//	기본생성자 : ()안에 파라미터가 없다.
//	클래스 내에 (생성자가 하나도 없으면) 컴파일러가 기본 생성자를 만들어준다.
	/**
	 * this() : 생성자 함수
	 * this() : main() 함수에서 사용가능한가??? 안된다
	 * 생성자함수() 안에서는 this() 사용가능, 단 첫줄에
	 */
	public 생성자(  ) {
		//new Lec06생성자(5) == this(5)
		this(5); 
		new 생성자(10);
		add(10,30);
		mul(5,3);
		System.out.println("매개변수가 없는 생성자 : Lec06생성자(  )");
		 
	}
	public        void mul(int n1, int n2) {
		System.out.println("인스턴스 메서드 mul : " + n1 * n2);
	}
	public static void add(int n1, int n2) {
		System.out.println("클래스 메서드 static add :" + n1+ n2);
	}

//	매개변수가 있는 생성자 : ()안에 파라미터가 있다.
//	[인스턴스(화) 변수, 전역변수] vs. [지역변수] : 구분을 위해 this 사용
//	this : 클래스가 인스턴스화 된 주소값
	public 생성자(int userPoint) {
		//this.전역변수  = 지역변수
		this.userPoint = userPoint;	
		System.out.println(this);
		System.out.println("매개변수가 있는 생성자 : Lec06생성자(int userPoint)");
	}
	
	public static void main(String[] args) {
		/**
		//static 메서드 안에서는 this, this() 사용 불가
		//this는 new 생성자함수()를 호출후에 만들어진 주소를 지칭하는 키워드
		//즉: 언제 new 될지 알고 ... 실행시 메모리에 바로 올라갈 static 메서드안에서는 사용 불가
		*/
		//this(50000); 
		//System.out.println(this); 
		//System.out.println(iv);

		//클래스명  참조변수  = new  생성자();
		생성자 bbbb = new 생성자();
		System.out.println(bbbb);
		System.out.println("=================");
//		Lec06생성자 ssss = new Lec06생성자(50000);
//		System.out.println(ssss);
		
		
	}
}
