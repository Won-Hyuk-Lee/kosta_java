package com.kosta.lec;

/**
 * 인터페이스는 [공통의 메서드]를 모아두고 [부모 역활]이 목적
 * 인터페이스는 main()을 만들 수 없다 == 실행의 목적이 아님 == 부모가 되려는 목적
 *  - 다형성의 장점 모두 수용
 *  - 관계 없는 클래스를 연결해서 구조적으로 관리가 용이, 유지보수편리, 확장용이
 *  
 * abstract		:    추상 (일반메서드(공통), 추상메서드(반드시각자구현))
 * interface	: 완전추상 (               추상메서드(반드시각자구현))
 *  - 변수  : static final	상수만을 갖는다   
 *  - 메서드 : abstract     	추상 메서드만을 갖는다
 *  - [인터페이스]다중상속가능  : 자식인터    extends 부모인터, 부모인터2
 *    [클래스]   단일상속만가능 : 자식class extends 부모class
 *  - 자식class extends    부모class 
 *             implements 부모인터, 부모인터2                    
 *                 
 */
public interface Lec07인터페이스 extends 인터페이스부모1, 인터페이스부모2 {
	//public void add() {}  --> 바디가 있는 메서드는 절대 사용 불가
	public double PI = 3.14159;    //--> public static final    double PI = 3.14159;
	
	public void add();             //--> public abstract        void add();	
}


interface 인터페이스부모1 {
	public void inter1ParentMethod1();
	public void inter1ParentMethod2();
}

interface 인터페이스부모2 {
	public void inter2ParentMethod1();
}

