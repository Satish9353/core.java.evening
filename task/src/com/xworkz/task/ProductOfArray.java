package com.xworkz.task;

public class ProductOfArray {
	
	public static void main(String args[]) {
		
		int a[]= {12,45,23,6,12,79,9,345,87,56,26,28,28,12};
		int product=1;
		
		for(int i = 1;i<a.length;i++) {
			product = product*a[i];
		}
		System.out.println("product of array elements:"+product);
	}

}
