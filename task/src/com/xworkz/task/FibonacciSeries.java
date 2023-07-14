package com.xworkz.task;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int num, a=0,b=0,c=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();
		
		System.out.println("fibonacci series o is");
	
	for(int i=0;i<num;i++) {
		a=b;
		b=c;
		c=a+b;
		System.out.println(a+" ");
	}
	}

}
