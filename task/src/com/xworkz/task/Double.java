package com.xworkz.task;

import java.util.Arrays;

public class Double {
	
	public static void main(String[] args) {
		
		double a[] = {100.00,152.00,125.25,158.46};
		double b[] = {10.00,12.00,15.25,18.46};
		
		//toString
		System.out.println(Arrays.toString(a));
		
		//binary search
		System.out.println(Arrays.binarySearch(a, 02));
		
		//equals
		System.out.println(Arrays.equals(a, b));
	
		//sorting
		System.out.println(Arrays.toString(a));
		Arrays.sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
		//copyof
		System.out.println(Arrays.toString(a));
		double[] newArray=Arrays.copyOf(b, 3);
		System.out.println(Arrays.toString(newArray));
		
		//hashcode
		System.out.println(Arrays.hashCode(b));
		
		//parallel sort
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
	}

}
