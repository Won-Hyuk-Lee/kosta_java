package com.kosta.lec;

public class Quiz03별_루프문제 {

	public static void main(String[] args) {

		//		------------------------------------------		
		//		*****
		for(int i=0;i<5;i++) {
			System.out.print("*");
		}
		System.out.println("-------------------------------------");



		//		*
		//		*
		//		*
		//		*
		//		*
		for(int i=0;i<5;i++) {
			System.out.println("*");
		}
		System.out.println("-------------------------------------");


		//		*****
		//		*****
		//		*****
		//		*****
		//		*****
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------------");


		//		for(int i=0;i<5;i++) {
		//			System.out.println("*****");
		//		}

		//		*
		//		**
		//		***
		//		****
		//		*****
		for(int i=1;i<=5;i++) {
			for(int j=0; j<i;  j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");


		//		*****
		//		****
		//		***
		//		**
		//		*
		for(int i=0;i<5;i++) {
			for(int j=5; j > i;  j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1;i<=5;i++) {
			for(int j=6; j > i;  j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		//by 성근
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if (i>=j) {
					System.out.print("*");
				} 
			}
			System.out.print("\n");
		}

		System.out.println("-------------------------------------");


		for(int i=0;i<5;i++) {
			//공백
			for(int j=4; j > i;  j--) {
				System.out.print(" "); //4-0 3-0 2-0 1-0 
			}
			//별
			for(int s=0; s < (i+1);  s++) {   //0 < (0+1)
				System.out.print("*");
			}
			System.out.println();
		}
//		-------------------------------------------------------------------------------
		//by 정현
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.out.print("★");
			}
			System.out.println();
		}
//		-------------------------------------------------------------------------------
		//by 형섭
		for(int i = 4; i > -1; i--) {      //i 4 3 2 1 0
			for(int j = 0; j < 5; j++) {   //j 0 1 2 3 4
				if(j < i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

//		-------------------------------------------------------------------------------
		//		by 진우
		//	     *
		//	    ***
		//	   *****
		//	  *******
		//	 *********

		int star = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k+=1) {
				System.out.print("*");
			}
			star = star + 2;
			System.out.println();
		}
//		-------------------------------------------------------------------------------
		
		//		by 정현
		//	     ★
		//	    ★★★
		//	   ★★★★★
		//	  ★★★★★★★
		//	 ★★★★★★★★★
		//	 

		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i*2;k++) {
				System.out.print("★");
			}
			System.out.println();
		}

//		-------------------------------------------------------------------------------
		//		by 재훈
		//		********* 
		//		 *******  
		//		  *****   
		//		   ***    
		//		    *     
		
		int MAX = 5;
		int half = MAX-1;
		for(int i = MAX; i > 0; --i) {
			for(int j = 0; j < MAX * 2; ++j) {
				int start = half - i;
				int end = half + i;
				
				if(start < j && j < end) 
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.println();

		
//		-------------------------------------------------------------------------------
//		by 원혁	: 입력받아 출력	
//		   *
//		  ***
//		 *****
//
//		 리버스 센터 별찍기
//		 *****
//		  ***
//		   *
		
		int num = 10; // 센터 별찍기
		for (int i = 0; i < num; i++)
		{
			for (int j = 0; j < num - i - 1; j++) //빈칸출력
			{
				System.out.print(' ');
			}

			for (int k = 0; k < 2 * i + 1; k++) // 각 행은 2N+1개 만큼 출력
			{
				System.out.print('*');
			}
			System.out.println("");
		}

		System.out.println();
		System.out.println("리버스 센터 별찍기");

		for (int i = 0 ; i < num; i++) //리버스 센터 별찍기
		{
			for (int j = 0; j  < i; j++) //빈칸출력
			{
				System.out.print(' ');
			}

			for (int k = 0; k  < 2 * (num - i) - 1; k++) //별출력
			{
				System.out.print('*');
			}
			System.out.println("");
		}

//		-------------------------------------------------------------------------------
		
//		by 성근
//	    *    
//	    ***   
//	   *****  
//	  ******* 
//	 ********* 
		for(int i = 1;i < 10; i+=2 ) {
			for(int j=9;j>0;j-=2) {
				if(i<j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for(int j=1;j<9;j+=2) {
				if(i>j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
				
			System.out.print("\n");
		}

//		-------------------------------------------------------------------------------

//		by 성진
//	      *
//	     ***
//	    *****
//	   *******
//	  *********    //---		
//	 ***********
//	  *********
//	   *******
//	    *****
//	     ***
//	      *
//	      
		int count = 1;
		int max = 5;
		for(int c=0;c<max; c++) {
			for(int a =max; a>count/2; a--) 
				System.out.print(" ");
			for(int a =0; a<count; a++) 
				System.out.print("*");
			count+=2;
			System.out.print("\n");
		}
		for(int c=0;c<max+1; c++) {
			for(int a =max; a>count/2; a--) 
				System.out.print(" ");
			for(int a =count; a>0; a--) 
				System.out.print("*");
			count-=2;
			System.out.print("\n");
		}
		
		
//		-------------------------------------------------------------------------------
//		by 진우
//		*        *
//		**      **
//		***    ***
//		****  ****
//		**********
//		****  ****
//		***    ***
//		**      **
//		*        *
		/* 10행 10열의 배열 , 조건으로 공백과 별을 번갈아가며 찍음
		 * i,j 와 n은 1부터 시작 i가 10보다 크거나 같을 때 까지 1씩 증가 반복문
		 * 
		 * n+1 <= j <= 10-n의 범위에 공백을 출력 (i은 행, j는 열)
		 * 		(1)+1 <= j(칸) <= 10-(1)  2 ~ 9
		 * 		(2)+1 <= j(칸) <= 10-(2)  3 ~ 8   4 ~ 7    5 ~ 6
		 * 		j(칸)가 n+1한 것 보다 크거나 같고 j(칸)가 10-n 한 것보다 작거나 같음을 모두 만족하면
		 * true로 공백 출력 , 그렇지 않으면 *을 출력
		 * -별 줄이기-
		 * if문 사용 i가 5보다 작으면 n을 늘리고 그렇지 않으면 n을 줄인다.
		 */
		
		// for 중첩으로 나비 만들기
		for (int i = 1, n=1; i <= 10; i++) { //  
			for(int j = 1; j <= 10; j++) { //
				System.out.print(((j >= n+1) && (j <= 10-n))?" ":"*");
			}
			if(i<5) {
				n++;
			} else {
				n--;
			}
			System.out.println();
		}
		
		
		// (1~20까지) 정수 중   (2 또는 3의 배수가 아닌)    수들의 총합
//		int tsum = 0;
//		for (int i=1; i<=20; i++) { 
//			if ( (i%2 !=0) && (i%3 !=0) ) {
//				//tsum = tsum + i;
//				tsum += i;
//			}
//		} 
//		System.out.println(tsum);  //73
		
		// 1+(-2)+3+(-4)+... , 과 같은 식으로 (계속) 더해나갔을 때 몇까지 더해야 
		//총합이 100이상인지
//		----------------------------------	
//		tsum = 0;
//		int i = 1;
//		while(tsum < 100) {
//			if (i%2 == 1) {  //홀수
//				tsum += i;
//			} else {         //짝수
//				//tsum = tsum + (i * -1);
//				tsum += (-i);
//			}
//			i++;
//		}
//		System.out.println(i - 1);
		
		
		// 다음의 for문을 while문으로 변경
		/** 
		for(초기화; 조건문; 증강문) {
			
		}
		
		초기화;
		for( ; ; ) {
			조건문;
			증감문;
		}
		
		초기화;
		while(조건문) {
		    //TODO
		    증감문;
		}
		*/
//		for(int i=0; i<=4; i++) {
//			for(int j=0; j<=i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
//		
//		int i=0;
//		while(i<=4) {
//			int j=0;
//			while( j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력
//		for(int ju1=1; ju1<=6; ju1++) {
//			for(int ju2=1; ju2<=6; ju2++) {
//				int tsum = 0;
//				tsum = ju1 + ju2;
//				if (tsum == 6) {
//					System.out.println(ju1 + "," + ju2);
//				}
//			}
//		}
		
		for(int ju1=1; ju1<=6; ju1++) {
			for(int ju2=1; ju2<=6; ju2++) {
				if (ju1 + ju2 == 6) {
					System.out.println(ju1 + "," + ju2);
				}
			}
		}
		
		
		//-------------------회문
		// 12321 토마토 기러기 인도인 별똥별...
		int number = 131;
		int tmp = number;
		int result = 0; 
		while (tmp != 0) {
		    int digit = tmp % 10; 
		    result = result * 10 + digit; 
		    tmp /= 10; 
		}
		if (number==result) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
	}

}
