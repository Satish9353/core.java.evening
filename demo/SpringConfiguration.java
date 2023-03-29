package main.java.com.xworkz.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.java.com.xworkz.demo1.FoodStall;
import main.java.com.xworkz.demo2.Train;
import main.java.com.xworkz.demo3.Laptop;
import main.java.com.xworkz.demo5.Wire;
import main.java.com.xworkz.demo6.Kitchen;

@Configuration
public class SpringConfiguration {
	
	@Bean(name= "person")
	public Person getPerson() {
		Person p = new Person();
		p.setId(1);
		p.setName("Parshya");
		p.setAge(25);
		
		return p;
	}
	@Bean(name="person1")
	public Person getPerson1() {
		Person p = new Person();
		p.setId(2);
		p.setName("Archi");
		p.setAge(25);
		
		return p;
	}
	@Bean(name="person2")
	public Person getPerson2() {
		Person p = new Person();
		p.setId(3);
		p.setName("Pradeep");
		p.setAge(25);
		
		return p;
	}
	@Bean(name="person3")
	public Person getPerson3() {
		Person p = new Person();
		p.setId(4);
		p.setName("Salim");
		p.setAge(25);
		
		return p;
	}
	@Bean(name="person4")
	public Person getPerson4() {
		Person p = new Person();
		p.setId(5);
		p.setName("Mangya");
		p.setAge(25);
		
		return p;
	}
	@Bean(name="food stall1")
	public FoodStall getFoodStall1() {
		FoodStall fs = new FoodStall();
		fs.setId(1);
		fs.setName("bhagyavanti food stall");
		fs.setLocation("bk");
		return fs;
	}
	@Bean(name="food stall2")
	public FoodStall getFoodStall2() {
		FoodStall fs = new FoodStall();
		fs.setId(2);
		fs.setName("panjabi food stall");
		fs.setLocation("humnabad");
		return fs;
	}
	@Bean(name="food stall3")
	public FoodStall getFoodStall3() {
		FoodStall fs = new FoodStall();
		fs.setId(3);
		fs.setName("rajkamal food stall");
		fs.setLocation("bhalki");
		return fs;
	}
	@Bean(name="food stall4")
	public FoodStall getFoodStall4() {
		FoodStall fs = new FoodStall();
		fs.setId(4);
		fs.setName("shiva food stall");
		fs.setLocation("bidar");
		return fs;
	}
	@Bean(name="food stall5")
	public FoodStall getFoodStall5() {
		FoodStall fs = new FoodStall();
		fs.setId(5);
		fs.setName("kk food stall");
		fs.setLocation("aurad");
		return fs;
	}

