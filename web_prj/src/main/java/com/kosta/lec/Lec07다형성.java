package com.kosta.lec;

/** ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 *  다형성 
 *    - (다양한 형태)의 성질
 *    - PC : 자식 인스턴스로 부모타입의 객체에 접근하는 것
 *    - (자식의 클래스에 있는 메서드)들을 제한적으로 사용하면서
        (부모에게도 있는 자식의 메서드:오버라이딩)
        공통의 것을 해야할 때~~!!!!
 *    - 유연성~!!! --> 유지보수용이, 코드가독성, 추가확장용이
 *    
 *    - ★★★ 다(변수,메서드) 부모꺼 호출, 오버라이딩 된것만 자식꺼 호출
 *    - Child  c  = new Child();
 *      Parent p  = new Parent();
 *      Parent pc = new Child();
 *      Child  cp = new Parent();  XXXX
 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 */
class 다형성부모 {
	public int point = 100;
	public void add(int a) {
		System.out.println(a*100);
	}
	public void parentMethod() {
		System.out.println("parentMethod() call");
	}
} 
public class Lec07다형성 extends 다형성부모 {
	public int point = 10;
	@Override
	public void add(int a) {
		System.out.println(a*10);
	}
	public void childMethod() {
		System.out.println("childMethod() call");
	}
	public static void main(String[] args) {
		/**
		 * 변수			: 타입을 따른다
		 *      메서드	: 인스턴스를 따른다
		 * 다형성 메서드   : 타입을 따른다 (부모, 자식-오버라이딩)
		 *  Parent pc  = new Child();  
		 *     pc: 변수 부모꺼
		 *     pc: 메서드 부모꺼, 단 오버라이딩된 메서드는 자식꺼 
		 */
//		1. 자식타입 = 자식인스턴스();
//		Lec07다형성 c = new Lec07다형성();
//		System.out.println(c.point);  //자식 10
//		c.add(8);                     //자식-오버라이딩
//		c.parentMethod();  			  //부모
//		c.childMethod();			  //자식
		
//		2. 부모타입 = 부모인스턴스();
//		다형성부모 p = new 다형성부모();
//		System.out.println(p.point);  //부모 100
//		p.add(5);                     //부모-원본
//		p.parentMethod();             //부모
		
//		3. 부모타입 = 자식인스턴스();  --------------- 다형성
		다형성부모 pc = new Lec07다형성();
		System.out.println(pc.point);  //부모 100
		pc.parentMethod();             //부모
		pc.add(3);					   //자식-오버라이딩
		//pc.childMethod();		       //에러 : 부모에게 없는 메서드		
		    
 	}

}
