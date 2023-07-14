package com.xworkz.task;

import java.util.Scanner;

public class RemoveSpace {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String inputString = sc.nextLine();
		char [] charArray = inputString.toCharArray();
		String stringwithoutspace = "";
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]!=' ') {
				System.out.print(charArray[i]);
			}
		}
		
	}

}
