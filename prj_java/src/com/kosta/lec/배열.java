package com.kosta.lec;

public class 배열 {

	public static void main(String[] args) {

		//배열(array) : 타입이 [같은] 변수 [여러개]를 사용
		//변수선언
//		int num1;
//		System.out.println(num1);  //선언 후 초기화 없이 사용하면 에러
		int num1 = 10;
		System.out.println(num1);
		
//		배열(변수) 선언
//		int[] num;
//		기본값(default)으로 초기화
		int[] num = new int[3]; 
		System.out.println(num[0]);   //배열의 접근은 인덱스(index) 0부터
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		System.out.println("num.length:"+ num.length);
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		int[] numArr0  = new int[3];           //-------------
		int[] numArr1  = new int[ ] {0,0,0};
		
		
		int[] numArr2  = new int[ ]{10,20,30};
		int[] numArr3  =           {10,20,30};  //-----------
		
//		int 배열변수[3]개 명시 후 {10,20,30}값 3개 초기화
//		int[] numArr4  = new int[3]{10,20,30};
//		int[] numArr4  = new int[ ]{0,0,0}{10,20,30};  ?????
		
//		선언 후 라인바꿈 후 값을 초기화하면 에러 --> new 없음
//		int[] numArr2;
//		numArr2 = {10,20,30};
		
		int[] dan = new int[]{2,4,6,8};  
		int[] gob = new int[9];   //{0,0,0,0,0,0,0,0,0};
//		System.out.println(dan[0]);
//		System.out.println(dan[1]);
//		System.out.println(dan[2]);
//		System.out.println(dan[3]);
		for (int i=0; i<dan.length; i++) {
			System.out.println(dan[i]+"단");
			for (int j=0; j<gob.length; j++) {
				gob[j] = j + 1;
				System.out.print(dan[i]+"*"+gob[j]+"="+ (dan[i]*gob[j]) +"\t");
			}
			System.out.println();
		}
		
		//다차원  1차[]   2차[][]   n차[][][]...[] 
		//2행3렬
//		int[][] score  = new int[2][3];
		int[][] score  = new int[][] { 
									    {100, 70, 80},
			                            {99 , 88, 77}  
								     };
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print(score[i][j] + "\t");
//			}
//			System.out.println();
//		}							     
		System.out.println(score.length);    //행 : 2 
		System.out.println(score[0].length); //열 : 3
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[0].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}	
		
		// 2 3 4
		//int score2[][][] = new  

		//int[] arr[] = new int[3][];//가변배열

	}

}
