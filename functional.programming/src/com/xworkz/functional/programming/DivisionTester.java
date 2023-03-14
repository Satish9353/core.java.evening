package com.xworkz.functional.programming;

public class DivisionTester {
	public static void main(String[] args) {
		Division div = (num1,num2)->{
			System.out.println("div is started");
			System.out.println(num1/num2);
			System.out.println("div is ended");
			
		};
		div.div(20, 2);
	}

}