	@Bean(name="train1")
	public Train getTrain1() {
		Train t = new Train();
		t.setId(1);
		t.setName("basava express");
		t.setTrainNo(485796);
		return t;
		
	}
	@Bean(name="train2")
	public Train getTrain2() {
		Train t = new Train();
		t.setId(2);
		t.setName("hasan express");
		t.setTrainNo(485876);
		return t;
		
	}
	@Bean(name="train3")
	public Train getTrain3() {
		Train t = new Train();
		t.setId(3);
		t.setName("sheshadri express");
		t.setTrainNo(485487);
		return t;
		
	}
	@Bean(name="train4")
	public Train getTrain4() {
		Train t = new Train();
		t.setId(4);
		t.setName("karnataka express");
		t.setTrainNo(485548);
		return t;
		
	}
	@Bean(name="train5")
	public Train getTrain5() {
		Train t = new Train();
		t.setId(5);
		t.setName("rajdhani express");
		t.setTrainNo(485254);
		return t;
		
	}
	@Bean(name="laptop1")
	public Laptop getLaptop1() {
		Laptop l = new Laptop();
		l.setId(1);
		l.setBrandName("hp");
		l.setPrice(60000);
		return l;
		
	}
	@Bean(name="laptop2")
	public Laptop getLaptop2() {
		Laptop l = new Laptop();
		l.setId(2);
		l.setBrandName("mac book");
		l.setPrice(150000);
		return l;
		
	}
	@Bean(name="laptop3")
	public Laptop getLaptop3() {
		Laptop l = new Laptop();
		l.setId(3);
		l.setBrandName("acer");
		l.setPrice(35000);
		return l;
		
	}
	@Bean(name="laptop4")
	public Laptop getLaptop4() {
		Laptop l = new Laptop();
		l.setId(4);
		l.setBrandName("dell");
		l.setPrice(30000);
		return l;
		
	}
	@Bean(name="laptop5")
	public Laptop getLaptop5() {
		Laptop l = new Laptop();
		l.setId(5);
		l.setBrandName("asus");
		l.setPrice(50000);
		return l;
		
	}
	@Bean(name="wire1")
	public  Wire getWire1() {
		Wire w = new Wire();
		w.setId(1);
		w.setBrandName("finolex");
		w.setUse("to supply current");
		return w;
	}
	@Bean(name="wire2")
	public  Wire getWire2() {
		Wire w = new Wire();
		w.setId(2);
		w.setBrandName("polo");
		w.setUse("to supply current");
		return w;
	}
	@Bean(name="wire3")
	public  Wire getWire3() {
		Wire w = new Wire();
		w.setId(3);
		w.setBrandName("polycab");
		w.setUse("to supply current");
		return w;
	}
	@Bean(name="wire4")
	public  Wire getWire4() {
		Wire w = new Wire();
		w.setId(4);
		w.setBrandName("plaza");
		w.setUse("to supply current");
		return w;
	}
	@Bean(name="wire5")
	public  Wire getWire() {
		Wire w = new Wire();
		w.setId(5);
		w.setBrandName("v-guard");
		w.setUse("to supply current");
		return w;
	}
	@Bean(name="kitchen1")
	public Kitchen getKitchen1() {
		Kitchen k = new Kitchen();
		k.setId(1);
		k.setType("Galley Kitchen");
		k.setItem("sambar");
		return k;
		
	}
	@Bean(name="kitchen2")
	public Kitchen getKitchen2() {
		Kitchen k = new Kitchen();
		k.setId(2);
		k.setType("wide");
		k.setItem("rice");
		return k;
		
	}
	@Bean(name="kitchen3")
	public Kitchen getKitchen3() {
		Kitchen k = new Kitchen();
		k.setId(3);
		k.setType(" Island Kitchen");
		k.setItem("sagu");
		return k;
		
	}
	@Bean(name="kitchen4")
	public Kitchen getKitchen4() {
		Kitchen k = new Kitchen();
		k.setId(4);
		k.setType("U-Shaped ");
		k.setItem("chapati");
		return k;
		
	}
	@Bean(name="kitchen5")
	public Kitchen getKitchen5() {
		Kitchen k = new Kitchen();
		k.setId(5);
		k.setType("L-Shaped");
		k.setItem("roti");
		return k;
		
	}
	@Bean(name="string1")
	public String getString1() {
		return "getString1";
	}
	@Bean(name="string2")
	public String getString2() {
		return "getString2";
	}
	@Bean(name="string3")
	public String getString3() {
		return "getString3";
	}
	@Bean(name="string4")
	public String getString4() {
		return "getString4";
	}
	@Bean(name="string5")
	public String getString5() {
		return "getString5";
	}
	
	@Bean(name="int1")
	public Integer getInteger1() {
		return 123;
	}
	@Bean(name="int2")
	public Integer getInteger2() {
		return 245;
	}
	@Bean(name="int3")
	public Integer getInteger3() {
		return 1234;
	}
	@Bean(name="int4")
	public Integer getInteger4() {
		return 1223;
	}
	@Bean(name="int5")
	public Integer getInteger5() {
		return 1233;
	}
	@Bean(name="char1")
	public Character getCharacter1() {
		return 's';
	}
	@Bean(name="char2")
	public Character getCharacter2() {
		return 'p';
	}
	@Bean(name="char3")
	public Character getCharacter3() {
		return 'a';
	}
	@Bean(name="char4")
	public Character getCharacter4() {
		return 'r';
	}
	@Bean(name="char5")
	public Character getCharacter5() {
		return 'r';
	}
	@Bean(name="short1")
	 public Short getShort() {
		return 245;
	}
	@Bean(name="short2")
	 public Short getShort2() {
		return 20;
	}
	@Bean(value="short3")
	 public Short getShort3() {
		return 24;
	}
	@Bean(value="short4")
	 public Short getShort4() {
		return 45;
	}
	@Bean(value="short5")
	 public Short getShort5() {
		return 25;
	}
	
	
	

}


