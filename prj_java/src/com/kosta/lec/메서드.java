package com.kosta.lec;

public class 메서드 {

	public static void main(String[] args) {
		메서드 rv = new 메서드();
		int callback = rv.add(1,8,2);
		
		System.out.println(callback);
	}
	
	public int add(int a, int b) {
		int res = a+b;
		return res;
	}
	
	public int add(int a, int b, int c) {
		int res = a+b+c;
		return res;
	}
	


}
