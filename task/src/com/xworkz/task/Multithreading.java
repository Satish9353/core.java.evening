package com.xworkz.task;

public class Multithreading extends Thread{

	
	public void run() {
		System.out.println("the thread is running");
	}
	
	public static void main(String[] args) {
		
		Multithreading m = new Multithreading();
		m.start();
	}
	

}
