package com.xworkz.task;

public class TwodArrays {
	public static void main(String[] args) {
		
		int a[] []= {{1,2,3,4,5},{2,3,4,5,6}};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].length);
			
			for(int j=0;j<4;j++) {
				int b;
				System.out.println(a[i][j]);
			}
		}
		
	}

}
