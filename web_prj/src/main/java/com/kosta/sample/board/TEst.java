package com.kosta.sample.board;

public class TEst {

	public static void main(String[] args) {
		String original = "test ? test1 ? test2 ? test3 ? test4 ? test5";
        String data1 = "apple";
        String data2 = "banana";
        String data3 = "cherry";

        // ?를 데이터로 대체
        String replaced1 = original.replaceFirst("\\?", data1);
        String replaced2 = replaced1.replaceFirst("\\?", data2);
        String replaced3 = replaced2.replaceFirst("\\?", data3);
        String replaced4 = replaced3.replaceFirst("\\?", "테스트");
        String replaced5 = replaced4.replaceFirst("\\?", "되나?");

        System.out.println(replaced5);
	}

}
