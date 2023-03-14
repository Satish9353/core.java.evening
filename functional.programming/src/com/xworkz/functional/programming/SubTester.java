package com.xworkz.functional.programming;

public class SubTester {
	
	public static void main(String[] args) {
		
		Substraction sub = (num1,num2) ->{ 
		System.out.println("sub is started");
		System.out.println(num1-num2);
		System.out.println("sub is ended");
		};
		sub.sub(25, 20);
	}

}
