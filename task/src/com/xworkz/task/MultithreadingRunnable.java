package com.xworkz.task;

public class MultithreadingRunnable implements Runnable{
	
	public void run() {
		System.out.println("the thread is running");
	}
	
	public static void main(String[] args) {
		
		MultithreadingRunnable mr = new MultithreadingRunnable();
		Thread obj = new Thread(mr);
		obj.start();
	}

}
