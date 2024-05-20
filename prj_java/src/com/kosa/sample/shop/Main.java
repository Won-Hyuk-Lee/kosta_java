package com.kosa.sample.shop;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		HashMap<String, String> emp = new HashMap<String, String>();
		
		emp.put("empno", "7733");
		emp.put("ename", "smith");
		emp.put("sal", "600");
		
		list.add(emp);
		
		for(int i =0;i<list.size();i++) {
			String a = list.get(i).get("empno");
			String b = list.get(i).get("ename");
			String c = list.get(i).get("sal");
			System.out.println(a+ " " + b + " " + c);
		}
	}

}
