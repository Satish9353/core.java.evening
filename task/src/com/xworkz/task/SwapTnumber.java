package com.xworkz.task;

import java.util.Scanner;

public class SwapTnumber {
	
	public static void main(String[] args) {
		int x,y,temp;
	   System.out.println("enter x and y");
	   Scanner sc = new Scanner(System.in);
	   x = sc.nextInt();
	   y= sc.nextInt();
	   
	   System.out.println("before swapping " +x+y);
	   
	   temp = x;
	   x=y;
	   y=temp;
	   
	   System.out.println("after swapping" +x+y);
	}

}
