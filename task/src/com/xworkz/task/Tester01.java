package com.xworkz.task;
public class Tester01 {
	
	public static void main(String args[] ) throws ClassNotFoundException {
		
		System.out.println("main started");
		m1();
	}
	
	
	

	private static void m1() throws ClassNotFoundException {
		
	System.out.println("m1 is started");
	
	m2();
	
	System.out.println("m1 is ended");
		
	}

	private static void m2() throws ClassNotFoundException{
		System.out.println("m2 is started");
	  
		m3();
	 
	
		System.out.println("m2 is ended");
	}

	private static void m3() throws ClassNotFoundException {
			System.out.println("m3 is started");
			Class cls = Class.forName("com.xworkz.task.Tester01");
			System.out.println("m3 is ended");
		
	}
	
          
}



