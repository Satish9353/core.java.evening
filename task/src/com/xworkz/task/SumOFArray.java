package com.xworkz.task;

public class SumOFArray {
	
	public static void main(String args[]) {
		
		int a[]= {12,45,23,6,12,79,9,345,87,56,26,28,28,12};
		int sum = 0;
		
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
		System.out.println("sum of array elements:" +sum);
	}

}
