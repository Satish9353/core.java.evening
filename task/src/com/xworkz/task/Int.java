package com.xworkz.task;

import java.util.Arrays;

public class Int {
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("calling with finalise internally");
		
	}
	
	public static void main(String[] args) {
		
		Int in = new Int();
		//in = null;  //Is is ready for gc.
		
		
		//System.gc();
		
		
		Int in1 = new Int();
		in=in1;
		
		System.gc();
		
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b = {9,8,7,6,5,4,3,2,1};
		int[] c = {5,6,8,9,7,2,1,3};
		
		//System.out.println(Arrays.compare(a, b));
		//arraylist
		System.out.println(Arrays.toString(b));
		
		//binarysearch
		System.out.println(Arrays.binarySearch(b,5 ));
		
		//sorting
		System.out.println(Arrays.toString(c));
		Arrays.sort(c,0,c.length-1);
		System.out.println(Arrays.toString(c));
		
		//equals
		System.out.println(Arrays.equals(a, b));
		
		//hashcode
		System.out.println(Arrays.hashCode(c));
		
		
		//copyof
		int newArray[]=Arrays.copyOf(b, 3);
		System.out.println(Arrays.toString(newArray));
		
		//parallel sort
		Arrays.parallelSort(c);
		System.out.println(Arrays.toString(c));
		
		
		
		
	}

}
