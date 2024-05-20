package com.kosta.lec;

public class 반복문 {

	public static void main(String[] args) {

		
		for (int i = 2; i < 10; i+=2) // 구구단
		{
			for (int j = 2; j < 10; j+=2) {
				System.out.print(i + " X " + j + " = " + i * j + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		for (int i = 0; i < 5; i++) // 별찍기
		{
			for (int j = 0; j < 5; j++) {
				System.out.print('*');
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		for (int i = 0; i < 5; i++) // 직각삼각형 별찍기
		{
			for (int j = 5; j > i; j--) {
				System.out.print('*');
			}
			System.out.println(" ");
		}
		System.out.println(" ");

		for (int i = 0; i < 5; i++) // 리버스 별찍기
		{
			for (int j = 0; j < i + 1; j++) {
				System.out.print('*');
			}
			System.out.println(" ");
		}

		 for (int i = 0; i < 10; i += 2) {
		 System.out.print(i + " ");
		 }
		 System.out.println();
		 int i = 0;
		 while (i < 10) {
		 System.out.print(i + " ");
		 i += 2;
		 }
		 System.out.println();
		 i = 0;
		 do {
		 System.out.print(i + " ");
		 i += 2;
		 } while (i < 10);
		 
		 for (int j = 2; j < 10; j+=2) {
				System.out.print(i + " X " + j + " = " + i * j + " ");
			}
		 
		 
		//quiz.Test();
		int array = 1;
//		for (int i = 2; i < 10; i+=2) // 구구단
//		{
//			for (int j = 2; j <10; j+=2)
//			{
//				if(array == 1 && i == 2)
//				{
//					System.out.print("   "+ i + "단");
//					System.out.println(' ');
//					array = 0;
//				}
//				System.out.print(j + " X " + i + " = " + j * i + " ");
//			}
//			System.out.println();
//		}
		
		 
	}

}
