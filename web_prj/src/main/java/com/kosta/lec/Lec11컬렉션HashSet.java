package com.kosta.lec;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Set : 중복X, 순서보장X
 */
public class Lec11컬렉션HashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("abc");
		hs.add(10);
		hs.add('A');
		hs.add('A');
		hs.add('A');
		System.out.println(hs);
		
		
		//수정불가 , 기존의 값을 지우고 신규 값으로 입력
		//abc --> zzz
		hs.remove("abc");
		hs.add("zzz");
		System.out.println("수정:" + hs);
		
		hs.remove('A');
		System.out.println("HashSet:" + hs + "," + hs.getClass());
		//hs.clear();
		//System.out.println(hs);
		
		
		//형변환 : Set --> ArrayList
		ArrayList list = new ArrayList(hs);
		System.out.println("ArrayList:" +list + "," + list.getClass()  );
		
		//[10, zzz]
		System.out.println(list.get(0).getClass());  //class java.lang.Integer
		Integer res = (Integer)list.get(0);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
//		Integer res2 = (Integer)list2.get(0);
		Integer res2 = list2.get(0);
		System.out.println("제네릭사용(캐스팅 생략):" + res2);
		
		
		
	}

}
