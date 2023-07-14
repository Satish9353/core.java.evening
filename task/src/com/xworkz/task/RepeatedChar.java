package com.xworkz.task;

import java.util.Scanner;

public class RepeatedChar {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name");
		String name = sc.next();
		char c[] = name.toCharArray();
		for(int i=0;i<c.length;i++) {
			int z=0;
			
			for(int j=0;j<c.length;j++) {
				if(c[i] == c[j]) {
					z++;
				}
			}
			System.out.println(c[i] +" "+z);
		}
	}

}
