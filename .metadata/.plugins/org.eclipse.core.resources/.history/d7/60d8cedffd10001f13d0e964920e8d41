package com.kosa.sample.pkg;

//오버 라이딩(over riding)
//상속관계에서 부모 메서드를 재사용
//접근제한자 : 부모보다 자식은 더 좁은범위를 가질 수 없다. ex 부모 = protected -> 자식은 pulbic or protected
//예외 : 부모 예외 >= 자식 예외 -> 자식이 부모보다 더 많은 예외를 가질 수 없읍니다
class MyParent{
	protected int myPrint(String name, int age) {
		System.out.println("부모" + name);
		return age;
	}
}
public class Child extends MyParent {
	//굳이 복붙해서 오버라이딩 타이핑 한 이유 -> 바디부를 바꾸겠다.
	public int myPrint(String name, int age) {
		System.out.println("자식" + name);
		System.out.println("111");
		return age;
	}

	public static void main(String[] args) {
		MyParent m = new MyParent();
		Child c = new Child();
		c.myPrint("test", 0);
		m.myPrint("test", 1);
	}

}
