package com.kosta.lec;

public class 객체지향 {
	//전역변수
	int num2 = 0;		//인스턴스(화)    변수
	static int num = 0; //클래스(static) 변수
	//메모리에 올리는법 : new, static 근데 메모리 영역이 다름
	/*
	 * static 영역, stack영역, heap영역
	 * static 영역은 정적 메서드와 정적 변수들이 저장되는 영역으로 
	 * 프로그램 시작부터 종료까지 남아있는다.
	 * 
	 * stack영역은 메소드 내의 정의하는 기본 자료형 변수(int,double,long, 등)의 데이터값 저장
	 * 호출될때 할당되고 종료될때 메모리 해제
	 * 참조형 타입 변수는 참조값만 저장
	 * 후입선출
	 * 
	 * heap영역은 참조형 데이터 타입을 갖는 객체, 배열등이 저장
	 * 클래스 변수를 생성하여 객체를 만들 때 변수는 스택영역에서 실제 데이터가 저장된 heap영역의 참조값
	 * 인스턴스 실제 데이터의 heap영역에 올라간다.
	 * static메서드에서 외부 인스턴스 멤버에 접근 불가능하다.
	 */
	
	//클래스(static) 메서드
	public static void main(String[] args) {
		//지역변수
		//int num = 0;
		객체지향 rv = new 객체지향();
		System.out.println(rv.num2); // 참조변수 레퍼런스 베어리어블
		System.out.println(num);
		
		//오버로딩 : 메서드의 이름은 같고 매개변수의 유형과 개수가 다르도록 하는 것
		//오버라이딩 : 자식클래스에서 부모클래스의 메서드를 재정의
	}

}
