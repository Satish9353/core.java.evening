package com.xworkz.task;

public class ReverseArray {
	
	public static void main(String[] args) {
		int a[]= {1,5,4,2,6,8,99,10,11};
		
		System.out.println("original array");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("reverse of array");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]+" ");
		}
	}
}
