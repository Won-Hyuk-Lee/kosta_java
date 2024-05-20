package com.kosta.lec;

public class Lec04조건문 {

	public static void main(String[] args) {
		// -------------------------------
		// if (__조건식__) {  //TODO }  
		// CASE .... WHEN (__조건식__) THEN '십'.. END
		// -------------------------------
		
		int score = 70;
		
//		if (score >= 90) { 
//			System.out.println("A");
//			System.out.println("^^");
//		}
		
//		if (score >= 90)  
//			System.out.println("A");
//			System.out.println("B");
		
		
		// if() ~~      else if() .....
//		score = 10;
//		if (score >= 90) { 
//			System.out.println("A");
//		} else if (score >= 80) {
//			System.out.println("B");
//		} else if (score >= 70) {
//			System.out.println("C");
//		} else if (score >= 60) {
//			System.out.println("D");
//		}    
		
		
		
		
		// if() ~~      else if() .....    else
//		score = 10;
//		if (score >= 90) { 
//			System.out.println("A");
//		} else if (score >= 80) {
//			System.out.println("B");
//		} else if (score >= 70) {
//			System.out.println("C");
//		} else if (score >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
		// if() ~~        else
		score = 10;
		if (score >= 90) { 
			System.out.println("A");
		} else {
			System.out.println("F");
		} 
				
		System.out.println("----done----");
		
		
		// -------------------------------
		// switch
		// DECODE(deptno, 10, '십', '아니다')
		// -------------------------------
		score = 70;
		char grade = ' ';
		switch(score) {
			case 90:
				grade = 'A';
				break;
			case 80:
				grade = 'B';
				break;
			case 70:
				grade = 'C';
				break;
			default :
				grade = 'F';
				break;
		}
		System.out.println(grade);
		
//		멀티 조건식 ------------------------------------ 
//		where job = 'CLERK' and sal > 2000;
//		and --> &&
//		or  --> ||
//		-------------------------------------------------
//		age 10~19   m       ---> 50
//						f   ---> 0  
//		age 20~29   m       --->100
//		              f     ---> 0
//		age 30~39   m f     ---> 0
//		                    ---> 잘못입력
			
		int age  = 25;
		char gen = 'f';
		
		if(gen =='m') {
			
		} else {
			
		}
		
		if(age >=10 && age<20) {
			
		}else if(age >=20 && age<30) {
			
		} else if(age >=30 && age<40) {
		
		}
		
		
		if(age >=10 && age<20) {
			if(gen =='m') {
				System.out.println(50);
			} else {
				System.out.println(0);
			}
		}else if(age >=20 && age<30) {
			if(gen =='m') {
				System.out.println(100);
			} else {
				System.out.println(0);
			}
		} else if(age >=30 && age<40) {
			if(gen =='m') {
				System.out.println(0);
			} else {
				System.out.println(0);
			}
		} else {
			System.out.println("잘못입력");
		}

//		if(gen =='m') {
//			if(age >=10 && age<20) {
//				
//			}else if(age >=20 && age<30) {
//				
//			} else if(age >=30 && age<40) {
//			
//			}
//		} else {
//			if(age >=10 && age<20) {
//				
//			}else if(age >=20 && age<30) {
//				
//			} else if(age >=30 && age<40) {
//			
//			}
//		}
//		
		if(age >= 10 && age < 20 && gen == 'm') {
			System.out.println(50);
		} else if (age >= 20 && age < 30 && gen == 'm') {
			System.out.println(100);
		} else if (age >= 30 && age < 40 && gen == 'm') {
			System.out.println(0);
		} else if (age >= 10 && age < 20 && gen == 'f') {
			System.out.println(0);
		} else if (age >= 20 && age < 30 && gen == 'f') {
			System.out.println(0);
		} else if (age >= 30 && age < 40 && gen == 'f') {
			System.out.println(0);
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		String output = "";
		if(age >= 10 && age <= 19) {
			if(gen == 'm') {
				output = "50";
			} else {
				output = "0";
			}
		} else if(age >= 20 && age <= 29) {
			if(gen == 'm'){
				output = "100";
			} else {
				output = "0";
			}
		} else if(age >= 30 && age <= 39) {
			output = "0";
		} else {
			output = "잘못된 입력입니다.";
		}
		System.out.println(output);
		
		int num = 0;
		
		
		if(age >= 10 && age <=19) {
			if(gen == 'm') {
				num = 50;
			}
		} else if(age >= 20 && age <=29) {
			if(gen == 'm') {
				num = 100;
			}
		}else if(age >= 30 && age <=39) {
			num = 0; 
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println(num);
		
	}

}
