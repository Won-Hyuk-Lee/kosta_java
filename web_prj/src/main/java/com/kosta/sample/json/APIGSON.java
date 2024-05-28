package com.kosta.sample.json;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;

public class APIGSON {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("empno", "7733");
		map.put("ename", "smith");
		
		gson.toJson(map);
		
		String mapString = gson.toJson(map);
		System.out.println(mapString + "," + mapString.getClass());
		
		HashMap res = gson.fromJson(mapString, HashMap.class);
		System.out.println(res);
		
		ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
		list.add(map);
		
		String mapString2 = gson.toJson(list);
		System.out.println(mapString2 + " " + mapString2.getClass());
	}

}
