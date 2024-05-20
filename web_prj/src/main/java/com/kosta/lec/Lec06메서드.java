package com.kosta.lec;

public class Lec06메서드 {
	
	
	/**
	// void 메서드는 return이 없다. 
	// void res = myPrint("hello");  <------ 에러
	//            myPrint("hello");  <------ 정상
	*/
	public static void myPrint(String prm) {
		System.out.println(prm);
		//return;
	}
	//오버로딩 :: 메서드 정의(준비)
	public static void main(int args)         //---- 헤더
	{										  //---- 바디 between { and }
		System.out.println("오버로딩 main");
		
	}
	public static void main(String[] args) {
		//메서드 호출 == 메서드를 가져다 쓰겠다
		main(7);       //static method -- static method 
		
		myPrint("hello");
		
		
		//add(1,8);  ---------에러에러----- static method -- instance method 
		//add() 메서드에 static 붙이는 방법
		//클래스 참조변수(new).add()
		Lec06메서드 rv = new Lec06메서드(  );
		int callRes = rv.add(1, 8);
	  //int callRes = 9;
		System.out.println(callRes);
		
		System.out.println(rv.add(1, 8)); //비추 : 1회성 출력 후 
	}
	public        int add(int a, int b) {
		int res = a + b;
		return res;
	}
	
	

}
