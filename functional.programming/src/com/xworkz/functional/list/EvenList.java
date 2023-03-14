package com.xworkz.functional.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EvenList {
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(10);
		li.add(25);
		li.add(125);
		li.add(138);
		li.add(235);
		li.add(12);
		li.add(45);
		li.add(456);
		li.add(154);
		li.add(30);
		li.add(25);
		li.add(35);
		li.add(40);
		li.add(4561);
		li.add(1504);
		li.add(310);
		li.add(25);
		li.add(10);
		
		
		
		System.out.println(li);
		
		Iterator<Integer> itr = li.iterator();
		while(itr.hasNext()) {
			Integer in = itr.next();
			if(in % 2 == 0)
			System.out.println(in);
		}
		System.out.println("filtering the data by using filter method");
		
		System.out.println("");
		
		System.out.println("The data is less then 100");
		List<Integer> lessThenHundred = li.stream().filter(in->(in<100)).collect(Collectors.toList());
		System.out.println(lessThenHundred);
		
		System.out.println("The data is more the 100");
		List<Integer> moreThenHundred = li.stream().filter(in->(in>100)).collect(Collectors.toList());
		System.out.println(moreThenHundred);
	}

}
