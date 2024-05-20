package com.kosa.sample.quiz;

public class CallTest {
	
    public static void main(String[] a) {
    	
//    	-------------------------- 단일값 사용 : String subjectSum_형섭()
    	new Child(100,90,80);
    	new Child(88,77,66);
    	String res = Parent.subjectSum_형섭();
    	System.out.println(res);
    	System.out.println();   
    	
//    	-------------------------- int[] 배열 사용 : subjectSum_승윤()
    	int[] temp = new int[]{100,90,80};
    	new Child(temp);
    	new Child(new int[]{88,77,66});
    	String res2 = Parent.subjectSum_승윤();
    	System.out.println(res2);
    	System.out.println();   
    	
//    	-------------------------- 생성자[] 배열 사용 : subjectSum_재훈(Sukang[] clsArr)   	
    	Child[] clsArr = {  new Child(100,90,80, 9999) , 
    						 new Child(88,77,66, 9999) 
    			          };
    	String res3 = Parent.subjectSum_재훈(clsArr);
    	System.out.println(res3);
    	System.out.println();   
	} 
}
