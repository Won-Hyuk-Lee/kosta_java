package com.kosta.lec;

public class Lec04반복문 {

	public static void main(String[] args) {
		
/** 		
	초기화 int i = 0
	조건문 i<=3
	증감문 i++    i = i+1   i += 1  
	
	for(초기화 ; 조건문 ; 증감문 ) {
		
	}
	
	초기화;
	while(조건문) {
		증감문;
	}
	
	초기화;
	do  {
		증감문;
	} while(조건문);
*/		

			
//		----------------------
//		int i = 0;	
//		for(    ;   ;    ) {
//			if (i<=3) {
//				System.out.println(i);
//			} else {
//				break;
//			}
//			i++;
//		}
		

//		----------------------------------
//		for(int i = 0; i<=3 ;i++) {
//			System.out.print(i + "\t");
//		}
		
		
//		----------------------------------
//		int i = 0;
//		while(i<=3) {				
//			System.out.println(i);
//			i++;
//		}
		
		
		
//		----------------------------------
//		int i = 0;
//		do {
//			System.out.println(i);   //0      1    2     3 
//			i++;                     //0++    1++  2++   3++
//			                         // 1     2     3    4 
//		} while(i<=3);               // 1<=3  2<=3  3<=3 4<=3
		
		
//		------------------------- 퀴즈
		// 0부터 시작해서 0 2 4 6 8 출력하는 프로그램 작성
		// System.out.print(i + "\t");
		

		
//		//무한루프
//		for(;;) {
//			//
//		}
//		
//		while(true) {
//			//
//		}
//		
//		do {
//			//
//		} while(true);
		

		
		//int i =0;
		for(int i =0; i <=8; i+=2) {
			System.out.print(i + " ");
			//i+=2
		}
		System.out.println("\n");
		
//		while
		int i = 0;
		while(i<=8) {
			System.out.print(i + " ");
			i+=2;
		}
		System.out.println("\n" + i);
		
		
//		do while
		i = 0;
		do {
			System.out.print(i + " ");
			i+=2;
		} while (i <= 8);
		
		
//		#####################################
		
		//for
		for(int num = 0; num<5; num++) {  
			System.out.println(num*2); //0 1 2 3 4 
		}
		
		// while
		int num = 0;
		while(num<=4) {
			System.out.println(num*2);
			num++;
		}

		// do while
		num = 0;
		do {
			System.out.print(num*2+"\t");
			num++;
		}	while(num<=4);
		
		System.out.print("abc" + "\n");	
		
		
		
		
			
	}
	
	
	
	
	
	
	
	
	

}
