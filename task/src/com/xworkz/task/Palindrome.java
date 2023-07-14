package com.xworkz.task;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String a,b;
		StringBuffer sb;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		
		a=sc.nextLine();
		sb=new StringBuffer(a);
		b=sb.reverse().toString();
		
		if(a.equals(b)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}
		
	}
	
}
 