package com.xworkz.task;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
		int n;
		int count=0;
		System.out.println("enter a number");
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i =1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n+"no is prime");
		}
		else {
			System.out.println(n+"no is not prime");
		}
		
	}

}
