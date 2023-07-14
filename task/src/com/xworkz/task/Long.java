package com.xworkz.task;

import java.util.Arrays;

public class Long {
	
	public static void main(String[] args) {
		
	  long contactNo[] = {7411646619L,6353472656L,8695712354L};
	  long contactNo1[]= {7598462354L,89657423514L,79657423514L};
	  
		////toString
		System.out.println(Arrays.toString(contactNo));
		
		//binarysearch
		
		System.out.println(Arrays.binarySearch(contactNo, 3));
		
		//sorting
				System.out.println(Arrays.toString(contactNo));
				Arrays.sort(contactNo,0,contactNo.length-1);
				System.out.println(Arrays.toString(contactNo));
				
				
		//hashcode
				
		System.out.println(Arrays.hashCode(contactNo));
		
		//copyof
				System.out.println(Arrays.toString(contactNo));
				long[] newArray=Arrays.copyOf(contactNo1, 1);
				System.out.println(Arrays.toString(newArray));
				
		//equals
				
				System.out.println(Arrays.equals(contactNo,contactNo1 ));	
				
		//parallel sort
				Arrays.parallelSort(contactNo);
				System.out.println(Arrays.toString(contactNo));
	}

}
