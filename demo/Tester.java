package main.java.com.xworkz.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.java.com.xworkz.demo1.FoodStall;
import main.java.com.xworkz.demo2.Train;
import main.java.com.xworkz.demo3.Laptop;
import main.java.com.xworkz.demo5.Wire;
import main.java.com.xworkz.demo6.Kitchen;

public class Tester {
	 public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println("person data");
		Person person = ac.getBean("person",Person.class);
		System.out.println(person);
		
		Person person1 = ac.getBean("person1",Person.class);
		System.out.println(person1);
		
		Person person2 = ac.getBean("person2",Person.class);
		System.out.println(person2);
		
		Person person3 = ac.getBean("person3",Person.class);
		System.out.println(person3);
		
		Person person4 = ac.getBean("person4",Person.class);
		System.out.println(person4);
		
		System.out.println("     ");
		System.out.println("FoodStall data");
		FoodStall fs1 = ac.getBean("food stall1",FoodStall.class);
		System.out.println(fs1);
		
		FoodStall fs2 = ac.getBean("food stall2",FoodStall.class);
		System.out.println(fs2);
		
		FoodStall fs3 = ac.getBean("food stall3",FoodStall.class);
		System.out.println(fs3);
		
		FoodStall fs4 = ac.getBean("food stall4",FoodStall.class);
		System.out.println(fs4);
		
		FoodStall fs5 = ac.getBean("food stall5",FoodStall.class);
		System.out.println(fs5);
		
		System.out.println("   ");
		System.out.println("train data");
		Train t1 = ac.getBean("train1",Train.class);
		System.out.println(t1);
		
		Train t2 = ac.getBean("train2",Train.class);
		System.out.println(t2);
		
		Train t3 = ac.getBean("train3",Train.class);
		System.out.println(t3);
		
		Train t4 = ac.getBean("train4",Train.class);
		System.out.println(t4);
		
		Train t5 = ac.getBean("train5",Train.class);
		System.out.println(t5);
		
		System.out.println("    ");
		System.out.println("laptop data");
		Laptop l1 = ac.getBean("laptop1",Laptop.class);
		System.out.println(l1);
		
		Laptop l2 = ac.getBean("laptop2",Laptop.class);
		System.out.println(l2);
		
		Laptop l3 = ac.getBean("laptop3",Laptop.class);
		System.out.println(l3);
		
		Laptop l4 = ac.getBean("laptop4",Laptop.class);
		System.out.println(l4);
		
		Laptop l5 = ac.getBean("laptop5",Laptop.class);
		System.out.println(l5);
		
		System.out.println("   ");
		System.out.println("wire data");
		Wire w1 = ac.getBean("wire1",Wire.class);
		System.out.println(w1);
		
		Wire w2 = ac.getBean("wire2",Wire.class);
		System.out.println(w2);
		
		Wire w3 = ac.getBean("wire3",Wire.class);
		System.out.println(w3);
		
		Wire w4 = ac.getBean("wire4",Wire.class);
		System.out.println(w4);
		
		Wire w5 = ac.getBean("wire5",Wire.class);
		System.out.println(w5);
		
		System.out.println("   ");
		System.out.println("kitchen data");
		Kitchen k1 = ac.getBean("kitchen1",Kitchen.class);
		System.out.println(k1);
		
		Kitchen k2 = ac.getBean("kitchen2",Kitchen.class);
		System.out.println(k2);
		
		Kitchen k3 = ac.getBean("kitchen3",Kitchen.class);
		System.out.println(k3);
		
		Kitchen k4 = ac.getBean("kitchen4",Kitchen.class);
		System.out.println(k4);
		
		Kitchen k5 = ac.getBean("kitchen5",Kitchen.class);
		System.out.println(k5);
		
		System.out.println("  ");
		System.out.println("string data");
		String s = ac.getBean("string1",String.class);
		System.out.println(s);
		
		String s1 = ac.getBean("string2",String.class);
		System.out.println(s1);
		
		String s2 = ac.getBean("string2",String.class);
		System.out.println(s2);
		
		String s3 = ac.getBean("string3",String.class);
		System.out.println(s3);
		
		String s4 = ac.getBean("string4",String.class);
		System.out.println(s4);
		
		System.out.println("  ");
		System.out.println("int data");
		Integer i = ac.getBean("int1",Integer.class);
		System.out.println(i);
		
		Integer i1 = ac.getBean("int2",Integer.class);
		System.out.println(i1);

		Integer i2 = ac.getBean("int3",Integer.class);
		System.out.println(i2);
		
		Integer i3 = ac.getBean("int4",Integer.class);
		System.out.println(i3);

		Integer i4 = ac.getBean("int5",Integer.class);
		System.out.println(i4);
		
		System.out.println("  ");
		System.out.println("char data");
		Character c = ac.getBean("char1",Character.class);
		System.out.println(c);
		
		Character c1 = ac.getBean("char2",Character.class);
		System.out.println(c1);
		
		Character c2 = ac.getBean("char3",Character.class);
		System.out.println(c2);
		
		Character c3 = ac.getBean("char4",Character.class);
		System.out.println(c3);
		
		Character c4 = ac.getBean("char5",Character.class);
		System.out.println(c4);
		
		System.out.println("  ");
		System.out.println("short data");
		Short st = ac.getBean("short1",Short.class);
		System.out.println(st);
		
		Short st1 = ac.getBean("short2",Short.class);
		System.out.println(st1);
		
		Short st2 = ac.getBean("short3",Short.class);
		System.out.println(st2);
		
		Short st3 = ac.getBean("short4",Short.class);
		System.out.println(st3);
		
		Short st4 = ac.getBean("short5",Short.class);
		System.out.println(st4);	
	}

}
