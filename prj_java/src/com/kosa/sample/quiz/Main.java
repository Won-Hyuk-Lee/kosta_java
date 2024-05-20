package com.kosa.sample.quiz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		int count = a.length();
		int roopCount = count/2;
		boolean check = true;
		
		if(count %2 ==0) //글자수가 짝수면
		{
			for(int i =0;i<roopCount;i++)
			{
				if(a.charAt(i) != a.charAt(count))
				{
					check = false;
				}
				count--;
				
			}
		}
		else //글자수가 홀수인경우
		{
			for(int i =0;i<roopCount;i++)
			{
				
			}
		}
		
		
		
		System.out.println(count);
	}

}
