package com.xworkz.functional.programming;

public class MulTester {
	
	public static void main(String[] args) {
		
		Multiplication mul = (num1,num2)->{
		System.out.println("mul is started");
		System.out.println(num1*num2);
		System.out.println("mul is ended");
	};
	mul.mul(25, 2);
	}
}
