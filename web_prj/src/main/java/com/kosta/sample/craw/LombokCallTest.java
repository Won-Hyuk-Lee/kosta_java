package com.kosta.sample.craw;

public class LombokCallTest {

	public static void main(String[] args) {
		NewsVO nvo = new NewsVO();
		nvo.setTitle("이건제목");
		
		String title = nvo.getTitle();
		System.out.println(title);

	}

}
