package com.kosta.lec;

class Lec07부모클래스 {
	public void div() {  }
}

public     class     Lec07인터페이스자식 extends    Lec07부모클래스
                                      implements 인터페이스부모1, 인터페이스부모2  {
    	/**
	//상속 : implements Lec07인터페이스 --> (1개 추상메서드 add())
	//                 Lec07인터페이스 extends 인터페이스부모1, 인터페이스부모2
	//  인터페이스부모1(2개 추상메서드), 인터페이스부모2(1개 추상메서드)
	// 반드시 오버라이딩 해야 하는 메서드는 1개 + 2개+ 1개 --> 총 4개 
	*/
	//@ annotation 어노테이션 
	//@Override
	//public void add() { }
		
	@Override
	public void inter1ParentMethod1() {}

	@Override
	public void inter1ParentMethod2() {}

	@Override
	public void inter2ParentMethod1() {}
	

	public static void main(String[] args) {
		
	}

}	
