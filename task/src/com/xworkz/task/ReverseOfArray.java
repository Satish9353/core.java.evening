package com.xworkz.task;

public class ReverseOfArray {
	
	public static void main(String args[]) {
		
		int a[]= {12,45,23,6,12,79,9,345,87,56,26,28,28,12};
		
		System.out.print("original array");
		
		for(int i=0;i<a.length;i++ ) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("reverse array");
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
