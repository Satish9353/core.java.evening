package com.xworkz.task;

import java.util.Arrays;

public class Boolean {
	
	public static void main(String[] args) {
		
		boolean b[] = {false,true,true,false};
		boolean c[] = {true,true,true,false};
		
		//toString
		System.out.println(Arrays.toString(b));
		
		//equals
		System.out.println(Arrays.equals(b, c));
		
		//copyOfRange
		System.out.println(Arrays.copyOfRange(c, 02, 03));
		
		//fill
		Arrays.fill(c, true);
		System.out.println(Arrays.toString(c));
		
		
	}

}
