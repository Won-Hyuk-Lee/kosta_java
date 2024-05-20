package com.kosta.lec;
/**
 * abstract (추상,미완성) 
 * Pclass Cclass1 Cclass2...
 *    구조적 : 다른 클래스들이 Pclass의 [자손으로 관리]가 되어질 필요가 있는 경우
 *    기능적 : 다른 클래스들이 Pclass에서 제공되는 (nomalMethod() 공통 기능의 메서드를) 사용하되.
 *                                         (absMethod() 일부 메서드는 [각자가 기능구현]해야 되는 경우
 *                                        
 *  - 클래스	: 인스턴스 생성 불가(new 못함)
 *          : abstract 메서드가 있을 수~~~도 있다.
 *          : 부모의 일반메서드 메서드를 사용하고 싶으면 : 자식new.부모일반메서드()
 *          : 부모의 추상메서드 메서드를 사용하고 싶으면 : 반드시 오버라이딩 자식new.자식오버라이딩메서드()
 *  - 메서드	: 바디가 없는 메서드    
 */
public abstract class Lec07추상 {
	//abstract public void absMethod(); --> 가능 그러나 비추!!
	

	//추상메서드
	public abstract void absMethod();
	public abstract void absMethod2();
	public abstract void absMethod3();
	public abstract void absMethod4();
	//인스턴스 메서드
	public void nomalMethod() {
		System.out.println("Parent nomalMethod() call");	
	}
	//클래스 메서드
	public static void staticMethod() {
		System.out.println("Parent staticMethod() call");
	}
}
