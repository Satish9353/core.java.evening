package com.xworkz.task;

public class TwoDArray {
	
	public static void main(String args[]) {
		
		int[][] twod = {{16,25,24,3,4},{25,45,35,85,2}};
		
		for (int i=0;i<twod.length;i++) {
			
			System.out.println("length of an array"+twod[i].length);
			
			for(int j=0;j<5;j++) {
				
				int temp;
				
				System.out.println(twod[i][j]);
				
			}
			
		}
	}

}
