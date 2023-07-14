package com.xworkz.task;

import java.util.Arrays;

public class Char {
	
	public static void main(String[] args) {
		
		char c[]= {'a','z','c','d'};
		char c1[]= {'a','b','c','d'};
		
		//toString
		System.out.println(Arrays.toString(c));
		
		//equals
		System.out.println(Arrays.equals(c, c1));
		
		//sorting
		System.out.println(Arrays.toString(c));
		Arrays.sort(c,0,c.length-1);
		System.out.println(Arrays.toString(c));
		
		//copyof
		System.out.println(Arrays.toString(c));
		char [] newArray=Arrays.copyOf(c1, 3);
		System.out.println(Arrays.toString(newArray));
		
		//hashcode
				System.out.println(Arrays.hashCode(c));
				
		//parallel sort
		Arrays.parallelSort(c);
		System.out.println(Arrays.toString(c));
		
	}

}
