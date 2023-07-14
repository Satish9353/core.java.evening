package com.xworkz.task;

import java.util.Scanner;

public class SwapNo {
	
	public static void main(String[] args) {
		
		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("before swapping"+a+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping"+a+b);
	}

}
