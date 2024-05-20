package com.kosta.lec;

public class Quiz02구구단 {

	public static void main(String[] args) {

		
//		-------------------------------------------------------------
//		★2단
//		2*2=4	2*4=8	2*6=12	2*8=16	
//		★4단
//		4*2=8	4*4=16	4*6=24	4*8=32	
//		★6단
//		6*2=12	6*4=24	6*6=36	6*8=48	
		
		for(int dan=2; dan<=6; dan+=2) {
				System.out.println("★" + dan + "단");
			for(int gob=2; gob<=8; gob+=2) {
				System.out.print (dan +"*"+gob+"=" + (dan*gob)   +"\t" );
			}
			System.out.println();
		}
		
//		-------------------------------------------------------------
//		2단		4단		6단	
//		2*2=4	4*2=8	6*2=12	
//		2*4=8	4*4=16	6*4=24	
//		2*6=12	4*6=24	6*6=36	
//		2*8=16	4*8=32	6*8=48	
		
		for(int dan=2; dan<=6; dan+=2) {
			System.out.print("★" +dan+"단"+"\t" );
		}
		System.out.println();
		
		for(int gob=2; gob<=8; gob+=2) {
			for(int dan=2; dan<=6; dan+=2) {
				System.out.print(dan+"*"+gob+"=" + (dan*gob)   +"\t" );
			}
			System.out.println();
		}
		

		
		
		
				
				
		
		
			

	}

}
