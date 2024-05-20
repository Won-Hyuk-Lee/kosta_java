package com.kosta.lec;

public class Lec06Calc {
	//----------------------------------------
	public static void main(String[] args) {
		int num;
		String str;
		int[] arr;
		
		String aaaa   =  add("Ab","cc");
		System.out.println(aaaa);
		
		Lec06Calc ttt = new Lec06Calc();
		int    aaaaaa = ttt.mul(5,2);
		System.out.println(aaaaaa);
		
	}
	//-----------------------------------------
	//클래스메서드		add
	public static String add(String s1, String s2) {
		String res = s1 + s2;
		return res;
	}
	//-----------------------------------------
	//인스턴스메서드		mul
	public        int mul(int n1, int n2) {
		int res = n1 * n2;
		return res;
	}
	//-----------------------------------------

}




