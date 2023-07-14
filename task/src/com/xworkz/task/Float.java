package com.xworkz.task;

import java.util.Arrays;

public class Float {
	
	public static void main(String[] args) {
		
	
	
	float price[] = {25.25f,421.25f,15.15f};
	float price2[] = {15.25f,125.50f,175.50f};
	
	        //toString	
			System.out.println(Arrays.toString(price));
			
			//binarysearch
			System.out.println(Arrays.binarySearch(price,2));
			
			//sorting
			System.out.println(Arrays.toString(price));
			Arrays.sort(price,0,price.length-1);
			System.out.println(Arrays.toString(price));
			
			//equals
			System.out.println(Arrays.equals(price, price2));
			
			//hashcode
			System.out.println(Arrays.hashCode(price));

			//copyof
			System.out.println(Arrays.toString(price));
			float[] newArray=Arrays.copyOf(price2, 3);
			System.out.println(Arrays.toString(newArray));
			
			//parallel sort
			Arrays.parallelSort(price);
			System.out.println(Arrays.toString(price));
	}
}
