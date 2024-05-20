package com.kosta.lec;
import java.util.Scanner;
public class Lec06String {

	public static void main(String[] args) {
		String msg   = "exit";
		String name2 = "exit";
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println(msg   + "," + System.identityHashCode(msg));
		System.out.println(name  + "," + System.identityHashCode(name));
		System.out.println(name2 + "," + System.identityHashCode(name2));
		
		
		if(msg.equals(name)) {
			System.out.println(11);
		} else {
			System.out.println(22);
		}
			
//		if(msg == name) {
//			System.out.println(11);
//		} else {
//			System.out.println(22);
//		}

	}

}
