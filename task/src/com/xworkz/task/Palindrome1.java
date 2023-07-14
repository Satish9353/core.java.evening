package com.xworkz.task;

import java.util.Scanner;

public class Palindrome1 {
	
	public static void main(String[] args) {
		
		String a,b;
		StringBuffer ab;
		
		System.out.println("enter a string");
		
	   Scanner sc = new Scanner(System.in);
	   a=sc.nextLine();
	   ab=new StringBuffer(a);
	   b=ab.reverse().toString();
	   
	   if(a.equals(b)) {
		   System.out.println("palindrome");
	   }
	   else {
		   System.out.println("not palindrome");
	   }
	}

}
