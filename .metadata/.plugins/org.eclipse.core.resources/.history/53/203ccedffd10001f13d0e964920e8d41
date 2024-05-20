package com.kosa.sample.quiz;

public class Parent {
	
	public Parent() {
		System.out.println("국어\t 영어\t 수학");
	}
	
//	-------------------------- 단일값 사용 : subjectSum_형섭()
	static int korSum;
	static int engSum;
	static int mathSum;
	
	public Parent(int kor, int eng, int math) {
		//this(); 
		korSum  += kor;
		engSum  += eng;
		mathSum += math;
		System.out.println(kor + "\t" +  eng + "\t" +  math);
	}
	
	public static String subjectSum_형섭() {
		String msg = "국어" +  korSum + "\t 영어" +  engSum + "\t수학" +  mathSum;
		return msg;
	}
	
//	-------------------------- int[] 배열 사용 : subjectSum_승윤(int[][] scoreSum) 
	private static int[][] scoreSumArr = new int[2][3];
	private static int userCount = 0;
	
	public Parent(int[] scores) {
		scoreSumArr[userCount] = scores;   // --> scoreSumArr[0] = {100,90,80};
		userCount++;
	}
	
	public static String subjectSum_승윤() {
		int ksum =0, esum=0, msum=0;
		// scoreSumArr = {  {100,90,80}, {88,77,66} };
		for(int u=0; u<scoreSumArr.length; u++) {
			ksum += scoreSumArr[u][0];
			esum += scoreSumArr[u][1];
			msum += scoreSumArr[u][2];
		}
		String msg = "국어" +  ksum + "\t 영어" +  esum + "\t수학" +  msum;
		return msg;
	}
	
	
//	-------------------------- 생성자[] 배열 사용 : subjectSum_재훈(Sukang[] clsArr)
	public static String subjectSum_재훈(Child[] clsArr) {
		int ksum =0, esum=0, msum=0;
		//clsArr = new Sukang[] {  new Sukang(100,90,80) ,  new Sukang(88,77,66) };
		for(int u=0; u<clsArr.length; u++) {
			ksum += clsArr[u].getCkor();
			esum += clsArr[u].getCeng();
			msum += clsArr[u].getCmath();
		}
		String msg = "국어" +  ksum + "\t 영어" +  esum + "\t수학" +  msum;
		return msg;
	}
	
	
}
