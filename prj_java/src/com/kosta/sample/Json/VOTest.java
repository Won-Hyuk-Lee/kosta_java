package com.kosta.sample.Json;

/**
//VO : Value Object
//DTO : Data Transfer Object
//Entity 클래스 : 값을 넣고 빼기 위한 용도의 클래스
// getter 꺼내기 setter 넣기

*/

public class VOTest {

	public static void main(String[] args) {
		EmpVO e = new EmpVO(7735, "smith", 3000);

		System.out.println(e.getEmpno());
		System.out.println(e.getEname());
		System.out.println(e.getSal());
		System.out.println(e.toString());
	}

}