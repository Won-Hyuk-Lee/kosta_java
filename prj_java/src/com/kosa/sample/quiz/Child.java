package com.kosa.sample.quiz;

public class Child extends Parent {

//	배열 변수 scores : 인스턴스 변수(접근제어자 private)
//	private int[] scores = new int[3];
//	int[] scores = new int[] {0,0,0};
//	int[] scores = {0,0,0};
	
	
	//생성자 : 기본생성자
	public Child() {
		//super();
	}
	
	
//	-------------------------- 단일값 사용 : String subjectSum_형섭()
	//생성자 
    public Child(int kor, int eng, int math) {
    	//super();
    	super(kor, eng, math);	
    }
 
//	-------------------------- int[] 배열 사용 : subjectSum_승윤()
    public Child(int[] scores) {
    	super(scores);
    }
 
    
//	-------------------------- 생성자[] 배열 사용 : subjectSum_재훈(Sukang[] clsArr)   	
    private int ckor;
	private int ceng;
	private int cmath;
	//생성자 
    public Child(int kor, int eng, int math, int dummy) {
    	//super();
    	this.ckor = kor;
  		this.ceng = eng;
  		this.cmath = math;
    }
    public int getCkor() {
		return this.ckor;
	}
	public int getCeng() {
		return this.ceng;
	}
	public int getCmath() {
		return this.cmath;
	}
    
}
