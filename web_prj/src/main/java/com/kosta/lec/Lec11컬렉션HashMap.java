package com.kosta.lec;
/**
 *    Collectcion  ------------------ Map
 *    List ArrayList Vector           HashMap 
 *    Set  HashSet
 *    
 *    Map<K,V>
 *    list set map 	: [0,1,2]
	  map   	 	: {key=val, key2=val, key3=val}
	  
	  REST 서비스 JSON(JavaScript Object Notation) -->  { key : val}
	  Python 프로그램 Dictionary(딕셔너리)            -->  { key : val}
	      - Django Flask 프레임워크 
	  Java 프로그램 Map                             -->  {key = val}
 */
 
import java.util.HashMap;

public class Lec11컬렉션HashMap {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("name","abc");
		map.put("age",10);
		map.put("score",'A');
		map.put("score",'B');
		//{score=A, name=abc, age=10}
		System.out.println(map);
		
		System.out.println(map.get("name") + "," + map.get("name").getClass());
		System.out.println(map.get("age") + "," + map.get("age").getClass());
		
		
		
		/** 
		 * ------------------------------------------
		 * 작은	<-- 큰 	: down casting(강제 형변환)
		 * 큰	<-- 작은	: up   casting(형변환 생략가능)
		 *
		 * 레퍼클래스(wrapper class)
		 * int --> Integer 
		 * ------------------------------------------
		 */
		
		String str = (String)map.get("name");
		int  num   = (Integer)map.get("age");
		//int num = (int)map.get("age");
		System.out.println(str + ","+  num);
		
		
		//수정 -------------------------
		// 1. put(기존키값, 변경값) 
		// 2. replace(기존키, 변경값)
		//----------------------------
		map.put("name","zzz");
		//map.replace("name", "zzz");
		//map.replace("name", "abc", "zzz");
		System.out.println("변경후:" + map);
		
		/**
		 * 제네릭(Generic)
		 *  - (컴파일 시) 클래스,메서드 등에서 사용할 데이터 (타입을 미리 지정)하는 방법
		 *  - 컴파일 시 컴파일러가 사전에(구동전에) 타입 체크
		 *    
		 *  타입안정성, 코드가독성, 런타임 시 오버헤드 감소
		 */
		HashMap<String,String> map2 = new HashMap<String,String>();
		map2.put("name"  , "abc");
		map2.put("addr"  , "서울");
		
		//★★★ 제네릭을 사용함으로써 형변환 생략 가능
		//String str2 = (String)map2.get("name");   
		String str2 = map2.get("name");
		
		
		
		
	}

}
