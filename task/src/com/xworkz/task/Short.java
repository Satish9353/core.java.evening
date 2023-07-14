package com.xworkz.task;

import java.util.Arrays;

public class Short {
	
	public static void main(String[] args) {
		
		short [] s= {12,4,56,78,90};
		short [] s1= {22,25,75,94,98};
		
		//equals
		System.out.println(Arrays.equals(s, s1));
		
		//toString
		System.out.println(Arrays.toString(s1));
		
		//hashcode
		System.out.println(Arrays.hashCode(s1));
		
		//sorting
		Arrays.sort(s,0,s.length-1);
		System.out.println(Arrays.toString(s));
		
		
		
		
	}

}
