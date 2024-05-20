package com.kosta.lec;

public class Lec05배열 {

	public static void main(String[] arg) {
		//java Lec05배열    "10"    "20"
		//실행  .class      arg[0]  arg[1]
		System.out.println(arg[0] + ","+  arg[1]);
		
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
				
		
//		String name = "abc";
//		String[] name2 = {"abc"};
//		String[] name3 = new String[] {"abc"};
//		String[] name4 = new String[1];
//		String[] name5 = new String[] {new String("abc")};
		
		
		
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
				gob[j] = j + 1;  //---------------------****
				System.out.print(dan[i]+"*"+gob[j]+"="+ (dan[i]*gob[j]) +"\t");
			}
			System.out.println();
		}
		
		int   ss  = 10;
		int[] sss = {10,20,30};
		
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
		
		// 2 3 4  score[0][0][0].length
		int[] dailyByPointUserCardAtColdSilverGrade[];

//		-------------------------------------------------		
//		-----------------퀴즈) 배열 변수
//		a. int[] arr[];
//		c. int[] arr = new int[5];
//		b. int[] arr = new int[]{1,2,3,};
//		b. int[] arr =          {1,2,3,};
//		f. int[] arr[] = new int[3][]; //가변배열
//
//		d. int[] arr = new int[5]{1,2,3,4,5};
//		e. int[5] arr;
//		
		
//		-------------------------------------------------		
//		-----------------퀴즈) 총합
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		for(int i=0; i<5; i++) {
//			//sum = sum + arr[i];
//			sum += arr[i];
//		}
//		System.out.println("sum="+sum);

//		-------------------------------------------------		
//		-----------------퀴즈) 총합, 평균
//		int[][] arr = { { 5, 5, 5, 5, 5}, 
//						{10,10,10,10,10}, 
//						{20,20,20,20,20}, 
//						{30,30,30,30,30} 
//					  }; 
//		int total = 0; 
//		float average = 0; 
//		int cnt = 0;
//		for(int i = 0; i<arr.length; i++) {
//			for(int j = 0; j<arr[0].length; j++) {
//				total += arr[i][j];
//				cnt++;
//			}	
//		}
//		average = (float)total / cnt ;
//		System.out.println("total="+total); 
//		System.out.println("average="+average);
		
//		-------------------------------------------------
//		int[][] arr = { { 5, 5, 5, 5, 5}, 
//						{10,10,10,10,10}, 
//						{20,20,20,20,20}, 
//						{30,30,30,30,30} 
//					  }; 
//		int total = 0; 
//		float average = 0; 
//		int count = 0;
//		for(int i=0;i<arr.length;i++) {
//			count = count + arr[i].length;	
//			
//			for(int j=0;j<arr[i].length;j++) {
//				total = total + arr[i][j];
//			}
//		}
//		System.out.println(total);
//		
////		for(int k=0;k<arr.length;k++) {
////			count = count + arr[k].length;			
////		}
//		average = (float)total/count; 
//		System.out.println(count);
//		System.out.println(average);  //16.25


//		-------------------------------------------------
//		----- 퀴즈) 큰 금액의 동전을 우선적으로 거슬러 줘야한다
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		int res = 0;
		for(int i=0;i<coinUnit.length;i++) {
			res = money / coinUnit[i];
			System.out.println(coinUnit[i] + "원 : " + res + "개");
			//money = money - (coinUnit[i] * res);	
			money -= (coinUnit[i] * res);
		}
		
//		
//		(32~126) 아스키 코드 출력		--> (32~126) 이외는 오류
//		int inputNum    = 65;      	--> A출력
//		char inputChar  = 'A';		--> 65출력
//		String inputStr = "ABC";  	--> 65 66 67출력
		
		for (int i=32 ; i<=126; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i=32 ; i<=126; i++) {
			System.out.print((char)i + "\t");
		}
		System.out.println();
		
		System.out.println("--------------------");
		int inputNum    = 65;      	//--> A출력
		System.out.println((char)inputNum);
		char inputChar  = 'A';		//--> 65출력
		System.out.println((int)inputChar);
		
		/**
		 String str = "abc";
		 is equivalent to:

		      char data[] = {'a', 'b', 'c'};
		      String str = new String(data);
		*/
		
		//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
		String str1 =           "abc";
		String str2 = new String("abc");
		String str3 = new String("abc");
		char data[] = {'a', 'b', 'c'};
		String str4 = new String(data);
		String str5 = new String(new char[]{'a', 'b', 'c'});
		
		//char   : charAt(i) : str --> char
		String inputStr = "ABC";
		char c = ' ';
		for(int i=0; i<inputStr.length(); i++) {
			c = inputStr.charAt(i);
			System.out.println(c + "," + (int)c);
		}
		
//		String temp = "A";
//		for(int i=0;i<1000; i++) {
//			temp = temp + i;
//		}
		
		//char[] : toCharArray(str) --> char[]
		char[] carr = inputStr.toCharArray();
		c = ' ';
		for(int i=0; i<carr.length; i++) {
			c = carr[i];
			System.out.println(c + "," + (int)c);
		}
	
		
	}

}
