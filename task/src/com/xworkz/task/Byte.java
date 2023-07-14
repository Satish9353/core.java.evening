package com.xworkz.task;

import java.util.Arrays;

public class Byte {
	
	public static void main(String[] args) {
		
		byte b[]= {25,52,48,98,78,20};
		byte b1[]= {35,72,80,48,88,30};
		
		//toString
		System.out.println(Arrays.toString(b));
		
		//equals
		System.out.println(Arrays.equals(b, b1));
		
		//hashcode
		System.out.println(Arrays.hashCode(b1));
		
		//copyof
		byte[] newArray=Arrays.copyOf(b1, 3);
		System.out.println(Arrays.toString(newArray));
		
		//copyOfRange
		System.out.println(Arrays.copyOfRange(b1, 2, 5));
		
		//sorting
		Arrays.sort(b,0,b.length-1);
		System.out.println(Arrays.toString(b));
		
		//parallel sort
				Arrays.parallelSort(b);
				System.out.println(Arrays.toString(b));
		
	}

}
