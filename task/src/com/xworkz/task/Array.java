package com.xworkz.task;

public class Array {
	
	public static void main(String[] args) {
	
		int b [] = {1,2,3,4,5,6};
		for(int i =0;i<b.length;i++) {
			if(b[i]%2==0) {
				System.out.println("the given no is even"+b[i]);
				
				int sum = (b[i]+2)*(b[i]+2);
				System.out.println(sum);
			}
			else {
				System.out.println("the given no is odd"+b[i]);
				int sum1 = b[i]*b[i];
				System.out.println(sum1);
			}
		}
		int i = 0;
		for(i=0;i<=b.length-1;i++) {
			int a = 0;
			for(int j=1;j<=b[i];j++) {
				if(b[i]%j==0) {
					a++;
				}
			}
			if(a==2) {
				System.out.println("The given number is prime  "+b[i]);
				int sum = b[i]*b[i];
				System.out.println(sum);
			}
			else {
				System.out.println("the given number is not prime"+b[i]);
				int sum1 = b[i]*b[i];
				System.out.println(sum1);
			}
		}
	}
}


