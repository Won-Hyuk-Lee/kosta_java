package com.kosta.lec;
import java.util.HashMap;

public class 맵 {

	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put("age", 30);
		hm.put("job", "개백수");
		hm.put("name", null);
		hm.put("height", 180);

		System.out.println(hm.get("age").getClass());
		int a= (int)hm.get("age");
		System.out.println(hm);
		System.out.println(a);
		
	}
	
	static void Test() {
		System.out.println("1");
	}

}
